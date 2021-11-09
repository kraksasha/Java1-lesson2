package com.geekbrains;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(sumToDiapazone(4,7));
        pozitiveOrNegative(4);
        System.out.println(pozitiveOrNegativeB(1));
        printString("Himaaan",4);
        System.out.println(leapOrNo(2008));
    }

    public static boolean sumToDiapazone(int a,int b){
        if ((a + b >= 10) && (a + b <= 20)){
            return true;
        } else {
            return false;
        }
    }

    public static void pozitiveOrNegative(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean pozitiveOrNegativeB(int a){
        if (a >= 0){
            return true;
        } else {
            return false;
        }
    }

    public static void printString(String s, int a){
        for (int i = 0; i < a; i++){
            System.out.println(s);
        }
    }

    public static boolean leapOrNo(int a){
        if ((a%4 == 0) && ((a%100 != 0) || (a%400 == 0))){
            return true;
        } else {
            return false;
        }
    }

}
