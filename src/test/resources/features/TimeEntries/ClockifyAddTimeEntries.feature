
Feature: AddTimeEntries
  COMO usuario de Clockify
  QUIERO agregar  horas a un proyecto
  PARA actualizar trabajos

  @prueba
  Scenario Outline: Agregar horas a un proyecto resultado exitoso
    Given projectId valido '<projectId>'
    And un Task valido '<taskId>'
    And un Tag valido '<tagId>'
    And una Hora de inicio '<H_inicio>'
    And una hora final  '<H_final>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se valida que los id de project '<projectId>' y task '<taskId>'coincidan
    And se valida que la hora de inicio '<H_inicio>' y la hora final '<H_final>' coincidadn
    And Se verifica campos no vacios
    Examples:
      | operation | entity           | jsonName                     | status | taskId                   | tagId                    | projectId                | H_inicio                 | H_final                  |  |  |  |
      | POST      | ADD_TIME_ENTRIES | timeEntries/rqAddTimeEntries | 201    | 62b30cb0dc592149765fb0b2 | 62b30e25727d933cbdda1971 | 628808eeb5ab6e23f5414258 | 2023-10-12T19:00:14.000Z | 2023-11-28T12:00:14.000Z |  |  |  |



