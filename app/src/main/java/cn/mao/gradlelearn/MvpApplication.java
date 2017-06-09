package cn.mao.gradlelearn;

import android.app.Application;

import com.mcxiaoke.packer.helper.PackerNg;

/**
 * Created by zhangkun on 2017/6/8.
 */

public class MvpApplication extends Application {

    private static MvpApplication instance;
    public static String appChannel = "UNKNOWN";

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        appChannel = PackerNg.getMarket(this, "mvp");
    }

    public static MvpApplication getInstance() {
        return instance;
    }

}
