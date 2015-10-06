package cn.sh.xq.elephantnews.activity;

import cn.sh.xq.elephantnews.MyApplication;
import cn.sh.xq.elephantnews.R;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onStart() {
		Intent intent;
		SharedPreferences sp = PreferenceManager
				.getDefaultSharedPreferences(MyApplication.myApplication);
		// TODO Auto-generated method stub
		super.onStart();
		String versionName = sp.getString("versionName", null);
		Log.i("MainActivity", "onStart versionName = " + versionName);
		Log.i("MainActivity", "onStart App versionName = "
				+ MyApplication.myApplication.getmVersionName());
		/*
		 * 如果当前是第一次运行本应用时，跳转到GuideViewActivity如果当前是新版应用时，转到GuideViewActiviy
		 * 以上两种情况外，直接跳转到WelcomeActivity
		 */

		if ((versionName == null)
				|| (MyApplication.myApplication.getmVersionName() != null && !MyApplication.myApplication
						.getmVersionName().equals(versionName))) {
			Log.i("MainActivity", "onStart the 1st time");

			SharedPreferences.Editor editor = sp.edit();
			editor.putString("versionName",
					MyApplication.myApplication.getmVersionName());
			editor.apply();
			Log.i("MainActivity", "onStart GuideViewActivity.class");
			intent = new Intent(this, GuideViewActivity.class);
		} else {
			Log.i("MainActivity", "onStart WelcomeActivity.class");
			intent = new Intent(this, WelcomeActivity.class);
		}
		this.startActivity(intent);
		this.finish();
		// this.getSharedPreferences("", mode)
	}

}
