 import java.util.Scanner;
  public class Hello{

  	public static void main(String[] args){
  		Scanner scanner = new Scanner(System.in);

  		System.out.println("����������");
  		String name = scanner.next();
  		System.out.println("����������");
  		int age = scanner.nextInt();
  		System.out.println("������нˮ");
  		double sal = scanner.nextDouble();
  		System.out.println("name="+name+"age="+age+"sal="+sal);
  	}
  }
   class BinaryTest{
    public static void main(String[] args) {
      int n1 = 0b1010;
      int n2 = 1010;
      int n3 = 01010;
      int n4 = 0X10101;
      System.out.println("n1="+n1);
      System.out.println("n2="+n2);
      System.out.println("n3="+n3);
      System.out.println("n4="+n4);
    }
  }