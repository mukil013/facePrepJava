package day08;
import java.util.Scanner;
class Students{
    String name = null;
    int age = 0;
    float cgpa = 0;
    protected int roll = 0;
    int[] arr;
    Students(int n, String name, int age){
        this.name = name;
        this.age = age;
        arr = new int[n];
    }
}
public class Oops {
    private static String log = "Hello";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Students stu1 = new Students(n ,"Mukil",21);
        for (int i = 0; i < n; i++) {
            stu1.arr[i] = in.nextInt();
        }
        in.close();
        System.out.printf("%s %d %.2f %d\n",stu1.name,stu1.age,stu1.cgpa,stu1.roll);
        for (int i = 0; i < n; i++) {
            System.out.print(stu1.arr[i]+" ");
        }
        System.out.println(log);
        System.out.println();
    }
}
