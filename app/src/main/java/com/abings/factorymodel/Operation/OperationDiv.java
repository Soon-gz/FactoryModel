package com.abings.factorymodel.Operation;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by HaomingXu on 2016/8/24.
 */
public class OperationDiv extends Operation {

    private Context context;
    public OperationDiv(Context context){
        this.context = context;
    }

    @Override
    public double getResultMoney() {
        if (getNumB() != 0){
            return getNumA()/getNumB();
        }else{
            Toast.makeText(context, "被除数不能是0!", Toast.LENGTH_SHORT).show();
            return 0;
        }

    }
}
