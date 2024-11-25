package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.step.DrawerLayoutStep
import com.example.myawesomeapp.step.GalleryScreenStep
import com.example.myawesomeapp.step.HomeScreenStep
import com.example.myawesomeapp.step.SlideshowScreenStep
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyAwesomeTests {
    private lateinit var scenario: ActivityScenario<MainActivity>

    private val homeScreen = HomeScreenStep()
    private val drawerLayout = DrawerLayoutStep()
    private val slideshowScreen = SlideshowScreenStep()
    private val galleryScreen = GalleryScreenStep()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun checkHomeScreen() {
        homeScreen.checkHomeScreenIsDisplayed()
    }

    @Test
    fun checkSlideshowScreen() {
        // 1. Open Drawer
        drawerLayout.openDrawer()
        // 2. Click on Slideshow
        drawerLayout.proceedToSlideshowScreen()
        // 3. Assert Slideshow activity is displayed
        slideshowScreen.checkSlideshowScreenIsDisplayed()
    }

    @Test
    fun checkMenuAppearance() {
        // 1. Check that there is Toolbar on the Home Screen
        homeScreen.checkToolbarIsDisplayed()
        // 2. Check that it contains: Menu button, Title "Home", Options button
        homeScreen.checkToolbarContainsMenuButton()
        homeScreen.checkToolbarTitleIsCorrect()
        homeScreen.checkToolbarContainsOptionsButton()
        // 3. Open Drawer
        drawerLayout.openDrawer()
        // 4. Check that opened drawer contains: user picture, username, email, buttons: Home, Gallery, Slideshow
        drawerLayout.checkIsUserPicturePresented()
        drawerLayout.checkIsUserNamePresented()
        drawerLayout.checkIsUserEmailPresented()
        drawerLayout.checkIsHomeButtonPresented()
        drawerLayout.checkIsGalleryButtonPresented()
        drawerLayout.checkIsSlideshowButtonPresented()
        // 5. Back to the Home Screen using Drawer's Home button
        drawerLayout.proceedToHomeScreen()
        homeScreen.checkHomeScreenIsDisplayed()
    }

    @Test
    fun checkFloatingActionButtonIsClickableAndShowsNotification() {
        // 1. Get FloatingActionButton
        homeScreen.checkFloatingActionButtonIsDisplayed()
        // 2. Click on FAB button and check notification is shown
        // and contains text "Replace with your own action"
        homeScreen.clickOnFloatingActionButton()
        homeScreen.checkFloatingActionButtonNotificationIsDisplayed()
        // 3. Smash notification via swipe
        homeScreen.smashFloatingActionButtonNotification()
        // 4. Check that notification isn't present more
        Thread.sleep(1000)
        homeScreen.checkFloatingActionButtonNotificationNotDisplayed()
    }

    @Test
    fun checkGalleryScreen() {
        // Refactor!!!
        // Hardcoded Thread.sleep(1000) is a bad approach
        // i guess i can replace it by while loop
        // which runs until timeout
        // but can breaks earlier by some condition

        // 1. Open drawer
        drawerLayout.openDrawer()
        // 2. Click on the "Gallery" button
        drawerLayout.proceedToGalleryScreen()
        // 3. Check that clicked button becomes active
        drawerLayout.checkGalleryButtonBecomesActive()
        // 4. Check that Gallery screen is opened:
        // 4.1. Toolbar's title now equals to "Gallery"
        galleryScreen.checkToolbarTitleIsCorrect()
        // 4.2. There is list of elements
        Thread.sleep(1000)
        galleryScreen.checkRecyclerViewIsDisplayed()
        // 5. Click to the list's first element
        // Refactor!!!
        // make function accept item index to have a singular interface
        // for interaction with RecyclerView
        galleryScreen.clickOnTheFirstListItem()
        // 6. Check that notification with text "Item #1 clicked successfully!" is shown
        Thread.sleep(1000)
        galleryScreen.checkFirstRecyclerViewItemNotificationText()
        // 7. Scroll list to the last element, click on it and check
        // that corresponding notification is shown
        galleryScreen.scrollRecyclerViewToTheLastItem()
        galleryScreen.clickOnTheLastListItem()
        galleryScreen.checkLastRecyclerViewItemNotificationText()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}