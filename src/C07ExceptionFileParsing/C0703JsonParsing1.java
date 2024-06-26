package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

//  IO  - IO를 위한 라이브러리 모음
//      - Buffer를 사용하려면 BufferedReader , BufferedWriter를 사용해야함
//     -  Blocking 방식으로 해당 Thread는 데이터를 읽거나 쓸때까지 blocking 사용자가 다른 작업 불가.
//  NIO - 버퍼가 내장
//      - Non-Blocking 방식이다.
//      - 버퍼 기반이 기본이다.

public class C0703JsonParsing1 {
//    자바 객체 -> JSON : 직렬화
//    JSON -> 자바 객체 : 역직렬화

//    json 파일 read(NIO/IO패키지) -> 문자열 Read - 파싱(역직렬화)
//    readTree : JsonNode 트리구조로 객체 return
//    readValue : 원하는 객체로 변환해서 return
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_data1.json");
        String jsonString = Files.readString(filePath);
        
//        System.out.println(jsonString);
        JsonNode data1 = objectMapper.readTree(jsonString);
        Map<String, String> studentMap = new HashMap<>();
        studentMap.put("id", data1.get("id").asText());
        studentMap.put("name", data1.get("name").asText());
        studentMap.put("classNumber", data1.get("classNumber").asText());
        studentMap.put("city", data1.get("city").asText());
        System.out.println(studentMap);

//        readValue : 바로 객체로 변환
//        Map<String, String> studentMap2 = objectMapper.readValue(jsonString, Map.class);
//        System.out.println(studentMap2);

//        Student student3 = objectMapper.readValue()
        Student student = objectMapper.readValue(jsonString, Student.class);
        System.out.println(student);


    }
}

// objectMapper는 getter 또는 setter 메서드명을 통해 필드값을 유추
// 실제 값의 setting은 reflection이라는 기술을 통해 변수값에 할당
// reflection : 런타임 동작, 클래스/메서드/변수에 직접 접근

// 변수를 출력할 때 getter 나 setter 로 저장한다.
// getter 나 setter 둘중 아무거나 있어도 되지만 둘다 없으면 출력 오류
// but setter만 있는 경우는 흔하지 않으니 getter로 해두자!

class Student{
    int id;
    private String name;
    private String classNumber;
    private String city;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString(){
        return "이름은"+this.name + " classnumber는 " + this.classNumber + " 출신도시는 " + this.city;
    }
}
