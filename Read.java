import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read{
public static void main(String args[]){try{
File obj=new File("C:/Users/haran/hari/new_file1.txt");
Scanner scanner=new Scanner(obj);
while(scanner.hasNextLine()){
String data=scanner.nextLine();
System.out.println(data);
} 	scanner.close();}
catch(FileNotFoundException e){
e.printStackTrace();
}
}
}