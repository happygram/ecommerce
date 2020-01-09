package happygram.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import happygram.ecommerce.dto.CategoryDto;
import happygram.ecommerce.service.CategoryService;

@Controller
public class WebController {

   @Autowired
   private CategoryService categoryService;

   @RequestMapping(value = "/")
   public String main(Model model) {
      model.addAttribute("template", "fragments/content/main");
      return "index";
   }

   @RequestMapping(value = "/product")
   public String product(Model model) {
      model.addAttribute("template", "fragments/content/product");
      return "index";
   }

   @RequestMapping(value = "/category")
   public List<CategoryDto> getCategory(Model model) {
      return categoryService.getCategory();
   }
}