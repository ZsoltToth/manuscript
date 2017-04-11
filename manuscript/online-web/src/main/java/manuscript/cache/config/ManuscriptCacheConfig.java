package manuscript.cache.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import manuscript.module.user.management.registration.UserRegistrationDao;

@Configuration
@EnableCaching(mode = AdviceMode.PROXY, proxyTargetClass = true)
public class ManuscriptCacheConfig extends CachingConfigurerSupport {
	
	@Bean
	@Override
	public CacheManager cacheManager() {
		SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
		simpleCacheManager.setCaches(collectCaches());
		return simpleCacheManager;
	}

	private List<Cache> collectCaches() {
		List<Cache> caches = new ArrayList<Cache>();
		caches.add(academicDisciplinesCache());

		return caches;
	}

	private ConcurrentMapCache academicDisciplinesCache() {
		return new ConcurrentMapCache(UserRegistrationDao.ACADEMIC_DISCIPLINES_CACHE);
	}
}
