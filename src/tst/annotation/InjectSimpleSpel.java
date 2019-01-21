package tst.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by r.denishev on 21.09.2017.
 */
@Service("injectSimpleSpel")
public class InjectSimpleSpel {
  @Value("#{injectSimpleConfig.name}")
  private String name;
  @Value("#{injectSimpleConfig.age + 1}")
  private int age;
  @Value("#{injectSimpleConfig.height}")
  private float height;
  @Value("#{injectSimpleConfig.programmer}")
  private boolean programmer;
  @Value("#{injectSimpleConfig.ageinSeconds}")
  private Long ageinSeconds;

  public String toString() {
    return "Name: " + name + "\n"
      + "Age: " + age + "\n"
      + "Age in Seconds: " + ageinSeconds + "\n"
      + "Height: " + height + "\n"
      + "Is Programmer?: " + programmer;
  }

  public static void main(String[] args) {
    GenericXmlApplicationContext ctx =
      new GenericXmlApplicationContext();
    ctx.load("classpath:tst/app-context-annotation. xml");
    ctx.refresh();
    InjectSimpleSpel simple =
      (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
    System.out.println(simple);
  }

}
