import com.zuoqiang.dao.ClazzMapper;
import com.zuoqiang.dao.StudentMapper;
import com.zuoqiang.entity.Clazz;
import com.zuoqiang.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by ZUO on 2017/6/11.
 *   Mybatis一对多
 *   一个班级有多个学生
 */
public class OneToManyTest {
    @Test
    public void test1(){
        ClazzMapper clazzMapper=getSession().getMapper(ClazzMapper.class);
        Clazz clazz=clazzMapper.selectClazzById(1);
        System.out.println(clazz);
        List<Student> list=clazz.getStudents();
        for (Student student : list) {
            System.out.println(student.getName());
            
        }

    }
    @Test
    public void test2(){
        StudentMapper studentMapper=getSession().getMapper(StudentMapper.class);
        Student student=studentMapper.selectStudentById(1);
        System.out.println(student);
        System.out.println(student.getClazz());


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
