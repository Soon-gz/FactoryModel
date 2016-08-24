package com.abings.factorymodel.Operation;

/**
 * Created by HaomingXu on 2016/8/24.
 */
public class OperationAdd extends Operation {
    @Override
    public double getResultMoney() {
        return getNumA()+getNumB();
    }
}
