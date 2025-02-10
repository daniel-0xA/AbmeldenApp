package com.example.testapplication

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.launch
import androidx.appcompat.app.AlertDialog
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.testapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

//    private fun onButtonClicked() {
//        when {
//            ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED -> {
//                // Permission already granted, proceed with camera functionality
//                startCameraPreview()
//            }
//            shouldShowRequestPermissionRationale(Manifest.permission.CAMERA) -> {
//                // Explain to the user why the permission is needed
//                // You can use a dialog or Snackbar for this
//                // ... and then request the permission again
//                requestCameraPermission()
//            }
//            else -> {
//                // Request the permission
//                requestCameraPermission()
//            }
//        }
//    }
//


//    private fun requestCameraPermission() {
//        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), CAMERA_PERMISSION_REQUEST_CODE)
//    }
//
//    private fun startCameraPreview() {
//        // Code to start the camera preview
//    }
//
//    companion object {
//        private const val CAMERA_PERMISSION_REQUEST_CODE = 123
//    }
//
//    private val requestPermissionLauncher =
//        registerForActivityResult(
//            ActivityResultContracts.RequestPermission()
//        ) { isGranted: Boolean ->
//            if (isGranted) {
//                startCameraPreview()
//            } else {
//                // Explain to the user that the feature is unavailable without the camera permission
//            }
//        }
//
//    private fun onButtonClicked() {
//        when {
//            ContextCompat.checkSelfPermission(
//                this,
//                Manifest.permission.CAMERA
//            ) == PackageManager.PERMISSION_GRANTED -> {
//                startCameraPreview()
//            }
//
//            shouldShowRequestPermissionRationale(Manifest.permission.CAMERA) -> {
//                // Explain to the user why the permission is needed...
//                AlertDialog.Builder(this)
//                    .setTitle("Camera Permission Required")
//                    .setMessage("This app needs access to your camera to take pictures.")
//                    .setPositiveButton("OK") { _, _ -> requestCameraPermission() }
//                    .setNegativeButton("Cancel", null)
//                    .show()
//                requestPermissionLauncher.launch(Manifest.permission.CAMERA)
//            }
//
//            else -> {
//                requestPermissionLauncher.launch(Manifest.permission.CAMERA)
//            }
//        }
//    }


}