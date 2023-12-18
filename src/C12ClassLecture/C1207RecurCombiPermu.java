package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1207RecurCombiPermu {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> combination_list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int n=2;
        combination(n, 0, myList, temp, combination_list);
        System.out.println(combination_list);
    }
//    static void combination
    static void combination(int n, int start, List<Integer> myList, List<Integer> temp, List<List<Integer>> combination_list){
        if(temp.size()==n){
            combination_list.add(new ArrayList<>(temp));
            System.out.println(temp);
            return;
        }
        for (int i = start; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combination(n, i+1, myList, temp, combination_list);
            temp.remove(temp.size()-1);
        }
    }
}