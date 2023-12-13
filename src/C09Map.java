import java.util.*;

public class C09Map {
    public static void main(String[] args) {
        ////        <String, String> -> Map
////        삽입된 데이터에 순서가 없다.
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//        System.out.println(myMap);
//        System.out.println(myMap.get("basketball"));
////        size(), isEmpty()
//        System.out.println(myMap.size());
//        System.out.println(myMap.isEmpty());
//        myMap.put("basketball", "탁구");
////        없으면 put이 putIfAbsent
//        myMap.putIfAbsent("baseball", "배구");
//        System.out.println(myMap);
//
////        getOrDefault : key가 없으면 default값 return
//        System.out.println(myMap.getOrDefault("tennis","스포츠"));
//
//        System.out.println(myMap.containsKey("soccer"));
//        myMap.remove("baseball");
//        System.out.println(myMap.keySet());
//        System.out.println(myMap.values());
//
////        enhanced for : key값 하나씩 출력.
//        for(String a : myMap.keySet()){
//            System.out.println(myMap.get(a));
//        }

//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
////        iterator를 통해 key값  하나씩 출력.
//        Iterator<String> myIter = myMap.keySet().iterator();
////        next 메서드는 데이터를 소모시키면서 return
////        System.out.println(myIter.next());
//        System.out.println(myIter);
////        hasNext() : iterator안에 값이 있는지 없는지.
//        while (myIter.hasNext()){
//            System.out.println(myIter.next());
//        }

//        아래의 리스트를 가지고 좋아하는 운동종목과 사람숫자를 map형태로 나타내시오.
        List<String> myList = new ArrayList<>();
        myList.add("basketball");
        myList.add("basketball");
        myList.add("basketball");
        myList.add("baseball");
        myList.add("baseball");
        myList.add("tennis");
        myList.add("tennis");
        myList.add("tennis");
//      basketball을 n명이 좋아한다.
        Map<String, Integer> myMap = new HashMap<>();
        for(String a : myList) {
            myMap.put(a,myMap.getOrDefault(a, 0) + 1);
        }

//            완주하지 못한 선수
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
//        시간초과
//        List<String> participant_list = new ArrayList<>(Arrays.asList(participant));
//        for(String c : completion) {
//            if(participant_list.contains(c)) {
//                participant_list.remove(c);
//            }
//        }
//        String answer = participant_list.get(0);

////        최적화
//        for(String a : participant) myMap.put(a, myMap.getOrDefault(a, 0)+1);
//        for(String a : completion) {
//            if(myMap.get(a) > 1) myMap.put(a, myMap.get(a)-1);
//            if(myMap.get(a)==1) myMap.remove(a);
//        }
//        String answer = myMap.keySet().iterator().next();

//        LinkedHashMap : 데이터 삽입순서 유지
        Map<String, Integer> myMap1 = new LinkedHashMap<>();
        myMap1.put("hello5", 1);
        myMap1.put("hello4", 1);
        myMap1.put("hello3", 1);
        myMap1.put("hello2", 1);
        myMap1.put("hello1", 1);
        System.out.println(myMap1);
//        TreeMap : key를 통해 데이터 정렬
        Map<String, Integer> myMap2 = new TreeMap<>();
        myMap2.put("hello5", 1);
        myMap2.put("hello4", 1);
        myMap2.put("hello3", 1);
        myMap2.put("hello2", 1);
        myMap2.put("hello1", 1);
        System.out.println(myMap2);
    }
}
