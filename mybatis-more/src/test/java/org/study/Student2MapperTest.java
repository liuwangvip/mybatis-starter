package org.study;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.study.entity.Course;
import org.study.entity.Student2;
import org.study.util.SessionFactoryHelper;

import java.io.IOException;
import java.util.List;

/**
 * @author liuwang
 * @date 2018/6/30
 */
public class Student2MapperTest {
    @Test
    /**
     * 关联嵌套查询 两条sql
     */
    public void testSelectA() throws IOException {
        SqlSession sqlSession = SessionFactoryHelper.getSessionFactory().openSession();
        try {
            Student2 student = sqlSession.selectOne("selectA", 100);
            Course course = student.getCourse();
            System.out.println(student.toString());
        } finally {
            sqlSession.close();
        }
    }


    @Test
    /**
     * 关联查询，执行一条sql ，success
     */
    public void testSelectB() throws IOException {
        SqlSession sqlSession = SessionFactoryHelper.getSessionFactory().openSession();
        try {
            Student2 student = sqlSession.selectOne("selectB", 100);
            Course course = student.getCourse();
            System.out.println(student.toString());
        } finally {
            sqlSession.close();
        }
    }


    @Test
    /**
     * 一对多collection 查询，执行两条sql，success
     */
    public void testSelectC() throws IOException {
        SqlSession sqlSession = SessionFactoryHelper.getSessionFactory().openSession();
        try {
            Student2 student = sqlSession.selectOne("selectC", 101);
            Course course = student.getCourse();
            List<Course> courses = student.getCourses();
            System.out.println(student.toString());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    /**
     * 一对多collection，执行一条sql success
     */
    public void testSelectD() throws IOException {
        SqlSession sqlSession = SessionFactoryHelper.getSessionFactory().openSession();
        try {
            Student2 student = sqlSession.selectOne("selectD", 101);
            Course course = student.getCourse();
            List<Course> courses = student.getCourses();
            System.out.println(student.toString());
        } finally {
            sqlSession.close();
        }
    }

}
