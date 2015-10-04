package cn.sh.xq.elephantnews.fragment;

import cn.sh.xq.elephantnews.R;
import cn.sh.xq.elephantnews.activity.GuideViewActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;

public class EntryFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_entry, null);
		v.findViewById(R.id.btn_entry).setOnClickListener(
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						Log.i("EntryFragment", "Start WelcomeActivity");
						GuideViewActivity activity = (GuideViewActivity) getActivity();
						activity.entryApp();
					}
				});
		return v;
	}

}
