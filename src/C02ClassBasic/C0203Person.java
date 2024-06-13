package C02ClassBasic;

public class C0203Person {
    String name;
    String Email;
    int age;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void eating(){
        System.out.println(name +"이 밥을 먹는다.");
    }

}
