Feature: print every step

  Background: ready
    Given BackGround is here
  Scenario Outline: scenario outLine
    Given this is given in start scenario outLine <first column> <second column>
    When This is when in start scenario outLine <first column> <second column>
    Then This is then in start scenario outLine <first column> <second column>
    Examples:is been executed one by one
      |first column |second column   |
      |row 1        |row 2           |
      |row 3        |row 4           |
      |row 5        |row 6           |



