package com.layout.hello.util;

import com.layout.hello.constants.ErrorCode;
import com.layout.hello.dto.StandardResponseDTO;

/**
 * @author JerisonPaul
 * @date 2023/8/24 下午11:29
 */
public class HttpResponseUtil {
    public static StandardResponseDTO success(int code, Object data) {
        return new StandardResponseDTO<>(code, data);
    }

    public static StandardResponseDTO success(Object data) {
        return success(200, data);
    }

    public static StandardResponseDTO success(int code) {
        return success(code, null);
    }

    public static StandardResponseDTO success() {
        return success(200, null);
    }

    public static StandardResponseDTO error(ErrorCode errorCodeEnum) {
        return new StandardResponseDTO<>(errorCodeEnum.code(), errorCodeEnum.getMsg(), null);
    }

    public static StandardResponseDTO error(int code, String msg) {
        return new StandardResponseDTO<>(code, msg, null);
    }
}
