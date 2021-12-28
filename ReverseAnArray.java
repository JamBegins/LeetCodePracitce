import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5};
        Arrays.stream(inputArray).forEach(System.out::println);

        reverse(inputArray);
        Arrays.stream(inputArray).forEach(System.out::println);
    }
    private static void reverse(int[] sampleInput) {
        int start = 0;
        int end = sampleInput.length-1;
        int temp;
        while (start<end) {
            temp = sampleInput[start];
            sampleInput[start]=sampleInput[end];
            sampleInput[end]= temp;
            start++;
            end--;
        }
     }
}
