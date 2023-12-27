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

//        기존에 같은 email있으면 예외처리
        Optional<Author> author1 = authorRepository.getAuthorByEmail(author.getEmail());
        if(author1.isPresent()){
            throw new IllegalArgumentException("같은 사용자가 있습니다.");
        }

        authorRepository.register(author);
    }

    Author login(String email, String password) throws NoSuchElementException, IllegalArgumentException {
        Optional<Author> author1 = authorRepository.getAuthorByEmail(email);
        if(!author1.isPresent()){
            throw new NoSuchElementException("회원 가입되지 않은 사용자입니다.");
        }

        if(!author1.get().getPasswd().equals(password)){
            throw new IllegalArgumentException("비밀번호가 틀렸습니다.");
        }
        return author1.get(); //비밀번호 일치하는 사용자 객체 리턴
    }
}
