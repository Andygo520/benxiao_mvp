package com.cnmar.benxiao_mvp.service.presenter;

import android.content.Context;
import android.content.Intent;

import com.cnmar.benxiao_mvp._Url;
import com.cnmar.benxiao_mvp.component.system.model.SystemUser;
import com.cnmar.benxiao_mvp.service.retrofit.Api;
import com.cnmar.benxiao_mvp.service.retrofit.RxHelper;
import com.cnmar.benxiao_mvp.service.retrofit.RxSubscriber;
import com.cnmar.benxiao_mvp.service.view.IView;
import com.cnmar.benxiao_mvp.service.view.LoginView;

import com.cnmar.benxiao_mvp.utils.UniversalHelper;

import static com.cnmar.benxiao_mvp.component.common.vo.IsEnableVo.T;


/**
 * Created by Administrator on 2017/7/10.
 */

public class LoginPresenter implements IPresenter {
    private LoginView loginView;
    private Context context;

    public LoginPresenter(Context context) {
        this.context = context;
    }

    @Override
    public void onCreate() {
    }

    @Override
    public void onStop() {

    }

    @Override
    public void attachView(IView view) {
        this.loginView = (LoginView) view;
    }

    public void login(String name, String password) {
        String token = UniversalHelper.getToken(_Url.LOGIN);
        Api.getDefault().login(name, password, token)
                .compose(RxHelper.<SystemUser>handleResult())
                .subscribe(new RxSubscriber<SystemUser>(context) {
                    @Override
                    protected void _onNext(SystemUser systemUser) {
                        loginView.onNext(systemUser);
                    }

                    @Override
                    protected void _onError(String message) {
                        loginView.onError(message);
                    }
                });
    }
}
