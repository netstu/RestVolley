/*
 * PatchRequest      2015-11-25
 * Copyright (c) 2015 hujiang Co.Ltd. All right reserved(http://www.hujiang.com).
 * 
 */

package com.hujiang.restvolley2.webapi.request;

import android.content.Context;

import com.android.volley.Request;

/**
 * Path method request.
 *
 * @author simon
 * @version 1.0.0
 * @since 2015-11-25
 */
public class PatchRequest extends RVRequestWithBody<PatchRequest> {

    /**
     * constructor.
     * @param context {@link Context}
     */
    public PatchRequest(Context context) {
        super(context, Request.Method.PATCH);
    }
}