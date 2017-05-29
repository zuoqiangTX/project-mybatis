import com.zuoqiang.dao.UserDao;
import com.zuoqiang.entity.Article;
import com.zuoqiang.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;


/**
 * Created by ZUO on 2017/5/28.
 */
public class UserDaoTest {
    @Test
    public void findByName(){
        SqlSession sqlSession = getSessionFactory().openSession();
        try {
            UserDao userMapper = sqlSession.getMapper(UserDao.class);
            String name="qiang";
            List<User> userList=userMapper.findByName(name);
            for (User user : userList) {
                System.out.println(user.getAge());
            }
        } finally {

        }
    }
    @Test
    public void findUserById() {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        User user = userMapper.findById(1);
        if (user != null) {
            System.out.println(user.getName());
        }
        Assert.assertNotNull("no data", user);
    }

    @Test
    public void findAll(){
        SqlSession sqlSession=getSessionFactory().openSession();
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        List<User> user=userDao.findAllUsers();
        for (User u : user) {
            System.out.println(u.getName());
        }
        Assert.assertNotEquals(5, user.size());
    }

//    @Test
    public void insert(){
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        User inserUser=new User();
        inserUser.setName("liwenzhe");
        inserUser.setAge(23);
        inserUser.setPassword("123456");
        inserUser.setDeleteFlag(0);
        userMapper.insertUser(inserUser);
        //提交事务
        sqlSession.commit();
        sqlSession.close();

    }
 //       @Test
    public void updateUser(){
        SqlSession sqlSession = getSessionFactory().openSession();
            try {
                UserDao userMapper = sqlSession.getMapper(UserDao.class);
                User updateUser=new User();
                updateUser.setId(6);
                updateUser.setName("lwz");
                updateUser.setAge(23);
                updateUser.setPassword("123456");
                updateUser.setDeleteFlag(0);
                userMapper.UpdateUser(updateUser);
                //提交事务
                sqlSession.commit();
            } finally {
                sqlSession.close();

            }
    }
    @Test
    public void resultUserArticleList(){
        SqlSession sqlSession = getSessionFactory().openSession();
        try {
            UserDao userMapper = sqlSession.getMapper(UserDao.class);
            int id=1;
            List<Article> articleList=userMapper.resultUserArticleList(id);
            for (Article article : articleList) {
                System.out.println(article.getTitle());
            }
        } finally {
            sqlSession.close();

        }
    }
 //   @Test
    public void deleteUser(){
        SqlSession sqlSession = getSessionFactory().openSession();
        try {
            UserDao userMapper = sqlSession.getMapper(UserDao.class);
            String deleteName="lwz";
            userMapper.deleteUser(deleteName);
            //提交事务
            sqlSession.commit();
        } finally {
            sqlSession.close();

        }
    }
    private static SqlSessionFactory getSessionFactory() {
       SqlSessionFactory sqlSessionFactory=null;
        String resource="configuration.xml";
        try {
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSessionFactory;
    }
}
