package org.study.util;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
/**
 * @author liuwang
 * @date 2018/6/30
 */
public class SessionFactoryHelper {
    private SessionFactoryHelper(){
        throw new RuntimeException("class can not instances");
    }
    private static SqlSessionFactory sqlSessionFactory = null;
    final static String resource = "mybatis-config.xml";
    public static SqlSessionFactory getSessionFactory() throws IOException {
        if (sqlSessionFactory == null) {
            synchronized (SqlSessionFactory.class) {
                if (sqlSessionFactory == null) {
                    InputStream inputStream = Resources.getResourceAsStream(resource);
                    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
                }
            }
        }
        return sqlSessionFactory;
    }
}
