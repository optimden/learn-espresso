@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.step.GalleryScreenStep
import com.example.myawesomeapp.step.MainScreenStep
import com.example.myawesomeapp.step.PanelOfNavigationStep
import com.example.myawesomeapp.step.SlideshowScreenStep
import com.example.myawesomeapp.step.SnackebarStep
import com.example.myawesomeapp.step.ToolbarStep
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyAwesomeTests {
    private lateinit var scenario: ActivityScenario<MainActivity>
    private val main = MainScreenStep()
    private val navPanel = PanelOfNavigationStep()
    private val slideshow = SlideshowScreenStep()
    private val snackBar = SnackebarStep()
    private val gallery = GalleryScreenStep()
    private val toolbar = ToolbarStep()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun openMenuOnMainScreen() {
    }

    @Test
    fun openSlideshowFromMenu() {
        toolbar.clickOnPanelOfNavigation()
        navPanel.clickOnSlideshowScreenFromNavigationPanel()
        slideshow.checkSlideshowScreenTextIsDisplayed()
    }

    @Test
    fun checkMenu() {
        main.checkMainScreenTextIsDisplayed()
        toolbar.clickOnPanelOfNavigation()
        navPanel.checkHeaderOfNavigationPanelIsDisplayed()
        navPanel.checkUserEmailIsDisplayed()
        navPanel.checkPanelOfNavigationButtonsIsDisplayed()
        navPanel.checkPanelOfNavigationTextIsDisplayed()
        navPanel.clickOnHomeScreenButton()
    }

    @Test
    fun checkMailButtonOnMainScreen() {
        main.checkMainScreenTextIsDisplayed()
        main.checkMailButtonIsDisplayed()
        main.clickOnMailButton()
        snackBar.checkMainScreenSnackBarTextIsDisplayed()
        snackBar.swipeSnackBar()
        Thread.sleep(1000)
        snackBar.checkSnackBarIsNotDisplayed()
    }

    @Test
    fun checkGalleryItemsList() {
        main.checkMainScreenTextIsDisplayed()
        toolbar.clickOnPanelOfNavigation()
        navPanel.clickOnGalleryButton()
        navPanel.checkFocusGalleryButton()
        Thread.sleep(1000)
        gallery.checkGalleryScreenListOptionsIsDisplayed()
        gallery.checkGalleryToolbarTextIsDisplayed()
        gallery.checkFirstGalleryItemIsDisplayed()
        gallery.clickOnFirstGalleryItem()
        snackBar.checkFirstItemGalleryTextIsDisplayed()
        snackBar.swipeSnackBar()
        Thread.sleep(1000)
        gallery.scrollGalleryItems()
        gallery.checkLastGalleryItemIsDisplayed()
        gallery.clickOnLastGalleryItem()
        snackBar.checkLastItemGalleryTextIsDisplayed()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}
