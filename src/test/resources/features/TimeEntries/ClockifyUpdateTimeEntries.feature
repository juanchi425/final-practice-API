
Feature: UpdateTimeEntries
  COMO usuario de Clockify
  QUIERO Modificar un campo de una hora registrada
  PARA corregir errores

  Scenario Outline: Se modifica el campo descripcion de una hora registrada
    Given projectId valido '<projectId>'
    And un Task valido '<taskId>'
    And un Tag valido '<tagId>'
    And un timeEntries-id valido '<TimeEntriesId>'
    And una descripcion '<description>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>

    Examples:
      | operation | entity              | jsonName                        | status | TimeEntriesId            | description | projectId                | taskId                   | tagId                    |
      | PUT       | UPDATE_TIME_ENTRIES | timeEntries/rqUpdateTimeEntries | 200    | 62b35ffb727d933cbdda536b | arhe2       | 628808eeb5ab6e23f5414258 | 62b30cb0dc592149765fb0b2 | 62b30e25727d933cbdda1971 |




