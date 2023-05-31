package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.ArticlePageObject;

public class iOSArticlePageObject  extends ArticlePageObject
{
    static {
        TITLE = "id:Java (programming language)";
        FOOTER_ELEMENT = "id:View article in browser";
        OPTIONS_ADD_TO_MY_LIST_BUTTON = "id:Save for later";
        FOLDER_IN_LISTS = "xpath://android.widget.ImageButton[@content-desc='Navigate up']";
        CLOSE_ARTICLE_BUTTON = "xpath://XCUIElementTypeButton[@name='W']";

    }

    public iOSArticlePageObject(AppiumDriver driver)
    {
        super(driver);
    }
}
