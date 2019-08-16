package net.devwiki.devwiki.module.thread;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.devwiki.devwiki.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * UI相关
 * Created by zyz on 2017/3/21.
 */

public class ThreadFragment extends Fragment {

    public static ThreadFragment newInstance() {
        return new ThreadFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_thread, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R.id.rxj_java_btn})
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.rxj_java_btn:
                break;
                default:
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
