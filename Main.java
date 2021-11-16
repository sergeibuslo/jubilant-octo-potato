package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] grade = new int[20];
        grade[0] = new Random().nextInt();
        int result = 0;
        for(int i = 0; i < 20; i++){
            result = new Random().nextInt();
        }
//      grade[0] = new Random().nextInt();
        grade[1] = new Random().nextInt();
        grade[2] = new Random().nextInt();
        grade[3] = new Random().nextInt();
        grade[4] = new Random().nextInt();
        grade[5] = new Random().nextInt();
        grade[6] = new Random().nextInt();
        grade[7] = new Random().nextInt();
        grade[8] = new Random().nextInt();
        grade[9] = new Random().nextInt();
        grade[10] = new Random().nextInt();
        grade[11] = new Random().nextInt();
        grade[12] = new Random().nextInt();
        grade[13] = new Random().nextInt();
        grade[14] = new Random().nextInt();
        grade[15] = new Random().nextInt();
        grade[16] = new Random().nextInt();
        grade[17] = new Random().nextInt();
        grade[18] = new Random().nextInt();
        grade[19] = new Random().nextInt();
        // Не осилил сделать цикл

        System.out.println(Arrays.toString(grade));

        int sum = 0;
        for (int element : grade)
            sum += element;
        System.out.println(sum);

        if( sum % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
    }

}
//сумму и четность выполнил только с подсказками из интернета.