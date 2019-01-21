package tst.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by r.denishev on 21.09.2017.
 */
@Component("injectSimpleConfig")
public class InjectSimpleConfig {
    private String name = "John Smith";
    private int age = 35;
    private float height = 1.78f;
    private boolean programmer = true;
    private Long ageinSeconds = 1103760000L;
}
