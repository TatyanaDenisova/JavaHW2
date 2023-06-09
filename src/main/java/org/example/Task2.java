package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

//        2) Не обязательное. Реализуйте алгоритм сортировки пузырьком числового массива,
//        результат после каждой итерации запишите в лог-файл.
//
public class Task2 {
    private static Log log;
    private static Logger logger = log.log(Task2.class.getName());

    public static void main(String[] args) {
        int[] array = {6, 4, 1, 3, 9};
        bubbleNumber(array);
        for(int i = 0; i < array.length; i++){
            logger.log(Level.INFO, (array[i]+ " \n"));
        }
    }
    private static void bubbleNumber(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
