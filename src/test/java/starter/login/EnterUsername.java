package starter.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterUsername {
    static Target USERNAME_FIELD = Target.the("username field").located(By.name("Username"));
}
