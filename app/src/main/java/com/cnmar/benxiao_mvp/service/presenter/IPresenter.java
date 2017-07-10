package com.cnmar.benxiao_mvp.service.presenter;

import com.cnmar.benxiao_mvp.service.view.IView;

/**
 * Created by Administrator on 2017/7/10.
 */
/*
 * presenter主要用于网络的请求以及数据的获取
 * */
public interface IPresenter {
    void onCreate();

    void onStop();

    void attachView(IView view);//将Presenter与View进行绑定，保证Presenter持有View的引用
}
