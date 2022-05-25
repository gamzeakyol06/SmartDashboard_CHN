package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class LeftMenu {
    WebDriver driver;
    public LeftMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public List<WebElement> span_Value(){
    List<WebElement> spans = driver.findElements(By.tagName("span"));return spans;}
    By comboboxchn = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[8]");
    public WebElement ComboboxChina() {return driver.findElement(comboboxchn);}
    By chn301 = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[8]/ul/li[1]");
    public WebElement CHN301() {return driver.findElement(chn301);}
    By chn302 = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[8]/ul/li[2]");
    public WebElement CHN302() {return driver.findElement(chn302);}
    By chn303 = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[8]/ul/li[3]");
    public WebElement CHN303() {return driver.findElement(chn303);}
}