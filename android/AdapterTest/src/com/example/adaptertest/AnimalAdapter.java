package com.example.adaptertest;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class AnimalAdapter extends ArrayAdapter<Animal> {

	private int resourceId;
	
	public AnimalAdapter(Context context, int resource, List<Animal> objects) {
		super(context, resource, objects);
		resourceId = resource;
	}
	
	@Override
	public View getView(int position, View converView, ViewGroup parent) {
		
		Animal animal = getItem(position);
		
		View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
		ImageView animalView = (ImageView)view.findViewById(R.id.animal_image);
		TextView animalName = (TextView)view.findViewById(R.id.animal_name);
		
		animalView.setImageResource(animal.getImageId());
		animalName.setText(animal.getName());
		
		return view;
		
		
	}

}
