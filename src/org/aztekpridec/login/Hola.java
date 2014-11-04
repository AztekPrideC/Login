package org.aztekpridec.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Hola extends Activity{
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.hola);     
	    }
	 public void seSale(View view ){
		 finish();
	 }
}
