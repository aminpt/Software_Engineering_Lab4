Feature: Calculator Operations
  In order to do complex math
  I want to calculate the square root of division

  Scenario: Square root of 4 divided by 1
    Given Two input values, 4 and 1
    When I calculate the square root of division
    Then I expect the result 2

  Scenario Outline: Square root of division with examples
    Given Two input values, <a> and <b>
    When I calculate the square root of division
    Then I expect the result <result>

    Examples:
      | a  | b | result |
      | 4  | 1 | 2      |
      | 36 | 4 | 3      |
