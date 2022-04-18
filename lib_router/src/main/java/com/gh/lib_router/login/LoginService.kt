package com.gh.lib_router.login

import com.alibaba.android.arouter.facade.template.IProvider

/**
 * @author: gh
 * @description:
 * @date: 2022/4/14.
 * @from:
 */
interface LoginService : IProvider {

    fun isLogin(): Boolean

}