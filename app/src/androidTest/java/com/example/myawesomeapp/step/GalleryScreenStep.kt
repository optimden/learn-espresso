package com.example.myawesomeapp.step

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.GalleryScreen
import com.example.myawesomeapp.element.Toolbar

class GalleryScreenStep {
    private val galleryScreen = GalleryScreen()
    private val toolbar = Toolbar("Gallery")

    fun checkToolbarTitleIsCorrect() {
        toolbar.toolbarTitle
            .check(matches(isDisplayed()))
    }

    fun checkRecyclerViewIsDisplayed() {
        galleryScreen.recyclerView
            .check(matches(isDisplayed()))
    }

    // I'm not sure where do i need to place start and end indices of
    // RecyclerView list - here or in GalleryScreen class?
    // Now they're hardcoded that is a bad practice. Left it for the
    // further improvement.
    fun clickOnTheFirstListItem() {
        galleryScreen.recyclerViewGetItemClickableElementByItemIndex(1)
            .perform(click())
    }

    fun checkFirstRecyclerViewItemNotificationText() {
        galleryScreen.recyclerViewGetItemNotificationByItemIndex(1)
            .check(matches(isDisplayed()))
    }

    fun scrollRecyclerViewToTheLastItem() {
        galleryScreen.recyclerView
            .perform(RecyclerViewActions.scrollToLastPosition<ViewHolder>())
    }

    fun clickOnTheLastListItem() {
        galleryScreen.recyclerViewGetItemClickableElementByItemIndex(10)
            .perform(click())
    }

    fun checkLastRecyclerViewItemNotificationText() {
        galleryScreen.recyclerViewGetItemNotificationByItemIndex(10)
            .check(matches(isDisplayed()))
    }
}