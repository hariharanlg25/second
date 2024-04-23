 public class Num{
public static void main(String args[]){
String name="hariharan";
boolean false_palin=true;

System.out.println("***********palindrome**************");
for(int i=0;i<name.length()/2;i++){
if(name.charAt(1)!=name.charAt(name.length() - i - 1)){
false_palin=false;
break;
}
}
if(false_palin){
System.out.println(name+"is palindrome");
}
else{
System.out.println(name+"is not palindromec");}
// *******************************************

System.out.println("***********reverse string**************");
System.out.println("starting with reversing the string");
String full_name="hariharan",reverse="",temp;
for(int i=full_name.length()-1;i>=0;i--){
reverse+=full_name.charAt(i);

}System.out.println(full_name+" before reversing");
System.out.println(reverse+" after reversing");
// *******************************************
System.out.println("fibonacci series");
int a=0,b=1,c,num=9	;
for(int i=0;i<=num;i++){
System.out.println(a+"");
c=a+b;
a=b;
b=c;

}


// *******************************************

System.out.println("***********swap number**************");
System.out.println(" program to swap ");

int first=18;
int second=89;
int dummy=0;

System.out.println(first+"before"+second+"before");

dummy=first;
first=second;
second=dummy;
System.out.println(first+"after"+second+"after");
//************************************

System.out.println("***********leap year**************");
System.out.println("leap year code");
int year=2023;
if((year % 4 == 0)||(year%400==0)&&(year % 100 != 0)){
System.out.println(year+" is a leap year");
}else{
System.out.println("not a leap year");}
System.out.println("***********bubble sort**************");
System.out.println("bubble sort");
int[] arr={12,43,2,1,3,4,233,564,13,8,65,9};

for(int m=0;m<arr.length;m++){
System.out.println("before sorting  "+m+arr[m]);
}
for(int z=0;z<arr.length - 1;z++){
for(int j=0;j<arr.length - z - 1;j++){
if(arr[j]>arr[j+1]){
int temper;
temper=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temper;
}
}
}
for(int x=0;x<arr.length;x++){
System.out.println("sorted array"+arr[x]);
//System.out.println("*******************");
}
System.out.println("********************************");
System.out.println("factorial program");
int fact=1;
int number=5;
for(int e=1;e<number;e++){
fact*=e;
}
System.out.println(fact);
System.out.println("******************prime number****************************");
System.out.println("the prime number program");
int prime=8;
boolean primer=true;
for(int f=2;f<=Math.sqrt(prime);f++){
if(prime%f==0)
{
primer=false;
break;
}
}
if(primer){
System.out.println("prime number"+prime);}else{System.out.println("not a prime number "+prime);}
}
}