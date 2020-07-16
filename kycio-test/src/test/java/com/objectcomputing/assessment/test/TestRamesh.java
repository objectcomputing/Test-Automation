package com.objectcomputing.assessment.test;

public class TestRamesh {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            String dropdown = "//*[@id='app']/div/div[1]/div[1]/div[2]/div[" + (i + 1) + "]/div[1]/div";
            System.out.println(dropdown);
        }

    }

}
