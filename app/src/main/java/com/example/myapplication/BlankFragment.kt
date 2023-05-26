package com.example.myapplication

import android.app.Activity
import android.app.Activity.RESULT_OK
import android.content.ActivityNotFoundException
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.FileProvider
import androidx.core.content.PermissionChecker.checkSelfPermission
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import java.io.File
import java.io.IOException

// TODO: Rename parameter arguments, choose names that match

@Suppress("DEPRECATION")
class BlankFragment : Fragment() {
    private val REQUEST_IMAGE_CAPTURE = 1
    private lateinit var imageView: ImageView


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        val button = view.findViewById<Button>(R.id.buttonCreate)

        button.setOnClickListener {
               view ->
            view.findNavController().navigate(R.id.action_blankFragment_to_creationprofile3)

        }


        return view
    }

}
