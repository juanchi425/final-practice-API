
Feature: Add Project
  COMO usuario de Clockify
  QUIERO Agregar un nuevo Proyecto
  PARA llevar un control de los mismos

  Scenario Outline: Agrega un Proyecto Nuevo Exitoso
    Given un Api-Key valido '<key>'
    And un Worspace-id valido '<worspaceId>'
    And projectId valido '<projectId>'
    And un nombre del proyecto '<nombre>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se valida que el proyecto fue creado '<nombre>'
    Examples:
      | operation | entity          | jsonName                | status | key                                              | worspaceId               | projectId                | nombre |
      | POST      | ADD_NEW_PROJECT | project/rqAddNewProject | 201    | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e | 628808eeb5ab6e23f5414258 | Kiwi3  |
      | POST      | ADD_NEW_PROJECT | project/rqAddNewProject | 201    | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e | 628808eeb5ab6e23f5414258 | i2     |
      | POST      | ADD_NEW_PROJECT | project/rqAddNewProject | 201    | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e | 628808eeb5ab6e23f5414258 | mike    |



