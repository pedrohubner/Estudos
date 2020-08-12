package com.designpatterns.abstractfactory.factory;

import com.designpatterns.abstractfactory.project.Control;
import com.designpatterns.abstractfactory.project.VideoGameControl;

public class VideoGameControlFactory implements ControlFactory {

    @Override
    public Control createControl() {
        return new VideoGameControl();
    }
}
