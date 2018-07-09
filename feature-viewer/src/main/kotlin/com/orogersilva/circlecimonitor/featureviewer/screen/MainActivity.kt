package com.orogersilva.circlecimonitor.featureviewer.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.orogersilva.circlecimonitor.featureviewer.R

class MainActivity : AppCompatActivity() {

    // region ACTIVITY LIFECYCLE METHODS

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // endregion

    // region OVERRIDED METHODS

    override fun onSupportNavigateUp() = findNavController(R.id.navHostFragment).navigateUp()

    // endregion
}
