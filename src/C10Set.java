import java.util.*;

public class C10Set {
    public static void main(String[] args) {
////        중복 없고, 순서 없다.
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);


////        반 학생들이 좋아하는 운동종목 : list로 만들고,
////        좋아하는 종목명의 개수를 출력
//        List<String> myList = new ArrayList<>();
//
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("tennis");
//        myList.add("tennis");
//        myList.add("tennis");
//        Set<String> mySet = new HashSet<>();
////        mySet = Set.copyOf(myList);//방법3
//        for(String s : myList) {
//            mySet.add(s); //방법1
//            //Collections.addAll(mySet, s); //방법2
//        }
//        System.out.println(mySet.size());

////        List를 인자값으로 받아 초기값 세팅 가능
//        Set<String> mySet = new HashSet<>(myList);

////        배열을 인자값으로 받아 Set 초기값 세팅
////        배열이 주어졌다면 Arrays.asList(배열 변수명);
//        String[] myArray = {"java", "java", "python", "python", "C++"};
//        Set<String> mySet = new HashSet<>(Arrays.asList(myArray));
//        System.out.println(mySet);

////        int일 경우 for문 돌려서 형변환(박싱)하자
//        int[] myArrInt = {1, 2, 3, 4, 4, 3, 2};
//        Set<Integer> mySetInt = new HashSet<>();
//        for(int a : myArrInt){
//            mySetInt.add(a);
//        }
//        System.out.println(mySetInt);

//        Set<String> mySet1 = new HashSet<>(Arrays.asList("java", "python", "javascript"));
//        Set<String> mySet2 = new HashSet<>(Arrays.asList("java", "html", "css"));
//
////        교집합 : retainAll
//        Set<String> temp1 = new HashSet<>(mySet1);
//        temp1.retainAll(mySet2);
//        System.out.println(temp1);
//
////        합집합 : addAll
//        Set<String> temp2 = new HashSet<>(mySet1);
//        temp2.addAll(mySet2);
//        System.out.println(temp2);
//
////        차집합 : removeAll
//        Set<String> temp3 = new HashSet<>(mySet1);
//        temp3.removeAll(mySet2);
//        System.out.println(temp3);

//        순서가 없으므로 enhanced for문 혹은 iterator 사용

////        LinkedHashSet, TreeSet
//        Set<String> mySet = new TreeSet<>();
//        mySet.add("hello5");
//        mySet.add("hello4");
//        mySet.add("hello3");
//        mySet.add("hello2");
//        mySet.add("hello1");
//        System.out.println(mySet);

////        두개 뽑아서 더하기
//        int[] numbers = {2,1,3,4,1};
//        Set<Integer> myTreeSet = new TreeSet<>();
//        for (int i = 0; i < numbers.length-1; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                myTreeSet.add(numbers[i]+numbers[j]);
//            }
//        }
//        System.out.println(myTreeSet);
//
//        int[] answer = new int[myTreeSet.size()];
//        int count=0;
//        for(int a : myTreeSet){
//            answer[count++] = a;
//        }
//        System.out.println(Arrays.toString(answer));

        String[] phone_book = {"12","123","1235","88","567"};
        List<String> phone_number_list = new ArrayList<>(Arrays.asList(phone_book));
        Collections.sort(phone_number_list);
        boolean answer = true;
        for (int i = 0; i < phone_number_list.size()-1; i++) {
            //문자열의 길이가 같거나, 뒤의 문자열의 길이가 더 긴 경우만 비교 가능
            if(phone_number_list.get(i).length() <= phone_number_list.get(i+1).length()){
                String head = phone_number_list.get(i);
                System.out.println("head = " + head);
                String comp = phone_number_list.get(i+1).substring(0, head.length());
                System.out.println("comp = " + comp);
                if(head.equals(comp)) {
                    answer=false;
                    break;
                }
            }
        }
        System.out.println(answer);

    }
}
