package manuscript.system.security.config.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface LoginMapper {
	
	public String loadUserIdByUsername(@Param("username") String username);
	
	public String loadPasswordByUserId(@Param("userId") String userId);
	
	public List<String> loadAuthorityListByUserId(@Param("userId") String userId);
}
