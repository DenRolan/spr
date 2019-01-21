package tst;

/**
 * Created by r.denishev on 15.09.2017.
 */
public class HelloWorld {

  public static void main(String[] args) {
    if (args.length > 0) {
      System.out.println(args[0]);
    } else {
      System.out.println("Hello World!");
    }
  }
}
