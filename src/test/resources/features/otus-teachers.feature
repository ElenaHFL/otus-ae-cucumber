#language:en

Feature: Validate Otus teacher information

  Scenario Outline: As a user I can get information on teachers
    Given I navigate to Otus main page by 'https://otus.ru/'
    When I go to teacher page
    Then I should find info about '<workplace>' for '<teacher>'
    Examples:
      | teacher                   | workplace                                 |
      | Станислав Ступников       | Программист рекламной системы в Mail.Ru   |
      | Юрий Дворжецкий           | Luxoft Training Center                    |


  Scenario Outline: As a user I can get information on the number of teachers teaching the course
    Given I navigate to Otus main page by 'https://otus.ru/'
    When I go to teacher page
    Then I should find that the '<courseName>' is taught by <count> people
    Examples:
      | courseName             | count                     |
      | Data Engineer          | 3                         |
      | Python QA Engineer     | 5                         |
      | QA Lead                | 4                         |
