import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class Har{
public static void main(String args[]){

try{
FileWriter obj = new FileWriter("C:/Users/haran/hari/new_file1.txt");

obj.write("hello world program is being ou dated in the current generation");
obj.close();
File obj1 = new File("C:/Users/haran/hari/new_file1.txt");

System.out.println("file created"+obj1.getName());
System.out.println("successfully wrote");
}
catch(IOException i){
System.out.println("error ");
i.printStackTrace();
}
}
}