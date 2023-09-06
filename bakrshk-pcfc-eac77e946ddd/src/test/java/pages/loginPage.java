package pages;
import Helper.CellValues;
import Helper.DataRead;
import Helper.CellValues.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runners.CucumberRunner;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class loginPage extends CucumberRunner {
//    private static CellValues cell;
    private  String FilePath =".//TestData//";
    //    private static CellValues cell;
//    CellValues cell = new CellValues();
    CellValues cell = new CellValues();

//    public void EnterUsername() throws Exception {
//
//                CellValues cell = new CellValues();
//                List<DataRead> DataList = cell.LoginData("Z:\\Projects\\Cucumber_framework\\src\\test\\java\\TestData\\userInput.xlsx", "User");
//                if (DataList.size() == 0) {
//                    System.out.println("No data found in excel");
//                } else {
//                    for (DataRead excel : DataList) {
//                        String pwd = excel.getUserName();
//
//                        System.out.println(pwd);
//                        WebElement username = driver.findElement(By.id("username"));
//                        username.sendKeys(pwd);
//                    }
//                }
//        }
    public void EnterUser(String user) throws Exception {

                WebElement username = driver.findElement(By.id("username"));
                 explicitWait(username);

                     username.sendKeys(user);
                     Thread.sleep(1000);
            }



    public  void EnterPass(String pass) throws Exception {

                WebElement password = driver.findElement(By.id("password"));
                password.sendKeys(pass);
                Thread.sleep(3000);
    }
    public  void ClickSubmitButton()  {
        WebElement submit_Btn = driver.findElement(By.id("submitid"));
        explicitWaitClick(submit_Btn);
        submit_Btn.click();
        WebElement element = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-user']//parent::a"));

        explicitWait(element);

    }
    public  void PageDisplay() {
        String url = driver.getCurrentUrl();
        System.out.println(url);

    }
    public void ClickLogout() throws InterruptedException {
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-user']//parent::a"));
        explicitWaitClick(element);
        element.click();
        WebElement elem2 = driver.findElement(By.xpath("//span[contains(text(),'Logout')]"));
        explicitWaitClick(elem2);
        elem2.click();
        WebElement submit_Btn = driver.findElement(By.id("submitid"));
        explicitWaitClick(submit_Btn);
    }
}