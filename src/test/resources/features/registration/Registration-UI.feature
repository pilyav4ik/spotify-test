Feature: User sign up UI

  Scenario Outline: User registration by UI

    Given click "Sign up" link
    When input email <email> for registration
    When input email <emailtwo> again for registration
    When input password <password> for registration
    When input profile name <profilename> for registration
    When input month of birth <month> for registration
    When input day of birth <day> for registration
    When input year of birth <year> for registration
    When check gender <gender> for registration
    And click "Sign up" button
    Examples:
    | email               | emailtwo        | password | profilename | month | day | year | gender |
    | "mail@gmail.com"    |"mail@gmail.com" | "12345"  | "Robot 123" | "May" | 15  | 1986 | "non-binary"   |
