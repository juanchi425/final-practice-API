
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


  Scenario Outline: Agregar horas a un proyecto resultado exitoso
    Given un Api-Key valido '<key>'
    And un Worspace-id valido '<worspaceId>'
    And projectId valido '<projectId>'
    And un Task valido '<taskId>'
    And un Tag valido '<tagId>'
    And una Hora de inicio '<H_inicio>'
    And una hora final  '<H_final>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se valida que los id de project '<projectId>' y task '<taskId>'coincidan
    And se valida que la hora de inicio '<H_inicio>' y la hora final '<H_final>' coincidadn
    Examples:
      | operation | entity           | jsonName                     | status | key                                              | worspaceId               | taskId                   | tagId                    | projectId                | H_inicio                 | H_final                  |
      | POST      | ADD_TIME_ENTRIES | timeEntries/rqAddTimeEntries | 201    | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e | 62b30cb0dc592149765fb0b2 | 62b30e25727d933cbdda1971 | 628808eeb5ab6e23f5414258 | 2023-08-12T18:00:14.000Z | 2023-08-28T13:00:14.000Z |
      | POST      | ADD_TIME_ENTRIES | timeEntries/rqAddTimeEntries | 201    | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e | 62b30cb0dc592149765fb0b2 | 62b30e25727d933cbdda1971 | 628808eeb5ab6e23f5414258 | 2023-09-12T18:00:14.000Z | 2023-09-28T13:00:14.000Z |


  @prueba
  Scenario Outline: Se modifica el campo descripcion de una hora registrada
    Given un Api-Key valido '<key>'
    And un Worspace-id valido '<worspaceId>'
    And projectId valido '<projectId>'
    And un Task valido '<taskId>'
    And un Tag valido '<tagId>'
    And un timeEntries-id valido '<TimeEntriesId>'
    And una descripcion '<descripcion>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>

    Examples:
      | operation | entity              | jsonName                        | status | key                                              | worspaceId               | TimeEntriesId            | descripcion         | projectId                | taskId                   | tagId                    |
      | PUT       | UPDATE_TIME_ENTRIES | timeEntries/rqAddTimeEntries    | 200    | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e | 62b325f3727d933cbdda2e1b | analisis info       | 628808eeb5ab6e23f5414258 | 62b30cb0dc592149765fb0b2 | 62b30e25727d933cbdda1971 |
      | PUT       | UPDATE_TIME_ENTRIES | timeEntries/rqUpdateTimeEntries | 200    | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e | 62b32520727d933cbdda2dbc | control de entradas | 628808eeb5ab6e23f5414258 | 62b30cb0dc592149765fb0b2 | 62b30e25727d933cbdda1971 |





