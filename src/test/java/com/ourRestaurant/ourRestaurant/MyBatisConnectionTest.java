package com.ourRestaurant.ourRestaurant;

import org.apache.ibatis.session.SqlSessionFactory;
import org.assertj.core.internal.bytebuddy.build.BuildLogger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;

@SpringBootTest
public class MyBatisConnectionTest {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void Connection_test(){
        try(Connection con = sqlSessionFactory.openSession().getConnection()){
            System.out.println("mysql-mybatis Connection Succeed");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}