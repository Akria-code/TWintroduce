package com.wm.twintroduce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mUserNameEt,mPwdEt;
    private CheckBox mIscheckedCb;
    private Button mLoginBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mIscheckedCb=findViewById(R.id.checkBox);
        mUserNameEt=findViewById(R.id.user_name);
        mPwdEt=findViewById(R.id.pass_word);

        SharedPreferences sp=getSharedPreferences("info",MODE_PRIVATE);
        String userName=sp.getString("uesrname",null);
        String password=sp.getString("pwd",null);
        if (!TextUtils.isEmpty(userName)){
            mUserNameEt.setText(userName);
        }
        if (!TextUtils.isEmpty(password)){
            mPwdEt.setText(password);
        }
    }
}