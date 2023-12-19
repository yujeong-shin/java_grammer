package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1207RecurCombiPermu {
    static int maxSum=0;
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> combination_list = new ArrayList<>();
        List<List<Integer>> permutation_list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[myList.size()];
//        int n=2;
//        combination(n, 0, myList, temp, combination_list);
        //System.out.println(combination_list);
//        permutation(n, visited, myList, temp, permutation_list);
//        System.out.println(permutation_list);
////        실습1 출력
//        permutation_practice1(n, visited, myList, temp);
////        실습2 출력
//        for (int n = 1; n <= 4 ; n++) {
//            permutation_practice2(n, visited, myList, temp);
//        }
//        실습3 출력
        permutation_practice3(myList, visited, 0, 0);
        System.out.println(maxSum);
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

//    static void permutation
    static void permutation(int n, boolean[] visited, List<Integer> myList, List<Integer> temp, List<List<Integer>> permutation_list){
        if(temp.size() == n){
            permutation_list.add(new ArrayList<>(temp));
            System.out.println(temp);
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if(!visited[i]){
                visited[i]=true;
                temp.add(myList.get(i));
                permutation(n, visited, myList, temp, permutation_list);
                visited[i]=false;
                temp.remove(temp.size()-1);
            }
        }

    }

    static void permutation_practice1(int n, boolean[] visited, List<Integer> myList, List<Integer> temp){
        if(temp.size() == n){
            int sum=0;
            for(int num : temp){
                sum += num;
            }
            if(sum>=6){
                System.out.println(temp);
                System.out.println(sum);
                return;
            }
        }
        for (int i = 0; i < myList.size(); i++) {
            if(!visited[i]){
                visited[i]=true;
                temp.add(myList.get(i));
                permutation_practice1(n, visited, myList, temp);
                visited[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }

    static void permutation_practice2(int n, boolean[] visited, List<Integer> myList, List<Integer> temp){
        if(temp.size() == n){
            int sum=0;
            for(int num : temp){
                sum += num;
            }
            if(sum>=6){
                System.out.println(temp);
                System.out.println(sum);
                return;
            }
        }
        for (int i = 0; i < myList.size(); i++) {
            if(!visited[i]){
                visited[i]=true;
                temp.add(myList.get(i));
                permutation_practice2(n, visited, myList, temp);
                visited[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }

    static void permutation_practice3(List<Integer> myList, boolean[] visited, int temp, int count){
        if(count == 3){
            if(temp > maxSum) maxSum = temp;
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if(!visited[i]){
                visited[i]=true;
                temp += myList.get(i);
                permutation_practice3(myList, visited, temp, count+1);
                temp -= myList.get(i);
                visited[i]=false;
            }
        }
    }
}