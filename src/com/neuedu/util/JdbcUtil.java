package com.neuedu.util;

import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/t_s?useUnicode=true&characterEncoding=utf8";
    private static final String ROOT = "root";
    private static final String PSW = "root";

    //    加载驱动
    static {
        try {
            new Driver();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //专门获取连接 的方法  让 getConnection  参数写一次
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, ROOT, PSW);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    //    增删改 的功能 的封装  方法的定义    工具类
    public static int insert(String sql, Object... objs) {
        Connection conn = null;
        PreparedStatement pstm = null;
        int result=0;
        try {
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            for (int i = 0; i < objs.length; i++) {
                pstm.setObject(i + 1, objs[i]);
            }
            result = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(conn,pstm,null);
        }
        return result;
    }
    // 查询
    public static<T> List<T> executeQuery(String sql, RowMap<T> rowMap, Object... objs){
        List<T> lists = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstm= null;
        ResultSet rs= null;
        conn=getConnection();
        try {
            pstm=conn.prepareStatement(sql);
            for(int i=0;i<objs.length;i++){
                pstm.setObject(i+1,objs[i]);
            }
            rs= pstm.executeQuery();
            while(rs.next()){
//               拿到rs  返回出  当前类型的对象  泛型 T
                T t=rowMap.rowMapping(rs);
                lists.add(t);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  lists;
    }
    public static<T> T QueryOne(String sql, RowMap<T> rowMap, Object... objs){
        T t= null;
        Connection conn = null;
        PreparedStatement pstm= null;
        ResultSet rs= null;
        conn=getConnection();
        try {
            pstm=conn.prepareStatement(sql);
            for(int i=0;i<objs.length;i++){
                pstm.setObject(i+1,objs[i]);
            }
            rs= pstm.executeQuery();
            while(rs.next()){
//               拿到rs  返回出  当前类型的对象  泛型 T
                t=rowMap.rowMapping(rs);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  t;
    }
    //    关闭流的方法
    private static void close(Connection conn ,PreparedStatement pstm,ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstm != null) {
            try {
                pstm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static int executeupdate( String sno, String sname, Integer sage,String ssex,String drep) {
        return 0;
    }

    public static int executUpate( String sno, String sname, Integer sage,String ssex, String drep) {
        return 0;
    }

    public static int executeupdate(String s, String sname, Integer sage, String ssex, String dept, Integer sno) {
        return 0;
    }

    public static int executeupdate(String s, int sno) {
        return 0;
    }
}


