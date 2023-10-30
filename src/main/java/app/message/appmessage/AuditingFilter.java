package app.message.appmessage;

import java.io.IOException;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.filter.GenericFilterBean;

/**
 * 데모 '필터' 구현
 * - 필터(filter): 서블릿에 도달하기 전에 HTTP 요청에 대한 필터링 작업 수행 시 유용. 자바EE의 기술 중 하나. 디자인패턴 중 '책임연쇄패턴'의 구현
 * - 필터를 만드려면 javax.servlet.Filter 인터페이스 구현하거나, 스프링의 org.springframework.web.filter.GenericFilterBean 을 확장하여 구현
 * - 여기서는 GenericFilterBean을 사용
 */
public class AuditingFilter extends GenericFilterBean {

  @Override
  public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
      throws IOException, ServletException {
    // TODO Auto-generated method stub

    long start = new Date().getTime();  // 시작시간 기록
    chain.doFilter(req, res); // [주의] 미호출 시, 클라이언트에 응답을 보내지 못함
    long elapsed = new Date().getTime() - start;
    HttpServletRequest request = (HttpServletRequest) req;
    logger.debug("Request[uri=" + request.getRequestURI() + ", method=" + request.getMethod() + "] completed in " + elapsed + " ms");
  }
  
}
