package com.example.myawesomeapp.step

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.DrawerActions
import androidx.test.espresso.contrib.DrawerMatchers.isOpen
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.element.DrawerLayout

class DrawerLayoutStep {
    private val slideshowDrawerText = "Slideshow"
    private val drawerLayout = DrawerLayout()

    fun openDrawer() {
        drawerLayout.drawerLayout
            .perform(DrawerActions.open())
            .check(matches(isOpen()))
    }

    fun proceedToSlideshowScreen(): ViewInteraction {
        return onView(withText(slideshowDrawerText))
            .perform(click())
    }
}