package tst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by r.denishev on 21.09.2017.
 */
public class ConfiguraЫeMessageProvider implements MessageProvider {
  public String message;

  @Autowired
  public ConfiguraЫeMessageProvider(@Value("ConfiguraЬle message") String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return message;
  }

}