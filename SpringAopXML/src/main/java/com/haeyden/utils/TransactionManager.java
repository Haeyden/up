package com.haeyden.utils;

public class TransactionManager {
    private ConnectionUtil connectionUtils;

    public void setConnectionUtils(ConnectionUtil connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    public void beginTranscaction(){
        //从当前线程获取连接,实现开启事务
//        connectionUtils.getTraeadConnection().setAutoCommit(false);
    }

}
