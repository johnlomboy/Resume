package com.lombee.resume.skill;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.lombee.resume.R;

public class SkillActivity extends Activity {

	ListView lvSkill;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_skill);
		lvSkill = (ListView) findViewById(R.id.listtwo);

		SkillList sList[] = new SkillList[] {
				new SkillList(R.drawable.x, "Actionscript 3.0"),
				new SkillList(R.drawable.x, "Android Development"),
				new SkillList(R.drawable.x, "C++"),
				new SkillList(R.drawable.x, "Eclipse"),
				new SkillList(R.drawable.x, "Java"),
				new SkillList(R.drawable.x, "JSON"),
				new SkillList(R.drawable.x, "MySQL"),
				new SkillList(R.drawable.x, "SQLite"),
				new SkillList(R.drawable.x, "Visual Basic") };

		SkillListAdapter adapter = new SkillListAdapter(SkillActivity.this,
				R.layout.skill_listview_item, sList);

		lvSkill.setAdapter(adapter);
	}

}
