package starter.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterPassword {
    static Target PASSWORD_FIELD = Target.the("password field").located(By.name("Password"));
}
