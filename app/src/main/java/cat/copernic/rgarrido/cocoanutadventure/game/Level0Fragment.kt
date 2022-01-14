package cat.copernic.rgarrido.cocoanutadventure.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import cat.copernic.rgarrido.cocoanutadventure.R
import cat.copernic.rgarrido.cocoanutadventure.databinding.FragmentLevel0Binding

class Level0Fragment : Fragment() {

    private lateinit var binding:FragmentLevel0Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLevel0Binding.inflate(inflater, container, false)
        return binding.root
    }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            binding.btNext.setOnClickListener{
                findNavController().navigate(R.id.action_level0Fragment_to_level0Fragment1)
            }

        }
}