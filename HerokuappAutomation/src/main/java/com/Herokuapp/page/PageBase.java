package com.Herokuapp.page;

import com.Herokuapp.utils.TestBase;
import org.openqa.selenium.support.PageFactory;

public class PageBase extends TestBase {
    public ChallengingDOMPageObjects challengingDOMPage(){
        PageFactory.initElements(getDriver(), ChallengingDOMPageObjects.class);
        return new ChallengingDOMPageObjects(getDriver());

    }


}
