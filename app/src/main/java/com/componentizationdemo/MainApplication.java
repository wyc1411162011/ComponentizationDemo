package com.componentizationdemo;

import com.component.common.base.BaseApplication;
import com.component.common.util.ZRouter;
import com.component.mail.MailMainActivity;
import com.component.mail.MainApllication;
import com.componentizationdemo.activity.MainActivity;

/**
 * Created by ufsoft on2020-11-17
 * describle:
 */
public class MainApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        ZRouter.getInstance().register("com.main", MainActivity.class);
    }
}
