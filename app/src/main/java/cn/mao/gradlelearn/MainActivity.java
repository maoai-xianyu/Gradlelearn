package cn.mao.gradlelearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.socks.library.KLog;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tv_show_version)
    TextView tvShowVersion;
    @BindView(R.id.tv_show_api_url)
    TextView tvShowApiUrl;
    @BindView(R.id.tv_show_application_id)
    TextView tvShowApplicationId;
    @BindView(R.id.tv_show_version_name)
    TextView tvShowVersionName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvShowVersion.setText(getString(R.string.app_name));
        if (BuildConfig.LOG_HTTP_CALLS) {
            tvShowApiUrl.setText(String.valueOf("版本 " + BuildConfig.API_URL));
            if (BuildConfig.DEBUG) {
                tvShowApplicationId.setText(String.valueOf("版本id debug  " + BuildConfig.APPLICATION_ID));
                tvShowApplicationId.setTextColor(getResources().getColor(R.color.flavor_color));
                tvShowVersionName.setText(String.valueOf("版本name debug  " + BuildConfig.VERSION_NAME));
            } else {
                tvShowApplicationId.setText(String.valueOf("版本id stage  " + BuildConfig.APPLICATION_ID));
                tvShowVersionName.setText(String.valueOf("版本name stage  " + BuildConfig.VERSION_NAME));
            }

        } else {
            tvShowApiUrl.setText(String.valueOf("release版本 " + BuildConfig.API_URL));
            tvShowApplicationId.setText(String.valueOf("release版本id " + BuildConfig.APPLICATION_ID));
            tvShowVersionName.setText(String.valueOf("release版本name " + BuildConfig.VERSION_NAME));
        }

        KLog.d("Inner Class Test");

        KLog.d("这是测试");
        KLog.e("这是测试");
        KLog.i("这是测试");
        KLog.w("这是测试");
        KLog.a("这是测试");
        KLog.debug("这是测试");

    }
}

