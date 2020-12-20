package com.wadex.common.core.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wadex.common.core.domain.ResultBody;
import com.wadex.common.core.domain.ResultEnum;

import java.util.HashMap;
import java.util.Map;

/**统一异常捕获类
 * Created by qsf on 2020/5/13.
 */
@Slf4j
@RestControllerAdvice
public class ExceptionCatch {
//    private static Logger logger = LoggerFactory.getLogger(ExceptionCatch.class);

    //定义map 配置异常所对应的错误代码, ImmutableMap的特点是一旦创建就无法改变,并且线程安全
  /*  private static ImmutableMap<Class<? extends Throwable>,ResultCodeEnum> EXCEPTION;
    //使用builder来构建异常类型和错误代码的异常
    protected static ImmutableMap.Builder<Class<? extends  Throwable>,ResultCodeEnum> builder = ImmutableMap.builder();
    static {
        builder.put(HttpMessageNotReadableException.class,ResultCodeEnum.PARAM_IS_INVALID);
    }*/
    @ExceptionHandler(value= MethodArgumentNotValidException.class)
    public ResultBody handleVaildException(MethodArgumentNotValidException e){
        log.error("数据校验出现问题{}，异常类型：{}",e.getMessage(),e.getClass());
        BindingResult bindingResult = e.getBindingResult();

        Map<String,String> errorMap = new HashMap<>();
        bindingResult.getFieldErrors().forEach((fieldError)->{
            errorMap.put(fieldError.getField(),fieldError.getDefaultMessage());
        });
        return ResultBody.failure(errorMap);
    }
    /**
     * 捕获ecmException异常
     * @param e
     * @return
     */
    @ExceptionHandler(EclmExcepition.class)
    @ResponseBody
    public ResultBody ecmException(EclmExcepition e) {
        log.error("捕获到了异常: "+e.getMessage());
        ResultEnum resultCodeEnum = e.getResultCodeEnum();
        ResultBody resultBody = ResultBody.failure(resultCodeEnum,resultCodeEnum);
        return resultBody;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBody exception(Exception e) {
        log.error("捕获到了异常: "+e.getMessage());
      /*  if(EXCEPTION == null) {
            builder.build();
        }*/
      //  final ResultCodeEnum resultCodeEnum = EXCEPTION.get(e.getClass());
        final ResultBody resultBody;
       /* if(resultCodeEnum != null) {
            resultBody = ResultBody.failure(resultCodeEnum);
        }else {
            resultBody  = new ResultBody()
        }*/
        return ResultBody.failure(ResultEnum.FAILURE);
    }

}
