package C07ExceptionFileParsing;

import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C0705JsonParsing3 {
    public static void main(String[] args) throws IOException, InterruptedException {
//        http클라이언트가 java에 내장
        HttpClient client = HttpClient.newHttpClient();
        List<Post> postList = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        HttpRequest request =  HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());


        String posts = response.body();
        JsonNode jsonNode = objectMapper.readTree(posts);

        for(JsonNode j : jsonNode) {
            Post tempPost = objectMapper.readValue(j.toString(), Post.class);
            postList.add(tempPost);
        }
        System.out.println(postList);

//        List<Post> 객체를 json으로 직렬화
        String postJson = objectMapper.writeValueAsString(postList);
        System.out.println(postJson);
    }
}
class Post{
    int userId;
    int id;
    String title;
    String body;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString(){
        return "Id는 "+this.id + " title는 " + this.title + "\n";
    }
}