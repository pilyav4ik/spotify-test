Feature: Get user
  I needed get user information by token
  Scenario Template: Send request for getting user info
    Given get user request
    Then request is <status>
    Examples:
    |status|
    |  200 |

  Scenario Template: Send request for getting user Name
    Given get user name
    Then name is "<display_name>"
    Examples:
      |display_name|
      |ipiliavskyi|