package selfProgram;

public class coins {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int ans = 0, counter = 0;
        for (int i = 0; i < arr.length; i+=3) {
            int temp = 0;
            for (int j = i; j < 3; j++) {
                if(i != j){
                    temp *= arr[j];
                }
            }
            if(temp > ans){
                ans = temp;
            }
        }
        System.out.println(ans);
    }
}
