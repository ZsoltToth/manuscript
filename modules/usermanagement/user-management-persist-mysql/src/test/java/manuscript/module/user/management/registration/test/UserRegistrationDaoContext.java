package manuscript.module.user.management.registration.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

import manuscript.test.dao.context.AbstractDaoTestContext;

@Configuration
@MapperScan("manuscript.module.user.management.registration.mapper")
public class UserRegistrationDaoContext extends AbstractDaoTestContext {

}
