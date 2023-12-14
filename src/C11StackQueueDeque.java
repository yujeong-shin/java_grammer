import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class C11StackQueueDeque {
    public static void main(String[] args) {
//        Stack<Integer> mySt = new Stack<>();
//        mySt.push(10);
//        mySt.push(30);
//        mySt.push(30);
////        pop : 스택에서 요소를 제거 후 해당 요소 반환
//        System.out.println(mySt.pop());
////        peek : 스택에서 마지막 요소 반환. 제거x
//        System.out.println(mySt.peek());
//        System.out.println(mySt);
//        System.out.println(mySt.size());
//        System.out.println(mySt.isEmpty());

////        String 객체 5개 정도 stack에 추가 후 while문을 통해 모두 출력
//        Stack<String> myStack = new Stack<>();
//        myStack.push("hello1");
//        myStack.push("hello2");
//        myStack.push("hello3");
//        myStack.push("hello4");
//        myStack.push("hello5");
//
//        while(!myStack.isEmpty()){
//            System.out.println(myStack.pop());
//        }

////        웹페이지 방문
////        방문한 사이트 출력 + 뒤로가기 기능 구현
////        스캐너로 신규사이트 방문 or 뒤로가기
////        신규 사이트 방문일경우, 해당 주소 push
////        뒤로 가기일경우 해당 주소 pop
////        내 풀이
//        Stack<Integer> myHistory = new Stack<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("신규 사이트라면 0, 방문한 사이트라면 1를 입력하세요 : ");
//        int isvisit = sc.nextInt();
//        if(isvisit==0){
//            System.out.print("방문할 사이트 번호를 입력하세요 : ");
//            int startPage = sc.nextInt();
//            myHistory.push(startPage);
//            System.out.println("현재 스택 상태 : " + myHistory);
//
//            while(!myHistory.isEmpty()){
//                System.out.print("다른 신규 페이지를 방문하려면 0, 뒤로가려면 -1을 입력하세요 : ");
//                int nextAction = sc.nextInt();
//                if(nextAction==0) {
//                    System.out.print("방문할 사이트 번호를 입력하세요 : ");
//                    int nextPage = sc.nextInt();
//                    myHistory.push(nextPage);
//                    System.out.println("현재 스택 상태 : " + myHistory + "\n");
//                }
//                else{
//                    System.out.println("뒤로가기 : " + myHistory.pop() + "페이지로 돌아왔습니다.");
//                    System.out.println("현재 스택 상태 : " + myHistory + "\n");
//                }
//            }
//        }

////        강사님 풀이
//        Stack<String> backwards = new Stack<>();
//        Stack<String> forwards = new Stack<>();
//        while(true){
//            System.out.println("신규사이트 방문시 1번, 앞으로가기 2번, 뒤로가기 3번");
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//            if(input.equals("1")) {
//                System.out.println("방문하신 사이트를 입력해주세요");
//                String input2 = sc.nextLine();
//                System.out.println("방문하신 사이트는 " + input2 + "입니다.");
//                backwards.push(input2);
//            }else if(input.equals("2")) {
//                String temp = forwards.pop();
//                backwards.push(temp);
//                System.out.println("앞으로가기로 방문하신 곳은" + temp + "입니다. ");
//            }else {
//                String temp = backwards.pop();
//                forwards.push(temp);
//                System.out.println("뒤로가기로 방문하신 곳은" + backwards.peek() + "입니다. ");
//            }
//        }

////        큐선언
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.poll());
//        System.out.println(myQue);

////        프린터대기열 예제
////        문서1추가, 문서2추가, 문서3추가
//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//
//        while(!myQue.isEmpty()){
//            System.out.println("현재 인쇄 중인 문서 : " + myQue.poll());
//        }

////        전체 길이의 제한이 있는 큐 : ArrayBlockingQueue
//        Queue<String> myQue = new ArrayBlockingQueue<>(3);
////        add와 offer의 차이
////        add는 길이가 다 찼을 때 에러를 발생, offer 공간이 충분할 때만 add
////        myQue.add("hello1");
////        myQue.add("hello2");
////        myQue.add("hello3");
////        myQue.add("hello4");
////        System.out.println(myQue);
//
//        myQue.offer("hello1");
//        myQue.offer("hello2");
//        myQue.offer("hello3");
//        myQue.offer("hello4");
//        System.out.println(myQue);

////        우선순위 큐
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//        while(!pq.isEmpty())
//        {
//            System.out.println(pq.poll());
//        }

//        프로그래머스 - 더 맵게 문제
//        int[] scoville = {1, 2, 3, 9, 10, 12};
//        int K = 7;
//        int answer = 0;
//        Queue<Integer> myQue = new PriorityQueue<>();
//        //List 생성
//        for(int num : scoville) myQue.add(num);
//
//        while(true){
//            if(myQue.peek() >= K) break;
//            else if(myQue.size()==1 && myQue.peek() < K) {
//                answer = -1;
//                break;
//            }
//            else{
//                answer++;
//                int temp = myQue.poll() +  myQue.poll()*2;
//                myQue.add(temp);
//            }
//        }

////        ArrayDeque : 양방향에서 데이터를 삽입 / 제거할 수 있다.
////        성능 빠름.
//        Deque<Integer> myDeque = new ArrayDeque<>();
//        myDeque.addFirst(10);
//        myDeque.addFirst(20);//20,10
//        System.out.println(myDeque);
//        myDeque.addLast(30);
//        System.out.println(myDeque);//20,10,30
//
//        System.out.println(myDeque.pollFirst());//20
//        System.out.println(myDeque.pollLast());//30
//        System.out.println(myDeque);
        boolean answer = true;
        String s = "()())";
        Stack<Character> stack = new Stack<>();
//        for(char c : s.toCharArray()){
//            if(c=='(') stack.push(c);
//            else {
//                if(stack.isEmpty()) answer=false;
//                else stack.pop();
//            }
//        }
//        if(!stack.isEmpty()) answer=false;
//
//        System.out.println(answer);

////      종승이 코드 고치기.... 효율성 2번 미통과ㅠ
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i)=='('){
//                stack.push(s.charAt(i));
//            }
//            else{
//                if(stack.isEmpty()){
//                    stack.push(s.charAt(i));
//                }
//                else {
//                    if(stack.peek()=='('){
//                        stack.pop();
//                    }
//                }
//            }
//        }
//        System.out.println(stack.isEmpty()? true:false);

////         Deque로 풀기 - 강사님 풀이
//        Deque<Character> myDeque = new ArrayDeque<>();
//        for (int i = 0; i < s.length(); i++) {
//            if(myDeque.isEmpty()){
//                myDeque.addLast(s.charAt(i));
//                if(s.charAt(i)==')'){
//                    answer = false;
//                    break;
//                }
//            }
//            else{
//                if(myDeque.peekLast()=='(' && s.charAt(i)==')'){
//                    myDeque.pollLast();
//                }else{
//                    myDeque.addLast(s.charAt(i));
//                }
//            }
//        }
//        if(!myDeque.isEmpty()) answer = false;

////      훈쓰앤재영쓰 코드 크으.......... 치인다.
//        String str = "(())()";
//        int open=0;
//        int close=0;
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i)=='('){
//                open++;
//            }
//            else if(str.charAt(i)=='(') {
//                close++;
//            }
//            if(open<close) {
//                return false;
//            }
//        }
//        if(open == close) return true;

    }
}
