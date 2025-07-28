package starter.Page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.time.Duration;


public class LoginPage extends PageObject {
//============================ Locator ===============================================
    private By LandingPage (){
        return By.xpath("//*[@id=\"root\"]/div/div[1]");
    }
    private By InputUsername (){
        return By.xpath("//*[@id=\"user-name\"]");
    }
    private By InputPassword (){
        return By.xpath("//*[@id=\"password\"]");
    }
    private By ButtonLogin (){
        return By.xpath("//*[@id=\"login-button\"]");
    }
    private By ValidasiLogin(){
        return  By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    }
    private By ErrorMessage(){
        return  By.xpath("//h3[@data-test='error']");
    }


    //=========================================== Function =================================
    @Step
    public void OnlandingPage(){
    open();
        $(LandingPage()).isDisplayed();}

    public void ClikdanInputUsername(String Username){
        $(InputUsername()).click();
        $(InputUsername()).type(Username);
    }
    public void ClikdanInputPassword(String Password){
        $(InputPassword()).click();
        $(InputPassword()).type(Password);
    }
    public void ClikButtonLogin(){
        $(ButtonLogin()).click();
    }
    public void ValidasiLoginValid(){
        $(ValidasiLogin()).shouldBeVisible();
    }
    public void ValidasiLoginINvalid() {
        $(ErrorMessage()).shouldBeVisible(); // ini biar error message dipastikan tampil
    }
    }


