package dev.fatihg.themingsample.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import dev.fatihg.themingsample.R
import dev.fatihg.themingsample.ui.blue.BlueFragment
import dev.fatihg.themingsample.ui.white.WhiteFragment
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO#19 Add click listeners for each text view to open another fragment

        // White theme fragment navigation
        tvTop.setOnClickListener {
            requireActivity().apply {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, WhiteFragment.newInstance())
                    .addToBackStack("WhiteFragment")
                    .commit()
            }
        }

        // Blue theme fragment navigation
        tvBottom.setOnClickListener {
            requireActivity().apply {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, BlueFragment.newInstance())
                    .addToBackStack("BlueFragment")
                    .commit()
            }
        }

        // TODO#28 Add click listeners to enable the dark mode
        btnDarkTheme.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
    }
}