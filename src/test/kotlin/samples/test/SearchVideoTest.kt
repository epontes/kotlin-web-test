package samples.test

import org.junit.Assert
import org.junit.Test
import samples.Util.UtilResources
import samples.webpages.HomePage
import samples.webpages.ResultPage

class SearchVideoTest(): TestBase() {

    @Test
    fun searchVideo() {
        val homePage = HomePage(driver!!)

        homePage.searchVideo(UtilResources.getProperties("nameVideo"))

        val resultPage = ResultPage(driver!!)

        Assert.assertTrue(resultPage.isPageOpened()!!)

        resultPage.selectVideo(UtilResources.getProperties("selectVideo"))

        Assert.assertTrue(
            resultPage.playingVideo(UtilResources.getProperties("selectVideo"),

            UtilResources.getProperties("channel")))

    }





}