package C07ExceptionFileParsing.AuthorException;

//  1. Author 엔티티
//  - id, name, email, password
//  - 생성자에서 초기화, getter로만 구성

public class Author {
    long id;
    String name;
    String email;
    String password;

    Author(long id , String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}