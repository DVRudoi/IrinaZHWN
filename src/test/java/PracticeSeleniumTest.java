import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import runner.BaseTest;

import java.sql.Driver;
import java.util.List;

public class PracticeSeleniumTest extends BaseTest {

    /**
     * Elements-Finders
     */
    @Test
    public void testFindElementsFromElement() {
        try {
            getDriver().get("https://example.com");

            // Get element with tag name 'div'
            WebElement element = getDriver().findElement(By.tagName("div"));
            System.out.println(element.getText());
            System.out.println("_____________");
            // Get all the elements available with tag name 'p'
            List<WebElement> elements = element.findElements(By.tagName("p"));
            for (WebElement e : elements) {
                System.out.println(e.getText());
            }
        } finally {
            getDriver().quit();
        }
    }

    @Test
    public void testGetActiveElement() throws InterruptedException {
        try {
            getDriver().get("http://www.google.com");
            WebElement search = getDriver().findElement(By.cssSelector("[name='q']"));
            search.sendKeys("webElement");
//            Thread.sleep(2000);
//            search.clear();
//            Thread.sleep(2000);
            // Получить атрибут текущего активного элемента
            String attr = getDriver().switchTo().activeElement().getAttribute("class");
            Thread.sleep(2000);

            System.out.println(attr);
        } finally {
            getDriver().quit();
        }
    }

    /**
     * Elements-Information
     */
    @Test
    public void testTagName() {
    //navigates to url
        getDriver().get("https://www.example.com");

    //returns TagName of the element
        String value = getDriver().findElement(By.cssSelector("h1")).getTagName();
        System.out.println(value);
        System.out.println(value);

    }

    @Test
    public void testIsDisplayedAndIsEnabled() {
    //navigates to url
        getDriver().get("https://www.google.com/");

    //returns true if element is enabled else returns false
        boolean value = getDriver().findElement(By.name("btnK")).isEnabled();//isDisplayed() - Get boolean value for is element display (By.name("q"))
        System.out.println(value);
    }
    @Test
    public void testSizeAndPosition() {
    // Navigate to url
        getDriver().get("https://www.example.com");

    // Returns height, width, x and y coordinates referenced element
        Rectangle res = getDriver().findElement(By.cssSelector("h1")).getRect();

    // Rectangle class provides getX,getY, getWidth, getHeight methods
        System.out.println(res.getWidth());
    }

    @Test
    public void testGetCSSValue() {
    // Navigate to Url
        getDriver().get("https://www.example.com");

    // Retrieves the computed style property 'color' of linktext
        String cssValue = getDriver().findElement(By.linkText("More information...")).getCssValue("color");
        System.out.println(cssValue);
    }
}
