package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {
    
    @Given("El usuario se encuentra en la pantalla principal de Clockify (.*)")
    public void elUsuarioSeEncuentraEnLaPantallaPrincipalDeClockify(String url) {
        LoginService.navigateTo(url);
    }

    @When("El usuario hace click en el boton Log in")
    public void elUsuarioHaceClickEnElBotonLogIn() {
        LoginService.elUsuarioHaceClickEnElBotonLogIn();
    }

    @When("El usuario hace click en el boton Log in Manually")
    public void elUsuarioHaceClickEnElBotonLogInManually() {
        LoginService.elUsuarioHaceClickEnElBotonLogInManually();
    }

    @When("El usuario ingresa el email (.*)")
    public void elUsuarioIngresaElEmailEmail(String email) {
        LoginService.elUsuarioIngresaElEmail(email);
    }

    @When("El usuario ingresa la password (.*)")
    public void elUsuarioIngresaLaPasswordPassword(String passaword) {
        LoginService.elUsuarioIngresaLaPassword(passaword);
    }

    @When("El usuario hace click en el boton Login")
    public void elUsuarioHaceClickEnElBotonLogin() {
        LoginService.elUsuarioHaceClickEnElBotonLogin();
    }

    @Then("Se muestra la pantalla dashboard (.*)")
    public void seMuestraLaPantallaDashboardTrackerUrl(String url) {
        LoginService.navigateTo(url);
    }

    @Then("El usuario visualiza en pantalla la validación en el campo password: (.*)")
    public void elUsuarioVisualizaEnPantallaLaValidaciónMensaje(String mensaje) {
        LoginService.elUsuarioVisualizaEnPantallaEnElCampoPassword(mensaje);
    }

    @Then("El usuario visualiza en pantalla la validación: (.*)")
    public void elUsuarioVisualizaEnPantallaLaValidación(String mensaje) {
        LoginService.elUsuarioVisualizaEnPantallaLaValidación(mensaje);
    }

    @Given("Login exitoso (.*) (.*)")
    public void loginExitoso(String email, String password) {
        LoginService.loginExitoso(email,password);
    }
}
