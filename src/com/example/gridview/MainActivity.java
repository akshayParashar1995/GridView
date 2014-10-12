package com.example.gridview;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

public class MainActivity extends ActionBarActivity {
	
	GridView gridViewList;
	String[] gridItemNames={"Assignments","Self","Notifications","Calender"
			,"Events","About Us"};
	ArrayList<Item> list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initialise();
		
		for(String s: gridItemNames)
		{
			if(s.equals("Assignments"))
			{
				Item item=new Item("Assignments",R.drawable.assignment);
				list.add(item);
			}
			if(s.equals("Self"))
			{
				Item item=new Item("Self",R.drawable.self);
				list.add(item);
			}
			if(s.equals("Notifications"))
			{
				Item item=new Item("Notifications",R.drawable.notification);
				list.add(item);
			}
			if(s.equals("Calender"))
			{
				Item item=new Item("Calender",R.drawable.calender);
				list.add(item);
			}
			if(s.equals("Events"))
			{
				Item item=new Item("Events",R.drawable.event);
				list.add(item);
			}
			if(s.equals("About Us"))
			{
				Item item=new Item("About Us",R.drawable.about);
				list.add(item);
			}
			
		}
		gridViewList.setAdapter(new GridAdapter(this,0,0,list));
	}

	private void initialise() {
		// TODO Auto-generated method stub
		gridViewList=(GridView) findViewById(R.id.gvList);
		list=new ArrayList<Item>();
	
		
		
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
