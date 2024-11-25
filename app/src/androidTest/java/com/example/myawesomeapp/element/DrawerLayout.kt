package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.Matchers.allOf
import com.example.myawesomeapp.R

class DrawerLayout {
    private val layoutID = R.id.drawer_layout

    private val userPictureID = R.id.imageView
    private val userNameText = "Android Studio"
    private val userEmailID = R.id.textView

    private val menuButtonTextID = com.google.android.material.R.id.design_menu_item_text
    private val homeButtonText = "Home"
    private val galleryButtonText = "Gallery"
    private val slideshowButtonText = "Slideshow"

    val drawerLayout: ViewInteraction
        get() {
            return onView(withId(layoutID))
        }

    val drawerLayoutUserPicture: ViewInteraction
        get() {
            return onView(withId(userPictureID))
        }

    val drawerLayoutUserName: ViewInteraction
        get() {
            return onView(withText(userNameText))
        }

    val drawerLayoutUserEmail: ViewInteraction
        get() {
            return onView(withId(userEmailID))
        }

    val drawerLayoutHomeButton: ViewInteraction
        get() {
            return onView(
                allOf(
                    withId(menuButtonTextID),
                    withText(homeButtonText)
                )
            )
        }

    val drawerLayoutGalleryButton: ViewInteraction
        get() {
            return onView(
                allOf(
                    withId(menuButtonTextID),
                    withText(galleryButtonText)
                )
            )
        }

    val drawerLayoutSlideshowButton: ViewInteraction
        get() {
            return onView(
                allOf(
                    withId(menuButtonTextID),
                    withText(slideshowButtonText)
                )
            )
        }
}