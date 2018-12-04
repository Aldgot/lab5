package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.print("Введите строку -> ");
        Scanner scan = new Scanner(System.in);
        String str = new String(scan.nextLine());

        Scanner firstCoordinate = new Scanner(System.in);
        System.out.println("Введите координаты первой подстроки \n Номер первой буквы: ");
        int x = firstCoordinate.nextInt() + 1;
        System.out.println("Номер второй буквы: ");
        int y = firstCoordinate.nextInt() + 1;
        System.out.println("Введите координаты второй подстроки \n Номер первой буквы: ");
        int b = firstCoordinate.nextInt() + 1;
        System.out.println("Номер второй буквы: ");
        int c = firstCoordinate.nextInt() + 1;

        str = str.toLowerCase();

        str = str.replace(str.substring(x,y), str.substring(b,c));

        System.out.println("Строка с заменой подстрок -> " + str);
    }

}