package com.designpatterns.abstractFactory;

public class Demo {
    public static void main(String[] args) {
        show();
    }
    public static void show() {
        var homePage = new HomePage();
        homePage.setGoal(Goal.WEIGHT_LOSS);
    }
}
