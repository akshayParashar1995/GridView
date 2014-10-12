package com.example.gridview;



import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Table extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.table);
		Log.i("1","before");
		SharedPreferences sp=getSharedPreferences("User_Details",0);
		String msg=sp.getString("Name", "hahaha");
		Log.i("log",msg+"1");
		Log.i("2","after");
	}

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		// TODO Auto-generated method stub
		 super.onCreateOptionsMenu(menu);
		MenuInflater menuInflater=getMenuInflater();
		 menuInflater.inflate(R.menu.new_menu,menu);
		 
		 return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId())
		{
		case R.id.contact_us:
			/*Class ourClass;
			try {
				ourClass = Class.forName("com.example.gridview.ContactUs");
				Intent ourIntent=new Intent(Table.this,ourClass);
				startActivity(ourIntent);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			Intent i = new Intent();
			i.setAction(Intent.ACTION_VIEW);
			Uri mail = Uri.parse("mailto:akshayprshr95@gmail.com.com");
			i.setData(mail);
			startActivity(i);
			break;
		case R.id.options_menu:
			
			Class nextClass;
			try {
				nextClass = Class.forName("com.example.gridview.MainActivity");
				Intent ourIntent=new Intent(Table.this,nextClass);
				startActivity(ourIntent);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			break;
		}
		return true;
	}

}
