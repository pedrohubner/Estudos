package com.designpatterns.memento;

import java.util.List;

public class Changes {

    public List<BackUp> backUpList;

    Changes() {
    }

    Changes(List<BackUp> backUpList) {
        this.backUpList = backUpList;
    }

    public void saveChanges(BackUp backUp) {
        backUpList.add(backUp);
    }

    public BackUp getChanges(Integer index) {
        return backUpList.get(index);
    }
}
