package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C0602Calendar {
    public static void main(String[] args) {
        // java.util 패키지의 Calendar 클래스
        // 이거 좀 문제 있어서 이 위에는 잘 안 씀
//        Calendar calendar1 = Calendar.getInstance();
//        System.out.println(calendar1.getTime());
//
//        System.out.println(calendar1.get(Calendar.YEAR));
//        System.out.println(calendar1.get(Calendar.MONTH)+1);
//        System.out.println(calendar1.get(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar1.get(Calendar.DAY_OF_WEEK));
//        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
//        System.out.println(calendar1.get(Calendar.MINUTE));
//        System.out.println(calendar1.get(Calendar.SECOND));

        // java.time 패키지 : Local~ 클래스
        // 날짜(LocalDate), 시간(LocalTime), 날짜와 시간(LocalDateTime)
        // 날짜(LocalDate) : MariaDB상의 date타입과 Sync됨
        // 날짜와 시간(LocalDateTime) : MariaDB상의 datetime타입과 Sync됨
        LocalDate presentDate = LocalDate.now();
        System.out.println(presentDate);
        System.out.println(presentDate.getYear());
        System.out.println(presentDate.getMonth());
        System.out.println(presentDate.getDayOfMonth());
        System.out.println(presentDate.getDayOfWeek());

        LocalTime presentTime = LocalTime.now();
        System.out.println(presentTime);
        System.out.println(presentTime.getHour());
        System.out.println(presentTime.getMinute());
        System.out.println(presentTime.getSecond());

        // 이게 제일 좋음
        LocalDateTime presentDateTime = LocalDateTime.now();
        System.out.println(presentDateTime);
        System.out.println(presentDateTime.getYear());
        System.out.println(presentDateTime.getMonth());
        System.out.println(presentDateTime.getHour());

        // 임의로 특정 시간을 만들어내고 싶을 때 : of메서드 사용
        LocalDate birthDaty = LocalDate.of(2000,11,20);
        System.out.println(birthDaty.getYear());
        System.out.println(birthDaty.getMonth());
        System.out.println(birthDaty.getDayOfMonth());

        LocalTime birthTime = LocalTime.of(20,20,20);

        LocalDateTime birthDayTime = LocalDateTime.of(2000,11,20,20,20,20);
        // 매개변수로 크로노필드 enum타입 사용하여 프로그램의 유연성 향상
        System.out.println(birthDayTime.get(ChronoField.YEAR));
        System.out.println(birthDayTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(birthDayTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println(birthDayTime.get(ChronoField.HOUR_OF_DAY));
        // 0 : 오전 , 1 : 오후
        System.out.println(birthDayTime.get(ChronoField.AMPM_OF_DAY));
        myWatch(LocalDateTime.now(),ChronoField.YEAR );
    }
    static void myWatch(LocalDateTime localDateTime, ChronoField c){
        if(c==ChronoField.YEAR) System.out.println("연도는 "+localDateTime.get(c)+"입니다");
        else if(c==ChronoField.MONTH_OF_YEAR) System.out.println("월은 "+localDateTime.get(c)+"입니다");
        else if(c==ChronoField.AMPM_OF_DAY) {
            if (localDateTime.get(c) == 0) System.out.println("오전입니다");
            else System.out.println("오후입니다");
        }
    }
}
