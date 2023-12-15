package C12ClassLecture;

public class C1205Constructor {
    public static void main(String[] args) {
        Calender calender1 = new Calender("2023년", "12월", "15일");
        Calender calender2 = new Calender("2000년", "4월");
        Calender calender3 = new Calender("2023년", null, null);
        Calender calender4 = new Calender("2023년");
        System.out.println(calender1.getYear() + " " + calender1.getMonth() + " " + calender1.getDay());

    }
}


class Calender{
    private String year, month, day;
    Calender(String year, String month, String day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
//    메서드 오버로딩을 통해 같은 이름의 생성자 생성가능
    Calender(String year, String month){
        this.year = year;
        this.month = month;
    }
//    this() 키워드를 통해 클래스 내 매개변수에 맞는 생성자 호출 가능
    Calender(String year){
        this(year, null, null); //자동으로 매개변수 3개인 생성자 호출
    }
    Calender(){
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
