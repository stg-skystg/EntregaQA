package TestWeb;

import Steps.RegisterPagesSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterPageTest {
    @Steps
    RegisterPagesSteps registerPagesSteps;


    @Managed(driver = "chrome")
    WebDriver browser;

    @Test
    public void appRegisterTest(){
        registerPagesSteps.isOnRegisterPage();
        registerPagesSteps.registerAsUser();
        registerPagesSteps.registerAsUserstep2();
    }


}
