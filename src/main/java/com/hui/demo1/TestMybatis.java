package com.hui.demo1;

import java.io.InputStream;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hui.entity.User;

public class TestMybatis {
	
	public static void main(String[] args) {
        //加载 MyBatis 配置文件
        InputStream is = Test.class.getClassLoader().getResourceAsStream("mybatisConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //调用 MyBatis 原生接口执行 SQL
        //statement 为 UserMapper.xml 的 namespace 值+"."+select 标签的 id 值
        String statement = "com.hui.mapper.UserMapper.get";
        User user = sqlSession.selectOne(statement , 1);
        System.out.println(user);
      }

}
