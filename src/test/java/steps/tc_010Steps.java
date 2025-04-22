package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_010Page;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page slipPage = new tc_010Page(driver);

    @Given("El usuario ha completado la carga y procesamiento de documentos")
    public void completarCargaYProcesamientoDeDocumentos() {
        slipPage.cargarYProcesarDocumentos();
    }

    @When("El sistema procesa los documentos cargados")
    public void sistemaProcesaDocumentosCargados() {
        Assert.assertTrue("Documentos no procesados correctamente", slipPage.documentosProcesados());
    }

    @Then("El sistema genera el 'Slip de salida'")
    public void sistemaGeneraSlipDeSalida() {
        Assert.assertTrue("Slip de salida no generado", slipPage.slipDeSalidaGenerado());
    }

    @Then("El sistema guarda los documentos originales en el historial")
    public void sistemaGuardaDocumentosOriginalesEnHistorial() {
        Assert.assertTrue("Documentos originales no guardados en el historial", slipPage.documentosGuardadosEnHistorial());
    }

    @Then("El sistema almacena los datos extraídos en el historial de la solicitud")
    public void sistemaAlmacenaDatosExtraidosEnHistorialDeSolicitud() {
        Assert.assertTrue("Datos extraídos no almacenados en el historial", slipPage.datosExtraidosGuardadosEnHistorial());
    }
}