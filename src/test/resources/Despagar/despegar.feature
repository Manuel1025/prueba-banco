@test
Feature: Ver distintos vuelos

  Yo como usuario  de la Pagina Despegar
  necesito  un formulario de vuelo
  para poder seleccionar vuelos
  @Test1
  Scenario: el usuario deberia  poder distintos vuelos que coincidan con su criterio de busqueda
    Given que el usuario ingresa a la pagina
    When diligencia el formulrio de vuelo
    |origen       |destino   |mes                       |dia  |
    |MMonteria    |MMed      |octubre 2022              | 14  |

    Then deberia poder escoger un vuelo
