package manuscript.system.security.config.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface LoginMapper {
	
	public String loadUserIdByUsername(@Param("username") String username);
	
	public String loadPasswordByUserId(@Param("userId") String userId);
}
