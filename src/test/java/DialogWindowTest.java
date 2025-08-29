import PageMethods.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DialogWindowTest extends HomePage {

    public static final String DB_ELEMENT_TITLE = "Please confirm";
    public static final String DB_ELEMENT_X = "Close";
    public static final String DB_ELEMENT_BY = "Yes";
    public static final String DB_ELEMENT_BN = "No";

    @BeforeEach
    public void setup(){
        createDriver();
        getDriver().navigate().to("https://demos.telerik.com/kendo-angular-ui/demos/dialogs/preview?theme=default-main");}

    @Test

    public void testDB() {
        HomePage testDB = new HomePage();

        testDB.openDialog().clickOnDialogBox().verifyElementTitle(DB_ELEMENT_TITLE).
                verifyElementButton(DB_ELEMENT_BY).verifyElementButton(DB_ELEMENT_BN).focusOnX().closeDialog();
    }

    @AfterEach
    public void close(){quitDriver();}

}
