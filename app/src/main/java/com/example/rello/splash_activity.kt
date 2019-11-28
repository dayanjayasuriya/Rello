/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc
	 *	@file 		start_up_screen
	 *	@date 		0
	 *	@title 		Start-up Screen
	 *	@author
	 *	@keywords
	 *	@generator 	Export Kit v1.2.9.xd
	 *
	 */


package com.example.rello

import android.app.Activity
import android.content.Intent
import android.os.Bundle


import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class splash_activity : Activity() {


    private var _bg__splash_ek2: View? = null
    private var bitmap: ImageView? = null
    private var rello: TextView? = null
    private var rectangle_1: View? = null
    private var create_an_account: Button? = null
    private var rectangle_2: View? = null
    private var have_an_account_already__log_in: Button? = null

    public override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)


        rectangle_1 = findViewById(R.id.rectangle_1) as View
        create_an_account = findViewById<View>(R.id.create_an_account) as Button
        create_an_account!!.setOnClickListener {
            val signUpIntent = Intent(this, sign_up_1_activity::class.java)
            startActivity(signUpIntent)
        }
        rectangle_2 = findViewById(R.id.rectangle_2) as View
        have_an_account_already__log_in =
            findViewById(R.id.sign_in) as Button

        have_an_account_already__log_in!!.setOnClickListener {
            val loginIntent = Intent(this, log_in_activity::class.java)
            startActivity(loginIntent)
        }
    }

}
	
	