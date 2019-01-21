package tst;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by r.denishev on 15.09.2017.
 */
public class MessageSupportFactory {
  private static MessageSupportFactory instance;
  private Properties props;
  private MessageRenderer renderer;
  private MessageProvider provider;

  private MessageSupportFactory() {
    props = new Properties();
    try {
      props.load(new FileInputStream(
       // "D:\\projects\\spr\\src\\tst\\msf.properties"));
      "src/tst/msf.properties"));
      String rendererClass = props.getProperty("renderer.class");
      String providerClass = props.getProperty("provider.class");
      renderer = (MessageRenderer)
        Class.forName(rendererClass).newInstance();
      provider = (MessageProvider)
        Class.forName(providerClass).newInstance();
    } catch (Exception ех) {
      ех.printStackTrace();
    }
  }

  static {
    instance = new MessageSupportFactory();
  }

  public static MessageSupportFactory getInstance() {
    return instance;
  }

  public MessageRenderer getMessageRenderer() {
    return renderer;
  }

  public MessageProvider getMessageProvider() {
    return provider;
  }
}
