package com.example.islam;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;
public class MainActivity extends Activity {
  ListView list;
	zikr adapter;
  String[] web = {
      "Daily zikr",
       "Hadis",
      "Holy places & History",
      "Islamic calender",
      "Islam Guide",
      "Islam & Science",
      "Prayer Times"
  } ;
  Integer[] imageId = {
      R.drawable.islam1,
      R.drawable.islam2,
      R.drawable.islam3,
      R.drawable.islam6,
      R.drawable.islam4,
      R.drawable.islam5,
      R.drawable.islam7
  };
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
   
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
 list=(ListView)findViewById(R.id.list);

 String[] myArray= getResources().getStringArray(R.id.list);
 ArrayAdapter<String> aad= new ArrayAdapter<String>(this,android.R.layout.activity_list_item, myArray);
 setListAdapter(aad);
 

 
  }
private void setListAdapter(ArrayAdapter<String> aad) {
	list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
   	 @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
if (position == 0) {
      Intent int0 = new Intent(getApplicationContext(), zikr.class);
      startActivity(int0);
  }

  else if (position == 1) {
      Intent int1 = new Intent(getApplicationContext(), hadis.class);
      startActivity(int1);
  }
  else if (position == 2) {
      Intent int2 = new Intent(getApplicationContext(), place.class);
      startActivity(int2);
  }

  else if (position == 3) {
      Intent int3 = new Intent(getApplicationContext(),
              calender.class);
      startActivity(int3);
  }
  else if (position == 4) {
      Intent int4 = new Intent(getApplicationContext(),
              guide.class);
      startActivity(int4);
  }
  else if (position == 5) {
      Intent int5 = new Intent(getApplicationContext(),
              science.class);
      startActivity(int5);
  }
  else if (position == 6) {
      Intent int6 = new Intent(getApplicationContext(),
              time.class);
      startActivity(int6);
  }


        }
      });
	
}



  }	



