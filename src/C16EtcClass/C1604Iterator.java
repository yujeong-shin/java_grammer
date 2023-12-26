package C16EtcClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C1604Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

////        enhanced for문 : 원본 변경 불가 -> remove 불가
//        for(String fruit : myList){
//            System.out.println(fruit);
////            remove 메소드 없음
//        }

//        iterator는 메모리 주소를 가지고 있음
//        iterator 사용 : 참조하고 있는 원본데이터 삭제 가능 -> remove
        Iterator<String> myIter = myList.iterator();
        while(myIter.hasNext()){
//            System.out.println(myIter.next());
            if(myIter.next().equals("banana")){
//                myIter.next().remove() //이미 값을 꺼내버려서 삭제 불가능
//                myIter.next()로 꺼낸 값을 가리키는 어떤 포인터 값을 가지고 있기 때문에
//                아래 코드에서 banana 다음의 값이 삭제되는 게 아니라 banana를 삭제함
//                논리적으로는 살짝 모순이 있지만, 내부적으로 포인터가 존재한다고 이해하고 넘어가자
                myIter.remove();
            }
        }
        System.out.println(myList);
    }
}
