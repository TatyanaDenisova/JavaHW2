package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

//        1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE
//        этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
//        Если значение null, то параметр не должен попадать в запрос.
//        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class Task1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        String str;
        while ((str = br.readLine()) != null){
            System.out.printf("%s\n",str);
        }
        br.close();
    }
}
