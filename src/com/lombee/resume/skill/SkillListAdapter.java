package com.lombee.resume.skill;

import java.util.List;

import com.lombee.resume.MenuList;
import com.lombee.resume.R;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SkillListAdapter extends ArrayAdapter<SkillList> {

	private Context context;
	int layoutResourceId;
	SkillList[] sList = null;

	public SkillListAdapter(Context context, int textViewResourceId,
			SkillList[] sList) {
		super(context, textViewResourceId, sList);
		this.context = context;
		this.layoutResourceId = textViewResourceId;
		this.sList = sList;
	}

	@Override
	public View getView(int position, View row, ViewGroup parent) {
		// TODO Auto-generated method stub
		ListHolder holder = null;

		if (row == null) {
			LayoutInflater inflater = ((Activity) context).getLayoutInflater();
			row = inflater.inflate(layoutResourceId, parent, false);

			holder = new ListHolder();
			holder.imgView = (ImageView) row.findViewById(R.id.ivSkill);
			holder.txtView = (TextView) row.findViewById(R.id.tvSkill);

			row.setTag(holder);
		} else {
			holder = (ListHolder) row.getTag();
		}
		
		SkillList slist = sList[position];
		holder.imgView.setImageResource(slist.img);
		holder.txtView.setText(slist.skill);
		holder.txtView.setTextColor(Color.WHITE);
		holder.txtView.setTextSize(15);

		return row;
	}

	class ListHolder {
		ImageView imgView;
		TextView txtView;
	}

}
