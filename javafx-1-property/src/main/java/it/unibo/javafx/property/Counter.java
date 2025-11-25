package it.unibo.javafx.property;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Counter {
    private final IntegerProperty value;

    public Counter() {
        this.value = new SimpleIntegerProperty(0);
    }

    public void increment() {
        this.value.set(this.value.get() + 1);
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public void decrement() {
        this.value.set(this.value.get() - 1);
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public IntegerProperty counterProperty() {
        this.value.get();
        //throw new UnsupportedOperationException("Not implemented yet");
    }
}
