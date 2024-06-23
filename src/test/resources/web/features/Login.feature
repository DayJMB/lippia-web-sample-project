Feature: Verificar el ingreso manual como usuario a la plataforma Clockify

  @Login @Smoke
  Scenario Outline: Inicio de sesión exitosa
    Given El usuario se encuentra en la pantalla principal de Clockify <url>
    When El usuario hace click en el boton Log in
    When El usuario hace click en el boton Log in Manually
    When El usuario ingresa el email <email>
    When El usuario ingresa la password <password>
    When El usuario hace click en el boton Login
    Then Se muestra la pantalla dashboard <tracker_url>

    Examples:
      | email                            | password    | url                  | tracker_url                      |
      | daymara.mejias@crowdaronline.com | 2024Crowdar | https://clockify.me/ | https://app.clockify.me/tracker# |

  @Login @Smoke
  Scenario Outline: Inicio de sesión fallida - Validaciones en el campo password
    Given El usuario se encuentra en la pantalla principal de Clockify <url>
    When El usuario hace click en el boton Log in
    When El usuario hace click en el boton Log in Manually
    When El usuario ingresa el email <email>
    When El usuario ingresa la password <password>
    Then El usuario visualiza en pantalla la validación en el campo password: <mensaje>

    Examples:
      | email                            | password | url                  | mensaje               |
      | daymara.mejias@crowdaronline.com |          | https://clockify.me/ | Password is required  |
      | daymara.mejias@crowdaronline.com | 2024     | https://clockify.me/ | Password is not valid |

  @Login @Smoke
  Scenario Outline: Inicio de sesión fallida - Credenciales incorrectas
    Given El usuario se encuentra en la pantalla principal de Clockify <url>
    When El usuario hace click en el boton Log in
    When El usuario hace click en el boton Log in Manually
    When El usuario ingresa el email <email>
    When El usuario ingresa la password <password>
    When El usuario hace click en el boton Login
    Then El usuario visualiza en pantalla la validación: <mensaje2>

    Examples:
      | email                           | password     | url                  | mensaje2                  |
      | daymaramejias@crowdaronline.com | 2024Crowdar  | https://clockify.me/ | Invalid email or password |
      | daymaramejias@crowdaronline.com | 2024Crowdar* | https://clockify.me/ | Invalid email or password |
