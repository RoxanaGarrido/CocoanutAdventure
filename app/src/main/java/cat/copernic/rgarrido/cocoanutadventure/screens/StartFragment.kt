package cat.copernic.rgarrido.cocoanutadventure.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.preference.PreferenceManager
import cat.copernic.rgarrido.cocoanutadventure.R
import cat.copernic.rgarrido.cocoanutadventure.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btOptions.setOnClickListener{
            findNavController().navigate(R.id.action_startFragment_to_settingsFragment)
        }
        loadSettings()

        binding.btStart.setOnClickListener{
            findNavController().navigate(R.id.action_startFragment_to_stage0TittleFragment)
        }
    }

    private fun loadSettings() {
        val sp = PreferenceManager.getDefaultSharedPreferences(context)
        val signature = sp.getString("signature", "")
        val language = sp.getString("eng", "")
        val music = sp.getBoolean("music", true)


        //binding.tvName.text = "$signature" Cambiar el nombre en todas las pantallas
        /*
        Hacer una instancia del Global fragment para usar binding y modificar sus valores name y puntos
        ?
         */
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}