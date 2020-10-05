#language:en

Feature: Validate Otus contacts information

  Scenario Outline: As a user I can get information on social networks
    Given I navigate to Otus contacts page by 'https://otus.ru/'
    When I select social network '<name>'
    Then I should get link '<link>' by '<name>'
    Examples:
      | name             | link                                                       |
      | Facebook         | https://www.facebook.com/otus.ru/                          |
      | OK               | https://ok.ru/group/54448251797611                         |
      | YouTube          | https://www.youtube.com/channel/UCetgtvy93o3i3CvyGXKFU3g   |


  Scenario Outline: As a user I can get information on contacts
    Given I navigate to Otus contacts page by 'https://otus.ru/'
    When I select contact '<name>'
    Then I should get info '<info>' for '<name>'
    Examples:
      | name             | info                                  |
      | email            | help@otus.ru                          |
      | telephone        | +7 499 938-92-02                      |