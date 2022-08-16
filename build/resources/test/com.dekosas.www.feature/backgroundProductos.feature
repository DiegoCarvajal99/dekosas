#lenguage: en
Feature: Busquedas de productos

  Background:
    Given que me encuentre en la pagina dekosas https://dekosas.com/co/

  Scenario: Buscar productos en la pagina de dekosas

    When quiero conocer el precio del producto
      | producto |
      | colchon  |
    Then valido si el precio se adapta a mi presupuesto
      | validacion                           |
      | Plumón Sintético - Colchones Paraíso |

  Scenario: Buscar productos en la pagina de dekosas

    When quiero conocer el precio del producto
      | producto |
      | tapetes  |
    Then valido si el precio se adapta a mi presupuesto
      | validacion                                       |
      | Tapete Decorativo Prestige 8125-M721 - Deconcept |

  Scenario: Buscar productos en la pagina de dekosas

    When quiero conocer el precio del producto
      | producto        |
      | cuadros montaña |
    Then valido si el precio se adapta a mi presupuesto
      | validacion                         |
      | Cuadros Montaña Hielo - Interior P |