package com.lombee.resume.about;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lombee.resume.R;

public class GridViewAdapter extends BaseAdapter {
	private Context mContext;

	// Keep all Images in array
	private String[] title = { "", "", "Traits", "", "Sports ", "Education ",
			"Achievements ", "", "", "Work Experience", "Reference", "Hobbies",
			"", "Interests", "", "" };

	// Constructor
	public GridViewAdapter(Context c) {
		mContext = c;
	}

	@Override
	public int getCount() {
		return title.length;
	}

	@Override
	public Object getItem(int position) {
		return title[position];
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public boolean areAllItemsEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(int position) {
		// TODO Auto-generated method stub
		boolean flag = false;

		if (!title[position].isEmpty()) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	@Override
	public View getView(int position, View row, ViewGroup parent) {
		TextView tvTitle = new TextView(mContext);
		tvTitle.setText(title[position]);
		tvTitle.setTextSize(12);
		tvTitle.setGravity(Gravity.CENTER);
		tvTitle.setTextColor(Color.WHITE);

		if (!title[position].isEmpty()) {
			if (position == 2)
				tvTitle.setBackgroundResource(R.drawable.boxtraits);
			else if (position == 4)
				tvTitle.setBackgroundResource(R.drawable.boxsports);
			else if (position == 5)
				tvTitle.setBackgroundResource(R.drawable.boxeducation);
			else if (position == 6)
				tvTitle.setBackgroundResource(R.drawable.boxachievements);
			else if (position == 9)
				tvTitle.setBackgroundResource(R.drawable.boxwork);
			else if (position == 10)
				tvTitle.setBackgroundResource(R.drawable.boxreference);
			else if (position == 11)
				tvTitle.setBackgroundResource(R.drawable.boxhobbies);
			else if (position == 13)
				tvTitle.setBackgroundResource(R.drawable.boxinterests);
		} else
			tvTitle.setBackgroundResource(R.drawable.emptysquare);

		return tvTitle;
	}
}
