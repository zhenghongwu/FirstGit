package com.myself.zhw.text;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button start;
    private Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start= (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                CustomToast.showToast(getBaseContext(), "提示信息", 1000);//使用CustomToast能够使不断点击按钮的时候吐司提示不会重复跳出来
//                View view1= LinearLayout.inflate(MainActivity.this,R.layout.activity_main,null);
//                ToastUtil toastUtil=new ToastUtil();
//                toastUtil.setToastBackground(Color.BLUE,R.drawable.a).Short(MainActivity.this,"nihao").show();
                ToastUtil toastUtil1=new ToastUtil();//自定义的吐司提示
                toastUtil1.Short(MainActivity.this,"nihao").setToastColor(Color.BLUE,getResources().getColor(R.color.colorAccent)).show();
            }
        });
    }
}
