package com.nowlauncher.nowlauncher;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.GridView;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.widget.BaseAdapter;  
import android.content.Context;
import android.util.Log;


import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;

 /**
 * EN
 * GridView adapter to show the list of all installed applications
 */
 
 /**
 * IT
 * GridView adapter per mostrare la lista delle applicazioni installate
 */

public class ApplicationsAdapter extends BaseAdapter {
	
	/**
	* EN
	* Context of activity
	*
	* IT
	* Context dell'activity
	*/
	private Context mContext;
	
	/**
	* EN
	* App info array
	*
	* IT
	* App info array
	*/
	private ArrayList<AppInfo> mApplications;
  
	private AppInfo info;
  
	/**
	 * EN
	 * getItem and getItemId and required by structure but are useless
	 * 
	 * IT
	 * le funzioni getItem e getItemId sono richieste dalla struttura ma sono inutilizzate
	 */
	
	public Object getItem(int position) {  
	    return null;  
	}
	
	public long getItemId(int position) {  
	    return position;  
	}  
	
  	/**
  	* EN
  	* Costructor, get context and Applications array
  	*
  	* @param context the context of activity
  	* @param Applications the array of applications
  	*
  	* IT
  	* Costruttore, permette di ottenere il context e l'array delle applicazioni
  	*
  	* @param context il context dell'activity
  	* @param Applications l'arrat delle applicazioni
  	*/
	public ApplicationsAdapter(Context context, ArrayList<AppInfo> Applications) {  
	    mContext = context;  
	    mApplications = Applications;
	}		 

	/**
	* EN
	* Get the number of views
	*
	* IT
	* Ottiene il numero di views
	*/
	public int getCount() {  
	    return mApplications.size();  
	} 
	
	/**
	* EN
	* Create the view
	*
	* IT
	* Crea la view
	*/
	@Override
    public View getView(int position, View convertView, ViewGroup parent) {
	  
	    info = mApplications.get(position);
            
	    Drawable icon = info.icon;

            
		TextView textview = new TextView(mContext);
		textview.setCompoundDrawablesWithIntrinsicBounds(null, icon, null, null);
		textview.setText(info.title);
		textview.setGravity(17);
		//textview.setPadding(0, 0, 10, 20);
            
		return textview;        
                        
	}
}