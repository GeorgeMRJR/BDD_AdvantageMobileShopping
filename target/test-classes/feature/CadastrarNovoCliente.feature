#language: pt
@CadastrarNovoCliente
Funcionalidade: Cadastro de novo usuario
  
  Usuario deve fazer um cadastro

  Contexto: 
    Dado que estou no aplicativo android advantage mobile shopping
    E toco no menu
    E toco em login
    E toco em nova conta
    Entao a tela de cadastro abrira

  @TestePositivo
  Esquema do Cenario: cadastro positivo
    E Digito o nome de usuario "<NomeDeUsuario>"
    E Digito o email "<Email>"
    E Digito a senha "<Senha>"
    E Digito a comfirmacao da senha "<ComfirmaSenha>"
    E Digito o primeiro nome "<Nome>"
    E Digito o sobre nome "<SobreNome>"
    E Digito o telefone "<Telefone>"
    E Seleciono o continente "<Continente>"
    E Digito o estado "<Estado>"
    E Digito o endereco "<Endereco>"
    E Digito a cidade "<Cidade>"
    E Digito o codigo postal "<Cep>"
    E clico no botao de registro
    Entao o usuario estara cadastrado

    Exemplos: Deve preencher todos os campos e efetuar cadastro com sucesso
      | NomeDeUsuario | Senha   | ComfirmaSenha | Email           | Nome   | SobreNome | Telefone  | Continente | Cidade   | Estado | Endereco | Cep      |
      | George      | Abc123  | Abc123        | george@test.com | George | Luiz      | 989999899 | Brazil     | Sorocaba | SP     | Av.Gal   | 18060501 |
      | Fulano        | Abc1236 | Abc1236       | joao@test.com   | joao   | da silva  | 898777877 | Japan      | Tokyo    | Tokyo  | Av.Meiji | 18060501 |

  @TesteNegativo
  Esquema do Cenario: cadastro negativo
    E Digito o nome de usuario ja existente "George"
    E Digito o email "<Email>"
    E Digito a senha "<Senha>"
    E Digito a comfirmacao da senha "<ComfirmaSenha>"
    E Digito o primeiro nome "<Nome>"
    E Digito o sobre nome "<SobreNome>"
    E Digito o telefone "<Telefone>"
    E Seleciono o continente "<Continente>"
    E Digito o estado "<Estado>"
    E Digito o endereco "<Endereco>"
    E Digito a cidade "<Cidade>"
    E Digito o codigo postal "<Cep>"
    E clico no botao de registro
    Entao o cadastro nao sera realisado

    Exemplos: cadastro negativo
      | NomeDeUsuario | Senha   | ComfirmaSenha | Email           | Nome   | SobreNome | Telefone  | Continente | Cidade   | Estado | Endereco | Cep      |
      | George        | Abc123  | Abc123        | george@test.com | George | Luiz      | 989999899 | Brazil     | Sorocaba | SP     | Av.Gal   | 18060501 |
      | George        | Abc1236 | Abc1236       | joao@test.com   | joao   | da silva  | 898777877 | Japan      | Tokyo    | Tokyo  | Av.Meiji | 18060501 |
