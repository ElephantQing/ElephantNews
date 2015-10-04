package com.chechezhi.ui.guide;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;

public class SingleElement {
	/**当前页面中BMP的初始时的x位置*/
    public float xStart;
    /**当前页面中BMP的结束时的X位置*/
    public float xEnd;
    /**当前页面中BMP的初始时的Y位置*/
    public float yStart;
    /**当前页面中BMP的结束时的Y位置*/
    public float yEnd;
    /**当前页面中BMP的初始时的alpha值(透明度)*/
    public float alphaStart = 1.0f;
    /**当前页面中BMP的结束时的alpha值(透明度)*/
    public float alphaEnd = 1.0f;
    
    /**当前页面中BMP对象*/
    public Bitmap contentBitmap;
    public Matrix m = new Matrix();
    public Paint p = new Paint();

    public SingleElement(float xs, float ys, float xe, float ye, float as, float ae, Bitmap content) {
        xStart = xs;
        xEnd = xe;
        yStart = ys;
        yEnd = ye;
        alphaStart = as;
        alphaEnd = ae;
        contentBitmap = content;
    }
}
