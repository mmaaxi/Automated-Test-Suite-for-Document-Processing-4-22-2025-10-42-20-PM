import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_001Page {
    WebDriver driver;

    @FindBy(id = "uploadDocumentsOption")
    WebElement uploadDocumentsOption;

    @FindBy(id = "singleUploadOption")
    WebElement singleUploadOption;
    
    @FindBy(id = "multipleUploadOption")
    WebElement multipleUploadOption;

    @FindBy(id = "singleUploadBox")
    WebElement singleUploadBox;

    @FindBy(id = "multipleUploadBoxes")
    WebElement multipleUploadBoxes;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public void clickUploadDocumentsOption() {
        uploadDocumentsOption.click();
    }
    
    public boolean isSingleUploadOptionVisible() {
        return singleUploadOption.isDisplayed();
    }
    
    public boolean isMultipleUploadOptionVisible() {
        return multipleUploadOption.isDisplayed();
    }

    public void selectSingleFileUpload() {
        singleUploadOption.click();
    }

    public boolean isSingleFileUploadBoxEnabled() {
        return singleUploadBox.isEnabled();
    }

    public void selectMultipleFileUpload() {
        multipleUploadOption.click();
    }

    public boolean areMultipleUploadBoxesDisplayed() {
        return multipleUploadBoxes.isDisplayed();
    }
}