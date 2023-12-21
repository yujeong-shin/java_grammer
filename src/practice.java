import java.util.*;

public class practice {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        /*
        String[] strArr = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            strArr[i] = Integer.toString(numbers[i]);
        }
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if((strArr[i]+strArr[j]).compareTo(strArr[j]+strArr[i])<0){
                    String tmp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = tmp;
                }
            }
        }
        */
        String answer = "";
        String[] strArr = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            strArr[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(strArr, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        answer = String.join("", strArr);
//        if(answer.charAt(0)=='0') return "0";
        System.out.println(answer);
    }
}