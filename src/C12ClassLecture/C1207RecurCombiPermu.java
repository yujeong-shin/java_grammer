package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1207RecurCombiPermu {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < myList.size(); i++) {
            temp.add(myList.get(i));
            for (int j = i + 1; j < myList.size(); j++) {
                temp.add(myList.get(j));
//                combination.add(temp); //주소값 접근으로 모두 삭제됨
                combinations.add(new ArrayList<>(temp));
                temp.remove(temp.size()-1);
            }
            temp.remove(temp.size()-1);
        }
        System.out.println(combinations);
    }

}