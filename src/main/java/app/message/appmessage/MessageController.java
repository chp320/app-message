package app.message.appmessage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.servlet.ModelAndView;

/**
 * HTTP 요청을 받아 처리하는 컨트롤러
 */

 @Controller
 @RequestMapping("/messages")
public class MessageController {

  // 스프링 MVC에서 모델과 뷰를 사용하는 방법1
  @GetMapping("/welcome")
  public String welcome(Model model) {
    model.addAttribute("message", "Hello, Welcome to Spring Boot!");
    return "welcome";
  }


  // // 스프링 MVC에서 모델과 뷰를 사용하는 방법2
  // @GetMapping("/welcome")
  // public ModelAndView welcome() {
  //   ModelAndView mv = new ModelAndView("welcome");
  //   mv.addObject("message", "Hello, Welcome to Spring Boot!");
  //   return mv;
  // }

}
