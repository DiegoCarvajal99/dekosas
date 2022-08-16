#lenguage: en
Feature: Entrar a la pagina dekosas y buscar

  Background:
    Given que me encuentre en la pagina dekosas https://dekosas.com/co/

  Scenario: Buscar productos desde excel

    When quiero encontrar un producto desde excel
    Then Seleccionar producto


