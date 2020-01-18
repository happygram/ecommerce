package happygram.ecommerce.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import happygram.ecommerce.jpa.domain.Category;
import happygram.ecommerce.service.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {

   @Autowired
   private CategoryService categoryService;

   @RequestMapping(value = "/list")
   public Map<Category, List<Category>> getCategory(Model model) {
      return categoryService.getCategory();
   }

}