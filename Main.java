package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество чисел массива");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива");
        Scanner in = new Scanner(System.in);
        for(int i=0;i<size;i++)
            array [i]=in.nextInt();
        System.out.println("Нечётные элементы");
        for(int k: array){
            if(k%2 !=0){
                System.out.println(k+" ");
            }
        }
        System.out.println(" ");
    }
}
