package a.b.c;

//import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends Activity{
//	@Override
	CalendarView c;
//	Button btn;
//	TextView txt1;
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
//		int selDay = 1, selMonth =10, selYear = 2015; 
//		btn  = (Button)findViewById(R.id.button1);
//				txt1 = (TextView)findViewById(R.id.textView1);
		final String state;
		if (savedInstanceState == null) {
		    Bundle extras = getIntent().getExtras();
		    if(extras == null) {
		        state = null;
		    } else {
		        state = extras.getString("State"); 
		    }
		} else {
		    state = (String) savedInstanceState.getSerializable("STRING_I_NEED");
		}
		
		
		c = (CalendarView)findViewById(R.id.calendarView1);
		c.setOnDateChangeListener(new OnDateChangeListener() {
		
			//show the selected date as a toast
         public void onSelectedDayChange(CalendarView view, int year, int month, int day) {
	         	getApplicationContext();
//			         	txt1.setText(day + "/" + month+ "/"+ year);
	         	Intent go = new Intent(Main.this, Splash.class);
	         	go.putExtra("Date", year + "/" + month+ "/"+ day);
//	         	go.putExtra("State", state);
//	         	String state = "Gujarat"; 
//	         	go.putExtra("State", state);
	    		go.putExtra("State", state);
	         	
	         	startActivity(go);
         	}
		});
	}
}
