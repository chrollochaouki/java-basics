import java.util.ArrayList;

public class Recap {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(sum(numbers));
    }
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++){
            sum = sum + numbers.get(i);
        }
        return sum;
    }
}
//import java.util.ArrayList;
//import java.util.Scanner;
//public class Recap {
//    public static void main(String[] args){
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
//        printEvens(numbers);
//    }
//    public static void printEvens(int[] numbers){
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                System.out.println(numbers[i]);
//            }
//        }
//    }
//}
//import java.util.ArrayList;
//import java.util.Scanner;
//public class Recap {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Ali");
//        names.add("Chaouki");
//        names.add("Sam");
//        names.add("Mohamed");
//        names.add("Joe");
//        printLonger(names);
//    }
//    public static void printLonger(ArrayList<String> names){
//        for (int i = 0; i < names.size(); i++){
//            if (names.get(i).length() > 4){
//                System.out.println(names.get(i));
//            }
//        }
//    }
//}
//import java.util.Scanner;
//public class Recap {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = scanner.nextInt();
//        multiTable(n);
//    }
//    public static void multiTable(int n){
//        for (int i = 1; i <= 10; i++){
//            System.out.println(n + " x " + i + " = " + (n * i));
//        }
//    }
//}