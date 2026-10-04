package com.jad;

public class Foo implements IFoo {

    private IBaz baz;
    private IBar[] bars;
    private IQux qux;
    private ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
        this.bars = new IBar[0];
    }

    public IBaz getBaz() {
        return this.baz;
    }

    public IBar[] getBars() {
        return this.bars;
    }

    public IQux getQux() {
        return this.qux;
    }

    public ICorge getCorge() {
        return this.corge;
    }

    public void setCorge(ICorge corge) {
        this.corge = corge;
    }

    public void addBar(IBar bar) {
        IBar[] newBars = new IBar[bars.length + 1];

        for (int i = 0; i < bars.length; i++) {
            newBars[i] = bars[i];
        }

        newBars[bars.length] = bar;

        bars = newBars;
    }
}