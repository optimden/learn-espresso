package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import com.example.myawesomeapp.step.MainScreenStep
import com.example.myawesomeapp.step.PanelOfNavigationStep
import com.example.myawesomeapp.step.SlideshowScreenStep
import kotlin.concurrent.thread


@RunWith(AndroidJUnit4::class)
class MyFirstTest {
    private lateinit var scenario: ActivityScenario<MainActivity>
    private val main = MainScreenStep()
    private val navPanel = PanelOfNavigationStep()
    private val slideshow = SlideshowScreenStep()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun openSlideshowFromMenu() {
        main.callPanelOfNavigationFromMainScreen()
        navPanel.callSlideshowScreenFromNavigationPanel()
        slideshow.checkSlideshowScreenTextIsDisplayed()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}
