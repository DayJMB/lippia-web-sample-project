package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

import static org.openqa.selenium.Keys.ENTER;

public class LoginService extends ActionManager {


    public static void navigateTo(String url) {
        WebActionManager.navigateTo(url);
    }
    public static void elUsuarioHaceClickEnElBotonLogIn(){
        WebActionManager.click(LoginConstants.LOG_IN_BUTTON);
    }
    public static void elUsuarioHaceClickEnElBotonLogInManually(){
        WebActionManager.click(LoginConstants.LOGIN_MANUALLY_BUTTON);
    }
    public static void elUsuarioIngresaElEmail(String email) {
        WebActionManager.setInput(LoginConstants.INPUT_EMAIL, email);
    }
    public static void elUsuarioIngresaLaPassword(String password) {
        WebActionManager.setInput(LoginConstants.INPUT_PASSWORD,password +ENTER);
    }
    public static void elUsuarioHaceClickEnElBotonLogin() {
        WebActionManager.isVisible(LoginConstants.LOGIN_BUTTON);
        WebActionManager.click(LoginConstants.LOGIN_BUTTON);
    }
    public static void elUsuarioVisualizaEnPantallaEnElCampoPassword(String mensaje) {
        Assert.assertEquals(WebActionManager.getText(LoginConstants.MENSAJE_PASSWORD), mensaje);
    }
    public static void elUsuarioVisualizaEnPantallaLaValidación(String mensaje) {
        Assert.assertEquals(WebActionManager.getText(LoginConstants.MENSAJE_EMAIL), mensaje);
    }

    public static void loginExitoso(String email, String password){
        WebActionManager.click(LoginConstants.LOG_IN_BUTTON);
        WebActionManager.click(LoginConstants.LOGIN_MANUALLY_BUTTON);
        WebActionManager.setInput(LoginConstants.INPUT_EMAIL, email);
        WebActionManager.setInput(LoginConstants.INPUT_PASSWORD,password);
        WebActionManager.click(LoginConstants.LOGIN_BUTTON);
    }


}
