package dev.fatihg.themingsample.ui.white

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.fatihg.themingsample.R

class WhiteFragment : Fragment() {

    companion object {
        fun newInstance() = WhiteFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_white, container, false)
    }
}