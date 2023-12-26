package C16EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C1602Calendar {
    public static void main(String[] args) {
//////        날짜 관련 클래스의 종류 : Calendar(java.util), java.time 패키지 안에 있는 Local~ 클래스.
//////        결론 : LocalDateTime쓰자.
//        Calendar time = Calendar.getInstance();
//        System.out.println(time.getTime());
//
////        특정한 숫자 값은 get함수의 input 값으로 주어, 원하는 날짜 정보를 출력할 수 있게 해준다.
//        System.out.println(time.get(1)); //년도 정보
//        System.out.println(time.get(2)+1); //월 정보 - 1월이 0부터 시작해서 +1해줘야 한다.
//
//        System.out.println(time.get(Calendar.YEAR)); //년
//        System.out.println(time.get(Calendar.MONTH)+1); //월
//        System.out.println(time.get(Calendar.DAY_OF_MONTH)); //일
//        System.out.println(time.get(Calendar.DAY_OF_WEEK)); //요일(일:1, 월:2, 화:3 ~~ 금:6 토:7)
//        System.out.println(time.get(Calendar.HOUR_OF_DAY));
//        System.out.println(time.get(Calendar.MINUTE));
//        System.out.println(time.get(Calendar.SECOND));

//        java.time 패키지 : Local~ 클래스
//        LocalTime present_time = LocalTime.now();
//        System.out.println(present_time);
//        System.out.println(present_time.getHour());
//        System.out.println(present_time.getMinute());
//        System.out.println(present_time.getSecond());

//        LocalDate present_date = LocalDate.now();
//        System.out.println(present_date);
//
//        LocalDateTime this_time = LocalDateTime.now();
//        System.out.println(this_time);

////        임의로 특정 시간을 만들어 내고 싶을 때 : of 메서드 사용
//        LocalDate birthDay = LocalDate.of(2023, 12, 26);
////        일반 내장 메서드
//        System.out.println(birthDay.getYear());
//        System.out.println(birthDay.getMonth());
//        System.out.println(birthDay.getDayOfMonth());
//
////        임의로 특정 시간을 만들어 내고 싶을 때 : of 메서드 사용
//        LocalTime birthTime = LocalTime.of(02,02,19);
//        LocalTime birthTime2 = LocalTime.of(02,02,19,11);
//        System.out.println(birthTime);
//        System.out.println(birthTime2);
//
////          임의로 특정 시간을 만들어 내고 싶을 때 : of 메서드 사용
//        LocalDate birthDay = LocalDate.of(2023, 12, 27);
//        LocalTime birthTime = LocalTime.of(02,02,19);
//        LocalDateTime birthDayTime = LocalDateTime.of(birthDay, birthTime);
//        System.out.println(birthDayTime);
//        LocalDateTime birthDayTime2 = LocalDateTime.of(2023, 12, 26, 10,10,00);
//        //이렇게 사용하기보다는 now만 주로 사용함
//
//        크로노필드 enum 타입 사용
//        메소드를 통일하고 뒷자리의 필드로 구분하기 위해 사용 -> 메서드화 시킬 때 ChronoField를 매개변수화 시킬 수 있어서
//        // Enum ChronoField를 이용해서 명시적으로 get 메소드 이용 가능
//        int y   = date.get(ChronoField.YEAR);
//        int mon = date.get(ChronoField.MONTH_OF_YEAR);
//        int d   = date.get(ChronoField.DAY_OF_MONTH);
//        LocalDate birthDay = LocalDate.of(2023, 12, 27);
//        LocalTime birthTime = LocalTime.of(02,02,19);
//        LocalDateTime birthDayTime = LocalDateTime.of(birthDay, birthTime);

//        System.out.println(birthDayTime.get(ChronoField.YEAR)); //년
//        System.out.println(birthDayTime.get(ChronoField.MONTH_OF_YEAR)); //월
//
////        ⭐ 0 : 오전, 1 : 오후
//        System.out.println(birthDayTime.get(ChronoField.AMPM_OF_DAY));
//        if(birthDayTime.get(ChronoField.AMPM_OF_DAY)==0){
//            System.out.println("현재 시간은 오전입니다.");
//        }
//        else {
//            System.out.println("현재 시간은 오후입니다.");
//        }
//
//        매개변수로 크로노 필드를 받아 프로그램의 유연성 향상
        LocalDate birthDay = LocalDate.of(2023, 12, 27);
        LocalTime birthTime = LocalTime.of(02,02,19);
        LocalDateTime birthDayTime = LocalDateTime.of(birthDay, birthTime);
        printCalendar(birthDayTime, ChronoField.YEAR);
        printCalendar(birthDayTime, ChronoField.MONTH_OF_YEAR);
        printCalendar(birthDayTime, ChronoField.AMPM_OF_DAY);
    }
//
    static void printCalendar(LocalDateTime ldt, ChronoField cf){
        if(cf == ChronoField.YEAR){
            System.out.println("연도는 " + ldt.get(cf.YEAR) + "입니다");
        } else if(cf == ChronoField.MONTH_OF_YEAR){
            System.out.println("월은 " + ldt.get(cf.MONTH_OF_YEAR) + "입니다");
        }
        else if(cf == ChronoField.AMPM_OF_DAY){
            String temp = "";
            if(ldt.get(ChronoField.AMPM_OF_DAY)==0){
                temp = "오전";
            }
            else {
                temp="오후";
            }
            System.out.println("오전/오후는 " + temp + "입니다");
        }
    }
}
