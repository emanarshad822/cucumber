
package pages;
import Helper.CellValues;
import Helper.DataRead;
import Helper.CellValues.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import runners.CucumberRunner;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class DashboardPage extends CucumberRunner {

    public void ClickPassManagement() throws Exception {
    WebElement elem = driver.findElement(By.xpath("//a[contains(text(),'Pass Management')]"));
    explicitWait(elem);
        elem.click();
    }

    public void ClickApplyPass() throws Exception {
        WebElement elem = driver.findElement(By.xpath("//a[contains(text(),'Apply for Pass')]"));
        elem.click();
        WebElement elem2 = driver.findElement(By.xpath("//legend[@class='service-border']"));
        explicitWait(elem2);

    }
    public void ClickSearchPass() throws Exception {
        WebElement elem = driver.findElement(By.xpath("//a[contains(text(),'Search Pass')]"));
        elem.click();
        WebElement elem2 = driver.findElement(By.xpath("//legend[@class='service-border']"));
        explicitWait(elem2);

    }
    public void ClickPassApproval() throws Exception {
        WebElement elem = driver.findElement(By.xpath("//a[contains(text(),'Pass Approval')]"));
        elem.click();
        WebElement elem2 = driver.findElement(By.xpath("//legend[@class='service-border']"));
        explicitWait(elem2);

    }
    public void ClickPrintPass() throws Exception {
        WebElement elem = driver.findElement(By.xpath("//a[contains(text(),'Print Pass')]"));
        elem.click();
        WebElement elem2 = driver.findElement(By.xpath("//legend[@class='service-border']"));
        explicitWait(elem2);

    }
}
