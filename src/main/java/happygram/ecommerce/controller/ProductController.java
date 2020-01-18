package happygram.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

   @RequestMapping(value = "/view/detail")
   public String product(Model model) {
      model.addAttribute("template", "fragments/content/product");
      return "index";
   }

}