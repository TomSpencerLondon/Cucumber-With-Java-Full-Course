Feature: Query books from the LibraryService

  Background:
    Given That the LibraryService is initialized

  Scenario: Query the LibraryService for a specific book given a title
    When I query the LibraryService for the "Effective Java" book
    Then It is "true" that I find it

  Scenario: Query the LibraryService for the most popular topic
    When I query the LibraryService for the the most popular topic
    Then I get COMPUTING
