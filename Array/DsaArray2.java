import java.util.*;
class DsaArray2{
public static void main(String args[]){
int num;
System.out.println("Enter the number of Strings -");
Scanner ab=new Scanner(System.in);
num=ab.nextInt();
Scanner in=new Scanner(System.in);
String str=new String[num];
for(int i=0;i<str.length;i++){
str[i]=in.next();
}
System.out.println(Arrays.toString(str));
}
}
