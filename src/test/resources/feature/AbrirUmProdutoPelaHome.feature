 #language: pt
@AbrirUmProduto
Funcionalidade: Tocar em um produto na tela principal
  
  Deve Abrir um produto pela tela principal

  Contexto: 
    Dado que estou na tela principal do aplicativo android advantage mobile shopping

  @TestePositivo
  Esquema do Cenario: produto pela tela inicial positivo
    E toco na categoria "<Categoria>"
    Entao deve abrir a tela da categoria "<Categoria>"
    E toco no produto "<Produto>"
    Entao aparecera a tela do produto "<Produto>"

    Exemplos: 
      | Categoria  | Produto                          |
      | LAPTOPS    | HP Chromebook 14 G1(ENERGY STAR) |
      | TABLETS    | HP Elite x2 1011 G1 Tablet       |
      | HEADPHONES | HP H2310 In-ear Headset          |
      | MICE       | HP Z3600 Wireless Mouse          |

  @TesteNegativo
  Esquema do Cenario: Nao deve aceitar quantidade maior que 10 produtos no carrinho
    Dado que estou logado e o carrinho esta vasio
    E toco na categoria "<Categoria>"
    Entao deve abrir a tela da categoria "<Categoria>"
    E toco no produto "<Produto>"
    Entao aparecera a tela do produto "<Produto>"
    E coloco vinte itens do produto
    Entao deve aparecer 10 itens no carrinho

    Exemplos: Nao deve aceitar quantidade maior que 10 produtos no carrinho
      | Categoria  | Produto                          |
      | LAPTOPS    | HP Chromebook 14 G1(ENERGY STAR) |
      | TABLETS    | HP Elite x2 1011 G1 Tablet       |
      | HEADPHONES | HP H2310 In-ear Headset          |
