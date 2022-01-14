package cat.copernic.rgarrido.cocoanutadventure

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import cat.copernic.rgarrido.cocoanutadventure.databinding.FragmentStage0TittleBinding
import cat.copernic.rgarrido.cocoanutadventure.databinding.FragmentStartBinding
import java.util.*
import kotlin.concurrent.schedule
import kotlin.concurrent.timer
import java.util.TimerTask as TimerTask

class Level0TittleFragment : Fragment() {

    private lateinit var binding: FragmentStage0TittleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStage0TittleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        progressBar()
        binding.btGo.setOnClickListener{
            findNavController().navigate(R.id.action_stage0TittleFragment_to_level0Fragment)
        }
    }

    private fun progressBar() {
        binding.progressBar.max = 10
        ObjectAnimator.ofInt(binding.progressBar, "progress", 10)
            .setDuration(2000)
            .start()
    }

}
