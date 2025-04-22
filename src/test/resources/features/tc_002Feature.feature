Feature: Validar subida de archivo con formato válido y vista previa

  Scenario: Subir archivo PDF/DOCX dentro del límite de 50 MB y verificar vista previa
    Given el usuario está en la página de subida de archivos
    When el usuario selecciona un archivo PDF/DOCX con tamaño dentro de 50 MB
    Then el archivo se carga correctamente y se muestra la vista previa con nombre, tamaño y tipo