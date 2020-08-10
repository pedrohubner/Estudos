package com.designpatterns.memento;

import java.util.List;

public class JohnDoe {

    public List<BackUp> backUpList;

    JohnDoe() {
    }

    JohnDoe(List<BackUp> backUpList) {
        this.backUpList = backUpList;
    }

    public void saveChanges(BackUp backUp) {
        backUpList.add(backUp);
    }

    public BackUp getChanges(Integer index) {
        return backUpList.get(index);
    }
}
