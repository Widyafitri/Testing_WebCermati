package com.cermati.webtesting.utils;

public enum TestScenarios {

    //URL
    T1("TCC.001 As a user I want to access URL"),
    T2("TCC.002 As a user I want to register an account");


    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }


}
