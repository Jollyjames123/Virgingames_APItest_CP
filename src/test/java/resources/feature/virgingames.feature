Feature: Validating different values for virgingames application

@SMOKE
  Scenario: Check that user can get data with valid path and end point
    When    User sends a GET request with '/bingo' path and '/GetBingoLobbyFeed.do' end point
    Then    User gets valid status code '200'


  Scenario: Verify that default value of game frequency is 300000
    When    User sends a GET request with '/bingo' path and '/GetBingoLobbyFeed.do' end point
    And     User extracts default value of all game frequency
    Then    User is able to verify default value of game frequency

  Scenario: Verify that timestamp value is always in future
    When    User sends a GET request with '/bingo' path and '/GetBingoLobbyFeed.do' end point
    And     User gets current timestamp
    And     User extracts the starttimes for all the games
    Then    User is able to verify that timestamp value is in future

