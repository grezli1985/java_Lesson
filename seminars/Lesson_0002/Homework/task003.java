package java_Lesson.seminars.Lesson_0002.Homework;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



/*
3. **. Дана json строка (можно сохранить в файл и читать из файла)
    [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
    {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
    {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Написать метод(ы), который распарсит json и, используя StringBuilder, 
создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
    
    Пример вывода:
    Студент Иванов получил 5 по предмету Математика.
    Студент Петрова получил 4 по предмету Информатика.
    Студент Краснов получил 5 по предмету Физика.
 */


public class task003 {
    public static void main(String[] args) throws ParseException {
        String[] jsonString = {"{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}",
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}",
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}"};

        JSONParser jsonPar = new JSONParser();
        for (String item:jsonString) {
            Object obj = jsonPar.parse(item);
            JSONObject jsonObj = (JSONObject) obj;
            System.out.println(String.format("Студент %s получил %s по предмету %s", jsonObj.get("фамилия"), jsonObj.get("оценка"), jsonObj.get("предмет")));
        }




    }

    
}
