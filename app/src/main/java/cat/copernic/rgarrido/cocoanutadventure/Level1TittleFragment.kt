package cat.copernic.rgarrido.cocoanutadventure

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import cat.copernic.rgarrido.cocoanutadventure.databinding.FragmentLevel1TittleBinding
import cat.copernic.rgarrido.cocoanutadventure.databinding.FragmentStage0TittleBinding


class Level1TittleFragment : Fragment() {

    private lateinit var binding:FragmentLevel1TittleBinding

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
        binding = FragmentLevel1TittleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       progressBar()
        binding.btGo.setOnClickListener{
            findNavController().navigate(R.id.action_level1TittleFragment_to_toForestFragment)
        }
    }

    private fun progressBar() {
        binding.progressBar.max = 10
        ObjectAnimator.ofInt(binding.progressBar, "progress", 10)
            .setDuration(2000)
            .start()
    }
}