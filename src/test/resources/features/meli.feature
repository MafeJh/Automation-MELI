Feature: Se adquiere unproducto de mercado libre
  Scenario: Compra de audifonos en mercado libre
    Given Abro la pagina
    When Ingreso el nombre de los audifonos airpods
    And Doy click para visualizar el producto Apple AirPods Pro - Blanco
    Then Visualizo el precio del producto

