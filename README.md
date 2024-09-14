# TaskList - Clean Architecture em Java

Este repositório contém a implementação de uma aplicação **TaskList**, desenvolvida utilizando os princípios da **Clean Architecture** em Java. A aplicação tem como objetivo gerenciar tarefas diárias dos usuários, permitindo cadastro, login, criação, edição e exclusão de tarefas.

## Arquitetura

A Clean Architecture separa a aplicação em camadas, permitindo independência entre os componentes do sistema. Isso facilita a manutenção, testes e escalabilidade. As principais camadas implementadas neste projeto são:

- **Entities**: Contém as regras de negócio mais fundamentais, independentes de frameworks ou tecnologias externas.
- **Use Cases**: Orquestram a lógica de aplicação, sem depender de detalhes de infraestrutura.
- **Interface Adapters**: Contêm implementações que transformam dados para um formato que as camadas externas ou internas possam utilizar.
- **Frameworks & Drivers**: Contém detalhes de implementação, como frameworks de persistência, interfaces com serviços externos, APIs e bibliotecas.

### Diagrama de Camadas


## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação principal
- **Spring Boot**: Framework para facilitar o desenvolvimento de APIs RESTful
- **Spring Data JPA**: Integração com o banco de dados para persistência de dados
- **Hibernate**: Framework ORM para mapeamento objeto-relacional
- **H2 Database**: Banco de dados em memória para testes locais
- **Maven**: Gerenciador de dependências
- **JUnit**: Framework de testes unitários

## Estrutura do Projeto

A estrutura do projeto segue os princípios da Clean Architecture, conforme descrito abaixo:



### Camadas Detalhadas

- **Domain (Entities)**: Contém as classes de entidades de domínio, como `User` e `Task`, representando o núcleo da lógica de negócios.
  
- **Use Cases**: Contém os casos de uso que implementam a lógica da aplicação, como criar, editar e deletar tarefas. Por exemplo, o caso de uso `CreateTaskUseCase` é responsável por encapsular a regra de criação de uma nova tarefa.

- **Interface Adapters**: Contém os adaptadores de entrada e saída, transformando dados de/para entidades de domínio. Por exemplo, adaptadores de APIs REST, interfaces de banco de dados ou gateways para outros serviços.

- **Infrastructure (Frameworks & Drivers)**: Implementações específicas de frameworks como repositórios JPA, controladores REST utilizando Spring MVC, e a configuração de persistência com o Hibernate.

## Instalação e Execução

### Pré-requisitos

- Java 17+
- Maven 3.8+
- Docker (opcional para rodar o MongoDB em contêiner)

### Passos para executar o projeto localmente

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/tasklist-cleanarch.git
cd tasklist-cleanarch

