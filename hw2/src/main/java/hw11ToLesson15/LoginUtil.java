package hw11ToLesson15;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginUtil {
    private static final String VALIDATION_REGEX = "^\\w{3,20}$";

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
        Matcher m = Pattern.compile(VALIDATION_REGEX).matcher(login);
        if (!m.find())
            throw new WrongLoginException("Login must contain only Latin letters, numbers and underscore. Input length must be less than 20 characters");
    }

    private static void isPasswordValid(String password, String confirmPassword) {
        Matcher passwordCheck = Pattern.compile(VALIDATION_REGEX).matcher(password);
        if (!passwordCheck.find())
            throw new WrongPasswordException("Password must contain only Latin letters, numbers and underscore. Input length must be less than 20 characters");
        if (!password.equals(confirmPassword))
            throw new WrongPasswordException("Entered passwords are different");
    }

}
