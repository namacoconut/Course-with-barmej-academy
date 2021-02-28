class Main {
  public static void main(String[] args) {
    System.out.println(1);
    System.out.println(2.5);
    System.out.println('A');
    System.out.println(true);

// how to define a variable?
// write the data type, name the variable, add = sign, write the value according to datatype and then semicolon ;
    int age = 1;
    System.out.println(age);

      // لا تقم بمسح المتغير لأنه سيتم استخدامه في السؤال التالي
        int number = 10 + 2;
      System.out.println(number);
       
      boolean isEqual = number == 12;
      System.out.println(isEqual);
      
			boolean isLesserthan = 'a' < 'w';
      System.out.println(isLesserthan);
  }
  
}


// arrays:
public class Main {
    public static String[] get() {
		// String [] نوع المصفوفة
        String [] array = {"Barmej", "Ahmad", "Code" };      
		
        return array;
    }
}