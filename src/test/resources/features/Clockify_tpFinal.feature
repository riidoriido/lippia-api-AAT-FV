@Regression @ClockifyAPI

Feature: API tests with Clockify API

  Scenario Outline:Get hours from Time Entry
    Given user provides <x-api-key>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And define timeEntryId
    Examples:
      | x-api-key                                        | operation | entity         | jsonName       | statusCode |
      | ZjdkMjY5MmEtNGM1MS00ZTdiLTlmNzAtYjA4YmEyY2Q3OGVk | GET       | GET_TIME_ENTRY | getTimeEntries | 200        |

  Scenario Outline:Add Time Entry to project
    Given user provides <x-api-key>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    Examples:
      | x-api-key                                        | operation | entity         | jsonName       | statusCode |
      | ZjdkMjY5MmEtNGM1MS00ZTdiLTlmNzAtYjA4YmEyY2Q3OGVk | POST       | POST_TIME_ENTRY | addTimeEntry | 201       |

  Scenario Outline:Edit Time Entry
    Given user provides <x-api-key>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    Examples:
      | x-api-key                                        | operation | entity         | jsonName       | statusCode |
      | ZjdkMjY5MmEtNGM1MS00ZTdiLTlmNzAtYjA4YmEyY2Q3OGVk | PUT       | PUT_TIME_ENTRY | editTimeEntries | 200        |

  Scenario Outline:Delete Time Entry
    Given user provides <x-api-key>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    Examples:
      | x-api-key                                        | operation | entity         | jsonName       | statusCode |
      | ZjdkMjY5MmEtNGM1MS00ZTdiLTlmNzAtYjA4YmEyY2Q3OGVk | DELETE       | DELETE_TIME_ENTRY | getTimeEntries | 204        |