package stu.napls;

import org.junit.Test;
import stu.napls.nabootauthsdk.model.AuthLogin;

import static org.junit.Assert.assertEquals;


public class LibTest {
    @Test
    public void testModel() {
        AuthLogin authLogin = new AuthLogin();
        authLogin.setUsername("Hello");
        authLogin.setPassword("World");
        assertEquals("AuthLogin(username=Hello, password=World, source=null)", authLogin.toString());
    }

}
