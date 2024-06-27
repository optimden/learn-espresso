package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.GalleryScreenElement
import com.example.myawesomeapp.element.ToolbarElement

class GalleryScreenStep {
    private val galleryElement = GalleryScreenElement()
    private val toolbarElement = ToolbarElement()

    fun checkGalleryToolbarTextIsDisplayed() {
        toolbarElement.toolBarText("Gallery").check(matches(isDisplayed()))
    }

    fun checkGalleryScreenListOptionsIsDisplayed() {
        galleryElement.galleryListOptionsElement().check(matches(isDisplayed()))
    }

    fun checkFirstGalleryItemIsDisplayed() {
        galleryElement.galleryItemInListElement("1").check(matches(isDisplayed()))
    }

    fun checkLastGalleryItemIsDisplayed() {
        galleryElement.galleryItemInListElement("10").check(matches(isDisplayed()))
    }

    fun clickOnFirstGalleryItem() {
        galleryElement.galleryItemInListElement("1").perform(click())
    }

    fun clickOnLastGalleryItem() {
        galleryElement.galleryItemInListElement("10").perform(click())
    }

    fun scrollGalleryItems() {
        galleryElement.galleryListOptionsElement().perform(swipeUp())
    }
}
