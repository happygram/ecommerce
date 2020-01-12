package happygram.ecommerce.jpa.domain;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import happygram.ecommerce.constant.CategoryConstant;
import happygram.ecommerce.jpa.repository.CategoryRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class CategoryJpaTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    void injectedComponentsAreNotNull(){
      List<Category> menuList = categoryRepository.findAll();

      menuList.forEach(category -> {
        System.out.println(category);
      });

      // Parent
      List<Category> parentMenuList = menuList.stream()
        .filter(category -> category.getIdParent() == CategoryConstant.PARENT_ROOT)
        .collect(Collectors.toList())
        ;

      // Child
      Map<Long, List<Category>> childMenuMap = menuList.stream()
        .filter(category -> category.getIdParent() != CategoryConstant.PARENT_ROOT)
        .collect(Collectors.groupingBy(Category::getIdParent))
        ;

      for(Long key : childMenuMap.keySet()) {
        System.out.println(key);
        System.out.println(childMenuMap.get(key));
      }
    }

}