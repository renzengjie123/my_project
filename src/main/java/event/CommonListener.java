package event;


import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;

@Slf4j
public class CommonListener {

    public CommonListener() {
    }

    @PostConstruct
    public void init() {
        EventBusUtil.register(this);
    }

    @Subscribe
    public void register(CommonEvent commonEvent) {
        try {
            if (null != commonEvent.getParameterTypes()) {
                ReflectionUtil.invokeMethod(commonEvent.getTargetObject(), commonEvent.getTargetMethod(), commonEvent.getParameterTypes(), commonEvent.getArgs());
            } else {
                ReflectionUtil.invokeMethod(commonEvent.getTargetObject(), commonEvent.getTargetMethod(), commonEvent.getArgs());
            }
        } catch (Exception var3) {
            log.warn("register CommonEvent fail.", var3);
        }

    }
}
