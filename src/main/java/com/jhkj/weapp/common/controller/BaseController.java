package com.jhkj.weapp.common.controller;

import com.jhkj.weapp.common.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public class BaseController {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;

    private static final String UNKNOWN_ADDRESS = "unknown";
    protected String remoteAddress = UNKNOWN_ADDRESS;

    @ModelAttribute
    public void init(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.session = request.getSession();
        setRemoteAddress();
    }

    private void setRemoteAddress() {
        // 1.先尝试取X-Forwarded-For
        String ip = request.getHeader("X-Forwarded-For");
        if (unresolvedAddress(ip)) {
            // 2.尝试取X-Real-IP
            ip = request.getHeader("X-Real-IP");
        } else {
            int index = ip.indexOf(",");
            // 取第一个地址
            if (index != -1) {
                ip = ip.substring(0, index);
            }
        }
        if (unresolvedAddress(ip)) {
            // 3.取其他的头
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (unresolvedAddress(ip)) {
            // 4.取RemoteAddr
            ip = request.getRemoteAddr();
        }
        remoteAddress = "0:0:0:0:0:0:0:1".equals(ip) ? "127.0.0.1" : ip;
    }

    private boolean unresolvedAddress(String address) {
        return StringUtils.isNullOrEmpty(address) || UNKNOWN_ADDRESS.equals(address);
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

}
