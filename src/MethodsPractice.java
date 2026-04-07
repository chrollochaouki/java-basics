public class MethodsPractice {
    public static void main (String[] args){
        System.out.println(add(5, 3));
        System.out.println(name("Chaouki"));
        System.out.println(number (3));
        System.out.println(compare(6,9));
    }
    public static int add (int a, int b) {
        return a + b;
    }
    public static String name (String name){
        return "Hello, " + name;
    }
    public static boolean number (int a) {
        if (a % 2 == 0 ){
            return true;
        } else {
            return false;
           }
    }
    //or return a % 2 == 0;
    public static int compare (int x, int z) {
        if (x>z){
            return x;
        } else{
            return z;
          }
    }
}
