package cn.sh.xq.elephantnews.util;

import cn.sh.xq.elephantnews.R;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class AppHelper {

	/**
	 * You Can use this method to get Application Version
	 * 
	 * @param context
	 * @return
	 */
	public static String getAppVer(Context context) {
		try {
			PackageManager manager = context.getPackageManager();
			PackageInfo info = manager.getPackageInfo(context.getPackageName(),
					0);
			String version = info.versionName;
			return version;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
