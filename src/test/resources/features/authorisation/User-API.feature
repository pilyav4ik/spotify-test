Feature: User sign in API

  I needed get user information by token
  Scenario Template: Send request for getting user info
    Given get user request
    Then token is "<token>" then request is <status>
    Examples:
      |token|status|
      |BQBURtS_-rLupcmqNQnoGLjuKEWQz-oTmS7vHFaD3LWDIMpRgfTa49-X5Dd-NYDM_AHsl60Rw6ausIHiomNQkOp4ZbJOMmEUBCny52ceUCHfPZkvo0DVo4YraioOvq5AvfIQJ231C_T3YKdAnze4joYtBTVpWwqBP_ARYYNcQwW6m3WKzZck-RqDKFfZv1zmDF2GCx-wcvTcRceJa_seSDm9Uq0vIHTzru_16wiw8IL7S3lr-pK8F8sDZ6hjUygOAd9KwD6QW1GERlvGb5neba0LSQ_RhOqP1pqfMvEK|  200 |
      |abcd |  401 |

  Scenario Template: Send request for getting user Name
    Given get user name
    Then name is "<display_name>"
    Examples:
      |display_name|
      |ipiliavskyi|