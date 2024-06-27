package day01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assign1 {
    
    static class student{
        int sId, sRank;
        String sName, sAddress;
        String clg = "SNS";
        student(int a, int b, String c, String d){
            sId = a;
            sRank = b;
            sName = c;
            sAddress = d;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many students : ");
        int n = in.nextInt();
        List<student> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter "+(i+1)+" student detail : ");
            System.out.println();
            System.out.println("Student ID : ");
            int sid = in.nextInt();
            System.out.println("Student Rank : ");
            int sRank = in.nextInt();
            System.out.println("Student Name");
            String sName = in.next();
            System.out.println("Student Address : ");
            String sAddress = in.next();
            student objj = new student(sid,sRank,sName,sAddress);
            arr.add(objj);
            System.out.println();
        }
        System.out.println("Name |\tRank |\tAddress |\tCollege");
        System.out.println("----------------------------------------");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).sName+"\t"+arr.get(i).sRank+"\t"+arr.get(i).sAddress+"\t"+arr.get(i).clg);
        }
        student topRank = null;
        student topRankRegion = null;
        for (int i = 0; i < n-1; i++) {
            if(arr.get(i).sRank < arr.get(i+1).sRank){
                topRank = arr.get(i);
                if(arr.get(i+1).sAddress.equals(arr.get(i).sAddress)){
                    topRankRegion = arr.get(i);
                }
            }
        }
        System.out.println();
        System.out.println("Top Rank : \n"+topRank.sId+"\t"+topRank.sName+"\t"+topRank.sRank);
        System.out.println();
        System.out.println("Regional : \n"+topRankRegion.sId+"\t"+topRankRegion.sName+"\t"+topRankRegion.sRank);
        in.close();
    }
}
