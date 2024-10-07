package starter.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InvalidCredentials {
    public static Target INVALID_MESSAGE = Target.the("error login message").located(By.id("toast-container"));
}
