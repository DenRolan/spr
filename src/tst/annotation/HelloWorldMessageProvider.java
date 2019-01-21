package tst.annotation;

import org.springframework.stereotype.Service;
import tst.MessageProvider;

/**
 * Created by r.denishev on 15.09.2017.
 */
@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {
  @Override
  public String getMessage() {
    return "Hello World!";
  }

}
