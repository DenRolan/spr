package tst.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tst.MessageProvider;
import tst.MessageRenderer;

/**
 * Created by r.denishev on 15.09.2017.
 */
@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {
  private MessageProvider messageProvider;

  @Override
  public void render() {
    if (messageProvider == null)
      throw new RuntimeException(
        "You must set the property messageProvider of class:"
          + StandardOutMessageRenderer.class.getName());
// Вы должны установить свойство messageProvider класса
    System.out.println(messageProvider.getMessage());
  }

  @Override
  @Autowired
  public void setMessageProvider(MessageProvider provider) {
    this.messageProvider = provider;
  }

  @Override
  public MessageProvider getMessageProvider() {
    return this.messageProvider;
  }
}