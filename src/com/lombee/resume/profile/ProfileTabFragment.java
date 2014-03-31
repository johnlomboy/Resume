package com.lombee.resume.profile;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.lombee.resume.R;

public class ProfileTabFragment extends Fragment implements
		ActionBar.TabListener {

	private Fragment frag;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getActivity().setContentView(R.layout.profile_profiletabfragment);
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		frag = new ProfileTabFragment();
		// Attach fragment1.xml layout
		ft.add(android.R.id.content, frag);
		ft.attach(frag);

	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		ft.remove(frag);
	}

}
