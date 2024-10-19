## Ignição Spring Rest:
CRUD = Cadastro , Consulta, Exclusão, Atualização (CREATE, READ, UPDATE, DELETE)

EndPoints = Serviços para realizar operações CRUD


## Dependencias:

Starter Spring Web = Adiciona outras dependencias que é necessário para um projeto WEB funcionar


## Estrutura do Projeto:

.mvn = Maven Wrapper, maven imbutido dentro do projeto para que não precise instalar o maven no computador


.src/main = Pasta aonde fica os códigos Java


.src/resources = Pasta aonde fica os códigos de Configuração


.gitignore = Caso esteja trabalhando com o git, ele ignora alguns arquivos


Help.md = Ajuda sobre o seu projeto


application.properties = Arquivo para fazer customizações de configurações do Projeto Spring Boot


domain = Aonde vai ficar todos os códigos que vão estar sobre o nosso dominio

domain/model = Aonde vao ficar as classes deste contexto (ex .: Proprietario)


## Arquivo do Maven:
pom.xml:
            POM = Project Object Model

coração de um projeto maven:
arquivo xml, contem informações e configurações do projeto usados pelo maven para fazer o build do projeto, todas as configurações de dependencias e
como o projeto vai ser construido


## FATJAR:

Empacotamento de aplicações



<!-- Anotações -->

## @RestController

Diz que a classe controller é um componente Spring propria para desenvolvimento de Rest APIs


## @GetMapping

Metodo para obter alguma representação de um recurso



<!-- Collection Resource -->

## Collection Resource:

Apenas para organizar as chamadas "requisições" feitas no PostMan 



<!-- application.properties  -->

## application.properties:

Arquivo para fazer customizações de configurações do Projeto Spring Boot



## spring.datasource.url:

Espera uma URL de conexão de banco de dados


ex.: jdbc:mysql://host1:33060/sakila

jdbc:mysql nao muda, é padrao de conexão do MySql


host1 é o endereço aonde o banco de dados será iniciado, caso a conexão seja local, terá que alterar para "localhost"

ex.: jdbc:mysql://localhost:33060/sakila


33060 é a porta do MySql, no meu caso para o meu MySql a porta é 3306 que é o padrão, se você não especificar, ele ja pega por padrão a 3306

ex.: jdbc:mysql://localhost:3306/sakila  OU jdbc:mysql://localhost/sakila


sakila é o nome do schema, grupamento aonde fica os elementos


ex.: tabelas, views, procedures