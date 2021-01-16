package com.laojiubao.mall;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
class LaojiubaoMallApplicationTests {

    // 注入数据源对象
    @Autowired
    private DataSource defaultDataSource;

    @Test
    public void datasourceTest() throws SQLException {
        // 获取数据库连接对象
        Connection connection = defaultDataSource.getConnection();
        System.out.print("获取连接：");
        // 判断连接对象是否为空
        System.out.println(connection != null);
        connection.close();
    }

}
