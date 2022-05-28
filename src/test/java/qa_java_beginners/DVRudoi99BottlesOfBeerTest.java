package qa_java_beginners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class DVRudoi99BottlesOfBeerTest extends BaseTest {
    public static final String URL ="http://www.99-bottles-of-beer.net/";

    @Test
    public void testLetterJ (){
        getDriver().get(URL);

        WebElement buttonBrowseLanguages = getDriver().findElement(
              By.xpath("//li/a[@href = '/abc.html']"));
        buttonBrowseLanguages.click();

        WebElement buttonLetterJ = getDriver().findElement(
                By.xpath("//a[@href = 'j.html']"));
        buttonLetterJ.click();

        String expectedText = getDriver()
                .findElement(By.xpath("//p[contains(text(),'All')]"))
                .getText();

        Assert.assertEquals(
                expectedText, "All languages starting with the letter J are shown, sorted by Language.");

    }
}
