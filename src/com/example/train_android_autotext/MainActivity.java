package com.example.train_android_autotext;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView selection;


	 AutoCompleteTextView singleComplete;
	 MultiAutoCompleteTextView multiComplete;


	 String arr[]={"hà nội","Huế","Sài gòn",
	 "hà giang","Hội an","Kiên giang",
	 "Lâm đồng","Long khánh"};
	 protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.activity_main);
	 selection =(TextView) findViewById(R.id.selection);


	 singleComplete=(AutoCompleteTextView) findViewById(R.id.editauto);

	 ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
	 singleComplete.setAdapter(adapter);

	 
	 }

	 
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}



}
