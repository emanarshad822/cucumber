package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.BeforeClass;
import pages.loginPage;
import runners.CucumberRunner;

public class loginStep {
     loginPage login = new loginPage();
     CucumberRunner c = new CucumberRunner();

    @Then("^I click sigin button$")
    public void iClickSiginButton() {

        login.ClickSubmitButton();
    }

    @Given("^I am on PCFC login page$")
    public void iAmOnPCFCLoginPage() throws Exception {
        c.setEnv();
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterAnd(String user, String pass) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        login.EnterUser(user);
        login.EnterPass(pass);
    }

    @Then("^i Logout from PCFC$")
    public void iLogoutFromPCFC() throws Exception {
        login.ClickLogout();
    }
}
