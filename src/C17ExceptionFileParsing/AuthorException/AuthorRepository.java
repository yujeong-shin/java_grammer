package C17ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class AuthorRepository {
//  메모리 DB에 데이터 추가/삭제 부분은 repository로 분리
    List<Author> authors;
//    관습적인 패턴 : 생성자에서 모든 변수들을 초기화하자!!
//    가독성, 수정 용이성 높아짐
    AuthorRepository(){
        authors = new ArrayList<>();
    }

    void register(Author author){
        authors.add(author);
    }

    List<Author> getAuthors(){
        return authors;
    }

    Optional<Author> getAuthorByEmail(String email){
        for(Author a : this.authors){
            if(a.getEmail().equals(email)){
                return Optional.of(a);
            }
        }
        return Optional.empty();
    }
}
