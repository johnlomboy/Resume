package com.lombee.resume;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.lombee.resume.about.AboutActivity;
import com.lombee.resume.profile.ProfileActivity;
import com.lombee.resume.skill.SkillActivity;

public class MainActivity extends Activity {

	ListView lvMenu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		lvMenu = (ListView) findViewById(R.id.lvMenu);

		String profileDescription = "A personal information of myself including name, date of birth and address. Also, including some contact details.";
		String skillDescription = "A list of components that I personally encountered, studied and used so far.";
		String aboutDescription = "Other information that best describes me.";

		MenuList mList[] = new MenuList[] {
				new MenuList(R.drawable.profileb, "Profile", profileDescription),
				new MenuList(R.drawable.skillb, "Technical Skills",
						skillDescription),
				new MenuList(R.drawable.aboutb, "About", aboutDescription) };

		MenuListAdapter adapter = new MenuListAdapter(MainActivity.this,
				R.layout.main_listview_item, mList);
		lvMenu.setBackgroundResource(R.drawable.customshape);
		lvMenu.setAdapter(adapter);
		lvMenu.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {

				switch (arg2) {
				case 0:
					Intent i = new Intent(MainActivity.this,
							ProfileActivity.class);
					startActivity(i);

					break;
				case 1:
					Intent j = new Intent(MainActivity.this,
							SkillActivity.class);
					startActivity(j);
					break;
				case 2:
					Intent k = new Intent(MainActivity.this,
							AboutActivity.class);
					startActivity(k);
					break;

				default:
					break;
				}

			}
		});
	}

}
