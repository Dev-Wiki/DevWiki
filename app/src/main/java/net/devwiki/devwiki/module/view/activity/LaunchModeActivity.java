package net.devwiki.devwiki.module.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import net.devwiki.devwiki.R;
import net.devwiki.log.DevLog;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 启动模式
 * Created by zyz on 2017/6/23.
 */

public class LaunchModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_mode);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        DevLog.d("taskId:" + getTaskId());
    }

    @OnClick({R.id.standard_btn, R.id.task_btn, R.id.top_btn, R.id.instance_btn})
    public void onViewClicked(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.standard_btn:
                intent = new Intent(this, StandardActivity.class);
                break;
            case R.id.task_btn:
                intent = new Intent(this, SingleTaskActivity.class);
                break;
            case R.id.top_btn:
                intent = new Intent(this, SingleTopActivity.class);
                break;
            case R.id.instance_btn:
                intent = new Intent(this, SingleInstanceActivity.class);
                break;
            default:
                DevLog.w("未处理的点击事件:" + view.getId());
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
