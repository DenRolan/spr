package tst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by r.denishev on 15.09.2017.
 */
public class HelloWorldSpringDI {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext
      ("tst/applicationContext.xml");
    MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
    mr.render();
  }
}
