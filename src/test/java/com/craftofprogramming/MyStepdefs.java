package com.craftofprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Optional;

public class MyStepdefs {
  LibraryService libraryService;
  private Book book;
  private Optional<Topic> topic;

  @Given("^That the LibraryService is initialized$")
    public void thatTheLibraryServiceIsInitialized() {
      this.libraryService = LibraryService.getService(true);
    }
    @When("^I query the LibraryService for the \"([^\"]*)\" book$")
    public void iQueryTheLibraryServiceForTheBook(String bookTitle) {
      book = libraryService.getBookWithTitle(bookTitle);
    }

    @Then("It is {string} that I find it")
    public void itIsThatIFindIt(String isTrueStr) {
      final Boolean isTrue = Boolean.valueOf(isTrueStr);
      if (isTrue) {
        assertNotNull(book);
      }else {
        assertNotNull(book);
      }
    }

  @When("I query the LibraryService for the the most popular topic")
  public void iQueryTheLibraryServiceForTheTheMostPopularTopic() {
    topic = libraryService.mostPopularTopic();
  }

  @Then("I get {}")
  public void iGet(Topic actualTopic) {
    assertEquals(actualTopic, topic.get());
  }
}
