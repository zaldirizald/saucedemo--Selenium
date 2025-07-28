package starter.StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.Page.LoginPage;

public class LoginStepsDefinition {
    @Steps
    LoginPage loginPage;

    @Given("Pengguna berada di landingpage")
    public void penggunaBeradaDiLandingpage() {
        loginPage.OnlandingPage();
    }

    @When("Pengguna Input Username valid")
    public void penggunaInputUsernameValid() {
        loginPage.ClikdanInputUsername("standard_user");
    }

    @And("Pengguna Input Password valid")
    public void penggunaInputPasswordValid() {
        loginPage.ClikdanInputPassword("secret_sauce");
    }

    @And("Pengguna klik button Login")
    public void penggunaKlikButtonLogin() {
        loginPage.ClikButtonLogin();
    }

    @Then("Pengguna berhasil login")
    public void penggunaBerhasilLogin() {
        loginPage.ValidasiLoginValid();
    }
//============================== INVALID LOGIN ==============================================

    @Given("Pengguna berada di landingPage")
    public void penggunaBeradaDiLandingPage() {
        loginPage.OnlandingPage();
    }

    @When("Pengguna Input Username invalid")
    public void penggunaInputUsernameInvalid() {
        loginPage.ClikdanInputUsername("zaldirizald");
    }

    @And("Pengguna Input password valid")
    public void penggunainputPasswordValid() {
        loginPage.ClikdanInputPassword("secret_sauce");
    }

    @And("Pengguna klik button login")
    public void penggunaklikButtonLogin() {
        loginPage.ClikButtonLogin();
    }

    @Then("Pengguna tidak berhasil login")
    public void penggunaTidakBerhasilLogin() {
        loginPage.ValidasiLoginINvalid();
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", expectedMessage);
    }
    }

