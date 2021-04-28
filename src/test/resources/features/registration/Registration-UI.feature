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

  Scenario Outline: User registration no passed by UI with invalid email

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
    Then content with text "This email is invalid. Make sure it's written like example@email.com" visible
    Examples:
      | email          | emailtwo        | password | profilename | month | day | year | gender |
      | "gmail.com"    |"@gmail.com"     | "12345"  | "Robot 123" | "May" | 15  | 1986 | "non-binary"   |

  Scenario Outline: User registration no passed by UI without confirm email

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
    Then content with text "You need to confirm your email." visible
    Examples:
      | email               | emailtwo        | password | profilename | month | day | year | gender |
      | "mail@gmail.com"    |""               | "12345"  | "Robot 123" | "May" | 15  | 1986 | "non-binary"   |

  Scenario Outline: User registration no passed by UI without password

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
    Then content with text "You need to enter a password." visible
    Examples:
      | email               | emailtwo        | password | profilename | month | day | year | gender |
      | "mail@gmail.com"    |"mail@gmail.com" | ""  | "Robot 123" | "May" | 15  | 1986 | "non-binary"   |

  Scenario Outline: User registration no passed by UI without profile name

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
    Then content with text "Enter a name for your profile." visible
    Examples:
      | email               | emailtwo        | password | profilename | month | day | year | gender |
      | "mail@gmail.com"    |"mail@gmail.com" | "12345"  | ""          | "May" | 15  | 1986 | "non-binary"   |


  Scenario Outline: User registration no passed by UI without date of birth

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
    Then content with text "Select your birth month." visible
    Then content with text "Enter a valid day of the month." visible
    Then content with text "Enter a valid year." visible
    Examples:
      | email               | emailtwo        | password | profilename | month | day | year | gender |
      | "mail@gmail.com"    |"mail@gmail.com" | "12345"  | "Robot"     | ""    |   0  |  0   | "non-binary"   |