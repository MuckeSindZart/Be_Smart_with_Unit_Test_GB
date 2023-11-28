package seminars.five;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {
    @Test
    void seleniumTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();

        WebElement searchUrl = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/cite"));
        assertThat(searchUrl.getText()).isEqualTo("https://www.selenium.dev");
        driver.quit();

        List<WebElement> searchDivInList = driver.findElements(By.cssSelector("div"));
        boolean isFound = false;
        for (WebElement el : searchDivInList) {
            if (el.getText().contains("https://www.selenium.dev")) {
                isFound = true;
                break;
            }
        }

        assertTrue(isFound);
        driver.quit();
    }

    @Test
    void sourceTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        WebElement nameBox = driver.findElement(By.name("user-name"));
        nameBox.sendKeys("standard_user");
        WebElement passBox = driver.findElement(By.name("password"));
        passBox.sendKeys("secret_sauce");
        WebElement logInBtn = driver.findElement(By.id("login-button"));
        logInBtn.submit();
        WebElement search = driver.findElement(By.className("title"));

        assertEquals(search.getText(), "Products");

        driver.quit();
    }
}
