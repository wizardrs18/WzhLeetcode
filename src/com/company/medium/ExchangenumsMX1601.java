package com.company.medium;

public class ExchangenumsMX1601 {
    public int[] swapNumbers(int[] numbers) {
        int a = numbers[0];
        int b = numbers[1];
        a = a^b;
        b = b^a;
        a = a^b;
        numbers[0] = a;
        numbers[1] = b;
        return numbers;
    }
}
