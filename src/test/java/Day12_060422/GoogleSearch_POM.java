package Day12_060422;

import ReusableClasses.Reusable_Annotation_Class;
import org.testng.annotations.Test;

public class GoogleSearch_POM extends Reusable_Annotation_Class {

    @Test
    public void SearchForAKeywordOnGoogleHome(){
        driver.navigate().to("https://www.google.com");

    }
}
