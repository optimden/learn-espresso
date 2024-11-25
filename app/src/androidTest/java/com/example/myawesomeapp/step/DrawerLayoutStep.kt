package com.example.myawesomeapp.step

import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.DrawerActions
import androidx.test.espresso.contrib.DrawerMatchers.isOpen
import androidx.test.espresso.matcher.ViewMatchers.isChecked
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.DrawerLayout

class DrawerLayoutStep {
    private val drawerLayout = DrawerLayout()

    fun openDrawer() {
        drawerLayout.drawerLayout
            .perform(DrawerActions.open())
            .check(matches(isOpen()))
    }

    fun proceedToHomeScreen(): ViewInteraction {
        return drawerLayout.drawerLayoutHomeButton
            .perform(click())
    }

    fun proceedToSlideshowScreen(): ViewInteraction {
        return drawerLayout.drawerLayoutSlideshowButton
            .perform(click())
    }

    fun proceedToGalleryScreen(): ViewInteraction {
        return drawerLayout.drawerLayoutGalleryButton
            .perform(click())
    }

    fun checkGalleryButtonBecomesActive(): ViewInteraction {
        return drawerLayout.drawerLayoutGalleryButton
            .check(matches(isChecked()))
    }

    fun checkIsUserPicturePresented(): ViewInteraction {
        return drawerLayout.drawerLayoutUserPicture
            .check(matches(isDisplayed()))
    }

    fun checkIsUserNamePresented(): ViewInteraction {
        return drawerLayout.drawerLayoutUserName
            .check(matches(isDisplayed()))
    }

    fun checkIsUserEmailPresented(): ViewInteraction {
        return drawerLayout.drawerLayoutUserEmail
            .check(matches(isDisplayed()))
    }

    fun checkIsHomeButtonPresented(): ViewInteraction {
        return drawerLayout.drawerLayoutHomeButton
            .check(matches(isDisplayed()))
    }

    fun checkIsGalleryButtonPresented(): ViewInteraction {
        return drawerLayout.drawerLayoutGalleryButton
            .check(matches(isDisplayed()))
    }

    fun checkIsSlideshowButtonPresented(): ViewInteraction {
        return drawerLayout.drawerLayoutSlideshowButton
            .check(matches(isDisplayed()))
    }
}