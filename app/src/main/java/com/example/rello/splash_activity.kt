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
import android.os.Bundle


import android.view.View
import android.widget.ImageView
import android.widget.TextView

class splash_activity : Activity() {


    private var _bg__splash_ek2: View? = null
    private var bitmap: ImageView? = null
    private var rello: TextView? = null
    private var rectangle_1: View? = null
    private var create_an_account: TextView? = null
    private var rectangle_2: View? = null
    private var have_an_account_already__log_in: TextView? = null

    public override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)


        _bg__splash_ek2 = findViewById(R.id._bg__splash_ek2) as View
        bitmap = findViewById<View>(R.id.bitmap) as ImageView
        rello = findViewById<View>(R.id.rello) as TextView
        rectangle_1 = findViewById(R.id.rectangle_1) as View
        create_an_account = findViewById<View>(R.id.create_an_account) as TextView
        rectangle_2 = findViewById(R.id.rectangle_2) as View
        have_an_account_already__log_in =
            findViewById<View>(R.id.have_an_account_already__log_in) as TextView


        //custom code goes here

    }
}
	
	