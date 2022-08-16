#lenguage: en
Feature: Busquedas de productos

  Scenario Outline: <Caso><Producto>
    Given que me encuentre en la pagina dekosas <Url>
    When quiero conocer informacion del producto <Producto>
    Then valido el nombre del producto <Validar>

    Examples:
      | Caso            | Producto                | Url                     | Validar                                                                    |
      | Buscar producto | Papel de colgadura      | https://dekosas.com/co/ | Papel De Colgadura Deco Style - Gris - Konker                              |
      | Buscar producto | Goma de borrar soldados | https://dekosas.com/co/ | Goma De Borrar Soldados – Mustard                                          |
      | Buscar producto | Destapador              | https://dekosas.com/co/ | Destapador Wazi Negro – Mulikka                                            |
      | Buscar producto | Vinilo decorativo       | https://dekosas.com/co/ | Vinilo Decorativo Love - Adazio                                            |
      | Buscar producto | Marco para ecografia    | https://dekosas.com/co/ | Marco Para Ecografía "Love At First Sight" Pearhead Blanco - DKS Worldwide |
