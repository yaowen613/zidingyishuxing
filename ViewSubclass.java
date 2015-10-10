package com.yaowen.zidingyishuxing2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * 案例描述：
 * Android自定义属性的使用
 * 注意事项:
 * 1 在main.xml中声明命名空间
 * xmlns:testattr="http://schemas.android.com/apk/res/cc.testattrs"
 * 其中http://schemas.android.com/apk/res/为固定写法,其后追加包名
 * testattr为我们给自定义属性的别名引用
 * 2 getDimension(R.styleable.TestAttr_testTextSize, 20);
 * 第二个参数意思是:假如在xml文件中没有为改属性设值则采用此值.
 * 其余getXX()方法均类似
 * 3 注意getColor()方法中第二个参数的取值,是一个颜色值,在这里很容易错误
 */
public class ViewSubclass extends View {
    private Paint mPaint;
    private float textSize;
    private int textColor;

    public ViewSubclass(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public ViewSubclass(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TestAttr);
        textSize = typedArray.getDimension(R.styleable.TestAttr_testTextSize, 20);
        textColor = typedArray.getColor(R.styleable.TestAttr_testColor, Color.BLACK);
        Log.d("ViewSubclass","textSize=" + textSize + ",textColor=" + textColor);
        mPaint.setTextSize(textSize);
        mPaint.setColor(textColor);
        //切记recycle()
        typedArray.recycle();
    }

    public ViewSubclass(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setStyle(Style.FILL);
        canvas.drawText("9527", 10, 20, mPaint);
    }
}

