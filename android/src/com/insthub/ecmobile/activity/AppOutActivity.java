package com.insthub.ecmobile.activity;
//
//                       __
//                      /\ \   _
//    ____    ____   ___\ \ \_/ \           _____    ___     ___
//   / _  \  / __ \ / __ \ \    <     __   /\__  \  / __ \  / __ \
//  /\ \_\ \/\  __//\  __/\ \ \\ \   /\_\  \/_/  / /\ \_\ \/\ \_\ \
//  \ \____ \ \____\ \____\\ \_\\_\  \/_/   /\____\\ \____/\ \____/
//   \/____\ \/____/\/____/ \/_//_/         \/____/ \/___/  \/___/
//     /\____/
//     \/___/
//
//  Powered by BeeFramework
//  祈求无bug！！！
//
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;

import com.insthub.BeeFramework.activity.BaseActivity;
import com.insthub.ecmobile.R;
import com.umeng.analytics.MobclickAgent;
import com.umeng.common.Log;

public class AppOutActivity extends BaseActivity {

	private ImageView bg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.appout);
		
		bg = (ImageView) findViewById(R.id.bg);
		System.out.println("onCreate()");
		Log.e("AppOutActivity", "onCreate");
		Intent intent = getIntent();
		int flag = intent.getIntExtra("flag", 0);
		if(flag == 1) {
			bg.setBackgroundResource(R.drawable.closed);
		} else if(flag == 2) {
			bg.setBackgroundResource(R.drawable.expired_568h);
		}
		
	}
	
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {                
        return true;
    }
}
