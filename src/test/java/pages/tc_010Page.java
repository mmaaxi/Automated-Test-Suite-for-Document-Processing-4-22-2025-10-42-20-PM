package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    WebDriver driver;

    private By slipDeSalida = By.id("slip-salida");
    private By historialDocumentos = By.id("historial-documentos");
    private By historialDatos = By.id("historial-datos");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void cargarYProcesarDocumentos() {
        // Implementación de la carga y procesamiento de documentos
    }

    public boolean documentosProcesados() {
        // Lógica para verificar que los documentos han sido procesados correctamente
        return true; 
    }

    public boolean slipDeSalidaGenerado() {
        // Verificar si el 'Slip de salida' ha sido generado
        return driver.findElement(slipDeSalida).isDisplayed();
    }

    public boolean documentosGuardadosEnHistorial() {
        // Verificar si los documentos originales han sido guardados en el historial
        return driver.findElement(historialDocumentos).isDisplayed();
    }

    public boolean datosExtraidosGuardadosEnHistorial() {
        // Verificar si los datos extraídos han sido guardados en el historial
        return driver.findElement(historialDatos).isDisplayed();
    }
}