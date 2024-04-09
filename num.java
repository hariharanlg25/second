 public class Num{
public static void main(String args[]){
String name="hariharan";
boolean false_palin=true;
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

System.out.println(" program to swap ");

int first=18;
int second=89;
int dummy=0;

System.out.println(first+"before"+second+"before");

dummy=first;
first=second;
second=dummy;
System.out.println(first+"after"+second+"after");

}
}