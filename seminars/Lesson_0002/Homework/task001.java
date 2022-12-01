package java_Lesson.seminars.Lesson_0002.Homework;


import java.util.HashSet;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 * 1. Дана строка sql-запроса "select * from students where ". 
      Сформируйте часть WHERE этого запроса, используя StringBuilder. 
      Данные для фильтрации приведены ниже в виде json строки.

      Если значение null, то параметр не должен попадать в запрос.

      Параметры для фильтрации:
      {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}   
 */

public class task001 {
     public static void main(String[] args) throws ParseException {
          String myString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
          String sqlQuery = "select * from students where ";
          System.out.println(jsonToSql(parseJson(myString), sqlQuery));
     }
  
     public static JSONObject parseJson(String myJSON) throws ParseException {
          JSONParser parser = new JSONParser();
          Object obj = parser.parse(myJSON);
          JSONObject jsonObj = (JSONObject) obj;
          return jsonObj;
     }
  
     public static String jsonToSql(JSONObject myJSON, String myString) {
          StringBuilder sb = new StringBuilder();
          sb.append(myString);
          HashSet <String> keys = new HashSet<>();
          keys.addAll(myJSON.keySet());
          int n = 0;
          for (String item:keys) {
              if(!myJSON.get(item).toString().equals("null")) {
                  if (n > 0) {
                      sb.append(" and ");
                  }
                  sb.append(String.format("%s = %s", item, myJSON.get(item)));
                  n++;
               }
          }
  
          return sb.toString();
     }
 



}
