package pages;
import Helper.CellValues;
import Helper.DataRead;
import Helper.CellValues.*;
import Helper.Xls_Reader;
import gherkin.lexer.Th;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import runners.CucumberRunner;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import java.util.List;

public class PassPage extends CucumberRunner {
    String path = System.getProperty("user.dir");
    String rel = path + "\\src\\test\\java\\TestData\\Test.xlsx";
    Xls_Reader x = new Xls_Reader(rel);

    //    public void SelectPort() throws Exception {
//        Thread.sleep(5000);
//        //CellValues cell = new CellValues();
//        List<DataRead> DataList = cell.PassInfo(filepath, "Pass Info");
//        if (DataList.size() == 0) {
//            System.out.println("No data found in excel");
//        } else {
//            for (DataRead excel : DataList) {
//                String val = excel.getPort();
//
//                System.out.println(val);
//                Select drpCountry = new Select(driver.findElement(By.id("portsId")));
//                drpCountry.selectByVisibleText(val);
//
//
//            }
//        }
//    }
    public void SelectPort(String elem) throws Exception {

        String val = x.getCellData("Sheet1", elem, 2);

        System.out.println(val);
        Select drpCountry = new Select(driver.findElement(By.id("portsId")));
        drpCountry.selectByVisibleText(val);


    }


    public void SelectEntryGate(String elem) throws Exception {

        String val = x.getCellData("Sheet1", elem, 2);


        System.out.println(val);
        Select drpCountry = new Select(driver.findElement(By.id("gateIdStr")));
        drpCountry.selectByVisibleText(val);


    }


    public void SelectPassType(String elem) throws Exception {


        String val = x.getCellData("Sheet1", elem, 2);

        System.out.println(val);
        Select drpCountry = new Select(driver.findElement(By.id("passTypeIdStr")));
        drpCountry.selectByVisibleText(val);


    }

    public void SelectPassDuration(String elem) throws Exception {


        String val = x.getCellData("Sheet1", elem, 2);

        System.out.println(val);
        Select drpCountry = new Select(driver.findElement(By.id("passDurationIdStr")));
        drpCountry.selectByVisibleText(val);


    }

    public void SelectVisitReason(String elem) throws Exception {


        String val = x.getCellData("Sheet1", elem, 2);

        System.out.println(val);
        Select drpCountry = new Select(driver.findElement(By.id("reasonOfVisitIdStr")));
        drpCountry.selectByVisibleText(val);


    }


    public void EnterDateofVisit(String elem) throws Exception {


        String val = x.getCellData("Sheet1", elem, 2);
        WebElement element = driver.findElement(By.id("dateOfVisitStr"));
//        element.click();
//        element.clear();
        element.sendKeys("23/01/2020");
        element.clear();

        element.sendKeys(val);

//        element.sendKeys(Keys.BACK_SPACE + Keys.BACK_SPACE );
    }

    public void SelectTitle(String elem) throws Exception {


        String val = x.getCellData("Sheet1", elem, 2);

        System.out.println(val);
        Select drpCountry = new Select(driver.findElement(By.id("title")));
        drpCountry.selectByVisibleText(val);


    }


    public void EnterFirstName(String elem) throws Exception {


        String val = x.getCellData("Sheet1", elem, 2);
        WebElement element = driver.findElement(By.id("firstName"));
//        element.click();


        element.sendKeys(val);


    }

    public void EnterLastname(String elem) throws Exception {


        String val = x.getCellData("Sheet1", elem, 2);
        WebElement element = driver.findElement(By.id("lastName"));

        element.sendKeys(val);


    }

    public void EnterNationailty(String elem) throws Exception {


        String val = x.getCellData("Sheet1", elem, 2);
        WebElement element = driver.findElement(By.id("nationalityValue"));
        element.sendKeys(val);

        Thread.sleep(2000);
        element.sendKeys(Keys.ARROW_DOWN);

        element.sendKeys(Keys.ENTER);


    }

    public void EnterMobile(String elem) throws Exception {


        String val = x.getCellData("Sheet1", elem, 2);
        WebElement element = driver.findElement(By.id("mobileNumber"));

        element.sendKeys(val);
        Thread.sleep(3000);
        element.sendKeys(val);


    }

    public void EnterCompany(String elem) throws Exception {


        String val = x.getCellData("Sheet1", elem, 2);
        WebElement element = driver.findElement(By.id("vistorCompanyName"));

        element.sendKeys(val);


    }

    public void EnterHost(String elem) throws Exception {


        String val = x.getCellData("Sheet1", elem, 2);
        WebElement element = driver.findElement(By.id("hostCompanyName"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        explicitWait(element);
        element.sendKeys(val);
        Thread.sleep(4000);
        element.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);

        element.sendKeys(Keys.ENTER);

    }

    public void EnterPerson(String elem) throws Exception {


        String val = x.getCellData("Sheet1", elem, 2);
        WebElement element = driver.findElement(By.id("hostPerson"));

        element.sendKeys(val);


    }

    public void EnterEmail(String elem) throws Exception {


        String val = x.getCellData("Sheet1", elem, 2);
        WebElement element = driver.findElement(By.id("emailId"));

        element.sendKeys(val);


    }

    public void SelectDesignation(String elem) throws Exception {


        String val = x.getCellData("Sheet1", elem, 2);

        System.out.println(val);
        Select drpCountry = new Select(driver.findElement(By.id("designationIdStr")));
        drpCountry.selectByVisibleText(val);
        WebElement element = driver.findElement(By.id("docFile"));
        explicitWait(element);

    }

    public void SelectVisaType(String elem) throws Exception {


        String val = x.getCellData("Sheet1", elem, 2);

        System.out.println(val);
        Select drpCountry = new Select(driver.findElement(By.id("visaTypeIdStr")));
        drpCountry.selectByVisibleText(val);


    }


    public void ClickAgree() throws Exception {
        if (!driver.findElement(By.id("acceptTermsCondition")).isSelected()) {
            driver.findElement(By.id("acceptTermsCondition")).click();
        }

    }

    public void ClickSubmitBtn() throws Exception {
        Thread.sleep(5000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//input[@value='Submit']"));
        explicitWaitClick(element);

        executor.executeScript("arguments[0].click();", element);


        Thread.sleep(4000);


    }
    public void ClickConfirmBtn()throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@data-bb-handler = 'confirm']"))));
        Thread.sleep(3000);
        WebElement confirm = driver.findElement(By.xpath("//button[@data-bb-handler = 'confirm']"));

        explicitWait(confirm);
        confirm.click();
    }

    public void UploadPhoto() throws Exception {
        String path = System.getProperty("user.dir");
        String rel = path + "\\src\\test\\java\\TestData\\cr7.jpg";
        WebElement element = driver.findElement(By.xpath("//span[@id='prefix_0']//input[@id='docFile']"));
        explicitWait(element);
        element.sendKeys(rel);
        Thread.sleep(5000);

        WebElement element2 = driver.findElement(By.xpath("//span[@id='prefix_1']//input[@id='docFile']"));
        explicitWait(element2);
        element2.sendKeys(rel);
        WebElement element3 = driver.findElement(By.xpath("//span[@id='prefix_2']//input[@id='docFile']"));
        explicitWait(element3);
        element3.sendKeys(rel);
        WebElement element4 = driver.findElement(By.xpath("//span[@id='prefix_3']//input[@id='docFile']"));
        explicitWait(element4);
        element4.sendKeys(rel);
        WebElement element5 = driver.findElement(By.xpath("//span[@id='prefix_7']//input[@id='docFile']"));
        explicitWait(element5);
        element5.sendKeys(rel);
        WebElement element6 = driver.findElement(By.xpath("//span[@id='prefix_4']//input[@id='docFile']"));
        explicitWait(element5);
        element6.sendKeys(rel);
        WebElement element7 = driver.findElement(By.xpath("//span[@id='prefix_5']//input[@id='docFile']"));
        explicitWait(element5);
        element7.sendKeys(rel);
        WebElement element8 = driver.findElement(By.xpath("//span[@id='prefix_6']//input[@id='docFile']"));
        explicitWait(element5);
        element8.sendKeys(rel);
    }

    public void ClickEmirates() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//tr[8]//td[3]//div[1]//div[1]//input[1]"));
        explicitWait(element);
        element.click();
        Thread.sleep(2000);

    }

    public void ScrollView() {
        WebElement elem2 = driver.findElement(By.xpath("//div[contains(text(),'Document Details')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", elem2);

    }

    public void ClickPassport() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//tr[2]//td[3]//div[1]//div[1]//input[1]"));

        explicitWait(element);

        element.click();
        Thread.sleep(2000);

    }

    public void ClickVisa() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//tr[3]//td[3]//div[1]//div[1]//input[1]"));
        explicitWait(element);
        element.click();
        Thread.sleep(2000);

    }

    public void ClickTrade() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//tr[4]//td[3]//div[1]//div[1]//input[1]"));
        explicitWait(element);
        element.click();
        Thread.sleep(2000);

    }

    public void ClickLPO() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//tr[5]//td[3]//div[1]//div[1]//input[1]"));
        explicitWait(element);
        element.click();
        Thread.sleep(2000);

    }

    public void ClickOther() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//tr[6]//td[3]//div[1]//div[1]//input[1]"));
        explicitWait(element);
        element.click();
        Thread.sleep(2000);

    }

    public void ClickOther2() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//tr[7]//td[3]//div[1]//div[1]//input[1]"));
        explicitWait(element);
        element.click();
        Thread.sleep(2000);

    }

    public void EnterDate(String elem) throws Exception {
        String date_ent = x.getCellData("Sheet1", elem, 2);

        String date_ent1[] = date_ent.split("-");
        String shipFDay = date_ent1[0];
        System.out.println(shipFDay);

        String shipFMonth = date_ent1[1];
        System.out.println(shipFMonth);

        String shipFYear = date_ent1[2];
        System.out.println(shipFYear);

        String date_pres = driver.findElement(By.xpath("(//th[contains(@class,'datepicker-switch')])[1]")).getText();
        System.out.println(date_pres);
        String dp[] = date_pres.split(" ");
        String month_pres = dp[0];
        String year_pres = dp[1];
        if (year_pres.equals(shipFYear)) {
            driver.findElement(By.xpath("(//th[contains(@class,'datepicker-switch')])[1]")).click();

            driver.findElement(By.xpath("//span[contains(.,'" + shipFMonth + "')]")).click();
            Thread.sleep(5000);

        } else if (Integer.parseInt(year_pres) > Integer.parseInt(shipFYear)) {
            driver.findElement(By.xpath("(//th[contains(@class,'datepicker-switch')])[1]")).click();

            while (2 > 1) {
                year_pres = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[2]")).getText();
                if (year_pres.equalsIgnoreCase(shipFYear)) {

                    driver.findElement(By.xpath("//span[contains(.,'" + shipFMonth + "')]")).click();
                    Thread.sleep(5000);
                    break;
                }
                driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class='prev'][contains(text(),'«')]")).click();
            }

        } else {
            driver.findElement(By.xpath("(//th[contains(@class,'datepicker-switch')])[1]")).click();
            while (2 > 1) {
                year_pres = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[2]")).getText();
                if (year_pres.equalsIgnoreCase(shipFYear)) {

                    driver.findElement(By.xpath("//span[contains(.,'" + shipFMonth + "')]")).click();

                    Thread.sleep(5000);
                    break;
                }
                driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class='next'][contains(text(),'»')]")).click();
            }
        }

        switch (shipFMonth) {
            case "Jan": {
                driver.findElement(By.xpath("//td[@class='day'][contains(text()," + shipFDay + ")]")).click();
                System.out.println("Date Selected");
                break;
            }

            case "Feb": {
                driver.findElement(By.xpath("//td[@class='day'][contains(text()," + shipFDay + ")]")).click();
                System.out.println("Date Selected");
                break;
            }
            case "Mar": {
                driver.findElement(By.xpath("//td[@class='day'][contains(text()," + shipFDay + ")]")).click();
                System.out.println("Date Selected");
                break;
            }
            case "Apr": {
                driver.findElement(By.xpath("//td[@class='day'][contains(text()," + shipFDay + ")]")).click();

                System.out.println("Date Selected");
                break;
            }
            case "May": {
                driver.findElement(By.xpath("//td[@class='day'][contains(text()," + shipFDay + ")]")).click();
                System.out.println("Date Selected");
                break;
            }
            case "Jun": {
                driver.findElement(By.xpath("//td[@class='day'][contains(text()," + shipFDay + ")]")).click();
                System.out.println("Date Selected");
                break;
            }
            case "Jul": {
                driver.findElement(By.xpath("//td[@class='day'][contains(text()," + shipFDay + ")]")).click();
                System.out.println("Date Selected");
                break;
            }
            case "Aug": {
                driver.findElement(By.xpath("//td[@class='day'][contains(text()," + shipFDay + ")]")).click();
                System.out.println("Date Selected");
                break;
            }
            case "Sep": {
                driver.findElement(By.xpath("//td[@class='day'][contains(text()," + shipFDay + ")]")).click();
                System.out.println("Date Selected");
                break;
            }
            case "Oct": {
                driver.findElement(By.xpath("//td[@class='day'][contains(text()," + shipFDay + ")]")).click();
                System.out.println("Date Selected");
                break;
            }
            case "Nov": {
                driver.findElement(By.xpath("//td[@class='day'][contains(text()," + shipFDay + ")]")).click();
                System.out.println("Date Selected");
                break;
            }
            case "Dec": {
                driver.findElement(By.xpath("//td[@class='day'][contains(text()," + shipFDay + ")]")).click();
                System.out.println("Date Selected");
                break;
            }
            default: {
                System.out.println("Please enter the date in the standard format like DD-MMM-yyyy");
                break;
            }
        }
    }

    public void ClickAddVisitor() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//input[@id='addVisitor']"));
        explicitWait(element);
        element.click();
        Thread.sleep(2000);

    }


    public void EnterDocuments(String elem) throws Exception {
        String random = x.randomGenerate();
        System.out.println(random);

        x.setCellData1("Sheet1",27,1,random);

        String val = x.getCellData("Sheet1", elem, 2);
        System.out.println(val);

        WebElement element = driver.findElement(By.xpath("//form[@id=\"myForm\"]//span[text()='Passport']//ancestor::tr//input[@id='documentNumber']"));
        WebElement element2 = driver.findElement(By.xpath("//span[text()='Visa']//ancestor::tr//input[@id='documentNumber']"));
        WebElement element3 = driver.findElement(By.xpath("//span[text()='Trade License Copy']//ancestor::tr//input[@id='documentNumber']"));
        WebElement element4 = driver.findElement(By.xpath("//span[text()='LPO/ Agreement with FZ Company/Other Document']//ancestor::tr//input[@id='documentNumber']"));
        WebElement element5 = driver.findElement(By.xpath("//span[text()='Other Document']//ancestor::tr//input[@id='documentNumber']"));
        WebElement element6 = driver.findElement(By.xpath("//span[text()='Other Document1']//ancestor::tr//input[@id='documentNumber']"));
        WebElement element7 = driver.findElement(By.xpath("//span[text()='Emirates Id']//ancestor::tr//input[@id='documentNumber']"));
        System.out.println(val);

        element.sendKeys(val);
        element2.sendKeys(val);
        element3.sendKeys(val);
        element4.sendKeys(val);
        element5.sendKeys(val);
        element6.sendKeys(val);
        element7.sendKeys(val);


    }

    public void SelectPaymentOption(String elem, String elem2) throws Exception {
        String val = x.getCellData("Sheet1", elem, 2);
        String val2 = x.getCellData("Sheet1", elem2, 2);
        WebElement element = driver.findElement(By.xpath("//th[contains(text(),'Payment Order')]"));
        explicitWait(element);


        System.out.println(val);
        Select drpCountry = new Select(driver.findElement(By.id("paymentMethod")));
        drpCountry.selectByVisibleText(val);
        Thread.sleep(2000);
        Select drpCountry2 = new Select(driver.findElement(By.id("selectedPaymentInstrument")));
        drpCountry2.selectByVisibleText(val2);


    }

    public void ClickAgreePayment() throws Exception {
        Thread.sleep(2000);
        if (!driver.findElement(By.id("tcCheck")).isSelected()) {
            driver.findElement(By.id("tcCheck")).click();
        }

    }

    public void ClickAgreePaymentBtn() throws Exception {
        WebElement element = driver.findElement(By.id("agree"));
        element.click();
        Thread.sleep(2000);
        WebElement element2 = driver.findElement(By.id("card_type_selection"));
        explicitWait(element2);

    }

    public void SelectPaymentYes(String elem) throws Exception {
        String val = x.getCellData("Sheet1", elem, 2);

        System.out.println(val);
        Select drpCountry = new Select(driver.findElement(By.id("chooseToPay")));
        drpCountry.selectByVisibleText(val);
    }

    public void clickRadio() throws Exception {

        if (!driver.findElement(By.id("card_type_002")).isSelected()) {
            driver.findElement(By.id("card_type_002")).click();
        }

    }
    public void EnterCardNumberCVV(String elem,String elem2) throws Exception {

        Thread.sleep(2000);
        String val = x.getCellData("Sheet1", elem, 2);
        String val2 = x.getCellData("Sheet1", elem2, 2);
        WebElement element = driver.findElement(By.xpath("//input[@id ='card_number']"));
        explicitWait(element);
        element.sendKeys(val);
        WebElement element2 =  driver.findElement(By.xpath("//input[@id ='card_cvn']"));
        element2.sendKeys(val2);

    }

    public void SelectExpireDate(String elem, String elem2) throws Exception {
        String val = x.getCellData("Sheet1", elem, 2);
        String val2 = x.getCellData("Sheet1", elem2, 2);
        WebElement elemntm = driver.findElement(By.xpath("//select[@id='card_expiry_month']"));
        elemntm.click();
        WebElement element = driver.findElement(By.xpath("//select[@id='card_expiry_month']//option[contains(text()," + val + ")]"));
        element.click();
        //todo year
//        WebElement elemnty = driver.findElement(By.xpath("//select[@id='card_expiry_year']"));
//        elemnty.click();
        Thread.sleep(2000);

//        WebElement element2 = driver.findElement(By.xpath("//select[@id='card_expiry_year']//option"));
//        Thread.sleep(2000);
//        element2.click();
//        Select drpCountry = new Select(driver.findElement(By.xpath("//select[@id ='card_expiry_month']")));
//        drpCountry.selectByVisibleText(val);
//        Thread.sleep(2000);
        Select drpCountry2 = new Select(driver.findElement(By.xpath("//select[@id ='card_expiry_year']")));
        drpCountry2.selectByValue(val2);


    }
    public void ClickNextBtn() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@value='Next']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);


    }

    public void ClickPassBtn() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@name='commit']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
    public void ClickCloseSponser() throws Exception {
        WebElement element = driver.findElement(By.xpath("//a[@title='Close']"));
        explicitWait(element);
        Thread.sleep(5000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }



//todo Search Pass number Page methods

public void EnterPassRef(String elem){

    String val = x.getCellData("Sheet1", elem, 2);
    WebElement element = driver.findElement(By.xpath("//input[@id='searchPassRefNumber']"));

    element.sendKeys(val);


}
public void ClickSearchBtn() throws InterruptedException {
    WebElement element = driver.findElement(By.xpath("//input[@id='Search']"));
    element.click();
    Thread.sleep(2000);

}
public void GetText() throws InterruptedException {
    WebElement element = driver.findElement(By.xpath("//td[@class='sorting_1']"));
    String value = element.getText();
    System.out.println(value);
    Thread.sleep(2000);

}
    public void ClickSearchAction() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//td[8]//a"));
        element.click();
        Thread.sleep(2000);
        WebElement pass = driver.findElement(By.xpath("//div[contains(text(),'Pass Information')]"));
        explicitWait(pass);
        Thread.sleep(5000);

    }
    public void ClickActionApprove() throws InterruptedException {
        WebElement element =driver.findElement(By.xpath("//span[@class = 'glyphicon glyphicon-edit glphmargin selectableglyph']"));
        element.click();
        Thread.sleep(2000);
        WebElement pass = driver.findElement(By.xpath("//div[contains(text(),'Pass Information')]"));
        explicitWait(pass);
        Thread.sleep(5000);
    }
    public void getReference(){
        WebElement element = driver.findElement(By.id("succBodyBgPass"));
        String value = element.getText();
        String Ref = SplitNumbers(value);
        System.out.println(Ref);
        x.setCellData1("Sheet1",35,1,Ref);
    }
    public void ClickOpenImage() throws Exception {
        Thread.sleep(5000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//tr[@id='prefix_0']//input[@id='indexId']//ancestor::tr//span[@class='linkSpan']"));
        explicitWaitClick(element);

        executor.executeScript("arguments[0].click();", element);


        Thread.sleep(4000);

    }
    public void ClickNextImage()  throws Exception {
        WebElement element = driver.findElement(By.xpath("//tr[@id='prefix_0']//input[@id='indexId']//ancestor::tr//span[@class='linkSpan']"));
        explicitWaitClick(element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

        Thread.sleep(4000);
            WebElement next = driver.findElement(By.id("nextId"));
            next.click();
            Thread.sleep(2000);
        next.click();
        Thread.sleep(2000);

        next.click();
        Thread.sleep(2000);

        next.click();
        Thread.sleep(2000);

        next.click();
        Thread.sleep(2000);

        next.click();
        Thread.sleep(2000);

        next.click();
        Thread.sleep(2000);


    }



    public void ClickCloseBtn()  throws Exception {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//div[@class='modal-header ui-draggable-handle']//button[@class='close']"));
        explicitWaitClick(element);

        executor.executeScript("arguments[0].click();", element);



    }
    public void ClickApprove()  throws Exception {
        WebElement element = driver.findElement(By.id("approveId"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        explicitWait(element);
        element.click();
        Thread.sleep(3000);
        WebElement Verify = driver.findElement(By.xpath("//span[contains(text(),'Approval successful')]"));
        explicitWait(Verify);



    }
    public void ClickChangeLang()  throws Exception {
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.id("localeLinken"));
        element.click();
        Thread.sleep(5000);




    }
    public void ClickCheckboxBtn()  throws Exception {
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//td[@class='sorting_1']//input"));
        element.click();
        Thread.sleep(2000);

        WebElement download = driver.findElement(By.xpath("//input[@id='download']"));
        download.click();
        Thread.sleep(3000);
        WebElement element2 = driver.findElement(By.xpath("//button[@data-bb-handler='confirm']"));
        element2.click();
        Thread.sleep(3000);


    }

    public void ClickOkAlert()throws Exception{
        WebElement element = driver.findElement(By.xpath("//button[@data-bb-handler='ok']"));
        element.click();
        Thread.sleep(5000);

    }
}

