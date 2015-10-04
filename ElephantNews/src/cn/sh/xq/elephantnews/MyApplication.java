package cn.sh.xq.elephantnews;

import cn.sh.xq.elephantnews.util.AppHelper;
import android.app.Application;

public class MyApplication extends Application {
	private String mVersionNameString;
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
		this.mVersionNameString = AppHelper.getAppVer(myApplication);
	}
}
