package com.dimples.ui.splash;

import android.content.Context;

import com.dimples.mvp.ILifeCircle;
import com.dimples.mvp.IMvpView;
import com.dimples.mvp.MvpController;

/**
  *
  * @author zhongyj
  * @date 2019/3/28 14:42
  */
public interface ISplashActivityContract {

    /**
     * View层——视图逻辑
     */
    interface IView extends IMvpView {
        void setTvTimer(String timer);

        void pageSwitch(Context context, Class<?> cls);
    }

    /**
     * P层——业务逻辑
     */
    interface IPresenter extends ILifeCircle {
        void initTimer();
    }

    IView EMPTY_VIEW = new IView() {
        @Override
        public void setTvTimer(String timer) {

        }

        @Override
        public void pageSwitch(Context context, Class<?> cls) {

        }

        @Override
        public MvpController getMvpController() {
            return null;
        }
    };

}
