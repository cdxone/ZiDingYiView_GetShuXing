package com.cdx.example.zidingyiview_getshuxing.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.cdx.example.zidingyiview_getshuxing.R;

public class MyView extends View {

    private static final String TAG = MyView.class.getSimpleName();

    public MyView(Context context) {
        this(context, null);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.MyViewTest);
            if (typedArray != null){
                //获得参数1:枚举类型。
                if(typedArray.hasValue(R.styleable.MyViewTest_param1)){
                    int param1 = typedArray.getInt(R.styleable.MyViewTest_param1,0);
                    Log.e(TAG,"param1:" + param1);
                }

                //获得参数2：String类型。
                if(typedArray.hasValue(R.styleable.MyViewTest_param2)){
                    String param2 = typedArray.getString(R.styleable.MyViewTest_param2);
                    Log.e(TAG,"param2:" + param2);
                }

                //获得参数3：boolean类型。
                if(typedArray.hasValue(R.styleable.MyViewTest_param3)){
                    boolean param3 = typedArray.getBoolean(R.styleable.MyViewTest_param3,true);
                    Log.e(TAG,"param3:" + param3);
                }

                //获得参数4：颜色类型。
                if(typedArray.hasValue(R.styleable.MyViewTest_param4)){
                    int param4 = typedArray.getColor(R.styleable.MyViewTest_param4, Color.BLACK);
                    this.setBackgroundColor(param4);
                    Log.e(TAG,"param4:" + param4);
                }

                //获得参数5：dimen类型，尺寸类型。
                if(typedArray.hasValue(R.styleable.MyViewTest_param5)){
                    float param5 = typedArray.getDimension(R.styleable.MyViewTest_param5,0);
                    Log.e(TAG,"param5:" + param5);
                }

                //获得参数6：float类型。
                if(typedArray.hasValue(R.styleable.MyViewTest_param6)){
                    float param6 = typedArray.getFloat(R.styleable.MyViewTest_param6,0);
                    Log.e(TAG,"param6:" + param6);
                }

                //获得参数7:int类型
                if(typedArray.hasValue(R.styleable.MyViewTest_param7)){
                    int param7 = typedArray.getInt(R.styleable.MyViewTest_param7,0);
                    Log.e(TAG,"param7:" + param7);
                }

                //获得参数8：百分比类型
                if(typedArray.hasValue(R.styleable.MyViewTest_param8)){
                    //index：检索属性的索引
                    //base：这个分数的基本值。换句话说，一个标准分数乘以这个值。
                    //pbase：这个分数的父值。换句话说，(nn % p)中的p的值。
                    //defValue：如果属性没有定义或没有资源，则返回该值
                    float param8 = typedArray.getFraction(R.styleable.MyViewTest_param8,1,100,0);
                    Log.e(TAG,"param8:" + param8);
                }

                //获得参数9
                //关于flag的取值和取int值一样
                //❤ 取到的值是前两两个参数的和
                if(typedArray.hasValue(R.styleable.MyViewTest_param9)){
                    float param9 = typedArray.getInt(R.styleable.MyViewTest_param9,0);
                    Log.e(TAG,"param9:" + param9);
                }

                //用完记得回收
                typedArray.recycle();
            }
        }
    }
}
