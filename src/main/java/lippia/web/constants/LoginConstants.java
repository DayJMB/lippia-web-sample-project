package lippia.web.constants;

public class LoginConstants {

    public static final String LOG_IN_BUTTON = "xpath:/html/body/nav/div/div[3]/a[1]";
    public static final String LOGIN_MANUALLY_BUTTON = "xpath://a[contains(.,'Log in manually ')]";
    public static final String INPUT_EMAIL = "id:email";
    public static final String INPUT_PASSWORD = "xpath://input[@class='cl-form-control'][@id='password']";;
    public static final String LOGIN_BUTTON = "xpath://button[contains(text(), 'Log In')]";
    public static final String MESSAGE_PASSWORD = "xpath://*[@id=\"password\"]/div/div[2]/span";
    public static final String MESSAGE_INVALID_EMAIL_PASSWORD = "xpath://register-layout//login//form//span[@data-cy='error'][contains(.,'Invalid email or password')]";
}