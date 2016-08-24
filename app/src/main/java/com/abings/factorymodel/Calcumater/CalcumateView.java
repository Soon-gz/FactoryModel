package com.abings.factorymodel.Calcumater;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.abings.factorymodel.Operation.Operation;
import com.abings.factorymodel.Operation.OperationFactory;
import com.abings.factorymodel.R;

/**
 * Created by Shuwen on 2016/8/24.
 */
public class CalcumateView extends LinearLayout {

    private TextView textView;
    final StringBuilder stringBuilder = new StringBuilder();
    private Context context;
    private double numA;
    private double numB;
    private Button[]btns = new Button[18];
    //尽可能的使代码简化
    private int[]nums = new int[]{R.id.num0,R.id.num1,R.id.num2,R.id.num3,R.id.num4
            ,R.id.num5,R.id.num6,R.id.num7,R.id.num8,R.id.num9,R.id.caladd,R.id.calsub
            ,R.id.calmul,R.id.caldiv,R.id.calwait,R.id.clearall,R.id.delete,R.id.numdot};
    private int flag = 0;
    public CalcumateView(Context context) {
        this(context,null);
    }

    public CalcumateView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CalcumateView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        LayoutInflater.from(context).inflate(R.layout.calculater, this);
        initViews();
        setEvents();
    }

    private void setEvents() {
        //数字,加减乘除
        for (int i = 0; i < nums.length; i++) {
            setNumOnclick(btns[i]);
        }
    }

    public void setNumOnclick(final Button button){
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.caladd:
                        numA = Double.parseDouble(textView.getText().toString());
                        stringBuilder.delete(0,stringBuilder.length());
                        flag = 0;
                        textView.setText(stringBuilder);
                        break;
                    case R.id.calsub:
                        numA = Double.parseDouble(textView.getText().toString());
                        stringBuilder.delete(0,stringBuilder.length());
                        flag = 1;
                        textView.setText(stringBuilder);
                        break;
                    case R.id.calmul:
                        numA = Double.parseDouble(textView.getText().toString());
                        stringBuilder.delete(0,stringBuilder.length());
                        flag = 2;
                        textView.setText(stringBuilder);
                        break;
                    case R.id.caldiv:
                        numA = Double.parseDouble(textView.getText().toString());
                        stringBuilder.delete(0,stringBuilder.length());
                        flag = 3;
                        textView.setText(stringBuilder);
                        break;
                    case R.id.calwait:
                        numB = Double.parseDouble(textView.getText().toString());
                        stringBuilder.delete(0, stringBuilder.length());
                        Operation operation = OperationFactory.createOperation(flag,context);
                        operation.setNumA(numA);
                        operation.setNumB(numB);
                        double result = operation.getResultMoney();
                        textView.setText(String.valueOf(result));
                        break;
                    case R.id.clearall:
                        stringBuilder.delete(0, stringBuilder.length());
                        textView.setText(stringBuilder);
                        break;
                    case R.id.delete:
                        int len = stringBuilder.length() - 1 > 0?stringBuilder.length() - 1:0;
                        stringBuilder.delete(len, stringBuilder.length());
                        textView.setText(stringBuilder);
                        break;
                    default:
                        stringBuilder.append(button.getText());
                        textView.setText(stringBuilder);
                        break;
                }
            }
        });
    }

    private void initViews() {
        for (int i = 0;i < nums.length;i++){
            btns[i] = (Button) findViewById(nums[i]);
        }
        textView = (TextView) findViewById(R.id.text);
    }


}
