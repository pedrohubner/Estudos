package com.designpatterns.abstractfactory.factory;

import com.designpatterns.abstractfactory.project.Control;
import com.designpatterns.abstractfactory.project.GateControl;

public class GateControlFactory implements ControlFactory {

    @Override
    public Control createControl() {
        return new GateControl();
    }
}
