package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LogoutConstants;


public class LogoutService {

    public static void elUsuarioHaceClickEnElIconoDeSuPerfil() {
        WebActionManager.click(LogoutConstants.LOGGED_USER_ICON);
    }
    public static void elUsuarioHaceClickEnElBotónLogOut() {
        WebActionManager.click(LogoutConstants.LOG_OUT_BUTTON);
    }

}
