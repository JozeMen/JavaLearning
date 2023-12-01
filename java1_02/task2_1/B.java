package java1_02.task2_1;

import java.util.Date;

public class B extends A {
    private double varB1;

    public double getVarB1() {
        return varB1;
    }

    public void setVarB1(double varB1) {
        this.varB1 = varB1;
    }

    public B() {
        super();
        this.varB1 = 0.0;
    }

    @Override
    public int foo(Date dt) {
        return 0;
    }

    @Override
    public void buzz() {}
}
