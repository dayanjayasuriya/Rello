
	 
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
	

package exportkit.xd;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_activity extends Activity {

	
	private View _bg__splash_ek2;
	private ImageView bitmap;
	private TextView rello;
	private View rectangle_1;
	private TextView create_an_account;
	private View rectangle_2;
	private TextView have_an_account_already__log_in;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		
		_bg__splash_ek2 = (View) findViewById(R.id._bg__splash_ek2);
		bitmap = (ImageView) findViewById(R.id.bitmap);
		rello = (TextView) findViewById(R.id.rello);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		create_an_account = (TextView) findViewById(R.id.create_an_account);
		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		have_an_account_already__log_in = (TextView) findViewById(R.id.have_an_account_already__log_in);
	
		
		//custom code goes here
	
	}
}
	
	