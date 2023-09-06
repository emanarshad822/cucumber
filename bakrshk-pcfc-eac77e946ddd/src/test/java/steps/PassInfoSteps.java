package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PassPage;
import runners.CucumberRunner;

public class PassInfoSteps {
PassPage pg = new PassPage();




    @Then("^accept the agreement$")
    public void acceptTheAgreement() throws Exception {
        pg.ClickAgree();
    }

    @Then("^Click on submit button$")
    public void clickOnSubmitButton() throws Exception {
        pg.ClickSubmitBtn();
    }

    @When("^Enter Pass \"([^\"]*)\" and \"([^\"]*)\" information Port$")
    public void enterPassAndInformationPort(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.SelectPort(arg0);
        pg.SelectEntryGate(arg1);
    }

    @When("^Enter Pass \"([^\"]*)\" and \"([^\"]*)\" information Pass$")
    public void enterPassAndInformationPass(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.SelectPassType(arg0);
        pg.SelectPassDuration(arg1);
    }

    @When("^Enter Visitor \"([^\"]*)\" and \"([^\"]*)\" information Visit$")
    public void enterVisitorAndInformationVisit(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.SelectVisitReason(arg0);
        pg.EnterDateofVisit(arg1);    }

    @When("^Enter Visitor \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" information Title$")
    public void enterVisitorAndAndInformationTitle(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.SelectTitle(arg0);
        pg.EnterFirstName(arg1);
        pg.EnterLastname(arg2);    }

    @When("^Enter Visitor \"([^\"]*)\" and \"([^\"]*)\" information National$")
    public void enterVisitorAndInformationNational(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.EnterNationailty(arg0);
        pg.EnterMobile(arg1);    }

    @When("^Enter Visitor \"([^\"]*)\" information Visa$")
    public void enterVisitorInformationVisa(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.SelectVisaType(arg0);
    }

    @When("^Enter Visitor \"([^\"]*)\" information  Company$")
    public void enterVisitorInformationCompany(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.EnterCompany(arg0);
    }

    @When("^Select Visitor \"([^\"]*)\" Designation$")
    public void selectVisitorDesignation(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.SelectDesignation(arg0);
        pg.UploadPhoto();
    }

    @Then("^Enter \"([^\"]*)\" and \"([^\"]*)\" Host$")
    public void enterAndHost(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.EnterHost(arg0);
        pg.EnterPerson(arg1);    }

    @When("^Enter Visitor \"([^\"]*)\" information  Email$")
    public void enterVisitorInformationEmail(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        pg.EnterEmail(arg0);    }

    @Then("^Select Dates for \"([^\"]*)\" passport$")
    public void selectDatesForPassport(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.ClickPassport();
        pg.EnterDate(arg0);
    }

    @Then("^Select Dates for \"([^\"]*)\" Visit$")
    public void selectDatesForVisit(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.ClickVisa();
        pg.EnterDate(arg0);
    }

    @Then("^Select Dates for \"([^\"]*)\" Trade$")
    public void selectDatesForTrade(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.ClickTrade();
        pg.EnterDate(arg0);
    }

    @Then("^Select Dates for \"([^\"]*)\" LPO$")
    public void selectDatesForLPO(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.ClickLPO();
        pg.EnterDate(arg0);
    }

    @Then("^Select Dates for \"([^\"]*)\" Other$")
    public void selectDatesForOther(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.ClickOther();
        pg.EnterDate(arg0);
        pg.ClickOther2();
        pg.EnterDate(arg0);
    }

    @Then("^add visitor btn click$")
    public void addVisitorBtnClick() throws InterruptedException {
        pg.ClickAddVisitor();
    }

    @Then("^Select Dates for \"([^\"]*)\" emirate$")
    public void selectDatesForEmirate(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    pg.ClickEmirates();
    pg.EnterDate(arg0);}


    @Then("^Enter Document Values \"([^\"]*)\"$")
    public void enterDocumentValues(String arg0) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        pg.ScrollView();
    pg.EnterDocuments(arg0);

    }
    @Then("^i accept pay \"([^\"]*)\"$")
    public void iAcceptPay(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
            pg.SelectPaymentYes(arg0);
    }


    @Then("^i Select Payment \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iSelectPaymentAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.SelectPaymentOption(arg0,arg1);
    }


    @Then("^Click Agree Button$")
    public void clickAgreeButton() throws Exception {
        pg.ClickAgreePayment();
        pg.ClickAgreePaymentBtn();
    }



    @Then("^Fill the Payment Card \"([^\"]*)\" and \"([^\"]*)\"$")
    public void fillThePaymentCardAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.clickRadio();
        pg.EnterCardNumberCVV(arg0,arg1);

    }

    @Then("^Give the Expire Date \"([^\"]*)\" and \"([^\"]*)\"$")
    public void giveTheExpireDateAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pg.SelectExpireDate(arg0,arg1);
    }

    @Then("^click on next Btn$")
    public void clickOnNextBtn() throws Exception {
        pg.ClickNextBtn();
    }

    @Then("^Click on Confirm Btn$")
    public void clickOnConfirmBtn() throws Exception {
        pg.ClickConfirmBtn();
    }

    @Then("^click on Pay Btn$")
    public void clickOnPassBtn() throws Exception {
        pg.ClickPassBtn();
    }

    @Then("^Close the confirm Sponser$")
    public void closeTheConfirmSponser() throws Exception {
        pg.ClickCloseSponser();
    }

    @Then("^Enter Pass \"([^\"]*)\" Number$")
    public void enterPassNumber(String arg0) throws Throwable {
        pg.EnterPassRef(arg0);
    }

    @Then("^Click Search Button$")
    public void clickSearchButton() throws InterruptedException {
        pg.ClickSearchBtn();
    }

    @Then("^Verify the Data Present$")
    public void verifyTheDataPresent() throws InterruptedException {
        pg.GetText();
    }

    @Then("^Click on Details Pass Refer$")
    public void clickOnDetailsPassRefer() throws InterruptedException {
        pg.ClickSearchAction();
    }


    @Then("^i get the refernce id$")
    public void iGetTheRefernceId() {
        pg.getReference();
    }

    @Then("^Click on Action Details Pass Refer$")
    public void clickOnActionDetailsPassRefer() throws InterruptedException {
        pg.ClickActionApprove();
    }

    @Then("^Click to Verify Images$")
    public void clickToVerifyImages() throws Exception {
        pg.ClickNextImage();
    }

    @Then("^Close the Image$")
    public void closeTheImage() throws Exception {
        pg.ClickCloseBtn();
    }

    @Then("^Approve the Ref$")
    public void approveTheRef() throws Exception {
        pg.ClickApprove();
    }


    @Then("^Click change Language$")
    public void clickChangeLanguage() throws Exception {
        pg.ClickChangeLang();
    }

    @Then("^Click Chebox on ref$")
    public void clickCheboxOnRef() throws Exception {
        pg.ClickCheckboxBtn();
    }

    @And("^Accept the Alert$")
    public void acceptTheAlert() throws Exception {
        pg.ClickOkAlert();
    }
}
