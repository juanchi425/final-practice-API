@prueba
Feature: Project
  COMO usuario de Clockify
  QUIERO ver los projectos de mi Worckspace
  PARA llevar un control de los mismos

  Scenario Outline: Consulta Projects de Worksapce resultado exitoso
    Given un Api-Key valido
    And un Worspace-id valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    @Workspace
    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | PROJECT | Project/rq | 200    |


















  #Scenario Outline: Consulta Workspace resultado erroneo

    #Given X-Api-Key invalido
    #When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    #And se obtuvo el status code <status>
    #@Workspace
    #Examples:
     # | operation | entity | jsonName     | status |
      #| GET       | ERROR   | workspace/rq | 401    |