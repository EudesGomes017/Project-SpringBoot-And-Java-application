package com.dlea.Course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.dlea.Course.entities.User;
import com.dlea.Course.repositories.UserRepository;
import com.dlea.Course.services.exceptions.DatabaseException;
import com.dlea.Course.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> finAll() {
		return userRepository.findAll();
	}

	public User findById(Long id) {

		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User insert(User obj) {
		return userRepository.save(obj);
	}

	public User update(Long id, User obj) {
		
		
		try {

			User entity = userRepository
					.getReferenceById(id);/*
											 * getReferenceById retorna uma referência à entidade identificada pelo ID
											 * fornecido, sem realmente carregar seus dados do banco de dados até que
											 * seja necessário.
											 */
			updateDate(entity, obj);
			return userRepository.save(entity);

		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id); 
		}

	}

	private void updateDate(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());

	}

	public void delete(Long id) {
		if (!userRepository.existsById(id)) {
			throw new ResourceNotFoundException(id);
		}
		try {
			userRepository.deleteById(id);

		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());

		}
	}
}
