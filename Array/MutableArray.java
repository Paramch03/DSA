import java.util.Arrays;
class MutableArray{
public static void main(String args[]){
int arr[]={1,2,3,4};
System.out.println(Arrays.toString(arr));
change(arr);
}
static void change(int num[]){
num[2]=9999;
System.out.println(Arrays.toString(num));
}
}