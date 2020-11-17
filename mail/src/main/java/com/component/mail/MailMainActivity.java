package com.component.mail;


import android.os.Bundle;
import android.view.View;

import com.component.common.base.BaseActivity;
import com.component.common.util.ZRouter;

public class MailMainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_main);
        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ZRouter.getInstance().startActivity(MailMainActivity.this,"com.main");
            }
        });
    }
}
