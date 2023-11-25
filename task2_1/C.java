package task2_1;

import java.util.*;

public abstract class C extends A{
    protected UUID varC1;

    public UUID getVarC1() {
        return varC1;
    }

    public void setVarC1(UUID varC1) {
        this.varC1 = varC1;
    }
    
    public C() {
        super();
        this.varC1 = UUID.randomUUID();
    }

    @Override
    public int foo(Date dt) {
        return 0;
    }
    
    @Override
    public void buzz() {}
}
