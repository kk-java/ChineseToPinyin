package com.liucanwen.chinesetopy;

import com.liucanwen.chinesetopy.util.PinYin;

public class Test
{
	public static void main(String[] args)
	{
		String chinese1 = "ÔøÐ¡ÏÍ";
		String chinese2 = "ºúÒ»·Æ";
		
		String pinyin1 = PinYin.getPinYin(chinese1);
		String pinyin2 = PinYin.getPinYin(chinese2);

		System.out.println(chinese1 + "->" + pinyin1);
		System.out.println(chinese2 + "->" + pinyin2);
	}
}
