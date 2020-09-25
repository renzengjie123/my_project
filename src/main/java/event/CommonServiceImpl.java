package event;

import event.entity.User;

public class CommonServiceImpl implements CommonService{
    @Override
    public void getData(User user) {
        System.out.println("用户信息: " + user.toString());
    }
}
