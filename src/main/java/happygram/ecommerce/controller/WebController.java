package happygram.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
   @RequestMapping(value = "/")
   public String index() {
      System.out.println("test");
      return "index";
   }
}
