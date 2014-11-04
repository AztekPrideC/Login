package org.aztekpridec.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
 String usuario="admin";
 String contra="superuser";
 int intentos=0;
 private EditText user;
private EditText cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText) findViewById(R.id.txtUser);
        cont=(EditText) findViewById(R.id.txtContra);
        
    }

    public void acepta(View view){
    	Toast.makeText(this, "Verificando...", Toast.LENGTH_LONG).show();
    	Intent abrirHola=new Intent(this, Hola.class);
    	if(usuario.equals(String.valueOf(user.getText()))){
    		if(contra.equals(String.valueOf(cont.getText()))){
    			Toast.makeText(this, "Bienvenido "+usuario, Toast.LENGTH_LONG).show();
    			startActivity(abrirHola);
    	}
    		}else {
        		intentos++;
        		Toast.makeText(this, "Usuario incorrecto", Toast.LENGTH_LONG).show();
            	
        		if (intentos==3){
        			Toast.makeText(this, "Baneando...", Toast.LENGTH_LONG).show();
        	    	
        			finish();
        		}
        	}
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
