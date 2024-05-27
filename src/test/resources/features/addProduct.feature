

Feature: Agregar al carrito
  @AddProduct
  Scenario: Agregar producto al carrito
    Given que el usuario ingresa a la url de haceb
    When click en Menu
    And click en Categorias
    And click en subcategoria
    And click en producto de la subcategoria
    And click en agregar al carrito
    Then se visualizara en el carrito el producto agregado