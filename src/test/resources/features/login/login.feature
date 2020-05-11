@Login
Feature: Configuraçoes
  Como configurar
  Eu quero configurar
  Para automação

  @sanity
  Scenario: Deve validar o funcionamento da aplicação
    Given que o valor do contador eh 15
    When eu incrementar em 3
    Then o valor do contador sera 18

  @sanity
  Scenario: Deve incrementar contador
    Given que o valor do contador eh 10
    When eu incrementar em 2
    Then o valor do contador sera 12