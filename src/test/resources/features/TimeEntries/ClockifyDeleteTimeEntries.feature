
Feature: DeleteTimeEntries
  COMO usuario de Clockify
  QUIERO eliminar una hora registrada
  PARA limpiar mi espacio de trabajo

  Scenario Outline: Se Elimina una Hora registrada
    Given un timeEntries-id valido '<TimeEntriesId>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
   Examples:
     | operation | entity              | jsonName                        | status | TimeEntriesId            |
     | DELETE    | DELETE_TIME_ENTRIES | timeEntries/rqDeleteTimeEntries | 204    | 62b321d6c5d34c41311e06e1 |


