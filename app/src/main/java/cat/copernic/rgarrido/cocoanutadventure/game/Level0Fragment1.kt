package cat.copernic.rgarrido.cocoanutadventure.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import cat.copernic.rgarrido.cocoanutadventure.R
import cat.copernic.rgarrido.cocoanutadventure.databinding.FragmentLevel01Binding


class Level0Fragment1 : Fragment() {

    private lateinit var binding:FragmentLevel01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLevel01Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btForest.setOnClickListener{
            findNavController().navigate(R.id.action_level0Fragment1_to_level1TittleFragment)
        }

        binding.btCave.setOnClickListener{
            Toast.makeText(context, "You skipped level 1!", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_level0Fragment1_to_level2TittleFragment)
        }
    }

}