
Feature: Update Project
  COMO usuario de Clockify
  QUIERO Modificar Mis  Proyectos
  PARA Poder corregir ciertos errores


  Scenario Outline: Modifica Nombre y color del proyecto resultado exitoso

    Given un Api-Key valido '<key>'
    And un Worspace-id valido '<worspaceId>'
    And projectId valido '<projectId>'
    And un nombre del proyecto '<nombre>'
    And un color '<color>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se valida que el proyecto fue modificado '<nombre>' '<color>'
    Examples:
      | operation | entity         | jsonName                | status | nombre | color   | key                                              | worspaceId               | projectId                |
      | PUT       | UPDATE_PROJECT | project/rqUpdateProject | 200    | JUX    | #f33444 | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e | 628808eeb5ab6e23f5414258 |
      | PUT       | UPDATE_PROJECT | project/rqUpdateProject | 200    | home   | #f22444 | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e | 6292431183aa60205c948298 |
      | PUT       | UPDATE_PROJECT | project/rqUpdateProject | 200    | java   | #225444 | Y2UxNTAyNDYtMmIwYy00ZjM4LWI5NWYtZDFiOTYyYjI0NTkw | 628807ae3bf26277d6055a6e | 62952a225703a35a0c389c49                         |





