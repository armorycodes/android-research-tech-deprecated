package com.frogobox.research.delegate

/**
 * Created by Faisal Amir on 24/10/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */


class MainDelegateImpl : MainDelegate {

    override fun getTagMainDelegate(): String {
        return MainDelegateImpl::class.java.simpleName
    }

}