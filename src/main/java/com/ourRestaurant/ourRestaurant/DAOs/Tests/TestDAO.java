package com.ourRestaurant.ourRestaurant.DAOs.Tests;

import com.ourRestaurant.ourRestaurant.DTOs.Tests.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;

@Repository
public class TestDAO {

    @Autowired
    private SqlSession sqlSession;

    public TestDTO selectTest(){
        return sqlSession.selectOne("test.getTest");
    }
}
