package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/signup/personal")
public class RegisterPage extends PageObject {

    public void doRegister(){
        $("#firstName").sendKeys("Leonardo");
        $("#email").sendKeys("correoprueba123@yopmail.com");
        $("#lastName").sendKeys("Gomez");
        $("#birthMonth").selectByIndex(1);
        $("#birthDay").selectByIndex(1);
        $("#birthYear").selectByIndex(1);
        $("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a").click();
    }

    public String accountPageIsVisible(){
        return $("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[2]").getText();
    }


}
