package com.haeyden.utils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 管理连接的工具类,用于实现连接和线程绑定
 */
public class ConnectionUtil {
    private ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getThreadConnection() {
        try {
//1.先看看线程上是否绑了
            Connection conn = tl.get();
            if (conn == null) {
//2.从数据源中获取一个连接
                conn = dataSource.getConnection();
//3.和线程局部变量绑定
                tl.set(conn);
            }
//4.返回线程上的连接
            return tl.get();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(){
        tl.remove();
    }

}
