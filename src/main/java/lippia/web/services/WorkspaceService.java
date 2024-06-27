package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.WorkspaceConstants;


public class WorkspaceService {
    public static void elUsuarioHaceClickEnElMenúDesplegable() {
        WebActionManager.click(WorkspaceConstants.DROPDOWN_OPTIONS);
    }
    public static void elUsuarioHaceClickEnManageWorkspace() {
        WebActionManager.click(WorkspaceConstants.MANAGE_WORKSPACES);
    }
    public static void elUsuarioHaceClickEnElBotónCreateNewWorkspace() {
        WebActionManager.click(WorkspaceConstants.CREATE_NEW_WORKSPACE_BUTTON,false);
        WebActionManager.waitVisibility(WorkspaceConstants.CREATE_NEW_WORKSPACE_MODAL);
    }

public static void elUsuarioIngresaElNombreDelEspacioDeTrabajoName(String name) {
    WebActionManager.setInput(WorkspaceConstants.INPUT_WORKSPACE_NAME, name);
}
    public static void elUsuarioHaceClickEnElBotónCreate() {
        WebActionManager.click(WorkspaceConstants.CREATE_BUTTON);

    }
public static void seMuestraElEspacioDeTrabajoCreadoConEl(String name) {
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    WebActionManager.getElement(WorkspaceConstants.WORKSPACE, name);
}
}

