import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_001Page;

public class tc_001Steps {
    
    WebDriver driver = Hooks.driver;
    tc_001Page uploadPage = PageFactory.initElements(driver, tc_001Page.class);

    @Given("I am on the document upload page")
    public void i_am_on_the_document_upload_page() {
        driver.get("http://example.com/uploadpage");
    }

    @When("I select the 'upload documents' option")
    public void i_select_upload_documents_option() {
        uploadPage.clickUploadDocumentsOption();
    }

    @Then("I should see the options for single file upload and multiple file upload")
    public void i_should_see_options_for_upload_modes() {
        assert(uploadPage.isSingleUploadOptionVisible());
        assert(uploadPage.isMultipleUploadOptionVisible());
    }

    @When("I choose the 'single file upload'")
    public void i_choose_single_file_upload() {
        uploadPage.selectSingleFileUpload();
    }

    @Then("a single box should be enabled for file upload")
    public void single_file_upload_box_should_be_enabled() {
        assert(uploadPage.isSingleFileUploadBoxEnabled());
    }

    @When("I choose the 'upload documents separately'")
    public void i_choose_upload_documents_separately() {
        uploadPage.selectMultipleFileUpload();
    }

    @Then("multiple boxes should be displayed for each required document")
    public void multiple_boxes_should_be_displayed() {
        assert(uploadPage.areMultipleUploadBoxesDisplayed());
    }
}