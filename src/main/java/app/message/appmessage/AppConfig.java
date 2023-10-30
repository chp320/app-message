package app.message.appmessage;

import java.util.Arrays;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("app.message.appmessage")
public class AppConfig {

  /* 신규 필터 등록하는 방법
   * 1) web.xml 파일에 <filter>와 <filter-mapping> 등록
   * 2) FilterRegistrationBean을 만들어 '설정 클래스'에 등록  <-- 여기서는 이 방법을 사용
   */
  
   @Bean
   public FilterRegistrationBean<AuditingFilter> audFilterRegistrationBean() {
    FilterRegistrationBean<AuditingFilter> registration = new FilterRegistrationBean<>();
    AuditingFilter filter = new AuditingFilter();
    registration.setFilter(filter);   // Filter 설정
    registration.setOrder(Integer.MAX_VALUE);   // 상기 Filter를 체인 내 배치... 그런데 여기서 말하는 '체인'이 뭐지? -_-;;
    registration.setUrlPatterns(Arrays.asList("/messages/*"));  // Filter 처리할 URL 설정. 여기서는 /messages/ 로 시작하는 요청만 처리함.
    return registration;
   }
}
