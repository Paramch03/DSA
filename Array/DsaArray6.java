import java.util.Arrays.*;
import java.util.*;
class DsaArray6{
public static void main(String args[]){
Scanner ai=new Scanner(System.in);
System.out.println("Enter the elements of matrix -");
int a[][]={{1,2,3,4},{1,1},{1,2,2,2,2,2,3}};
for(int row =0;row<a.length;row++){
for(int col=0;col<a[row].length;col++){
a[row][col]=ai.nextInt();
}

//comment
}
System.out.println("Final Matrix -");
for(int b[]:a){
System.out.println(Arrays.toString(b));
}
}
}
