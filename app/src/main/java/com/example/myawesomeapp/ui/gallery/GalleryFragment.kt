package com.example.myawesomeapp.ui.gallery

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myawesomeapp.R
import com.example.myawesomeapp.databinding.FragmentGalleryBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton
import ru.kkuzmichev.simpleappforespresso.ui.gallery.GalleryItem

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val itemList: ArrayList<GalleryItem> = ArrayList()
    private var fab: FloatingActionButton? = null
    private var progressBar: ProgressBar? = null
    private var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        fab = requireActivity().findViewById(R.id.fab)
        fab?.visibility = View.INVISIBLE
        fab?.isClickable = false

        progressBar = root.findViewById(R.id.progress_bar)
        recyclerView = root.findViewById(R.id.recycle_view)
        fakeLoadData()

        setLists()
        recyclerView?.layoutManager = LinearLayoutManager(context)
        recyclerView?.adapter = GalleryAdapter(itemList)
        return root
    }

    private fun setLists() {
        for (i in 0..9) {
            itemList.add(GalleryItem("My title", "My description", i + 1))
        }
    }

    private fun fakeLoadData() {
        progressBar?.visibility = View.VISIBLE
        recyclerView?.visibility = View.INVISIBLE
        val handler = Handler()
        handler.postDelayed(object : Runnable {
            override fun run() {
                run {
                    progressBar?.visibility = View.INVISIBLE
                    recyclerView?.visibility = View.VISIBLE
                }
            }
        }, 1500)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}