import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class classTest {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int age = Integer br.readline();
    // System.out.println(age);
    Scanner sc = new Scanner(System.in);
    int age = sc .nextInt();
    String name = sc.nextline();
    float mark = sc.nextFloat();
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Mark: " + mark);
    sc.close();
  }
}