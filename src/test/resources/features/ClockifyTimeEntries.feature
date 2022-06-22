@prueba
Feature: Project
  COMO usuario de Clockify
  QUIERO consultar las horas registradas
  PARA llevar un control de los mismos

  Scenario Outline: Consulta Horas Registradas  resultado exitoso
    Given un Api-Key valido '<key>'
    And un Worspace-id valido '<worspaceId>'
    And un user-id valido '<userId>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se valida que los campos no esten vacios
    Examples:
      | operation | entity           | jsonName                     | status | key                                              | worspaceId               | userId                   |
      | GET       | GET_TIME_ENTRIES | timeEntries/rqGetTimeEntries | 200    | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e | 628807ae3bf26277d6055a69 |



