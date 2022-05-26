import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import runner.BaseTest;

public class ToyotaTest extends BaseTest {

    @Test
    public void testDmitriyRudoi() throws InterruptedException {
        getDriver().get("https://www.toyota.com/");

        WebElement searchButton = getDriver().findElement(
                By.xpath("//button[@class='search']"));    //"//*[@id='tcom-header']/div[2]/nav/ul/li[4]/button"));
        Thread.sleep(500);
        searchButton.click();

        WebElement searchBox = getDriver().findElement(By.name("keyword"));
        searchBox.sendKeys("2022 Corolla");

        WebElement goButton = getDriver().findElement(
                By.xpath(  "//button[@aria-label='Search submit']"));   //"//*[@id='tcom-header']/div[3]/div/div[2]/div/div[2]/div/form/button"));
        goButton.click();

        WebElement toyotaButton = getDriver().findElement(
                By.className("logo"));  //By.xpath("//a[@class='logo']"));    //"//*[@id='tcom-header']/div[2]/nav/ul/li[1]/a[1]"));
        toyotaButton.click();

        String expectedExploreAllVehicles = getDriver()
                .findElement(By.xpath("//h2[text()='Explore All Vehicles']"))
                .getText();                                                                       //   "/html/body/div[1]/div/div[2]/div/section[1]/div/div/div[1]/div[1]/h2"));

        Assert.assertEquals(expectedExploreAllVehicles, "Explore All Vehicles");
    }

}
