package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int[] number = {1,2,3,4,33,2,21,75,68}; //масив з чисел
        int result = Exercise.Calculate(number);//зберігає результат після Calculate
        System.out.println("Penultimate largest number is: " + result);// виводить результат
    }
}
