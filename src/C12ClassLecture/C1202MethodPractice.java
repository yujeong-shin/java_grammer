package C12ClassLecture;

public class C1202MethodPractice {
    public static void main(String[] args) {
//        소수 : 1과 자기자신을 제외하고 나누어지는 수가 없는 숫자
//        소수인지 아닌지 판별하는 메서드 작성
//        리턴타입 boolean : 소수이면 true, 아니면 false
//        main 메서드에서 호출하여 테스트
        System.out.println(isPrime(4));

    }
    static boolean isPrime(int num){
        boolean answer = false;
        int count=0;
        for (int i = 1; i <= num; i++) {
            if(num%i==0) count++;
        }
        if(count==2) answer=true;
        return answer;
    }

    static boolean isPrime2(int num){
        boolean answer = true;
        for (int i = 2; i*i <= num; i++) {
//            메서드가 return을 만나면 바로 종료
//            void 리턴타입 메서드에서도 강제종료를 위해 return 사용가능
            if (num % i == 0) return false;
        }
        return answer;
    }

    static void isPrimePrint(int num){
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                System.out.println("소수가 아닙니다.");
                return;
            }
        }
        System.out.println("소수입니다.");
    }
}
