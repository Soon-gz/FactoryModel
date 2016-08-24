package com.abings.factorymodel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /**
     *将业务逻辑和界面逻辑分开，在这个需求中，计算器显示逻辑，很简单。
     * 而业务逻辑，也就是计算器的加减乘除。把它集成到一个自定义控件中
     *        业务逻辑
     *
     *  -----计算父类（不变的部分）
     *
     *  --加--减--乘--除--开方--根号（变化的部分，可根据需求随意添加具体计算）-->工厂类，用于根据不同需求生成不同的实例对象，这是学习关键
     *
     *
     *@author Shuwen
     *created at 2016/8/24 15:06
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
