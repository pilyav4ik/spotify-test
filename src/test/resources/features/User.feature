Feature: Get user
  I needed get user information by token
  Scenario Template: Send request for getting user info
    Given get user request
    Then request is <status>
    Examples:
    |status|
    |  200 |
