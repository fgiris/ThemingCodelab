package dev.fatihg.themingsample.ui.blue

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.fatihg.themingsample.R

class BlueFragment : Fragment() {

    companion object {
        fun newInstance() = BlueFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_blue, container, false)
    }
}