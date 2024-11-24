package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.step.DrawerLayoutStep
import com.example.myawesomeapp.step.MainScreenStep
import com.example.myawesomeapp.step.SlideshowScreenStep
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyAwesomeTests {
    private lateinit var scenario: ActivityScenario<MainActivity>

    private val mainScreen = MainScreenStep()
    private val drawerLayout = DrawerLayoutStep()
    private val slideshowScreen = SlideshowScreenStep()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun checkMainScreen() {
        mainScreen.checkMainScreenIsDisplayed()
    }

    @Test
    fun checkSlideshowScreen() {
        // 1. Open Drawer
        // We use drawerLayout as a root element here due to as i understand
        // we haven't a direct way to get ID of toolbar (id@toolbar) elements
        // like 'burger' menu and settings three point in a column
        //
        // It's still not so clear moment for me
        // Need examine this topic deeper
        drawerLayout.openDrawer()

        // 2. Click on Slideshow
        drawerLayout.proceedToSlideshowScreen()

        // 3. Assert Slideshow activity is displayed
        slideshowScreen.checkSlideshowsScreenIsDisplayed()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}