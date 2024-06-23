package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.LogoutService;

public class LogoutSteps extends PageSteps {

    @When("El usuario hace click en el icono de su perfil")
    public void elUsuarioHaceClickEnElIconoDeSuPerfil() {
        LogoutService.elUsuarioHaceClickEnElIconoDeSuPerfil();

    }

    @And("El usuario hace click en el botón Log out")
    public void elUsuarioHaceClickEnElBotónLogOut() {
        LogoutService.elUsuarioHaceClickEnElBotónLogOut();

    }

    @Then("El usuario se encuentra en la pantalla de login (.*)")
    public void elUsuarioSeEncuentraEnLaPantallaDeLoginLogin_url(String login_url) {
            LoginService.navigateTo(login_url);
        }
}
