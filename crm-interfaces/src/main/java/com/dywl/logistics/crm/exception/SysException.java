package com.dywl.logistics.crm.exception;

import com.dywl.base.exception.BaseException;

/**
 * @author 陈世峰
 */
public class SysException extends BaseException {

    public SysException() {
        super();
    }

    public SysException(String message) {
        super(message);
    }

    public SysException(String businessCode, String message) {
        super(businessCode, message);
    }

    public SysException(String businessCode, String message, String... i18nMsg) {
        super(businessCode, message, i18nMsg);
    }
}
