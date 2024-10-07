package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import starter.login.ClickLoginButton;
import starter.login.InvalidCredentials;
import starter.navigation.NavigateTo;
import net.serenitybdd.screenplay.ensure.Ensure;

public class LoginStepDefinitions {

    @Given("{actor} is on the login page")
    public void onTheLoginPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theLoginPage());
    }

//    he enters his username {string} and password {string}
    @When("{actor} enters his username {string} and password {string}")
    public void entersUsernameAndPassword(Actor actor, String username, String password) {
        actor.attemptsTo(
                ClickLoginButton.about(username, password)
        );
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("{actor} enters his username {string} and incorrect password {string}")
    public void entersUsernameAndIncorrectPassword(Actor actor, String username, String password) {
        actor.attemptsTo(
                ClickLoginButton.about(username, password)
        );
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("{actor} should be redirected to the home page")
    public void shouldBeRedirectedToHomePage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(TheWebPage.title()).containsIgnoringCase("Dashboard")
        );
    }

    @Then("{actor} should see an error message")
    public void shouldSeeErrorMessage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(InvalidCredentials.INVALID_MESSAGE).isDisplayed()
        );
    }
}