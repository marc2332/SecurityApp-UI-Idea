package com.example.mespi.securityapp

import android.content.ClipData
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import android.content.ClipData.Item
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button1.setOnClickListener{ view ->
            val intent: Intent = Intent(this,clean::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener{ view ->
            val intent: Intent = Intent(this,scan::class.java)
            startActivity(intent)
        }

    }



}
