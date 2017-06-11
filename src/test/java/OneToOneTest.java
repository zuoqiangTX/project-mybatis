import com.zuoqiang.dao.PersonMapper;
import com.zuoqiang.entity.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by ZUO on 2017/6/11.
 * 测试Mybatis的一对一关系
 * 一个人只有一个身份证
 */
public class OneToOneTest {

    @Test
    public void test1(){
        PersonMapper personMapper=getSession().getMapper(PersonMapper.class);
        Person person=personMapper.selectPersonById(1);
        System.out.println(person.getName()+":"+person.getCard().getCode());

    }
    private static SqlSession getSession() {
        SqlSessionFactory sqlSessionFactory=null;
        SqlSession SqlSession=null;
        String resource="configuration.xml";
        try {
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSession=sqlSessionFactory.openSession();
        return SqlSession;
    }
}
