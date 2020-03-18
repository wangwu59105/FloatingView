package com.wangtao.floatingview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.release.floatingview.FloatRootView;
import com.release.floatingview.FloatView;
import com.release.floatingview.FloatingManage;
import com.release.floatingview.listener.FloatClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FloatingManage floatingManage = new FloatingManage(this);
        floatingManage.toast("点击领取资料").add();

        floatingManage.getView().setFloatClickListener(new FloatClickListener() {
            @Override
            public void onClick(FloatRootView magnetView) {
                FloatView floatView = (FloatView) magnetView;
                floatView.check(false);
                floatingManage.userToastDialog();
            }
        });
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                floatingManage.visibility(View.GONE);
            }
        });
    }
}
