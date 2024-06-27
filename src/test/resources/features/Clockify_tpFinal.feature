@Regression @ClockifyAPI

Feature: API tests with Clockify API

  @GetTimeEntry
  Scenario Outline:Get Time Entry
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And expected response is obtained in '<entity>' with '<expectedResponse>'
    Examples:
      | operation | entity         | jsonName     | statusCode | expectedResponse |
      | GET       | GET_TIME_ENTRY | getTimeEntry | 200        | OK               |

  @AddTimeEntry
  Scenario Outline:Add Time Entry to project
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And expected response is obtained in '<entity>' with '<expectedResponse>'
    And print '<expectedResponse>'
    Examples:
      | operation | entity          | jsonName     | statusCode | expectedResponse |
      | POST      | POST_TIME_ENTRY | addTimeEntry | 201        | OK               |

  @EditTimeEntry
  Scenario Outline:Edit Time Entry
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And expected response is obtained in '<entity>' with '<expectedResponse>'
    And print '<expectedResponse>'
    Examples:
      | operation | entity         | jsonName      | statusCode | expectedResponse |
      | PUT       | PUT_TIME_ENTRY | editTimeEntry | 200        | OK               |

  @DeleteTimeEntry
  Scenario Outline:Delete Time Entry
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And expected response is obtained in '<entity>' with '<expectedResponse>'
    And print '<expectedResponse>'
    Examples:
      | operation | entity            | jsonName        | statusCode | expectedResponse |
      | DELETE    | DELETE_TIME_ENTRY | deleteTimeEntry | 204        | OK               |