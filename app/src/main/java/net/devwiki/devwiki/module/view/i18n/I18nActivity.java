package net.devwiki.devwiki.module.view.i18n;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.devwiki.devwiki.R;
import net.devwiki.devwiki.utils.LanguageUtil;
import net.devwiki.log.DevLog;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class I18nActivity extends AppCompatActivity {

    @BindView(R.id.result_tv)
    TextView mResultTv;
    @BindView(R.id.get_result_btn)
    Button mGetResultBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i18n);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.get_result_btn, R.id.change_en_btn, R.id.change_zh_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.get_result_btn:
                mResultTv.setText(Locale.getDefault().getLanguage());
                break;
            case R.id.change_en_btn:
                LanguageUtil.changeLanguage(new Locale("en"));
                break;
            case R.id.change_zh_btn:
                LanguageUtil.changeLanguage(new Locale("zh"));
                break;
            default:
                DevLog.d();
        }
    }
}
