# Projeto de Gerenciamento de Produtos e Pedidos

Este repositório contém um sistema de gerenciamento de **produtos**, **pedidos** e **pagamentos**, com funcionalidades para gerenciar usuários, produtos e realizar pedidos com itens de produtos. O sistema inclui também a integração de informações de pagamento para completar as transações.

## Funcionalidades

###  **Gerenciamento de Produtos**
Oferece operações para adicionar, atualizar e excluir produtos no sistema. Cada produto possui atributos como nome, descrição, preço e imagem.

- **Adicionar Produto**: Insere um novo produto no sistema com as informações necessárias (nome, descrição, preço, imagem).
- **Atualizar Produto**: Modifica os detalhes de um produto existente, permitindo alterações no nome, descrição, preço e imagem.
- **Excluir Produto**: Remove um produto do sistema, tornando-o indisponível para futuras compras.

###  **Gestão de Pedidos**
Permite que os usuários façam pedidos, selecionando produtos disponíveis no sistema. Cada pedido pode conter um ou mais itens de produto, com a quantidade e o preço definidos no momento da compra.

- **Criar Pedido**: Registra um novo pedido, incluindo informações sobre os produtos solicitados, suas quantidades e preços.
- **Visualizar Pedido**: Exibe o resumo de um pedido, incluindo os itens solicitados e o total de valor.
- **Atualizar Pedido**: Modifica um pedido, permitindo ajustes na quantidade dos produtos ou adição de novos itens.
- **Excluir Pedido**: Remove um pedido do sistema.

###  **Itens do Pedido**
Representa um produto específico dentro de um pedido. Cada item do pedido contém informações detalhadas sobre o produto, como nome, preço, quantidade e o valor total do item naquele pedido.

- **Adicionar Item ao Pedido**: Insere um novo item ao pedido em curso, com o nome do produto, preço e quantidade.
- **Atualizar Item do Pedido**: Permite ajustar a quantidade de um item ou seu preço dentro de um pedido.
- **Remover Item do Pedido**: Remove um item do pedido.
