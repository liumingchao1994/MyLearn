import com.zhaoyan.StartUpApplication;
import com.zhaoyan.bean.Users;
import com.zhaoyan.dao.UsersDao;
import lombok.extern.log4j.Log4j2;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Log4j2
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartUpApplication.class)
public class JpaTest {
    @Autowired
    private UsersDao uDao;

    private Users user;

    @Before
    public void init() {
        initUser();
    }

    public void initUser() {
//        user = new Users(17,"海绵宝宝","222",33);
        user = new Users();
        user.setId(17);
        user.setPwd("666");
    }

    @Test
    public void testFun() {
        log.info("users : " + uDao.findAll());
    }
}



