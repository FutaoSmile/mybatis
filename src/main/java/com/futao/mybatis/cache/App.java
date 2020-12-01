package com.futao.mybatis.cache;

import com.futao.mybatis.cache.entity.TempEntity;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

@Slf4j
public class App {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sessionFactory.openSession();
        TempEntity tempEntity = (TempEntity) sqlSession.selectOne("com.futao.mybatis.cache.dao.TempDap.byId", "1");
    }
}
