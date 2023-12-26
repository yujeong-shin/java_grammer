package C16EtcClass;

import java.util.Arrays;

public class C1603GenericMain {
    public static void main(String[] args) {
////        제네릭 메서드 안 쓴 예제
//        String[] stArr = {"JAVA", "PYTHON", "C++"};
////        strSwap(stArr);
////        System.out.println(Arrays.toString(stArr));
////        0번째와 1번째 자리 Change
//        strChange(stArr, 0, 1);
//        System.out.println(Arrays.toString(stArr));
//
//        Integer[] intArr = {1,2,3,4,5};
////        intSwap(intArr);
////        System.out.println(Arrays.toString(intArr));
//        intChange(intArr, 1, 2);
//        System.out.println(Arrays.toString(intArr));

////        제네릭 메서드 생성 : 반환타입 왼쪽에 <T>를 선언
////        제네릭은 객체 타입이 들어와야함에 유의 ex) Integer, String, ...
//        String[] stArr = {"JAVA", "PYTHON", "C++"};
//        Integer[] intArr = {1,2,3,4,5};
//
//        System.out.println("-----제네릭 메서드로 swap-----");
//        genericSwap(stArr, 1, 2);
//        System.out.println(Arrays.toString(stArr));
//        genericSwap(intArr, 0, 1);
//        System.out.println(Arrays.toString(intArr));

        class GenericStudent<T> {
            String name;
            T age;
            GenericStudent(String name, T age){
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public T getAge() {
                return age;
            }

            public void setAge(T age) {
                this.age = age;
            }
        }

        GenericStudent<String> st1 = new GenericStudent<>("호두", "2");
        GenericStudent<Integer> st2 = new GenericStudent<>("호두", 3);
        System.out.println("이름은 : " + st1.getName() + ", 나이는 : " + st1.getAge());
        System.out.println(st1.getAge().getClass()); //String 타입
        System.out.println("이름은 : " + st2.getName() + ", 나이는 : " + st2.getAge());
        System.out.println(st2.getAge().getClass()); //Integer 타입
    }


    static void strChange(String[] stArr, int a, int b){
        String temp = stArr[a];
        stArr[a] = stArr[b];
        stArr[b] = temp;
    }

    static void intChange(Integer[] intArr, int a, int b){
        Integer temp = intArr[a];
        intArr[a] = intArr[b];
        intArr[b] = temp;
    }

    static <T>void genericSwap(T[] arr, int a, int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    static void strSwap(String[] stArr){
        for (int i = 0; i < stArr.length-1; i++) {
            String temp = stArr[i];
            stArr[i] = stArr[i+1];
            stArr[i+1] = temp;
        }
    }

    static void intSwap(Integer[] intArr){
        for (int i = 0; i < intArr.length-1; i++) {
            Integer temp = intArr[i];
            intArr[i] = intArr[i+1];
            intArr[i+1] = temp;
        }
    }
}
