package net.devwiki.devwiki.widget;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;

import net.devwiki.devwiki.R;

public class BaseActivity extends AppCompatActivity {

    private static final String TAG = "BaseActivity";

    Toolbar mToolbar;
    FrameLayout mContentFl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        if (layoutResID == R.layout.activity_base) {
            super.setContentView(layoutResID);
            mContentFl = this.findViewById(R.id.content_fl);
            mToolbar = this.findViewById(R.id.toolbar);
            setSupportActionBar(mToolbar);
            mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onNavBackClick();
                }
            });
            mContentFl.removeAllViews();
        } else {
            View view = View.inflate(this, layoutResID, null);
            mContentFl.addView(view);
        }
    }

    protected void onNavBackClick() {
        finish();
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
