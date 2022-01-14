package cat.copernic.rgarrido.cocoanutadventure.screens

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import cat.copernic.rgarrido.cocoanutadventure.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}