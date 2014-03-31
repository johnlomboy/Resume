package com.lombee.resume;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuListAdapter extends ArrayAdapter<MenuList> {

	private Context context;
	private int layoutResourceId;
	private MenuList[] mList = null;

	public MenuListAdapter(Context context, int textViewResourceId,
			MenuList[] mList) {
		super(context, textViewResourceId, mList);
		this.context = context;
		this.layoutResourceId = textViewResourceId;
		this.mList = mList;
	}

	@Override
	public View getView(int position, View row, ViewGroup parent) {
		// TODO Auto-generated method stub

		ImgHolder holder = null;

		if (row == null) {
			LayoutInflater inflater = ((Activity) context).getLayoutInflater();
			row = inflater.inflate(layoutResourceId, parent, false);

			holder = new ImgHolder();
			holder.imgView = (ImageView) row.findViewById(R.id.ivIcon);
			holder.txtView = (TextView) row.findViewById(R.id.tvTitle);
			holder.txtView2 = (TextView) row.findViewById(R.id.tvDesc);

			row.setTag(holder);
		} else {
			holder = (ImgHolder) row.getTag();
		}

		MenuList mlist = mList[position];
		holder.imgView.setImageResource(mlist.img);
		holder.txtView.setText(mlist.title);
		holder.txtView.setTextColor(Color.WHITE);
		holder.txtView.setTextSize(15);
		holder.txtView2.setText(mlist.description);
		holder.txtView2.setTextColor(Color.WHITE);
		holder.txtView2.setTextSize(10);

		return row;
	}

	class ImgHolder {
		ImageView imgView;
		TextView txtView;
		TextView txtView2;
	}

}
