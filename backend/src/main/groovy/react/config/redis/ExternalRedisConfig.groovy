package react.config.redis

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession
import org.springframework.session.web.http.HeaderHttpSessionStrategy
import org.springframework.session.web.http.HttpSessionStrategy

@Profile('redis')
@EnableRedisHttpSession
@Configuration
public class ExternalRedisConfig {
  @Bean
  HttpSessionStrategy sessionStrategy() {
    new JWTHeaderHttpSessionStrategy();
  }
}
