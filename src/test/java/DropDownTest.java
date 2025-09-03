import PageMethods.HomePageDropdowns;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DropDownTest extends HomePageDropdowns {

    public static final String FAVORITE_SPORT = "Table Tennis";


    @BeforeEach
    public void setup(){
        createDriver();
        getDriver().navigate().to("https://demos.telerik.com/kendo-angular-ui/demos/dropdowns/overview?theme=default-main");}

    @Test

    public void testDD(){

        HomePageDropdowns testDD = new HomePageDropdowns();

        testDD.clickOnAutoComplete();enterFavoriteSport(FAVORITE_SPORT).verifyFavoriteSport(FAVORITE_SPORT);

    }





    //@AfterEach
    //public void close(){quitDriver();}
}
