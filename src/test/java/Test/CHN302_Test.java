package Test;
import Base.Base;
import Component.CHNLines;
import Component.LeftMenu;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CHN302_Test extends Base {
    @BeforeSuite
    public void beforemethod(){
        super.beforemethod();
        super.loginmethod();
    }
    @Test(priority = 1)
    public void AVL_Daily_Success() throws InterruptedException {
        LeftMenu leftmenu = new LeftMenu(driver);
        CHNLines chnlines = new CHNLines(driver);
        Thread.sleep(2000);
        try {
            leftmenu.ComboboxChina().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(leftmenu.CHN302()).click().build().perform();
            Thread.sleep(2000);
            System.out.println(chnlines.title().getText() + " Daily");
            Thread.sleep(2000);
            actions.moveToElement(chnlines.TabAVL()).click().build().perform();

            System.out.println(chnlines.TabAVL().getText());
            System.out.println("OEE " + chnlines.ValueOEE().getText());
            System.out.println("Availability " + chnlines.ValueAvailability().getText());
            System.out.println("Performance " + chnlines.ValuePerformance().getText());
            System.out.println("Quality " + chnlines.ValueQuality().getText());

            System.out.println("Total Production " + chnlines.TotalProduction().getText());
            System.out.println("Defect " + chnlines.Defect().getText());
            System.out.println("PPM " + chnlines.PPM().getText());
            System.out.println("Breakdowns " + chnlines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(chnlines.TotalProduction().getText());
            System.out.println("Total Production " + totalproduction + "\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            } else {
                System.out.println("Production is OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 2)
    public void IML_Daily_Success() throws InterruptedException {
        LeftMenu leftmenu = new LeftMenu(driver);
        CHNLines chnlines = new CHNLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(chnlines.title().getText() + " Daily");
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(chnlines.TabIML()).click().build().perform();

            System.out.println(chnlines.TabIML().getText());
            System.out.println("OEE " + chnlines.ValueOEE().getText());
            System.out.println("Availability " + chnlines.ValueAvailability().getText());
            System.out.println("Performance " + chnlines.ValuePerformance().getText());
            System.out.println("Quality " + chnlines.ValueQuality().getText());

            System.out.println("Total Production " + chnlines.TotalProduction().getText());
            System.out.println("Defect " + chnlines.Defect().getText());
            System.out.println("PPM " + chnlines.PPM().getText());
            System.out.println("Breakdowns " + chnlines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(chnlines.TotalProduction().getText());
            System.out.println("Total Production " + totalproduction + "\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            } else {
                System.out.println("Production is OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 3)
    public void COL1_Daily_Success() throws InterruptedException {
        LeftMenu leftmenu = new LeftMenu(driver);
        CHNLines chnlines = new CHNLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(chnlines.title().getText() + " Daily");
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(chnlines.TabCOL1()).click().build().perform();

            System.out.println(chnlines.TabCOL1().getText());
            System.out.println("OEE " + chnlines.ValueOEE().getText());
            System.out.println("Availability " + chnlines.ValueAvailability().getText());
            System.out.println("Performance " + chnlines.ValuePerformance().getText());
            System.out.println("Quality " + chnlines.ValueQuality().getText());

            System.out.println("Total Production " + chnlines.TotalProduction().getText());
            System.out.println("Defect " + chnlines.Defect().getText());
            System.out.println("PPM " + chnlines.PPM().getText());
            System.out.println("Breakdowns " + chnlines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(chnlines.TotalProduction().getText());
            System.out.println("Total Production " + totalproduction + "\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            } else {
                System.out.println("Production is OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 4)
    public void COL2_Daily_Success() throws InterruptedException {
        LeftMenu leftmenu = new LeftMenu(driver);
        CHNLines chnlines = new CHNLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(chnlines.title().getText() + " Daily");
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(chnlines.TabCOL2()).click().build().perform();

            System.out.println(chnlines.TabCOL2().getText());
            System.out.println("OEE " + chnlines.ValueOEE().getText());
            System.out.println("Availability " + chnlines.ValueAvailability().getText());
            System.out.println("Performance " + chnlines.ValuePerformance().getText());
            System.out.println("Quality " + chnlines.ValueQuality().getText());

            System.out.println("Total Production " + chnlines.TotalProduction().getText());
            System.out.println("Defect " + chnlines.Defect().getText());
            System.out.println("PPM " + chnlines.PPM().getText());
            System.out.println("Breakdowns " + chnlines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(chnlines.TotalProduction().getText());
            System.out.println("Total Production " + totalproduction + "\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            } else {
                System.out.println("Production is OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("fail");
        }
    }

    @Test (priority = 5)
    public void AVL_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        CHNLines chnlines = new CHNLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(chnlines.title().getText() + " Weekly");
            Thread.sleep(2000);
            chnlines.PeriodFilter().click();
            Thread.sleep(2000);
            chnlines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(chnlines.TabAVL()).click().build().perform();

            System.out.println(chnlines.TabAVL().getText());
            System.out.println("OEE " + chnlines.ValueOEE().getText());
            System.out.println("Availability " + chnlines.ValueAvailability().getText());
            System.out.println("Performance " + chnlines.ValuePerformance().getText());
            System.out.println("Quality " + chnlines.ValueQuality().getText());

            System.out.println("Total Production " + chnlines.TotalProduction().getText());
            System.out.println("Defect " + chnlines.Defect().getText());
            System.out.println("PPM " + chnlines.PPM().getText());
            System.out.println("Breakdowns " + chnlines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(chnlines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 6)
    public void IML_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        CHNLines chnlines = new CHNLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(chnlines.title().getText() + " Weekly");
            Thread.sleep(2000);
            chnlines.PeriodFilter().click();
            Thread.sleep(2000);
            chnlines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(chnlines.TabIML()).click().build().perform();

            System.out.println(chnlines.TabIML().getText());
            System.out.println("OEE " + chnlines.ValueOEE().getText());
            System.out.println("Availability " + chnlines.ValueAvailability().getText());
            System.out.println("Performance " + chnlines.ValuePerformance().getText());
            System.out.println("Quality " + chnlines.ValueQuality().getText());

            System.out.println("Total Production " + chnlines.TotalProduction().getText());
            System.out.println("Defect " + chnlines.Defect().getText());
            System.out.println("PPM " + chnlines.PPM().getText());
            System.out.println("Breakdowns " + chnlines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(chnlines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 7)
    public void COL1_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        CHNLines chnlines = new CHNLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(chnlines.title().getText() + " Weekly");
            Thread.sleep(2000);
            chnlines.PeriodFilter().click();
            Thread.sleep(2000);
            chnlines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(chnlines.TabCOL1()).click().build().perform();

            System.out.println(chnlines.TabCOL1().getText());
            System.out.println("OEE " + chnlines.ValueOEE().getText());
            System.out.println("Availability " + chnlines.ValueAvailability().getText());
            System.out.println("Performance " + chnlines.ValuePerformance().getText());
            System.out.println("Quality " + chnlines.ValueQuality().getText());

            System.out.println("Total Production " + chnlines.TotalProduction().getText());
            System.out.println("Defect " + chnlines.Defect().getText());
            System.out.println("PPM " + chnlines.PPM().getText());
            System.out.println("Breakdowns " + chnlines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(chnlines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 8)
    public void COL2_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        CHNLines chnlines = new CHNLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(chnlines.title().getText() + " Weekly");
            Thread.sleep(2000);
            chnlines.PeriodFilter().click();
            Thread.sleep(2000);
            chnlines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(chnlines.TabCOL2()).click().build().perform();

            System.out.println(chnlines.TabCOL2().getText());
            System.out.println("OEE " + chnlines.ValueOEE().getText());
            System.out.println("Availability " + chnlines.ValueAvailability().getText());
            System.out.println("Performance " + chnlines.ValuePerformance().getText());
            System.out.println("Quality " + chnlines.ValueQuality().getText());

            System.out.println("Total Production " + chnlines.TotalProduction().getText());
            System.out.println("Defect " + chnlines.Defect().getText());
            System.out.println("PPM " + chnlines.PPM().getText());
            System.out.println("Breakdowns " + chnlines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(chnlines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }

    }

    @AfterTest
    public void aftertest(){
        super.aftermethod();
    }
}
