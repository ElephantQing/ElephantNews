package cn.sh.xq.elephantnews.activity;

import java.util.ArrayList;
import java.util.List;

import cn.sh.xq.elephantnews.R;
import cn.sh.xq.elephantnews.fragment.EntryFragment;

import com.chechezhi.ui.guide.AbsGuideActivity;
import com.chechezhi.ui.guide.SingleElement;
import com.chechezhi.ui.guide.SinglePage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class GuideViewActivity extends AbsGuideActivity {

	@Override
	public List<SinglePage> buildGuideContent() {
		// prepare the information for our guide
		List<SinglePage> guideContent = new ArrayList<SinglePage>();

		SinglePage page01 = new SinglePage();
		page01.mBackground = getResources().getDrawable(R.drawable.bg_page_01);
		SingleElement e01 = new SingleElement(-100, 0, 100, 200, 0.0f, 1.0f,
				BitmapFactory
						.decodeResource(getResources(), R.drawable.contact));
		page01.mElementsList.add(e01);
		guideContent.add(page01);

		SinglePage page02 = new SinglePage();
		page02.mBackground = getResources().getDrawable(R.drawable.bg_page_02);
		SingleElement e02 = new SingleElement(100, 200, 100, 400, 1.0f, 0.0f,
				BitmapFactory
						.decodeResource(getResources(), R.drawable.contact));
		page02.mElementsList.add(e02);
		guideContent.add(page02);

		SinglePage page03 = new SinglePage();
		page03.mBackground = getResources().getDrawable(R.drawable.bg_page_03);
		SingleElement e03 = new SingleElement(100, 400, 100, 400, 1.0f, 0.0f,
				BitmapFactory
						.decodeResource(getResources(), R.drawable.contact));
		page03.mElementsList.add(e03);
		page03.mCustomFragment = new EntryFragment();
		guideContent.add(page03);

		return guideContent;
	}

	@Override
	public Bitmap dotDefault() {
		return BitmapFactory.decodeResource(getResources(),
				R.drawable.ic_dot_default);
	}

	@Override
	public Bitmap dotSelected() {
		return BitmapFactory.decodeResource(getResources(),
				R.drawable.ic_dot_selected);
	}

	@Override
	public boolean drawDot() {
		return true;
	}

	public void entryApp() {
		// Time to entry your app! We just finish the activity, replace it with
		// your code.
		Intent intent = new Intent(this, WelcomeActivity.class);
		this.startActivity(intent);
		finish();
	}

	/**
	 * You need provide an id to the pager. You could define an id in
	 * values/ids.xml and use it.
	 */
	@Override
	public int getPagerId() {
		return R.id.guide_container;
	}

}
