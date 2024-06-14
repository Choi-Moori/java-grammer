package C03Inheritance;

public class C0304ProtectedClass {
//    default : 같은 패키지 내에서는 사용 가능
//    public : 다른 패키지 에서도 사용 가능
//    protected : 다른 패키지여도 상속 관계라면 사용 가능
//    private : 같은 클래스 에서만 사용 가능
//    public > protected > default > private 순으로 접근제한

    private String st1 = "hello java1";
    String st2 = "hello java2";
    protected String st3 = "hello java3";
    public String st4 = "hello java4";

    public static void main(String[] args) {
    }
}
