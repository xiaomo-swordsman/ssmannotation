import com.xiaomo.config.SpringConfiguration;
import com.xiaomo.domain.User;
import com.xiaomo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
public class SpringTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void test() {
        List<User> userList = userMapper.findAll();
        System.out.println("userList == " + userList);
    }
}
