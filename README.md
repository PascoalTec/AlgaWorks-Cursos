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


## Manutenção do banco de dados

db/migration

Arquivo para migration do MySQL, para criação de tabelas do banco de dados

##### IMPORTANTE!! NECESSÁRIO SER EXATAMENTE DESTA FORMA COM V001 QUE DITA O VERSIONAMENTO E DOIS __

ex.: V001__cria-tabela-proprietario.sql



## Jakarta Persistence (JPA)

Uma especificação que fornece a API um mapeamento de objeto relacional

@Entity() se não especificar o nome da tabela, por padrão o nome da classe vira o nome da tabela

@Table(name = "tb_proprietario") indica que a classe Proprietario agora está vinculada a tabela "tb_proprietario" no modelo relacional

ex.: A classe Proprietario seria uma classe de persistência

@Id define a propriedade como a propriedade de identificação do objeto, ela será a chave primária

@GeneratedValue(strategy = GenerationType.IDENTITY) define a estratégia de geração da chave para usar a forma nativa do banco de dados, por que ele está como auto incrementado

@Column - como as colunas já estão o mesmo nome, é opcional a inclusão desta anotação, quando a classe está anotada com a classe @Entity, elas já estão mapeadas usando o padrão, o nome da propriedade será o nome da coluna da tabela


Metodo Equals é o metodo que se usa para comparar objetos se o conteudo do objeto é igual a outro

#### Podemos gerar o EqualsAndHashCode pela dependencia do Lombok, usando @EqualsAndHashCode

@EqualsAndHashCode ele gera um equals e hashCode com base todas as prioridades, neste caso do projeto eu só quero o ID, você usa o (onlyExplicitlyIncluded = true), eu quero apenas as propriedades que eu incluir EXPLICITA