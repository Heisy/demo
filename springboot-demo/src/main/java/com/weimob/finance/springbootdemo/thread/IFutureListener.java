package com.weimob.finance.springbootdemo.thread;

public abstract class IFutureListener<V> {

    public abstract void operationCompleted(IFuture<V> future) throws Exception;
}
