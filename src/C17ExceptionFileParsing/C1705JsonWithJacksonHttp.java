package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C1705JsonWithJacksonHttp {
    public static void main(String[] args) {
//        http 클라이언트 생성
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();
//        http 요청객체 생성
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .GET().build();
        HttpRequest request2 = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET().build();
//        http 응답객체 생성


//        readTree() VS readValue()
        try {
//            jason -> java객체(ex. list)
//            json = java객체, jsonNode(Tree), (객체 ) ?? 졸았다...

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String bodyData = response.body();
//            System.out.println(bodyData);
//            readTree()는 {~~~~}한 뭉텅이를 가져옴 -> 필드에 접근해 객체 생성
            JsonNode jsonNode = mapper.readTree(bodyData);
//            System.out.println(jsonNode);

//            //Post class에 값 담기
            //테스트 시에 getter 주석 제거하기
//            Post post1 = new Post();
//            post1.setUserId(jsonNode.get("userId").asInt());
//            post1.setId(jsonNode.get("id").asInt());
//            post1.setTitle(jsonNode.get("title").asText());
//            post1.setBody(jsonNode.get("body").asText());
//            System.out.println(post1);

//            getter가 없으면 에러남
            Post post_test = new Post(jsonNode.get("userId").asInt(), jsonNode.get("id").asInt(), jsonNode.get("title").asText(), jsonNode.get("body").asText());
            System.out.println(post_test);

//            readValue()는 {~~~~}한 뭉텅이를 가져옴 -> 자동으로 필드에 접근해, 바로 객체 생성 가능
//           💡readValue를 사용해서 객체로 곧바로 매핑
//            userId는 userId로, id는 id로 자동으로 생성해서 대입해서 만들어줌
            Post post2 = mapper.readValue(bodyData, Post.class);
            System.out.println(post2);

//            JsonNode는 트리구조이므로,
//            for(JsonNode j : jsonNode) 이런 형식이 가능
//            jsonNode는 위에서 mapper.readTree(bodyData);로 받아온 애
            HttpResponse<String> response2 = client.send(request2, HttpResponse.BodyHandlers.ofString());
            String bodyData2 = response2.body();
            JsonNode jsonNode2 = mapper.readTree(bodyData2);
            List<Post> jsonNode_list = new ArrayList<>();
            for(JsonNode j : jsonNode2){
//                jsonNode_list.add(new Post(j.get("userId").asInt(), j.get("id").asInt(), j.get("title").asText(), j.get("body").asText()));
                Post myPost = mapper.readValue(j.toString(), Post.class);
                jsonNode_list.add(myPost);
            }
            System.out.println(jsonNode_list);
//            자바 객체를 json 타입으로 직렬화

            // 직렬화된 데이터
            String serialized_Data = mapper.writeValueAsString(jsonNode_list);
            System.out.println(serialized_Data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Post{
    int userId;
    int id;
    String title;
    String body;

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post(){}

    public int getUserId() {
        return userId;
    }

//    public void setUserId(int userId) {
//        this.userId = userId;
//    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getTitle() {
        return title;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public String getBody() {
        return body;
    }

//    public void setBody(String body) {
//        this.body = body;
//    }

    @Override
    public String toString(){
        return "userId : " + this.userId + "\nid : " + this.id + "\ntitle : " + this.title + "\nbody : " + this.body;
    }
}