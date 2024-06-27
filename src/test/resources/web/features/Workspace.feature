Feature: Verificar poder crear un espacio de trabajo en la plataforma Clockify

  @Workspace @Smoke
  Scenario Outline: Creación de un espacio de trabajo (Workspace)
    Given El usuario se encuentra en la pantalla principal de Clockify <url>
    When Login exitoso <email> <password>
    And El usuario hace click en el menú desplegable
    And El usuario hace click en Manage workspace
    And El usuario hace click en el botón Create new workspace
    And El usuario ingresa el nombre del espacio de trabajo <name>
    And El usuario hace click en el botón Create
    Then Se muestra el espacio de trabajo creado con el <name>

    Examples:
      | email                            | password    | url                  | name        |
      | daymara.mejias@crowdaronline.com | 2024Crowdar | https://clockify.me/ | Lippia web3 |
