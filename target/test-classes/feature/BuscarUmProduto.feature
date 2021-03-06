#language: pt
@BuscarUmProduto
Funcionalidade: Deve Bususcar um produto
  
  O usuario buscara um produto pelo campo de busca

  Contexto: 
    Dado que estou na tela principal do aplicativo android advantage mobile shopping

  @TestePositivo
  Esquema do Cenario: Buscar um produto existente
    E buscou no campo de busca o "<Produto>"
    E o usuario tocou no icone da lupa
    Entao a pagina do resultado aparecera com o resultado da busca "<Produto>"
    E o usuario toca no produto
    Entao a pagina do "<Produto>" sera exibida

    Exemplos: Buscar um produto existente
      | Produto                              |
      | HP USB 3 BUTTON OPTICAL MOUSE        |
      | LOGITECH USB HEADSET H390            |
      | BOSE SOUNDLINK BLUETOOTH SPEAKER III |

  @TesteNegativo
  Esquema do Cenario: Buscar um produto nexistente
    E buscou no campo de busca o "<Produto>"
    E o usuario tocou no icone da lupa
    Entao aparecera uma pagina informando que o produto "<Produto>" nao foi encontrado

    Exemplos: Buscar um produto inexistente
      | Produto |
      | iphone  |
      | Samsung |
      | Xiaomi  |
