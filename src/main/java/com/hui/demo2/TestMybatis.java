package com.hui.demo2;

import java.io.InputStream;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hui.entity.User;
import com.hui.repository.UserRepository;

public class TestMybatis {
	
	public static void main(String[] args) {
        //加载 MyBatis 配置文件
        InputStream is = Test.class.getClassLoader().getResourceAsStream("mybatisConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取实现接口的代理对象
        UserRepository userRepository = sqlSession.getMapper(UserRepository.class);

        //新增用户
//        User user = new User();
//        user.setUsername("张三");
//        user.setPassword("123");
//        user.setAge(22);
//        System.out.println(userRepository.addUser(user));
//        sqlSession.commit();

//        //删除用户
//        System.out.println(userRepository.deleteUser(2));
//        sqlSession.commit();

//        //查询用户
//        User user1 = userRepository.selectUserById(1);
//        System.out.println(user1);

        //修改用户
        User user2 = userRepository.selectUserById(1);
        user2.setUsername("李四");
        System.out.println(userRepository.updateUser(user2));
        sqlSession.commit();
    }

}
