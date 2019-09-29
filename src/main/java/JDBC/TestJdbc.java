package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * @author tingsun
 * @create 2019-09-18 14:58
 * 1、数据库连接，使用时就创建，不使用立即释放，对数据库进行频繁连接开启和关闭，造成数据库资源浪费，影响 数据库性能。
    设想：使用数据库连接池管理数据库连接。

   2、将sql语句硬编码到java代码中，如果sql 语句修改，需要重新编译java代码，不利于系统维护。
    设想：将sql语句配置在xml配置文件中，即使sql变化，不需要对java代码进行重新编译。

   3、向preparedStatement中设置参数，对占位符号位置和设置参数值，硬编码在java代码中，不利于系统维护。
    设想：将sql语句及占位符号和参数全部配置在xml中。

   4、从resutSet中遍历结果集数据时，存在硬编码，将获取表的字段进行硬编码，，不利于系统维护。
    设想：将查询的结果集，自动映射成java对象。

 */
public class TestJdbc {
    public static void main(String[] args) {

        //数据库连接
        Connection connection = null;
        //预编译的Statement，使用预编译的Statement提高数据库性能
        PreparedStatement preparedStatement = null;
        //结果 集
        ResultSet resultSet = null;

        String driver = "oracle.jdbc.driver.OracleDriver"; //驱动

        String url = "jdbc:oracle:thin:@//10.5.1.110:1521/hhdev"; //连接字符串

        String username = "pcisv7_dev"; //用户名

        String password = "123456"; //密码

        try {
            //加载数据库驱动
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
            //通过驱动管理类获取数据库链接
            //connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8", "root", "mysql");
            //connection =  DriverManager.getConnection("jdbc:oracle:thin:@10.5.1.110:1521/hhdev", "pcisv7_dev", "123456");
            //10.5.1.110:1521/hhdev
            //jdbc:oracle:thin:@localhost:1521:orcl
            //定义sql语句 ?表示占位符
            String sql = "select * from web_vhlclm_rpt where c_rpt_no = ?";
            //获取预处理statement
            preparedStatement = connection.prepareStatement(sql);
            //设置参数，第一个参数为sql语句中参数的序号（从1开始），第二个参数为设置的参数值
            preparedStatement.setString(1, "4100101000103300120150300002");
            //向数据库发出sql执行查询，查询出结果集
            resultSet =  preparedStatement.executeQuery();
            //遍历查询结果集
            while(resultSet.next()){
                System.out.println(resultSet.getString("c_rpt_id")+"  "+resultSet.getString("c_rpt_no"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //释放资源
            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
