package com.lombee.resume.profile;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.os.Bundle;

public class ProfileActivity extends Activity {

	private Tab tab;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Create the actionbar
		ActionBar actionBar = getActionBar();

		// HideActionbarIcon
		actionBar.setDisplayShowHomeEnabled(false);

		// HideActionbarTitle
		actionBar.setDisplayShowTitleEnabled(false);

		// Create Actionbar Tabs
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// Create first Tab
		tab = actionBar.newTab().setTabListener(new ProfileTabFragment());
		// Create your own custom icon
		tab.setText("Profile");
		actionBar.addTab(tab);

		// Create Second Tab
		tab = actionBar.newTab().setTabListener(new ContactTabFragment());
		// Set Tab Title
		tab.setText("Contact Details");
		actionBar.addTab(tab);
	}
}
