package samples.webpages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class ResultPage(private val driver:WebDriver) {

    @FindBy(xpath = ".//*[@id='contents'][@class='style-scope ytd-section-list-renderer']/ytd-search-pyv-renderer/div")
    private val numResult: WebElement? = null


    @FindBy(xpath = ".//*[@id='contents'][@class='style-scope ytd-search-pyv-renderer']")
    private val videos: List<WebElement>? = null


    @FindBy(xpath = ".//*[@id='eow-title']")
    private val titleVideo: WebElement? = null


    @FindBy(xpath = ".//*[@id='watch7-user-header']/div/a")
    private val channel: WebElement? = null

    init
    {
        PageFactory.initElements(driver, this)
    }


    fun isPageOpened(): Boolean? {
        return true//videos!!.isEmpty()
    }


    fun selectVideo(selectVideo: String){

        for (webElement in videos!!) {

            if (webElement.getText().contains(selectVideo)) {
                webElement.click()
                break
            }
        }
    }


    fun playingVideo(titleVideo: String, channel: String): Boolean{

        return titleVideo?.equals(titleVideo) && channel.equals(channel)
    }


}