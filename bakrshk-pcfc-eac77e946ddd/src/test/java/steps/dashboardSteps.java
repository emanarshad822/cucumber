package steps;

import cucumber.api.java.en.Then;
import pages.DashboardPage;

public class dashboardSteps {
    DashboardPage db = new DashboardPage();

    @Then("^click on pass management$")
    public void clickOnPassManagement() throws Exception {

        db.ClickPassManagement();
    }

    @Then("^click on apply for pass$")
    public void clickOnApplyForPass() throws Exception{
        db.ClickApplyPass();
    }

    @Then("^click on search pass$")
    public void clickOnSearchPass() throws Exception {
        db.ClickSearchPass();
    }

    @Then("^Click print Pass$")
    public void clickPrintPass() throws Exception {
        db.ClickPrintPass();
    }
    @Then("^Click Pass Approval$")
    public void clickPassApproval() throws Exception {
        db.ClickPassApproval();
    }
}
