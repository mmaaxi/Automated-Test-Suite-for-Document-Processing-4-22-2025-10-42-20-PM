package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;

public class tc_002Steps {

    WebDriver driver;
    tc_002Page uploadPage = new tc_002Page(driver);

    @Given("el usuario está en la página de subida de archivos")
    public void el_usuario_está_en_la_página_de_subida_de_archivos() {
        uploadPage.navigateToUploadPage();
    }

    @When("el usuario selecciona un archivo PDF/DOCX con tamaño dentro de 50 MB")
    public void el_usuario_selecciona_un_archivo_pdf_docx_con_tamaño_dentro_de_50_mb() {
        uploadPage.selectFile("ruta/del/archivo.pdf");
    }

    @Then("el archivo se carga correctamente y se muestra la vista previa con nombre, tamaño y tipo")
    public void el_archivo_se_carga_correctamente_y_se_muestra_la_vista_previa_con_nombre_tamaño_y_tipo() {
        Assert.assertTrue(uploadPage.isFilePreviewDisplayed());
    }
}