@checkPagesElements
  Feature: login feature automation scenarions

    Background: application should be installed and open
      Given I should set the test environment

    @startingPage
    Scenario: area will be used as start page should be enabled
      Given should be on page: "start page"
      When areas should be enabled and clickable
        |searchTextBoxElement   |
        |GetStartedButtonElement|
      Then if not I should learn them


    @login
    Scenario: area will be used for loging-in should be enabled
      Given click to button: "GetStartedButtonElement"
      And should be on page: "LoginPage"
      Then areas should be enabled and clickable
        |userNameTextBoxElement |
        |passwordTextBoxElement |
        |signInButton           |
        |forgotPassword         |
        |signInWithGoogle       |
        |signInWithWithFaceBook |
        |switchToRegister       |

      Then if not I should learn them

    @registerPage
      Scenario:  area will be used for RegisterPage should be enabled
        Given click to button: "GetStartedButtonElement"
        And should be on page: "LoginPage"
        And click to button: "switchToRegister"
        And should be on page: "RegisterPage"
        Then areas should be enabled and clickable
          |firstNameRegisterTextBoxElement  |
          |emailRegisterTextBoxElement      |
          |passwordRegisterTextBoxElement   |
          |show_Hide_PasswordButtonElement  |

        Then if not I should learn them
        When I send keys <below> to text Box: "passwordRegisterTextBoxElement"
            | 123456 |
        Then it should be "hidden" in "passwordRegisterTextBoxElement"
        When click to button: "show_Hide_PasswordButtonElement"
        Then it should be "shown" in "passwordRegisterTextBoxElement"
        Then if not I should learn them

