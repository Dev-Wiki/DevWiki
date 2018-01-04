package net.devwiki.devwiki.module.view.i18n;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import net.devwiki.devwiki.R;

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

    @OnClick(R.id.get_result_btn)
    public void onViewClicked() {
        mResultTv.append("getCountry:" + getResources().getConfiguration().locale.getCountry() + "\n");
        mResultTv.append("getDisplayCountry:" + getResources().getConfiguration().locale.getDisplayCountry() + "\n");
        mResultTv.append("getISO3Country:" + getResources().getConfiguration().locale.getISO3Country() +
                "\n");
        mResultTv.append("getISO3Language:" + getResources().getConfiguration().locale.getISO3Language() +
                "\n");
    }
}
