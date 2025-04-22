package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {

    WebDriver driver;

    By fileInput = By.id("fileUploadInput");
    By filePreview = By.id("filePreview");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("URL_DE_LA_PAGINA_DE_SUBIDA");
    }

    public void selectFile(String filePath) {
        WebElement uploadElement = driver.findElement(fileInput);
        uploadElement.sendKeys(filePath);
    }

    public boolean isFilePreviewDisplayed() {
        WebElement previewElement = driver.findElement(filePreview);
        return previewElement.isDisplayed() && !previewElement.getText().isEmpty();
    }
}