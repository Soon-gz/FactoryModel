package com.abings.factorymodel.Operation;

import android.content.Context;

/**
 * Created by HaomingXu on 2016/8/24.
 */
public class OperationFactory {
    public static Operation createOperation(int flag,Context context){
        Operation operation = null;
        switch (flag){
            case 0:
                operation = new OperationAdd();
                break;
            case 1:
                operation = new OperationSub();
                break;
            case 2:
                operation = new OperationMul();
                break;
            case 3:
                operation = new OperationDiv(context);
                break;
        }
        return operation;
    }
}
