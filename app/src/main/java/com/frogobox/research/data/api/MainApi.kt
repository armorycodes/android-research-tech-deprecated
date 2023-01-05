package com.frogobox.research.data.api

/**
 * Created by Faisal Amir on 24/10/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

interface MainApi {

    // TODO : Add your code here

    class Creator {
        fun newInstance(baseUrl: String): MainApi {
            return ApiService.create(baseUrl)
        }
    }

}