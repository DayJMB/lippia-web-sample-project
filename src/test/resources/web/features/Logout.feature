Feature: Deslogueo de la plataforma Clockify

  @Logout @Smoke
  Scenario Outline: Deslogueo exitoso
    Given El usuario se encuentra en la pantalla principal de Clockify <url>
    When Login exitoso <email> <password>
    When El usuario hace click en el icono de su perfil
    And El usuario hace click en el botón Log out
    Then El usuario se encuentra en la pantalla de login <login_url>

    Examples:
      | email                            | password    | url                  | login_url                        |
      | daymara.mejias@crowdaronline.com | 2024Crowdar | https://clockify.me/ | https://app.clockify.me/en/login |
