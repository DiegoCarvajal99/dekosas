#lenguage: en
Feature: Entrar a la pagina dekosas

  Background:
    Given que me encuentre en la pagina dekosas https://dekosas.com/co/

  Scenario: Buscar productos en una categoria en dekosas

    When quiero encontrar un producto
    Then Slecciono una categoria para escoger uno aleatoriamente
