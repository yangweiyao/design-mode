package com.yangwei.mode.observe.customize.observer;

import com.yangwei.mode.observe.customize.DisplayElement;
import com.yangwei.mode.observe.customize.Observer;
import com.yangwei.mode.observe.customize.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

//    private Subject subject;

    public CurrentConditionDisplay(Subject subject) {
//        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Condition: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        // 后续会使用mvc模式来设计显示数据的方式
        display();
    }

}
