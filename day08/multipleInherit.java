package day08;

public class multipleInherit extends child{
    public static void main(String[] args) {
        System.out.println(grandtotal);
    }
}
interface appa{
    static int blackMoney = 10000;
} 
interface mama{
    static int blackMoney = 10000;
}
class child implements appa,mama{
    static int grandtotal = appa.blackMoney + mama.blackMoney;
}
