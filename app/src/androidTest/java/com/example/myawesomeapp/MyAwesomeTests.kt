@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.step.MainScreenStep
import com.example.myawesomeapp.step.PanelOfNavigationStep
import com.example.myawesomeapp.step.SlideshowScreenStep
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

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun openMenuOnMainScreen() {
    }

    @Test
    fun openSlideshowFromMenu() {
        main.clickOnPanelOfNavigationFromMainScreen()
        navPanel.clickOnSlideshowScreenFromNavigationPanel()
        slideshow.checkSlideshowScreenTextIsDisplayed()
    }

    @Test
    fun checkMenu() {
        main.checkMainScreenTextIsDisplayed()
        main.clickOnPanelOfNavigationFromMainScreen()
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
        main.checkSnackBarTextIsDisplayed()
        main.swipeSnackBar()
        Thread.sleep(1000)
        main.checkSnackBarIsNotDisplayed()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}
