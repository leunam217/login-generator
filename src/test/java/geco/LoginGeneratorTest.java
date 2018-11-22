package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {
    private LoginService l;
    private String name ="manuel";
    private  LoginGenerator g;
    @Before
    public void init () {
        String[] ma= new String[1];
        ma[0]=name;
        l=new LoginService(ma);
        g= new LoginGenerator(l);
    }

    @Test
    public void generateLoginForNomAndPrenom() {
        assertEquals("erreur","manuel1",g.generateLoginForNomAndPrenom("","manuel"));
    }
}