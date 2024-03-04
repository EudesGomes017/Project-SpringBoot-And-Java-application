package com.dlea.Course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlea.Course.entities.User;
import com.dlea.Course.repositories.UserRepository;
import com.dlea.Course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> finAll() {
		return userRepository.findAll();
	}

	public User findById(Long id) {

		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id) );
	}

	public User insert(User obj) {
		return userRepository.save(obj);
	}

	public User update(Long id, User obj) {
		User entity = userRepository
				.getReferenceById(id);/*
										 * getReferenceById retorna uma referência à entidade identificada pelo ID fornecido, sem
										 * realmente carregar seus dados do banco de dados até que seja necessário.
										 */
		updateDate(entity, obj);
		return userRepository.save(entity);
	}

	private void updateDate(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());

	}

	public void delete(Long id) {
		userRepository.deleteById(id);
	}

}
