package com.cnmar.benxiao_mvp.service.view;

import com.cnmar.benxiao_mvp.component.system.model.SystemUser;

/**
 * Created by Administrator on 2017/7/10.
 */

public interface LoginView extends IView {
    void onNext(SystemUser systemUser);
    void onError(String message);
}
