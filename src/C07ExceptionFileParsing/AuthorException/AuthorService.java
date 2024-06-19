package C07ExceptionFileParsing.AuthorException;

//  3. Author 서비스
//  - AuthorRepository repository = new AuthorRepository
//

import java.util.List;

public class AuthorService {

    private static AuthorRepository authorRepository;
    AuthorService(){
        authorRepository = new AuthorRepository();
    }

    public void register(String name, String email, String password) throws Exception {
        if(authorRepository.getAuthorList().isEmpty()) {
            validationPassword(password);
            authorRepository.register(name, email, password);
        }
        else{
            validationEmail(email);
            validationPassword(password);
            authorRepository.register(name, email, password);
        }
    }
    private static void validationEmail(String email) throws Exception {
        for(Author au : authorRepository.getAuthorList()){
            if(au.getEmail().equals(email))
                throw new Exception("동일한 이메일이 있습니다. 다시 입력해 주세요");
        }
    }
    private static void validationPassword(String password) throws  Exception{
        if(password.length() <= 5 )
            throw  new Exception("비밀번호가 5자리 이하입니다. 다시 입력해 주세요.");
    }

    public void loginProcess(String email, String password) throws Exception {
        Author au = isUsers(email);
        if(au == null){
            throw new Exception("동일한 email이 없습니다. 다시입력해주세요");
        }
        if(!au.getPassword().equals(password))
            throw new Exception("페스워드가 일치하지 않습니다. 재입력");

        System.out.println("로그인 성공");
    }
    private Author isUsers(String email){
        for(Author au : authorRepository.getAuthorList()){
            if(au.getEmail().equals(email)) {
                return au;
            }
        }
        return null;
    }

    public void print(){
        authorRepository.informationReturn();
    }


}
