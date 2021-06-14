import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ScheduleParser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\programms\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        final String URL = "https://student.lpnu.ua/students_schedule?departmentparent_abbrname_selective=%D0%86%D0%A2%D0%A0%D0%95&studygroup_abbrname_selective=%D0%9C%D0%9D-11&semestrduration=1";
        driver.get(URL);

        List<WebElement> viewContent = driver.findElements(By.className("view-grouping"));
        viewContent.stream().forEach(x-> System.out.println(x.getText() + "\n\n"));

        driver.close();
    }
}
