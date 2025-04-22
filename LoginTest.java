import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void testCheckUserName_Valid() {
        Login login = new Login("John", "Doe", "jd_1", "P@ssword1!", "+27831234567");
        assertTrue(login.checkUserName());
    }

    @Test
    public void testCheckUserName_Invalid() {
        Login login = new Login("John", "Doe", "john!!!", "P@ssword1!", "+27831234567");
        assertFalse(login.checkUserName());
    }

    @Test
    public void testCheckPasswordComplexity_Valid() {
        Login login = new Login("John", "Doe", "jd_1", "Ch&&sec@ke99!", "+27831234567");
        assertTrue(login.checkPasswordComplexity());
    }

    @Test
    public void testCheckPasswordComplexity_Invalid() {
        Login login = new Login("John", "Doe", "jd_1", "password", "+27831234567");
        assertFalse(login.checkPasswordComplexity());
    }

    @Test
    public void testCheckCellPhoneNumber_Valid() {
        Login login = new Login("John", "Doe", "jd_1", "P@ssword1!", "+27831234567");
        assertTrue(login.checkCellPhoneNumber());
    }

    @Test
    public void testCheckCellPhoneNumber_Invalid() {
        Login login = new Login("John", "Doe", "jd_1", "P@ssword1!", "0831234567");
        assertFalse(login.checkCellPhoneNumber());
    }

    @Test
    public void testLoginUser_Success() {
        Login login = new Login("John", "Doe", "jd_1", "P@ssword1!", "+27831234567");
        assertTrue(login.loginUser("jd_1", "P@ssword1!"));
    }

    @Test
    public void testLoginUser_Failure() {
        Login login = new Login("John", "Doe", "jd_1", "P@ssword1!", "+27831234567");
        assertFalse(login.loginUser("jd_1", "WrongPass123"));
    }

    @Test
    public void testReturnLoginStatus_Success() {
        Login login = new Login("John", "Doe", "jd_1", "P@ssword1!", "+27831234567");
        String expected = "Welcome John, Doe it is great to see you again.";
        assertEquals(expected, login.returnLoginStatus(true));
    }

    @Test
    public void testReturnLoginStatus_Failure() {
        Login login = new Login("John", "Doe", "jd_1", "P@ssword1!", "+27831234567");
        String expected = "Username or password incorrect, please try again.";
        assertEquals(expected, login.returnLoginStatus(false));
    }
}
