package com.lombee.resume.about;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;

import com.lombee.resume.R;

public class AlertDialogFragment extends DialogFragment {

	private static int pos;

	public static DialogFragment newInstance(int position) {
		AlertDialogFragment frag = new AlertDialogFragment();
		pos = position;
		return frag;
	}

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

		switch (pos) {
		case 2:// traits
			View view = getActivity().getLayoutInflater().inflate(
					R.layout.alertdialogfragment_traits, null);
			builder.setView(view);
			return builder.create();
		case 4:// sports
			View view1 = getActivity().getLayoutInflater().inflate(
					R.layout.alertdialogfragment_sports, null);
			builder.setView(view1);
			return builder.create();
		case 5:// education
			View view2 = getActivity().getLayoutInflater().inflate(
					R.layout.alertdialogfragment_education, null);
			builder.setView(view2);
			return builder.create();
		case 6:// achievements
			View view3 = getActivity().getLayoutInflater().inflate(
					R.layout.alertdialogfragment_achievements, null);
			builder.setView(view3);
			return builder.create();
		case 9:// work experience
			View view4 = getActivity().getLayoutInflater().inflate(
					R.layout.alertdialogfragment_work, null);
			builder.setView(view4);
			return builder.create();
		case 10:// reference
			View view5 = getActivity().getLayoutInflater().inflate(
					R.layout.alertdialogfragment_reference, null);
			builder.setView(view5);
			return builder.create();
		case 11:// hobbies
			View view6 = getActivity().getLayoutInflater().inflate(
					R.layout.alertdialogfragment_hobbies, null);
			builder.setView(view6);
			return builder.create();
		case 13:// interests
			View view7 = getActivity().getLayoutInflater().inflate(
					R.layout.alertdialogfragment_interests, null);
			builder.setView(view7);
			return builder.create();
		default:
			return null;
		}

	}

}
