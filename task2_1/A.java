package task2_1;

import java.util.Date;

public abstract class A {
    protected String varA1;
    protected int varA2;

    public String getVarA1() {
        return varA1;
    }

    public void setVarA1(String varA1) {
        this.varA1 = varA1;
    }

    public int getVarA2() {
        return varA2;
    }
    
    public void setVarA2(int varA2) {
        if (varA2 >= 0 && varA2 < 100) {
            this.varA2 = varA2;
        } else {
            throw new IllegalArgumentException("Значение varA2 должно быть в диапазоне [0, 100).");
        }
    }

    public A() {
        this.varA1 = "aaa";
        this.varA2 = 0;
    }

    public abstract int foo(Date dt);
    public abstract void buzz();

}
