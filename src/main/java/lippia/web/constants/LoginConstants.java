package lippia.web.constants;

public class LoginConstants {

    public static final String LOG_IN_BUTTON = "xpath:/html/body/nav/div/div[3]/a[1]";
    public static final String LOGIN_MANUALLY_BUTTON = "xpath:/html/body/app-root/register-layout/div/div/div/div/div[2]/login/div/form/div/div/div[3]/a";
    public static final String INPUT_EMAIL = "id:email";
    public static final String INPUT_PASSWORD = "xpath://input[@class='cl-form-control'][@id='password']";;
    public static final String LOGIN_BUTTON = "xpath://button[contains(text(), 'Log In')]";
    public static final String MENSAJE_PASSWORD = "xpath://*[@id=\"password\"]/div/div[2]/span";
    public static final String MENSAJE_EMAIL= "xpath://span[@class='ng-tns-c129-2'][@data-cy='error'][contains(text(),'Invalid email or password')]";
}