package happygram.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

   @RequestMapping(value = "/view/detail")
   public String viewProductDetail(Model model) {
      model.addAttribute("template", "fragments/content/product/detail");
      return "index";
   }

   @RequestMapping(value = "/view/list/{id}")
   public String viewProductList(@PathVariable Long id, Model model) {
      model.addAttribute("template", "fragments/content/product/list");
      return "index";
   }

}