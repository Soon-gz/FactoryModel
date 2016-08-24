package com.abings.factorymodel.Operation;

/**
 * Created by Shuwen on 2016/8/23.
 */
public abstract class Operation {
    private double numA;
    private double numB;


    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }


    public double getResultMoney(){
        return 0;
    }
}
