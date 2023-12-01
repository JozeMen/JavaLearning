package java1_02.task2_1;

import java.util.*;

public class D extends C {
    public E varD1;

    public D() {
        super();
        this.varD1 = new E();
    }

    @Override
    public int foo(Date dt) {
        return 0;
    }
}
