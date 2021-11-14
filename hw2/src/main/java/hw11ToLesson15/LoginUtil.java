package hw11ToLesson15;

import java.util.HashMap;
import java.util.Map;

public class LoginUtil {
    private static final String EMAIL_REGEX = "^[\\\\w!#$%&'*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$"
    private static final String PASSWORD_REGEX = "^\\w{3,20}$";

    private static Map<String, String> loginData = new HashMap<>();

    static {
        loginData.put("WhiteOcean", "bkjfdiis67");
        loginData.put("BlackSea", "zzzzz");
        loginData.put("PacificOcean", "12345");
        loginData.put("IndianOcean", "423f3");
        loginData.put("AtlanticOcean", "b52f25f");
    }


    static boolean isUserAuthentic(String login, String password, String confirmPassword) {
        try {
            isLoginValid(login);
            isPasswordValid(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        if (loginData.containsKey(login)) {
            if (loginData.get(login).equals(password))
                return true;
        }
        System.out.println("Wrong login or password");
        return false;
    }

    private static void isLoginValid(String login) {
        if (!login.matches(EMAIL_REGEX))
            throw new WrongLoginException("login is nit an email");
    }

    private static void isPasswordValid(String password, String confirmPassword) {
        if (!password.matches(PASSWORD_REGEX))
            throw new WrongPasswordException("Password must contain only Latin letters, numbers and underscore. Input length must be less than 20 characters");
        if (!password.equals(confirmPassword))
            throw new WrongPasswordException("Entered passwords are different");
    }

}
