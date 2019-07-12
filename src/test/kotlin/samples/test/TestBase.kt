package samples.test

import org.junit.After
import org.junit.Before
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import samples.Util.UtilResources
import java.net.URI
import java.util.concurrent.TimeUnit

abstract class TestBase {

    lateinit var driver: WebDriver
        private set


@Before
fun setup() {
        System.setProperty(UtilResources.getProperties(
            "nameDriver"),
            UtilResources.getProperties(
                "pathDriver") + UtilResources.getProperties("exeDriver"))

        driver = ChromeDriver()

        driver?.manage()?.timeouts()?.implicitlyWait(10, TimeUnit.SECONDS)

        driver?.manage()?.window()?.maximize()

        driver?.get(URI(UtilResources.getProperties("pageURL")).toString())
    }

    @After
    fun driverClose() {

        driver?.close();
    }
}