Story:
    Como requisitado pelo cliente
    Deve ser implementado um sistema de login 
    para diferenciar os usuários do sistema

Scenario: Cadastrar um usuário
Given Temos uma base de dados
When Cadastrar uma pessoa
Then cadastro feito com sucesso

Scenario: Logar
Given Temos o sistema de login
When Autenticar um usuário
Then autenticação feita com sucesso
