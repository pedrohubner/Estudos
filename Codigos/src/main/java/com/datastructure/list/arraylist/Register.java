package com.datastructure.list.arraylist;

import java.util.List;

public class Register {

    private List<Integer> numbersList;

    Register(List<Integer> numbersList) {
        this.numbersList = numbersList;
    }

    public List<Integer> getNumbersList() {
        return numbersList;
    }

    @Override
    public String toString() {
        return "Register{" +
                "numbersList=" + numbersList +
                '}';
    }
}
