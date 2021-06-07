package Steps;

import UIPages.RegisterPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterPagesSteps {

    private RegisterPage registerPage;

    @Step
    public void isOnRegisterPage(){
        registerPage.open();
    }

    @Step
    public void registerAsUser(){
        registerPage.doRegister();
    }

    public void registerAsUserstep2(){
        registerPage.accountPageIsVisible();
    }

}
