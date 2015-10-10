package com.yaowen.zidingyishuxing;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by HelloWorld on 2015/10/10.
 */
public class MyTextView extends TextView {
    private String text;
    private int textAttrs;
    private static final String TAG = MyTextView.class.getSimpleName();

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.test);
        String text = typedArray.getString(R.styleable.test_MyText);
        int textArrts = typedArray.getInteger(R.styleable.test_MyTextAttr, -1);
        this.text = text;
        this.textAttrs = textArrts;
        Log.d(TAG, "text=" + text + "/n textAttrs=" + textArrts);
        typedArray.recycle();
    }

    public String getText() {
        return text;
    }
    public int getInteger(){
        return textAttrs;
    }
}
