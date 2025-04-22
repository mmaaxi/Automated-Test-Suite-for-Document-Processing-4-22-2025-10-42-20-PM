Feature: Slip de salida y almacenamiento en historial

  Scenario: Validar generación de 'Slip de salida' y almacenamiento en historial
    Given El usuario ha completado la carga y procesamiento de documentos
    When El sistema procesa los documentos cargados
    Then El sistema genera el 'Slip de salida'
    And El sistema guarda los documentos originales en el historial
    And El sistema almacena los datos extraídos en el historial de la solicitud