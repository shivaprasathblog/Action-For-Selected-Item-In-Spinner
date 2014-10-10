package com.example.actionforselectediteminspinner;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends Activity 
{
Spinner sp;
//Data items
String[] country={"Select country","India","France"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sp=(Spinner)findViewById(R.id.spinner1);
		//
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item,country);
		sp.setAdapter(adapter);
		sp.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,int arg2, long arg3) 
			
			{
				// TODO Auto-generated method stub
				  if (sp.getSelectedItem()=="Select country")
				  {
					  Toast.makeText(MainActivity.this,"Select your Country", Toast.LENGTH_LONG).show();  
				  }
				  if (sp.getSelectedItem()=="India")
				  {
					  Toast.makeText(MainActivity.this,"It is a Asian country", Toast.LENGTH_LONG).show();  
				  }
				  if (sp.getSelectedItem()=="France")
				  {
					  Toast.makeText(MainActivity.this,"It is a European country", Toast.LENGTH_LONG).show();  
				  }
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) 
			{
				// TODO Auto-generated method stub
					
			}
			
		});
	}



}
