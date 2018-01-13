import org.junit.Test;
import org.junit.runner.RunWith;
import org.laotie.activiti.entity.User;
import org.laotie.activiti.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author yuh
 * 2018/1/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testInsertUser(){

        Random random = new Random(100000L);

        List<User> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setId(System.currentTimeMillis()+random.nextLong());
            user.setName("user"+i);
        }
        userService.saveOrUpdateAll(list);
    }

}
