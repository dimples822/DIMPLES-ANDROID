package com.dimples.http.request;

import com.dimples.http.annotation.RequestMethod;
import com.dimples.http.request.host.IHost;

import java.util.Map;

/**
 * @author zhongyj
 * @date 2019/3/27 20:51
 */
public class HttpRequest implements IRequest {

    protected IHost host;

    private Map<String, Object> params;

    @RequestMethod
    protected int requestMethod;

    protected String path;

    @Override
    public int getRequestMethod() {
        return requestMethod;
    }

    @Override
    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    @Override
    public Map<String, Object> getParams() {
        return params;
    }

    @Override
    public IHost getHost() {
        return host;
    }

    @Override
    public String getPath() {
        return path;
    }

}











