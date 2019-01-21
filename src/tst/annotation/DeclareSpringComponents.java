package tst.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;
import tst.MessageProvider;

/**
 * Created by r.denishev on 19.09.2017.
 */
public class DeclareSpringComponents {
  public static void main(String[] args) {
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    ctx.load("classpath:tst/app-context-annotation. xml");
    ctx.refresh();
    MessageProvider messageProvider = ctx.getBean("messageProvider",
      MessageProvider.class);
    System.out.println(messageProvider.getMessage());
  }
}
