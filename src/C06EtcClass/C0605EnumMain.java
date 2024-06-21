package C06EtcClass;

public class C0605EnumMain {
    public static void main(String[] args) {
        EnumStudent s1 = new EnumStudent();
        s1.setName("hong1");

        // enum 안 쓰고 오타 줄이는 방법 : class 하나 더 선언하고 static final 선언
        s1.setClassGrade(ClassGrade.c1);
        EnumStudent s2 = new EnumStudent();
        s2.setName("hong2");
        // 여전히 타입이 String 타입이므로 임의 클래스 변수 사용하지 않을 수 있음
        // 즉 오타나거나 에러나올 수 있음
        // 그래서 enum
        s2.setClassGrade("secondgrade");

        // role의 경우 Enum 설정 시 위와 같은 실수를 방지할 수 있음
        // s2.setRole("GENERAL_USER"); // 타입 불일치 에러남
        // enum클래스.enum변수로 해야함
        s2.setRole(Role.GENERAL_USER);

        System.out.println(s2.getRole());
        System.out.println(s2.getRole().getClass());
        // enum값 내부에는 저장된 순서대로 0부터 index값이 내부적으로 할당됨
        // --- 따라서 GENERAL_USER는 0, ADMIN_USER는 1 됨
        System.out.println(s2.getRole().ordinal());


    }
}
class ClassGrade{
    static final String c1 = "first_grade";
    static final String c2 = "second_grade";
    static final String c3 = "third_grade";
}
enum Role{
    // 각 열거형 상수는 콤마로 구분하고,
    // 상수 목록 끝에 ;세미콜론으로 마무리한다
    // static final이 생략되어 있는 형식
    // 따라서 바로 GENERAL_USER로 하는 게 아니라 Role.GENERAL_USER
    GENERAL_USER, ADMIN_USER;
}
class EnumStudent{
    private String name;
    private String classGrade;
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }





}