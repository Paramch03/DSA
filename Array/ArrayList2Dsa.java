import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList2Dsa{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
for(int i=0;i<3;i++){
list1.add(new ArrayList<>());
}
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
list1.get(i).add(in.nextInt());
}
}
System.out.println(list1);
}
}

