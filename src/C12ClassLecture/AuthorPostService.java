package C12ClassLecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorPostService {
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        List<Post> posts = new ArrayList<>();

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("1번:회원가입, 2번:게시글작성, 3번:회원목록조회, 4번:회원상세조회, 5번:게시글상세조회 ");
            int number = Integer.parseInt(sc.nextLine());
            switch (number){
                case 1:
                    System.out.println("회원가입하실 이름을 입력해주세요");
                    String name = sc.nextLine();
                    System.out.println("회원가입하실 이메일을 입력해주세요");
                    String email = sc.nextLine();
                    Author author1 = new Author(name, email);
                    authors.add(author1);
                    break;

                case 2:
                    System.out.println("이메일을 입력해주세요");
                    String author_email = sc.nextLine();
                    // Author 객체 찾기
                    Author writer = null;
                    for(Author a : authors){
                        if(a.getEmail().equals(author_email)) {
                            writer = a;
                            break;
                        }
                    }
                    if(writer==null){
                        System.out.println("없는 사용자입니다");
                        continue;
                    }

                    System.out.println("게시글명을 입력해주세요");
                    String title = sc.nextLine();
                    System.out.println("게시글 내용을 입력해주세요");
                    String contents = sc.nextLine();

                    Post post1 = new Post(writer, title, contents);
                    posts.add(post1);
//                    writer.getPosts().add(post1); -> 기능은 맞으나 가독성이 떨어짐
//                    의미에 맞는 addPost함수 추가 후 사용
                    writer.addPost(post1);

                    // ** 세종님 아이디어 **
                    // addPost를 생성자에 합친 코드 사용 한다면
                    // posts.add(post1);에서 List<Post> posts에 생성과 동시에 post를 넣어주는 과정 수행.
                    // writer.addPost(post1);없이 posts.add(post1); 만 작성해줘도 동작함
                    break;

//                    회원목록조회
                case 3:
                    for(Author a : authors){
                        System.out.println(a.getEmail());
                    }
                    break;

//                    회원상세조회 : 이름, email, 작성글수
                case 4:
                    System.out.println("author email을 입력해주세요");
                    String author_email2 = sc.nextLine();

                    Author author = null;
                    for(Author a : authors){
                        if(a.getEmail().equals(author_email2)) {
                            author = a;
                            break;
                        }
                    }

                    System.out.println("회원명 : " + author.getName() +
                            "\n회원이메일 : " + author.getEmail() +
                            "\n글 작성수" + author.getPosts().size());

                    break;

//                    게시글상세조회
                case 5:
                    System.out.println("post id를 입력해주세요");
                    Long post_id = Long.parseLong(sc.nextLine());
                    Post temp_post = null;
                    for(int i=0; i<posts.size(); i++){
                        if(posts.get(i).getId() == post_id){
                            temp_post = posts.get(i);
                            break;
                        }
                    }
                    //post에 저자 객체 Author가 붙어 있어 쉽게 조회 가능
                    System.out.println(temp_post.getTitle() + " " + temp_post.getAuthor().getEmail());
                    break;

            }

        }
    }
}

//엔티티
class Author{
    private Long id;
    private String name;
    private String email;
    private List<Post> posts;
    static Long static_id = 0L;
    Author(String name, String email){
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.posts = new ArrayList<>(); //일반적으로 생성자 호출 시 초기화
    }
    void addPost(Post post){
        this.posts.add(post);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Post> getPosts() {
        return posts;
    }
}
class Post{
    private Long id;
    private String title;
    private String contents;
    private Author author;
    static Long static_id = 0L;
    Post(Author author, String title, String contents){
        static_id += 1;
        this.id = static_id;
        this.author = author;
        this.title = title;
        this.contents = contents;
    }
//    ** 세종님 아이디어 **
//    addPost를 생성자로 합치기 -> 자기 자신을 지칭하는 키워드 this 활용
//    addPost(주소) 저장되기 때문에 먼저 생성해두고 나중에 값을 넣어줘도 영향을 받지 않음.
//    Post(Author author, String title, String contents){
//        static_id += 1;
//        this.id = static_id;
//        this.author = author;
//        this.author.addPost(this);
//        this.title = title;
//        this.contents = contents;
//    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Author getAuthor() {
        return author;
    }
}