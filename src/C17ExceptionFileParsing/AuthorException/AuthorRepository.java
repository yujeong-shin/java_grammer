package C17ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;

class AuthorRepository {
//  메모리 DB에 데이터 추가/삭제 부분은 repository로 분리
    List<Author> authors;
    AuthorRepository(){
        authors = new ArrayList<>();
    }

    void register(Author author){
        authors.add(author);
    }

    List<Author> getAuthors(){
        return authors;
    }

    void getAuthorByEmail(){

    }
}
