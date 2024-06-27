package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.LogoutService;
import lippia.web.services.WorkspaceService;

public class WorkspaceSteps extends PageSteps {

    @And("El usuario hace click en el menú desplegable")
    public void elUsuarioHaceClickEnElMenúDesplegable() {
        WorkspaceService.elUsuarioHaceClickEnElMenúDesplegable();
    }

    @And("El usuario hace click en Manage workspace")
    public void elUsuarioHaceClickEnManegeWorkspace() {
        WorkspaceService.elUsuarioHaceClickEnManageWorkspace();
    }

    @And("El usuario hace click en el botón Create new workspace")
    public void elUsuarioHaceClickEnElBotónCreateNewWorkspace() {
        WorkspaceService.elUsuarioHaceClickEnElBotónCreateNewWorkspace();
    }

    @And("El usuario ingresa el nombre del espacio de trabajo (.*)")
    public void elUsuarioIngresaElNombreDelEspacioDeTrabajoName(String name) {
        WorkspaceService.elUsuarioIngresaElNombreDelEspacioDeTrabajoName(name);
    }

    @And("El usuario hace click en el botón Create")
    public void elUsuarioHaceClickEnElBotónCreate() {
        WorkspaceService.elUsuarioHaceClickEnElBotónCreate();
    }

    @Then("Se muestra el espacio de trabajo creado con el (.*)")
    public void seMuestraElEspacioDeTrabajoCreadoConEl(String uniqueWorkspaceName) {
        WorkspaceService.seMuestraElEspacioDeTrabajoCreadoConEl(uniqueWorkspaceName);
    }
}
