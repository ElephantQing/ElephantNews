package cn.sh.xq.elephantnews;

import cn.sh.xq.elephantnews.util.AppHelper;
import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {
	private String mVersionName;
	public static MyApplication myApplication;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		if (myApplication == null)
			myApplication = this;
		initData();
	}

	private void initData() {
		Log.i("MyApplication", "initData");
		this.setmVersionName(AppHelper.getAppVer(myApplication));
		Log.i("MyApplication", "mVersionName = " + this.getmVersionName());
	}

	/**
	 * @return the mVersionNameString
	 */
	public String getmVersionName() {
		return mVersionName;
	}

	/**
	 * @param mVersionNameString
	 *            the mVersionNameString to set
	 */
	public void setmVersionName(String mVersionName) {
		this.mVersionName = mVersionName;
	}
}
