package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMin(5,4,3));
         */
    }

    static int getMin(int a, int b, int c) {
        if (a > b){
            if (b > c){
                return c;
            }
            else {
                return b;
            }
        }
        else {
            if (a > c){
                return c;
            }
            else {
                return a;
            }
        }
    }
}