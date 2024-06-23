package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LogoutConstants;


public class LogoutService extends ActionManager {

    public static void elUsuarioHaceClickEnElIconoDeSuPerfil() {
        WebActionManager.click(LogoutConstants.ICONO_USUARIO_LOGUEADO);
    }
    public static void elUsuarioHaceClickEnElBotónLogOut() {
        WebActionManager.click(LogoutConstants.LOG_OUT_BUTTON);
    }
    public static void elUsuarioSeEncuentraEnLaPantallaDeLoginLogin_url(String login_url) {
        WebActionManager.click(LogoutConstants.LOG_OUT_BUTTON);
    }

}
