package testngtests;

import org.testng.annotations.Test;

public class LoginTests {
    @Test(enabled = true, priority = -2)
    static void loginValidCredentials(){
        System.out.println("loginValidCredentials");
    }
    @Test(enabled = true, priority = 0)
    static void loginInValidCredentials(){
        System.out.println("loginInValidCredentials");
    }
    @Test(enabled = true, priority = 4)
    static void loginValiduserIdInvalidPwd(){
        System.out.println("loginValiduserIdInvalidPwd");
    }
    @Test(enabled = true, priority = 1)
    static void loginInvaliduserIdValidPwd(){
        System.out.println("loginInvaliduserIdValidPwd");
        throw new RuntimeException();
    }
    @Test(enabled = false)
    static void loginBlankUserIdValidPwd(){
        System.out.println("loginBlankUserIdValidPwd");
    }
    @Test(enabled = false)
    static void loginValiduserIdBlankPwd(){
        System.out.println("loginValiduserIdBlankPwd");
    }
}
