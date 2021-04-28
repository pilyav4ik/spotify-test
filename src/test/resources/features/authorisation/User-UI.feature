Feature: User sign in UI

Scenario: User authorisation by UI

Then click "Log in" link
Then input email
Then input password
Then check checkbox "Remember me" is cheked
Then click login button
Then content with "Account overview" visible