package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.util.logging.Logger;

public class Task3 {

    private static Log log;
    static Logger logger = log.log(Task3.class.getName());

    public static void main(String[] args) throws ParseException {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},\n" +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},\n" +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        parseStudents(json);

    }


    private static void parseStudents(String json) throws ParseException {
        Object obj = new JSONParser().parse(json);
        JSONArray array = (JSONArray) obj;
        for (Object o : array) {
            JSONObject jasonObject = (JSONObject) o;
            StringBuilder builder = new StringBuilder("Студент ");
            builder.append(jasonObject.get("фамилия"))
                    .append(" получил ")
                    .append(jasonObject.get("оценка"))
                    .append(" по предмету ")
                    .append(jasonObject.get("предмет"));
            System.out.println(builder);
        }
    }
}
