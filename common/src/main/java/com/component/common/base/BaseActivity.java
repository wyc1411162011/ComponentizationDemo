package com.component.common.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;

/**
 * Created by ufsoft on2020-11-17
 * describle:
 */
public class BaseActivity extends Activity {
    public Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.context = this;
    }
}
