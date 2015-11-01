package a.b.c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;

public class States  extends Activity{
	
	String st[] = {"Rajasthan", "Punjab", "Gujarat", "Uttar Pradesh", "Haryana"};
	Spinner spinner;
	ArrayAdapter<String> adapter;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.states);
//		adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.states, states);
//		// Spinner element
	    spinner = (Spinner) findViewById(R.id.sta);
	     
	      
//	      
//	      // Spinner Drop down elements
//		
	 adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, st);
	 adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
     spinner.setAdapter(adapter);
	
		
	spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

        @Override
	
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
		  // On selecting a spinner item
	      String item = parent.getItemAtPosition(position).toString();
	      // Showing selected spinner item
	      Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
	      Intent go = new Intent(States.this, Main.class);
	     	go.putExtra("State", item);
	     	startActivity(go);
	   }
	   public void onNothingSelected(AdapterView<?> arg0) {
	      // TODO Auto-generated method stub
	   }
	});
}}



