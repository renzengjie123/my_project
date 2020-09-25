package event;

import event.entity.User;

public class CommonEventTest {

    public static void main(String[] args){
        CommonService commonService = new CommonServiceImpl();
        CommonListener listener = new CommonListener();
        User user = new User();
        user.setId("1");
        user.setName("小明");
        user.setSex("0");
        CommonEvent commonEvent = new CommonEvent(commonService, "getData", new Object[]{user});
        EventBusUtil.post(commonEvent);
    }
}
