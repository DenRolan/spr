package tst;

import tst.annotation.HelloWorldMessageProvider;
import tst.annotation.StandardOutMessageRenderer;

/**
 * Created by r.denishev on 15.09.2017.
 */
public class HelloWorldDecoupled {
  public static void main(String[] args) {
    MessageRenderer mr = new StandardOutMessageRenderer();
    MessageProvider mp = new HelloWorldMessageProvider();
    mr.setMessageProvider(mp);
    mr.render();
  }
}
