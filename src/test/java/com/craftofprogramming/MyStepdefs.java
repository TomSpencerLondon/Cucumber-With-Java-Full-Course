package com.craftofprogramming;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
  LibraryService libraryService;
  private Book book;

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
}
