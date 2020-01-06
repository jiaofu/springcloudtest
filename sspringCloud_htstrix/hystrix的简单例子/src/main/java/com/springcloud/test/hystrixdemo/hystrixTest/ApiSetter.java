package com.springcloud.test.hystrixdemo.hystrixTest;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommand.Setter;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.HystrixThreadPoolKey;
import com.netflix.hystrix.HystrixThreadPoolProperties;
/**
 * 调用API设置的参数或公共参数
 *
 */
public class ApiSetter {

    public static Setter setter(String commandKeyName, String threadPoolKeyName) {
        return setter("ApiGroup", commandKeyName, threadPoolKeyName);
    }

    public static Setter setter(String commandKeyName) {
        return setter(commandKeyName, "Api-Pool");
    }

    /**
     * @time 2017/12/20 16:57
     * @description     相关参数设置
     * @param groupKeyName      服务分组名
     * @param commandKeyName    服务标识名称
     * @param threadPoolKeyName 线程池名称
     * @return
     */
    public static Setter setter(String groupKeyName,String commandKeyName,String threadPoolKeyName) {
        //服务分组
        HystrixCommandGroupKey groupKey = HystrixCommandGroupKey.Factory.asKey(groupKeyName);

        //服务标识
        HystrixCommandKey commandKey = HystrixCommandKey.Factory.asKey(commandKeyName);

        //线程池名称
        HystrixThreadPoolKey threadPoolKey = HystrixThreadPoolKey.Factory.asKey(threadPoolKeyName);
        //线程配置
        HystrixThreadPoolProperties.Setter threadPoolProperties = HystrixThreadPoolProperties.Setter()
                .withCoreSize(25)
                .withKeepAliveTimeMinutes(5)
                .withMaxQueueSize(Integer.MAX_VALUE)
                .withQueueSizeRejectionThreshold(10000);


        //命令属性的配置
        HystrixCommandProperties.Setter commandProperties = HystrixCommandProperties.Setter()
                .withExecutionIsolationStrategy(HystrixCommandProperties.ExecutionIsolationStrategy.THREAD)
                .withExecutionIsolationThreadInterruptOnTimeout(true)
                .withExecutionTimeoutInMilliseconds(3000) //设置超时时间为3秒时自动熔断
                .withCircuitBreakerErrorThresholdPercentage(20);//失败率达到20%自动熔断


        //返回
        return HystrixCommand.Setter
                .withGroupKey(groupKey)
                .andCommandKey(commandKey)
                .andThreadPoolKey(threadPoolKey)
                .andThreadPoolPropertiesDefaults(threadPoolProperties)
                .andCommandPropertiesDefaults(commandProperties);

    }
}

