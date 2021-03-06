package com.nowlauncher.nowlauncher;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.content.ComponentName;

import android.util.Log;

/**
 * EN
 * Represents a launchable application. An application is made of a name (or title), an intent
 * and an icon.
 **/
 
 /** 
 * IT
 * Rappresenta un applicazione lanciabile. Un applicazione è composta da un nome (o titolo) un intent e un icona
 **/
 
public class AppInfo {
	
	/**
	* EN
	* Application title
	*
	* IT
	* Nome dell'applicazione
	**/
	protected CharSequence title;
	
	/**
	* EN
	* The intent used to start the application
	*
	* IT
	* L'intent usato per lanciare l'applicazione
	*/
	protected Intent intent;

	/**
	* EN
	* The application icon
	*
	* IT
	* L'icona dell'applicazione
	*/
	protected Drawable icon;

	/**
	* EN
	* Creates the application intent based on a component name and various launch flags
	*
	* @param className the class name of the component representing the intent
	* @param launchFlags the launch flags
	*
	* IT
	* Crea l'intent dell'applicazione basandoti nel ComponentName e con alcuni flag
	*
	* @param className la classe che rappresenta il component dell'intent
	* @param launchFlags i flag(parametri) di lancio
	*/	
	
	final void setIntent(ComponentName className, int launchFlags) {
	  
		intent = new Intent(Intent.ACTION_MAIN);
		intent.addCategory(Intent.CATEGORY_LAUNCHER);
		intent.setComponent(className);
		intent.setFlags(launchFlags);
	  
	  }
	  
 }