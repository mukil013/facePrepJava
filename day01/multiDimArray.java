package day01;
public class multiDimArray{
  public static void main(String[] args){
    String[][] arr = {{"Mr","Mrs"},{"jones","Smith"}};
    String name1 = arr[0][0]+" "+arr[1][0];
    String name2 = arr[0][1]+" "+arr[1][1];
    System.out.printf("%s\n%s\n",name1,name2);
  }
} 
