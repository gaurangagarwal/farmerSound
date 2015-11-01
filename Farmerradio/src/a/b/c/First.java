package a.b.c;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
//import farmFriends.States;
//import farmFriends.main;

public class First extends Activity {
//	@Override
	String[] st =  new String[] {"offline" , "online"};
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, st);
	      
		ListView listview = (ListView) findViewById(R.id.OnOff);
//		
		listview.setAdapter(adapter);
		
		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0,
					View arg1, int arg2, long arg3) {
				// TODO Auto-generated method stub
				 if(arg2==1)
				 {
					 Intent intent =new Intent(First.this,States.class);
					 startActivity(intent);
				 }
				 if(arg2==0)
				 {
					String url="tel:08039511963";
					Intent intent=new Intent (Intent.ACTION_CALL,Uri.parse(url));
					startActivity(intent);
				 }
					 
			}

			
		});
		
	}
		
		
}	
