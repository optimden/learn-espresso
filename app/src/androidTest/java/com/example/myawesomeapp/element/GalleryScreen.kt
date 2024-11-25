package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.hasSibling
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.CoreMatchers.allOf
import com.example.myawesomeapp.R

class GalleryScreen {
    private val galleryRecyclerViewID = R.id.recycle_view
    private val recyclerViewItemTitleID = R.id.item_title
    private val recyclerViewItemNumberID = R.id.item_number

    private val itemNotificationTextTemplate = "Item #itemIndex clicked successfully!"

    val recyclerView: ViewInteraction
        get() {
            return onView(withId(galleryRecyclerViewID))
        }

    fun recyclerViewGetItemClickableElementByItemIndex(index: Int): ViewInteraction {
        return onView(
            allOf(
                withId(recyclerViewItemTitleID),
                hasSibling(
                    allOf(
                        withId(recyclerViewItemNumberID),
                        withText(index.toString())
                    )
                )
            )
        )
    }

    fun recyclerViewGetItemNotificationByItemIndex(index: Int): ViewInteraction {
        return onView(
            withText(
                itemNotificationTextTemplate.replaceFirst("itemIndex", index.toString())
            )
        )
    }
}