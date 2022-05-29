package qa_java_beginners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class DVRudoi99BottlesOfBeerTest extends BaseTest {
    public WebElement searchLetter (String a){
        return getDriver().findElement(
                By.xpath(String.format("//a[@href = '%s.html']", a)));
    }
    public static final String URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testLetterJ() {
        getDriver().get(URL);

        WebElement buttonBrowseLanguages = getDriver().findElement(
                By.linkText("Browse Languages")); //By.xpath("//li/a[@href = '/abc.html']"))
        buttonBrowseLanguages.click();

        WebElement buttonLetterJ = searchLetter("j");
        buttonLetterJ.click();

        String actualText = getDriver()
                .findElement(By.xpath("//p[contains(text(),'All')]"))
                .getText();

        Assert.assertEquals(
                actualText, "All languages starting with the letter J are shown, sorted by Language.");

    }

    @Test
    public void testLastMySql() {
        getDriver().get(URL);

        WebElement buttonBrowseLanguages = getDriver().findElement(
                By.xpath("//li/a[@href = '/abc.html']"));
        buttonBrowseLanguages.click();

        WebElement buttonLetterM = getDriver().findElement(
                By.xpath("//a[@href = 'm.html']"));
        buttonLetterM.click();

        String actualText = getDriver()
                .findElement(By.xpath("//tr[last()]//a"))
                .getText();

        Assert.assertEquals(actualText, "MySQL");
    }

    @Test
    public void testMenu() {
        getDriver().get(URL);

        WebElement buttonBrowseLanguages = getDriver().findElement(
                By.xpath("//li/a[@href = '/abc.html']"));
        buttonBrowseLanguages.click();

        String actualText = getDriver()
                .findElement(By.xpath("//tr[1]"))
                .getText();

        Assert.assertEquals(actualText, "Language Author Date Comments Rate");
    }

    @Test
    public void testMathematical() {
        String expectedAuthor = "Brenton Bostick";
        String expectedDate = "03/16/06";
        String expectedComments = "1";

        getDriver().get(URL);

        WebElement buttonBrowseLanguages = getDriver().findElement(
                By.xpath("//li/a[@href = '/abc.html']"));
        buttonBrowseLanguages.click();

        WebElement buttonLetterM = getDriver().findElement(
                By.xpath("//a[@href = 'm.html']"));
        buttonLetterM.click();

        String actualAuthor = getDriver()
                .findElement(By.xpath("//tr[22]/td[2]"))
                .getText();

        String actualDate = getDriver()
                .findElement(By.xpath("//tr[22]/td[3]"))
                .getText();

        String actualComments = getDriver()
                .findElement(By.xpath("//tr[22]/td[4]"))
                .getText();

        Assert.assertEquals(actualAuthor, expectedAuthor);
        Assert.assertEquals(actualDate, expectedDate);
        Assert.assertEquals(actualComments, expectedComments);

    }

    @Test
    public void testSizeNumbers() {
        getDriver().get(URL);

        WebElement buttonBrowseLanguages = getDriver().findElement(
                By.xpath("//li/a[@href = '/abc.html']"));
        buttonBrowseLanguages.click();

        WebElement buttonLetter = getDriver().findElement(By.xpath("//a[@href = '0.html']"));
        buttonLetter.click();

        int actualRowCount = getDriver().findElements(
                By.xpath("//tbody/tr[contains(@onmouseover,'setPointer')]")).size();

        Assert.assertEquals(actualRowCount, 10);
    }

    @Test
    public void testSignGuestbook() {
        getDriver().get("http://www.99-bottles-of-beer.net/signv2.html");

        WebElement inputName = getDriver().findElement(
                By.name("name"));
        inputName.sendKeys("DDDDD");

        WebElement inputLocation = getDriver().findElement(
                By.name("location"));
        inputLocation.sendKeys("DDDDD");

        WebElement inputEmail = getDriver().findElement(
                By.name("email"));
        inputEmail.sendKeys("DDDDD");

        WebElement inputHomepage = getDriver().findElement(
                By.name("homepage"));
        inputHomepage.sendKeys("DDDDD");

        WebElement inputSecurityCode = getDriver().findElement(
                By.name("captcha"));
        inputSecurityCode.sendKeys("333");

        WebElement inputMessage = getDriver().findElement(
                By.name("comment"));
        inputMessage.sendKeys("333");

        WebElement button = getDriver().findElement(
                By.name("submit"));
        button.click();

        String actualError = getDriver()
                .findElement(By.xpath("//div[@id='main']/p"))
                .getText();

        Assert.assertEquals(actualError, "Error: Error: Invalid security code.");
    }
}
