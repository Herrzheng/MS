package com.wind.config;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    public Object getProxy(Object obj){
      return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
              obj.getClass().getInterfaces(),
                this);
    };

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(method,args);
    }
}
