# 🚧🚧 **EM CONSTRUÇÃO** 🚧🚧

Este microserviço ainda está em desenvolvimento! Por favor, aguarde atualizações.

# Microserviço de Cliente

Este microserviço é responsável por gerenciar clientes e seus endereços. Ele permite o cadastro e a listagem de clientes e endereços associados, utilizando Spring Boot, Spring Data JPA, Lombok e MySQL.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação.
- **Spring Boot 3**: Framework para criar a API REST.
- **Spring Data JPA**: Para integração com o banco de dados.
- **MySQL**: Banco de dados relacional utilizado.
- **Lombok**: Para reduzir a boilerplate de código (getters, setters, etc.).

## Funcionalidades

- **Cadastro de clientes**: Cadastro de um cliente com um ou mais endereços.
- **Listagem de clientes**: Listagem de todos os clientes com seus endereços.

## Pré-requisitos

- **Java 17** ou superior
- **Maven** para gerenciar dependências
- **MySQL** como banco de dados

## Configuração do Banco de Dados

Antes de rodar o projeto, configure seu banco de dados no arquivo `application.properties` ou `application.yml`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

```

