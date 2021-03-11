# SistemasDistribuidos
Repositório com o código das aulas da disciplina de Sistemas Distribuidos

 - Aula 01
  Vimos requisições HTTP
  Configuramos um ambiente de desenvolvimento, podendo optar pelas seguintes ferramentas:
  
 - Ide
 - [ ] [Spring STS](https://spring.io/tools)
 - [ ] [InteliJ](https://www.jetbrains.com/pt-br/idea/download/#section=windows)

 - Requisições e rotas
 - [ ] [Insomnia](https://insomnia.rest/download/)
 - [ ] [Postman](https://www.postman.com/downloads/)
-------

Estrutura básica do projeto

 Source/ ```src``` ==>
|_ MAIN/ Onde ficarão os códigos desenvolvidos da aplicação.

||__ > Java/ ```MercadoUnifavipApplication``` possui uma chamada de método para inicializar o container que possui a aplicação
A porta padrão de um projeto Java estará na porta 8080

||__ > Resources/ Configurações dos serviços e aplicação

|_ TESTE/ Diretório para desenvolvimento de testes, tanto unitários como testes de integração

-------


Para que a aplicação funcione, é necessário preencher e configurar a url da base de dados, o nome de usuário, senha e dependendo do SGBD é necessário o nome.
Essa configuração é feita no arquivo application.properties

-------


A classe de Products recebe do Lombock as tags de:

```@Data``` = mapeia métodos de get e set

```@Entity``` = define como uma entidade para o banco de dados

```@Table(name = "products")``` = nomeia a tabela na criação do banco de dados
