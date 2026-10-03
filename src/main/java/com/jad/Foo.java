package com.jad;

public class Foo implements IFoo{
    private IBaz baz;
    private IBar[] bars;
    private IQux qux;
    private ICorge corge;

    public IBaz getBaz() {
        return this.baz;
    }

    public IBar[] getBars() {
        return this.bars;
    }

    public IQux getQux() {
        return this.qux;
    }

    public ICorge getCorge(){
        return this.corge;
    }

    public void setCorge(ICorge corge) {
        this.corge = corge;
    }

    public Foo(IBaz baz){

    }

    public void addBar(IBar bar){

    }




}
