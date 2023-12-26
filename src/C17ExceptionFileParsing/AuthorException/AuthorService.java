package C17ExceptionFileParsing.AuthorException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

class AuthorService {
    AuthorRepository authorRepository;
    AuthorService(){
        authorRepository = new AuthorRepository();
    }

    void register(Author author) throws IllegalArgumentException{
//        만약에 password가 5자리 이하이면 예외 발생(IllegalArgumentException)
//        DB에 갔다 오면 리소스 낭비가 심하니, 로직에서 검증
        if (author.getPasswd().length() <= 5) {
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
        authorRepository.register(author);
    }

    Optional<Author> login(String email, String password) throws NoSuchElementException, IllegalArgumentException {
        //찾아서 Author 객체 리턴
        // DB에 있는 authors 다 가져오기
        List<Author> Authors = authorRepository.getAuthors();
        Optional<Author> findAuthor = Optional.empty();
        boolean isExistAuthor = false;
        boolean isRightPassword = false;
        for(Author author : Authors){
//        Authors에 로그인하고자 하는 email이 존재하지 않으면 예외 발생(NoSuchElementException)
            if(author.getEmail().equals(email)){
                isExistAuthor = true;
                if(author.getPasswd().equals(password)){
                    isRightPassword = true;
                    findAuthor = Optional.of(author); //Optional 객체로 만들어 return
                }
            }
        }

        if(!isExistAuthor){
            throw new NoSuchElementException("가입 정보가 없는 사용자입니다.");
        }
        if(!isRightPassword){
            throw new IllegalArgumentException("틀린 비밀번호를 입력했습니다.");
        }
////        DB에 있는 author 가져오기
//        Author xxx = authorRepository.getAuthorByEmail();


//        Author 객체 찾아서 반환
        return findAuthor;
    }
}
