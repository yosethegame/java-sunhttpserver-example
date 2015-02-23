package worlds.start;

import com.objogate.wl.UnsynchronizedProber;
import com.objogate.wl.web.AsyncWebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import support.YoseChallenge;

import static org.hamcrest.CoreMatchers.containsString;

public class HelloYoseChallenge extends YoseChallenge {

    private AsyncWebDriver browser;

    @Before
    public void visitHome() throws Exception {
        browser = new AsyncWebDriver( new UnsynchronizedProber(), new FirefoxDriver() );
        browser.navigate().to( "http://localhost:8000/" );
    }

    @After
    public void closeBrowser() {
        browser.quit();
    }

    @Test
    public void displaysExpectedMessage() {
        browser.element( By.id( "title" ) ).assertText( containsString( "Hello Yose" ) );
    }
}
