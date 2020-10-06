Feature: As a potential client i want to interact with the functionalities of Login
#last changes
  Scenario Outline: Valid login
    Given The fichap app is loaded correctly
    When The user does the login process with '<email>' and '<password>'
    Then The modal message is '<message>'


    @Login
    Examples:
      | email                      | password             |message            |
      | marcoschamorro41@gmail.com | 123456               |Aviso              |



    Scenario Outline: Invalid Login
      Given The fichap app is loaded correctly
      When The user does the login process with '<email>' and '<password>'
      Then The failed message is '<message>'

      @Login
      Examples:
        | email                      | password             |message            |
        | testing123@gmail.com       | 123456               |Datos incorrectos  |


