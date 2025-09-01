# CRUD de Clientes - Programação Web

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.5-brightgreen)
![Java](https://img.shields.io/badge/Java-21-blue)
![Lombok](https://img.shields.io/badge/Lombok-enabled-orange)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-red)

## Descrição
Projeto de **CRUD de clientes** desenvolvido como atividade da disciplina **Programação Web**.  
Permite criar, consultar, atualizar e deletar clientes, com filtros dinâmicos utilizando **JPA Specifications** e documentação via **Swagger**.

---

## Arquitetura
Visualização em camadas da aplicação:
```
┌─────────────┐
│ Controller  │
└─────┬───────┘
│
┌─────▼───────┐
│ Service     │
└─────┬───────┘
│
┌─────▼───────┐
│ Repository  │
└─────┬───────┘
│
┌─────▼──────────┐
│ Specifications │
└─────┬──────────┘
│
┌─────▼───────┐
│ Entity      │
└─────────────┘
```

- **Controller:** Recebe requisições HTTP e retorna respostas.  
- **Service:** Contém a lógica de negócio.  
- **Repository:** Realiza operações no banco de dados.  
- **Specifications:** Cria filtros dinâmicos para consultas.  
- **Entity:** Representa as tabelas do banco de dados.  

---

## Tecnologias e Dependencias utilizadas 

### Tecnologias
- **Spring Boot 3.5.5**  
- **Spring Data JPA**  
- **Lombok**  
- **OpenAPI/Swagger** – [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html) 

### Dependências Maven
- Lombok  
- springdoc-openapi-starter-webmvc-ui  
- spring-boot-starter-data-jpa  
- spring-boot-starter-web
- spring-boot-starter-test
- H2 Database  
 
**Documentação JPA Specifications:** [https://docs.spring.io/spring-data/jpa/reference/jpa/specifications.html](https://docs.spring.io/spring-data/jpa/reference/jpa/specifications.html)

---

## Funcionalidades
- CRUD completo de clientes  
- Filtros dinâmicos com **JPA Specifications**  
- Documentação da API via **Swagger/OpenAPI**

