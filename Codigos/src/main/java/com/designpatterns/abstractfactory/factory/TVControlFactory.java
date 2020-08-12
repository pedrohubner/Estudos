package com.designpatterns.abstractfactory.factory;

import com.designpatterns.abstractfactory.project.Control;
import com.designpatterns.abstractfactory.project.TVControl;

public class TVControlFactory implements ControlFactory {

    @Override
    public Control createControl() {
        return new TVControl();
    }
}
