package C02ClassBasic;

public class C0205Constructor {
    public static void main(String[] args) {
        Calendar cal = new Calendar("2024","6","12");
        System.out.println("오늘은 " +cal.getYear() + "년 " + cal.getMonth() + "월 " + cal.getDay() +"일입니다.");
    }
}

class Calendar{
    String year;
    String month;
    String day;

//    생성자 : 클래스명과 동일, 초기화 하고 싶은 변수명 나열
//    별도의 생성자를 만들경우, 초기생성자를 따로 선언 필요
    Calendar(String year, String month, String day){
        this.year = year;
        this.month = month;
        this.day=day;
    }
//    같은 클래스내의 다른생성자 호출시 this()사용
    Calendar(String year, String month){
        this(year,month,null);
    }

    public String getYear() {
        return year;
    }
    public String getMonth() {
        return month;
    }
    public String getDay() {
        return day;
    }
}