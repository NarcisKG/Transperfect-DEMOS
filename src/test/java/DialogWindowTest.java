import PageMethods.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DialogWindowTest extends HomePage {

    public static final String DIALOG_TITLE = "Please confirm";
    public static final String BUTTON_X = "Close";
    public static final String BUTTON_YES = "Yes";
    public static final String BUTTON_NO = "No";
    public static final String DIALOG_CONTENT = "Are you sure you want to continue?";

    @BeforeEach
    public void setup(){
        createDriver();
        getDriver().navigate().to("https://demos.telerik.com/kendo-angular-ui/demos/dialogs/preview?theme=default-main");}

    @Test

    public void testDB() {
        HomePage testDB = new HomePage();

        testDB.openDialog().clickOnDialogBox().verifyElementTitle(DIALOG_TITLE).
                verifyElementButton(BUTTON_YES).verifyElementButton(BUTTON_NO).
                verifyElementContent(DIALOG_CONTENT).verifyYesButtonColor("rgba(0, 0, 0, 0)").
                focusOnX().closeDialog();
    }

    @AfterEach
    public void close(){quitDriver();}

}
