package com.lombee.resume.about;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.lombee.resume.R;

public class AboutActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);

		GridView gvAbout = (GridView) findViewById(R.id.gvAbout);
		// Instance of ImageAdapter Class
		gvAbout.setAdapter(new GridViewAdapter(this));
		gvAbout.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long id) {
				switch (position) {
				case 2:
					DialogFragment a = AlertDialogFragment
							.newInstance(position);
					a.show(getFragmentManager(), "dialog");
					break;
				case 4:
					DialogFragment b = AlertDialogFragment
							.newInstance(position);
					b.show(getFragmentManager(), "dialog");
					break;
				case 5:
					DialogFragment c = AlertDialogFragment
							.newInstance(position);
					c.show(getFragmentManager(), "dialog");
					break;
				case 6:
					DialogFragment d = AlertDialogFragment
							.newInstance(position);
					d.show(getFragmentManager(), "dialog");
					break;
				case 9:
					DialogFragment e = AlertDialogFragment
							.newInstance(position);
					e.show(getFragmentManager(), "dialog");
					break;
				case 10:
					DialogFragment f = AlertDialogFragment
							.newInstance(position);
					f.show(getFragmentManager(), "dialog");
					break;
				case 11:
					DialogFragment j = AlertDialogFragment
							.newInstance(position);
					j.show(getFragmentManager(), "dialog");
					break;
				case 13:
					DialogFragment k = AlertDialogFragment
							.newInstance(position);
					k.show(getFragmentManager(), "dialog");
					break;

				default:
					break;
				}

			}
		});
	}
}
