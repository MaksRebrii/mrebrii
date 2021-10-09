package hw11ToLesson15;

public class TestLoginUtil {

    public static void main(String[] args) {
        System.out.println(LoginUtil.isUserAuthentic("L-oginWi5thLenMoreThan20", "1232", "1232")); //not valid login
        System.out.println(LoginUtil.isUserAuthentic("WhiteOcean", "Not15valodPAss-", "Not15valodPAss-")); //not valid password
        System.out.println(LoginUtil.isUserAuthentic("WhiteOcean", "bkjfdiis67", "1234")); //passwords are different
        System.out.println(LoginUtil.isUserAuthentic("BlackOcean", "bkjfdiis67", "bkjfdiis67")); //can't find user
        System.out.println(LoginUtil.isUserAuthentic("WhiteOcean", "123", "123")); //incorrect password
        System.out.println(LoginUtil.isUserAuthentic("WhiteOcean", "bkjfdiis67", "bkjfdiis67")); //should pass
    }

}
