package org.example;

public class kata {
    public String[] fizzBuzz() {
        String[] array = new String[100];
        for(int i = 0; i < 100; i++) {
            int num = i + 1;
            if (num % 15 == 0) {
                array[i] = "FizzBuzz";
            }
            else if (num % 5 == 0) {
                array[i] = "Buzz";
            }
            else if (num % 3 == 0) {
                array[i] = "Fizz";
            }
            else {
                array[i] = "" + num + "";
            }
        }
        return array;
    }
}