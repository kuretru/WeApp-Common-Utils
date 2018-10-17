package com.jhkj.weapp.common.controller;

import com.jhkj.weapp.common.exception.AdminUnauthenticatedException;
import com.jhkj.weapp.common.exception.MissingParametersException;
import com.jhkj.weapp.common.exception.UserUnauthenticatedException;
import com.jhkj.weapp.common.util.PojoUtils;
import com.jhkj.weapp.common.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public class BaseController {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;

    private static final String UNKNOWN_ADDRESS = "unknown";
    protected String remoteAddress = UNKNOWN_ADDRESS;

    private static ThreadLocal<Long> adminId = ThreadLocal.withInitial(() -> -1L);
    private static ThreadLocal<Long> userId = ThreadLocal.withInitial(() -> -1L);

    @ModelAttribute
    public void init(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.session = request.getSession();
        setRemoteAddress();
    }

    protected void verifyUser(long userId) throws UserUnauthenticatedException {
        if (BaseController.userId.get().equals(userId)) {
            throw new UserUnauthenticatedException("用户令牌与操作的用户不匹配");
        }
    }

    protected void verifyAdmin(long adminId) throws AdminUnauthenticatedException {
        if (BaseController.adminId.get().equals(adminId)) {
            throw new AdminUnauthenticatedException("管理员令牌与操作的管理员不匹配");
        }
    }

    protected void checkRequiredParameters(Object dto) throws MissingParametersException {
        List<String> requiredParameters = PojoUtils.checkRequiredParameters(dto);
        if (!requiredParameters.isEmpty()) {
            throw new MissingParametersException(requiredParameters);
        }
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

    public long getUserId() {
        return userId.get();
    }

    public void setUserId(long userId) {
        BaseController.userId.set(userId);
    }

    public long getAdminId() {
        return adminId.get();
    }

    public void setAdminId(long adminId) {
        BaseController.adminId.set(adminId);
    }

}
