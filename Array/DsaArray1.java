import java.util.*;
class DsaArray1{
public static void main(String args[]){
Scanner num=new Scanner(System.in);
System.out.println("Enter the size of array - ");
int size=num.nextInt();
Scanner in=new Scanner(System.in);
int arr[]=new int[size];
for(int i=0;i<arr.length;i++){
arr[i]=in.nextInt();
}
for(int ele:arr){
System.out.print(ele+ " ");
}
System.out.println(Arrays.toString(arr));
}
}