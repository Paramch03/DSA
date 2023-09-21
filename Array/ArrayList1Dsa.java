import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1Dsa{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
ArrayList<Integer> list1=new ArrayList<>(2);
list1.add(67);
list1.add(6711);
list1.add(6);
list1.add(7);
list1.add(607);
list1.add(670);
System.out.println(list1);
list1.set(3,99);
list1.remove(1);
System.out.println(list1);
}
}