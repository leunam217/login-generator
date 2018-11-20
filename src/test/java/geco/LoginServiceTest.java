package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    private LoginService l;
    private String login ="manuel";

    @Before
    public void init () {
        l=new LoginService(new String[0]);
    }


    @Test
    public void loginExists_addLogin() {
        l.addLogin(login);
        assertTrue("exist(l ,(add (l,empty)) )= true", l.loginExists(login));
    }

    @Test
    public void loginExists () {
        assertFalse("si le login n'est pas présent " +
                "ça doit retourner false",l.loginExists(""));
    }

    @Test
    public void findAllLoginsStartingWith() {
        l.addLogin(login);
        List<String> list = l.findAllLoginsStartingWith("man");
        assertArrayEquals("test pas passé", new String[]{"manuel"},list.toArray());
    }

    @Test
    public void findAllLogins() {
        l.addLogin(login);
        List<String> list = l.findAllLogins();
        assertArrayEquals("test pas passé", new String[]{"manuel"},list.toArray());

    }
}