import PageMethods.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class OpenWindowTest extends HomePage{

    public static final String WIN_TITLE = "About";
    public static final String WIN_CONT = "Additional info";
    public static final String WIN_MAX = "Maximize";
    public static final String WIN_MIN = "Minimize";
    public static final String WIN_CLOSE = "Close";


    @BeforeEach
    public void setup(){
        createDriver();
        getDriver().navigate().to("https://demos.telerik.com/kendo-angular-ui/demos/dialogs/preview?theme=default-main");}

    @Test

    public void testOW(){
        HomePage testOW = new HomePage();

        testOW.openWindow().clickOnWindow().
                verifyWindowTitle(WIN_TITLE).verifyWindowContent(WIN_CONT).
                maximizeWindow(WIN_MAX);

    }

    @AfterEach
    public void close(){quitDriver();}



}
