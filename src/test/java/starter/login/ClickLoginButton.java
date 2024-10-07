package starter.login;

import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class ClickLoginButton {
public static Performable about(String username, String password) {
        System.out.println("Entra al clickloginbutton " + username + " " + password);
        System.out.println("Entra al clickloginbutton " + EnterUsername.USERNAME_FIELD);
        System.out.println("Entra al clickloginbutton " + EnterPassword.PASSWORD_FIELD);
        return Task.where("{0} login for '" + username + "' with password '" + password + "'",
                Clear.field(EnterUsername.USERNAME_FIELD),
                Enter.theValue(username).into(EnterUsername.USERNAME_FIELD),
                Clear.field(EnterPassword.PASSWORD_FIELD),
                Enter.theValue(password).into(EnterPassword.PASSWORD_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }
}
