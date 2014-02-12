package com.liucanwen.chinesetopinyin;

import com.liucanwen.chinesetopinyin.pinyin.PinYin;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		String chinese1 = "ÔøÐ¡ÏÍ";
		String chinese2 = "ºúÒ»·Æ";
		String pinyin1 = PinYin.getPinYin(chinese1);
		String pinyin2 = PinYin.getPinYin(chinese2);
		
		TextView tv = new TextView(this);
		tv.setText(chinese1 + "->" + pinyin1 + "\n" + chinese2 + "->" + pinyin2);
		
		setContentView(tv);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
