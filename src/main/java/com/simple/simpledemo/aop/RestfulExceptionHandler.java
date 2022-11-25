package com.simple.simpledemo.aop;

import com.alibaba.fastjson.JSONException;
import com.fasterxml.jackson.core.JsonParseException;
import com.simple.simpledemo.enumeration.BusiCodeEnum;
import com.simple.simpledemo.exception.CustomMessageException;
import com.simple.simpledemo.vo.BaseResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.util.ObjectUtils;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.security.auth.login.AccountException;
import java.io.IOException;
import java.sql.SQLException;

@Slf4j
@RestControllerAdvice
public class RestfulExceptionHandler {

    private BaseResponseVO responseData(Integer code, Exception e) {
        BusiCodeEnum busiCodeEnum = BusiCodeEnum.getBusiCodeEnumByCode(code);
        log.error("异常代码:{},异常描述:{},异常堆栈:", code, busiCodeEnum.getReasonPhrase(), e);
        if (ObjectUtils.isEmpty(e.getCause()) || ObjectUtils.isEmpty(e.getCause().getMessage())) {
            return new BaseResponseVO(busiCodeEnum.value(), String.format(busiCodeEnum.getReasonPhrase(), e.getClass().getName(), e.getMessage()));
        }
        return new BaseResponseVO(busiCodeEnum.value(), String.format(busiCodeEnum.getReasonPhrase(), e.getClass().getName(), e.getCause().getMessage()));
    }

    private BaseResponseVO responseData(Integer code, String message, Exception e) {
        log.error("异常代码:{},异常描述:{},异常堆栈:", code, message, e);
        return new BaseResponseVO(code, message);
    }

    /**
     * 运行时异常
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler(Exception.class)
    public BaseResponseVO runtimeExceptionHandler(Exception e) {
        return responseData(BusiCodeEnum.SERVER_ERROR.value(), e);
    }


    /**
     * 处理CustomerMessageException
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler(CustomMessageException.class)
    public BaseResponseVO customerMessageException(CustomMessageException e) {
        return responseData(BusiCodeEnum.SERVER_ERROR.value(), e.getMessage(), e);
    }


    /**
     * 处理SQLSyntaxErrorException
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler(SQLException.class)
    public BaseResponseVO sqlException(SQLException e) {
        return responseData(BusiCodeEnum.SQL_EXECUTE_ERR.value(), e.getMessage(), e);
    }

    /**
     * 处理AccountException
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler(AccountException.class)
    public BaseResponseVO accountException(AccountException e) {
        return responseData(BusiCodeEnum.ACCOUNT_EXCEPTION.value(), e.getMessage(), e);
    }


    //---------------------------------------jdk/spring自带的异常----------------------------------

    /**
     * 处理IllegalArgumentException
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public BaseResponseVO illegalArgumentException(IllegalArgumentException e) {
        return responseData(BusiCodeEnum.SERVER_ERROR.value(), e.getMessage(), e);
    }

    /**
     * 空指针异常
     *
     * @param e 异常
     * @return
     */
    @ResponseStatus
    @ExceptionHandler(NullPointerException.class)
    public BaseResponseVO nullPointerExceptionHandler(NullPointerException e) {
        return responseData(BusiCodeEnum.NULL_POINTER_EXCEPTION.value(), e);
    }

    /**
     * 类型转换异常
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler(ClassCastException.class)
    public BaseResponseVO classCastExceptionHandler(ClassCastException e) {
        return responseData(BusiCodeEnum.SERVER_ERROR.value(), e);
    }

    /**
     * IO异常
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler(IOException.class)
    public BaseResponseVO iOExceptionHandler(IOException e) {
        return responseData(BusiCodeEnum.SERVER_ERROR.value(), e);
    }

    /**
     * 未知方法异常
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler(NoSuchMethodException.class)
    public BaseResponseVO noSuchMethodExceptionHandler(NoSuchMethodException e) {
        return responseData(BusiCodeEnum.SERVER_ERROR.value(), e);
    }

    /**
     * 数组越界异常
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler(IndexOutOfBoundsException.class)
    public BaseResponseVO indexOutOfBoundsExceptionHandler(IndexOutOfBoundsException e) {
        return responseData(BusiCodeEnum.SERVER_ERROR.value(), e);
    }

    /**
     * 请求body缺失异常
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler({HttpMessageNotReadableException.class})
    public BaseResponseVO requestNotReadable(HttpMessageNotReadableException e) {
        return responseData(BusiCodeEnum.SERVER_ERROR.value(), e);
    }

    /**
     * 类型匹配异常
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler({TypeMismatchException.class})
    public BaseResponseVO requestTypeMismatch(TypeMismatchException e) {
        return responseData(BusiCodeEnum.SERVER_ERROR.value(), e);
    }

    /**
     * 方法不支持异常
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    public BaseResponseVO methodNotSupported(HttpRequestMethodNotSupportedException e) {
        return responseData(BusiCodeEnum.SERVER_ERROR.value(), e);
    }

    /**
     * 请求头不支持异常
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler({HttpMediaTypeNotSupportedException.class})
    public BaseResponseVO mediaTypeNotAcceptable(HttpMediaTypeNotSupportedException e) {
        return responseData(BusiCodeEnum.SERVER_ERROR.value(), e);
    }

    /**
     * 参数解析异常
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler(JSONException.class)
    public BaseResponseVO runtimeExceptionHandler(JSONException e) {
        return responseData(BusiCodeEnum.SERVER_ERROR.value(), e);
    }

    /**
     * 参数解析异常
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler(JsonParseException.class)
    public BaseResponseVO runtimeExceptionHandler(JsonParseException e) {
        return responseData(BusiCodeEnum.SERVER_ERROR.value(), e);
    }

    /**
     * 请求参数缺失异常
     *
     * @param e 异常
     * @return
     */

    @ExceptionHandler({MissingServletRequestParameterException.class})
    public BaseResponseVO requestMissingServletRequest(MissingServletRequestParameterException e) {
        return responseData(BusiCodeEnum.SERVER_ERROR.value(), e);
    }

    /**
     * 参数不能为空
     *
     * @param e 异常
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseResponseVO exceptionHandler(MethodArgumentNotValidException e) {
        return responseData(BusiCodeEnum.SERVER_ERROR.value(), e);
    }
}
