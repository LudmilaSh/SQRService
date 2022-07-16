package ru.netology.SqrService.sqr;

public class SQRService {
    public int calculate(int min, int max) {

        int counter = 0;
        for (int i = 1; i <= 99; i++) {
            if (i * i >= min & i * i <= max) {
                counter = counter + 1;
            }

        }
        return counter;


    }

}