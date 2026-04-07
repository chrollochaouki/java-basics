public class ArraysPractice {
    public static void main(String[] args) {

        int[] grades = {85, 92, 78, 90, 88};
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
        for (int i = 0; i < grades.length; i++){
            if (grades[i] > 85){
                System.out.println(grades[i]);
            }
        }
        int sum = 0;
        for (int i = 0; i < grades.length; i++){
            sum = sum + grades[i];
        }
        System.out.println("Average: " + sum / grades.length);
        int max = grades[0];
        for (int i = 0; i < grades.length; i++){
            if (grades[i] > max){
                max = grades[i];
            }
        }
        System.out.println("Highest: " + max);
    }
}