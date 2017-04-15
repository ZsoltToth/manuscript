package manuscript.module.user.management.personaldatasettings.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import manuscript.module.user.management.personaldatasettings.PersonalDataSettingsDao;
import manuscript.module.user.management.personaldatasettings.PersonalDataSettingsDaoImpl;
import manuscript.module.user.management.personaldatasettings.mapper.PersonalDataSettingsMapper;
import manuscript.test.annotation.IgnoreTestContext;
import manuscript.test.dao.context.AbstractDaoTestContext;

@IgnoreTestContext
@Configuration
@MapperScan("manuscript.module.user.management.personaldatasettings.mapper")
public class PersonalDataSettingsMapperContext extends AbstractDaoTestContext{

	@Autowired
	private PersonalDataSettingsMapper personalDataSettingsMapper;
	
	@Bean
	public PersonalDataSettingsDao getPersonalDataSettingsDao(){
		return new PersonalDataSettingsDaoImpl(personalDataSettingsMapper);
	}

}
