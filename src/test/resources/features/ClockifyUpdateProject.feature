@prueba
Feature: Add Project
  COMO usuario de Clockify
  QUIERO Agregar un nuevo Proyecto
  PARA llevar un control de los mismos

  Scenario Outline: Agrega un Proyecto Nuevo Exitoso
    Given un Api-Key valido
    And un Worspace-id valido
    And un nombre del proyecto
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se valida que el proyecto fue creado
    Examples:
      | operation | entity          | jsonName                | status |
      | POST      | ADD_NEW_PROJECT | project/rqAddNewProject | 201    |


