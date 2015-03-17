package com.example.adaptertest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;

import android.widget.ListView;

public class MainActivity extends Activity {

	private List<Animal> animalList = new ArrayList<Animal>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		init_animal();
	
		AnimalAdapter animalAdapter = new AnimalAdapter(MainActivity.this, R.layout.animal_item,animalList);
		ListView listView = (ListView) findViewById(R.id.list_view);
		listView.setAdapter(animalAdapter);
		
		
	}
	

	private void init_animal() {
		Resources res = getResources();
		String[] animalsName = res.getStringArray(R.array.animal_name);
		int animalStartId = R.drawable.cat;
		
		for(int i=0; i < animalsName.length; i++) {
			Animal animal = new Animal(animalsName[i], animalStartId+i);
			animalList.add(animal);
		}
	}
}
