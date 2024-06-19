package C07ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorRepository {
    static long id = 1;
    private List<Author> authorList;
    AuthorRepository(){
        authorList = new ArrayList<>();
    }

    void register(String name, String email, String password){
        authorList.add(new Author(id++, name, email, password));
    }

    void informationReturn(){
        for(Author au : authorList){
            System.out.println("ID \t\t: " + au.getId());
            System.out.println("이름 \t: " + au.getName());
            System.out.println("이메일 \t: " + au.getEmail());
        }
    }

    List<Author> getAuthorList(){
        return this.authorList;
    }
    public Optional<Author> findAuthorByEmail(String email){
        Author author1 = null;
        for(Author au : authorList){
            if (email.equals(au.getEmail()))
                author1 = au;
        }

        return Optional.ofNullable(author1);
    }
}