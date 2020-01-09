package happygram.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import happygram.ecommerce.dto.CategoryDto;
import happygram.ecommerce.jpa.domain.Category;
import happygram.ecommerce.jpa.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryDto> getCategory() {
        List<Category> menuList = categoryRepository.findAll();
        return null;
    }
}