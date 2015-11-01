package a.b.c;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.media.MediaPlayer;
//import android.content.Intent;
//import a.b.c.R;
import android.os.Bundle;
import android.os.Environment;
import android.text.Html;
import android.text.InputType;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Splash extends Activity{
//	@Override
	//ImageButton smsNews, smsTut; // bnt --> button for news text, bna --> button for news audio
	TextView newsBtn1, newsBtn2, tutBtn1, tutBtn2;
	
	TextView txt;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
//		txt = (TextView)findViewById(R.id.textView2);
//		Intent getIndent = new Intent();
//		go.getExtras("Date");
//		go.getExtra
		String date = null,state = null;
		if (savedInstanceState == null) {
		    Bundle extras = getIntent().getExtras();
		    if(extras == null) {
		        date= null;
		        state = null;
		    } else {
		        date= extras.getString("Date");
		        state = extras.getString("State"); 
		    }
		} else {
		    date = (String) savedInstanceState.getSerializable("STRING_I_NEED");
		    state = (String) savedInstanceState.getSerializable("STRING_I_NEED");
		}
		
//		TextView textView =(TextView)findViewById(R.id.textView);
//		textView.setClickable(true);
//		textView.setMovementMethod(LinkMovementMethod.getInstance());
//		String text = "<a href='http://www.google.com'> Google </a>";
//		textView.setText(Html.fromHtml(text));
		
		
		
//		txt = (TextView)findViewById(R.id.textView1);
//		txt.setClickable(true);
//		txt.setMovementMethod(LinkMovementMethod.getInstance());
//		String link = "<a href='https://drive.google.com/uc?export=download&id=0B0cs60cMbG4xci1LQ3pMUTJCVW8'>Download Link</a>";
//		txt.setText(Html.fromHtml(link));
//		MediaPlayer mp = new MediaPlayer();
		
		newsBtn1 = (TextView) findViewById(R.id.newsBtn1);		
		newsBtn2 = (TextView) findViewById(R.id.newsBtn2);
		tutBtn1 = (TextView) findViewById(R.id.tutBtn1);
		tutBtn2 = (TextView) findViewById(R.id.tutBtn2);

		newsBtn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
//				String url = "https://drive.google.com/uc?export=download&id=0B3WMDQhlZL_7ZUxjeGg3TjE1SUE";
				newsBtn1.setClickable(true);
				newsBtn1.setMovementMethod(LinkMovementMethod.getInstance());
				String text = "<a href='https://drive.google.com/uc?export=download&id=0B3WMDQhlZL_7ZUxjeGg3TjE1SUE'> Audio News </a>";
				newsBtn1.setText(Html.fromHtml(text));
				
//				TextView textView =(TextView)findViewById(R.id.newsBtn1);
//				textView.setClickable(true);
//				textView.setMovementMethod(LinkMovementMethod.getInstance());
				
			}
		});
		
		newsBtn2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				newsBtn2.setClickable(true);
				newsBtn2.setMovementMethod(LinkMovementMethod.getInstance());
				// TODO Auto-generated method stub
//				String url = "https://drive.google.com/uc?export=download&id=0B3WMDQhlZL_7c0ZOWkJhOTlKdFk";
				String text = "<a href='https://drive.google.com/uc?export=download&id=0B3WMDQhlZL_7c0ZOWkJhOTlKdFk'> PDF News </a>";
				newsBtn2.setText(Html.fromHtml(text));
			}
		});

		tutBtn1.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View v) {
				tutBtn1.setClickable(true);
				tutBtn1.setMovementMethod(LinkMovementMethod.getInstance());
				// TODO Auto-generated method stub
//				String url = "https://drive.google.com/uc?export=download&id=0B3WMDQhlZL_7WmtBMWpUeHBTaE0";
				String text = "<a href='https://drive.google.com/uc?export=download&id=0B3WMDQhlZL_7WmtBMWpUeHBTaE0'> Audio Tutorial </a>";
				tutBtn1.setText(Html.fromHtml(text));
			}
		});
		
		tutBtn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				tutBtn2.setClickable(true);
				tutBtn2.setMovementMethod(LinkMovementMethod.getInstance());
				// TODO Auto-generated method stub
//				String url = "https://drive.google.com/uc?export=download&id=0B3WMDQhlZL_7aUxFaExTR24teE0";
				String text = "<a href='https://drive.google.com/uc?export=download&id=0B3WMDQhlZL_7aUxFaExTR24teE0'> PDF Tutorial </a>";
				tutBtn2.setText(Html.fromHtml(text));
			}
		});
		
	}
}
