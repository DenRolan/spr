package tst;

/**
 * Created by r.denishev on 15.09.2017.
 */
public class HelloWorldDecoupledWithFactory {
  public static void main(String[] args) {
    MessageRenderer mr = MessageSupportFactory.getInstance().
      getMessageRenderer();
    MessageProvider mp = MessageSupportFactory.getInstance().
      getMessageProvider();
    mr.setMessageProvider(mp);
    mr.render();
  }
}
