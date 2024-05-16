package com.example.alertdialogwithanarray

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btn: Button =findViewById(R.id.button)
        var option=arrayOf("mohammad","ahmad","hawkar")
        var alertDialog=AlertDialog.Builder(this).setTitle("Choose to add").setSingleChoiceItems(option,0){_,i->
            Toast.makeText(this,"you chose ${option[i]}", Toast.LENGTH_LONG).show()
        }.setPositiveButton("Accept"){_,_->
            Toast.makeText(this,"you accepted",Toast.LENGTH_LONG).show()
        }.setNegativeButton("Decline"){_,_->
            Toast.makeText(this,"you Declined",Toast.LENGTH_LONG).show()
        }.create()

        btn.setOnClickListener {
            alertDialog.show()
        }
    }
}