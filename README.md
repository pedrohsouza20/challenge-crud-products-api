# Challenge CRUD Products API
#### Desafio de CRUD solicitado pela empresa [OAK Tecnologia](https://www.oaktecnologia.com/), como teste complementar para a vaga de estágio back-end
##### Requisitos: Cadastro e listagem de produtos
##### Cadastro | Formulário com os campos abaixo:
- Nome do produto - campo de texto.
- Descrição do produto - campo de texto.
- Valor do produto - campo de valor.
- Disponível para venda - campo com 2 opções: sim / não.

##### Listagem:
- Colunas da listagem: nome, valor.
- Ordenação por valor do menor para o maior.
- Quando cadastrar um novo produto é para abrir a listagem automaticamente.
- Deve existir um botão para cadastrar um novo produto a partir da listagem.
- Pode implementar a prova até onde conseguir.
- A implementação pode ser realizada com qualquer linguagem de programação.

# GB - Challenge CRUD Products API
#### CRUD challenge requested by the company [OAK Tecnologia](https://www.oaktecnologia.com/), as a supplementary test for the back-end internship position
##### Requirements: Product registration and listing
##### Registration | Form with the fields below:
- Product name - text field.
- Product description - text field.
- Product price - value field.
- Available for sale - field with 2 options: yes / no.

##### Listing:
- Listing columns: name, price.
- Sorting by price from lowest to highest.
- When a new product is registered, the listing should open automatically.
- There should be a button to register a new product from the listing.
- You may implement the test as far as you can.
- The implementation can be done with any programming language.


# Guia do projeto
### Front-end
- Angular 19.1.0 | rxjs 7.8.0
- Bootstrap 5.3.3
- TypeScript 5.7.2
- IDE: VS CODE 

Faça o download do Angular 19.1.0 utilizando npm:

``npm install -g @angular/cli@19.1.0``
####
Clone o Front-end do projeto pelo repositório:
[Repositório Front-end](https://github.com/pedrohsouza20/challenge-crud-products-front-end)
######
No diretório do projeto, instale suas dependencias utilizando o terminal:

``npm install ou npm -i``
######
Em seguida, suba o projeto utilizando a porta 4200 (padrão no Angular)

``ng serve``
ou
``ng serve --port 4200``
- Caso queira utilizar outra porta, lembre-se de alterar a configuração de política de CORS no back-end, o mesmo foi configurado para mentir intereção HTTP com a porta 4200.
### Back-end
- Java 17
- Spring 3.4.2
- Maven
- IDE: IntelliJ Community

Baixe o Java e o JDK 17

Clone o Back-end do projeto pelo repositório: [Repositório Back-end](https://github.com/pedrohsouza20/challenge-crud-products-api)
Defina as variáveis de ambiente para a conexão com o banco de dados:

- Caso esteja utilizando IntelliJ:
Menu > Run > Edit Configurations > Enviroment Variables

``
username | password
``
####
Baixe todas as dependências, utilizando o Maven
Execute o projeto; o código gerará a tabela products no seu banco de dados.
### Database
- Postgres 17
- pgAdmin como SGBD 4

