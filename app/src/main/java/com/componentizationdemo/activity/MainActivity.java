package com.componentizationdemo.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.component.common.base.BaseActivity;
import com.component.mail.MailMainActivity;
import com.componentizationdemo.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt_mail).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.mail.main");
                startActivity(intent);
//                Intent intent1 = new Intent(context, MailMainActivity.class);
//                startActivity(intent1);
            }
        });

    }
}
