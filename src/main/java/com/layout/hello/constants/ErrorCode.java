package com.layout.hello.constants;

/**
 * @author JerisonPaul
 * @date 2023/8/24 下午11:31
 */
public enum ErrorCode {

    UNAUTHORIZED(401, "认证失败, 拒绝访问"),
    TOKENEXPIRED(403, "token过期"),
    PARSEEXCEPTION(403, "token解析异常"),
    SIGNATUREFAILED(403, "签名失败"),
    NOT_FOUND(404, "找不到资源"),
    CANNOT_ACCESS_DATABASE(500, "连接不到数据库"),
    NULL_POINTER_EXCEPTION(500, "空指针异常"),
    IO_EXCEPTION(500, "IO异常"),
    UNKNOWN_EXCEPTION(500, "未明确的异常"),
    SERVICE_EXCEPTION(500, "服务异常"),
    OTHER_EXCEPTION(500, ""),
    ILLEGAL_PARAMETER_EXCEPTION(1000, "参数校验失败"),

    USERDOESNOTEXIST(10201, "用户不存在"),
    NOPERMISSION(10202, "暂无权限访问"),
    LOGICCHECK(10300, "条件不足");

    private final int code;
    private final String msg;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int code() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    @Override
    public String toString() {
        return "ErrorCodeEnum{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

}
