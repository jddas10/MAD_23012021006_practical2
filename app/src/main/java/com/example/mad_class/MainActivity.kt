package com.example.mad_class

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showMessage("onCreate method is called")
    }

    //fun showMessage(msg:String){
    //  Log.i(TAG, "showMessage: $msg")
    //Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()
    //}

    fun showMessage(msg: String) {
        Log.i(TAG, "showMessage: $msg")
        Snackbar.make(this.findViewById(R.id.main), msg, Snackbar.LENGTH_SHORT).show()
    }

    override fun onPause() {
        showMessage("App is pause")
        super.onPause()

    }


    override fun onResume() {
        showMessage("App is resume ")
        super.onResume()
    }
    override fun onStop() {
        showMessage("App is Stop")
        super.onStop()
    }
    override fun onDestroy() {
        showMessage("App is destroy")
        super.onDestroy()
    }
    override fun onRestart() {
        showMessage("App is restart")
        super.onRestart()
    }
    override fun onStart() {
        showMessage("Hello JDDAS :) ")
        super.onStart()
    }

}