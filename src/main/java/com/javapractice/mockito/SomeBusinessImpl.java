package com.javapractice.mockito;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    int findGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for(int value : data) {
            if (value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }
}

