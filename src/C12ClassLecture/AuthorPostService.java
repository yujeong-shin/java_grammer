package C12ClassLecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorPostService {
    //    인스턴스 변수 생성
//    생성자 : 모든 인스턴스 변수 초기화
//    모든 클래스에 getter 생성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Author> authors = new ArrayList<>();
        List<Post> posts = new ArrayList<>();
        boolean checkDuplicate = false;
        while(true){
            System.out.println("기능을 선택해주세요");
            System.out.println("1 : 회원가입, 2 : 게시글 작성, 3 : 회원 목록조회, 4 : 회원 상세조회, 5 : 게시글 상세조회");
            int menu = Integer.parseInt(sc.nextLine());
            if(menu == 1) {
                //회원가입
                System.out.println("회원가입하실 이름을 입력해주세요");
                String name = sc.nextLine();

                System.out.println("회원가입하실 이메일을 입력해주세요");
                String email = sc.nextLine();
                if(authors.size()>=0) {
                    Author myAuthor = new Author(name, email);
                    authors.add(myAuthor);
                    System.out.println("현재까지 가입자 수는 : " + authors.size());
                    System.out.println(myAuthor.toString());
                }
                else {
                    for(Author a : authors) {
                        if (a.getEmail().equals(email)) {
                            System.out.println("이미 존재하는 이메일입니다. 다시 회원가입을 진행해주세요");
                            break;
                        }
                    }
                }
            }
            else if(menu == 2) {
                //게시글 작성
                //이메일로 가입여부 확인
                System.out.println("회원 이메일을 입력해주세요");
                String input_email = sc.nextLine();
                for(Author a : authors) {
                    if (a.getEmail().equals(input_email)) {
                        System.out.println("회원 가입한 회원입니다");

                        System.out.println("게시글 제목을 입력해주세요");
                        String title = sc.nextLine();
                        System.out.println("게시글 내용을 입력해주세요");
                        String contents = sc.nextLine();
                        Post myPost = new Post(title, contents, a.getId());
                        posts.add(myPost);
                        System.out.println("게시글 작성이 완료됐습니다");
                        System.out.println(myPost.toString());
                    }
                    else {
                        System.out.println("먼저 회원 가입을 진행해주세요");
                        break;
                    }
                }
            }
            else if(menu == 3) {
                for(Author a : authors) {
                    System.out.println(a.getEmail());
                }
                System.out.println();
            }
            else if(menu == 4) {
                //회원명, 회원email, 회원작성글수
                for(Author a : authors) {
                    System.out.println("name : " + a.getName());
                    System.out.println("email : " + a.getEmail());
                    int post_count=0;
                    for(Post p : posts){
                        if(p.getAuthor_id() == a.getId()) post_count++;
                    }
                    System.out.println("count posts : " + post_count);
                    System.out.println();
                }
            }
            else if(menu == 5) {
                for(Post p : posts){
                    System.out.println("게시글 제목 : " + p.getTitle());
                    //post의 author_id와 author의 id가 같은 경우, 작성자 email값 출력
                    for(Author a : authors){
                        if(p.getAuthor_id() == a.getId())
                            System.out.println("작성자 email : " + a.getEmail());
                        System.out.println();
                    }
                }
            }
            else System.out.println("잘못된 번호입니다.\n");

        }
    }
}
//    엔티티
class Author {
    //id, name, email, password
    private Long id;
    private String name;
    private String email;
    static Long static_id = 0L; //고유 id값 지정
    Author(String name, String email) {
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
    }
    @Override
    public String toString() {
        return "id :  " + id + "\nname : " + name + "\nemail : " + email + "\n";
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

}
class Post {
    //id, title, contents, author_id
    private Long id;
    private String title;
    private String contents;
    private Long author_id;
    static Long static_id = 0L;//고유 id값 지정

    Post(String title, String contents, Long author_id) {
        static_id += 1;
        this.id = static_id;
        this.title = title;
        this.contents = contents;
        this.author_id = author_id;
    }
    @Override
    public String toString() {
        return "id :  " + id + "\ntitle : " + title + "\ncontents : " + contents + "\nauthor_id : " + author_id + "\n";
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Long getAuthor_id() {
        return author_id;
    }
}