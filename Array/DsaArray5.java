import java.util.Arrays.*;
import java.util.*;
class DsaArray5{
public static void main(String args[]){
Scanner ai=new Scanner(System.in);
System.out.println("Enter the elements of matrix -");
int a[][]=new int[3][5];
for(int row =0;row<a.length;row++){
for(int col=0;col<a[row].length;col++){
a[row][col]=ai.nextInt();
}
}
System.out.println("Final Matrix -");
for(int b[]:a){
System.out.println(Arrays.toString(b));
}
}
}

