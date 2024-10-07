package starter.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class ClickLoginButton {
public static Performable about(String username, String password) {
        return Task.where("{0} login for '" + username + "' with password '" + password + "'",
                Clear.field(EnterUsername.USERNAME_FIELD),
                Enter.theValue(username).into(EnterUsername.USERNAME_FIELD),
                Clear.field(EnterPassword.PASSWORD_FIELD),
                Enter.theValue(password).into(EnterPassword.PASSWORD_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }
}
