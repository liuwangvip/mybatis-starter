package org.study;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.study.entity.Student3;
import org.study.mapper.Student3Mapper;
import org.study.util.SessionFactoryHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liuwang
 * @date 2018/6/30
 */
public class Student3MapperTest {
    @Test
    public void SelectOne() throws IOException {
        SqlSession sqlSession = SessionFactoryHelper.getSessionFactory().openSession();
        try {
            Student3 student =sqlSession.getMapper(Student3Mapper.class).selectOne(100);
            System.out.println(student.toString());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void SelectTwo() throws IOException {
        SqlSession sqlSession = SessionFactoryHelper.getSessionFactory().openSession();
        try {
            List<Student3> student =sqlSession.getMapper(Student3Mapper.class).selectTwo("","");
            System.out.println(student.toString());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void SelectThree() throws IOException {
        SqlSession sqlSession = SessionFactoryHelper.getSessionFactory().openSession();
        try {
            List<Student3> student =sqlSession.getMapper(Student3Mapper.class).selectThree("","");
            System.out.println(student.toString());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void SelectFour() throws IOException {
        SqlSession sqlSession = SessionFactoryHelper.getSessionFactory().openSession();
        try {
            List<Student3> student =sqlSession.getMapper(Student3Mapper.class).selectFour("","123456");
            System.out.println(student.toString());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void SelectFive() throws IOException {
        SqlSession sqlSession = SessionFactoryHelper.getSessionFactory().openSession();
        try {
            List ids = Arrays.asList(new Integer[]{100,101,102});
            List<Student3> student =sqlSession.getMapper(Student3Mapper.class).selectFive(ids);
            System.out.println(student.toString());
        } finally {
            sqlSession.close();
        }
    }

}
