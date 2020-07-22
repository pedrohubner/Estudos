package com.copy.register;

public class Register implements Cloneable {

    private String document;

    Register(String document) {
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return document;
    }
}
