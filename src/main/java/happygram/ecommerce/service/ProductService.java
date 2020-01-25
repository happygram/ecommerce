package happygram.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import happygram.ecommerce.jpa.domain.Product;
import happygram.ecommerce.jpa.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /**
     * 메뉴 아이디로 상품 목록 조회
     * @param categoryId
     * @return
     */
    public List<Product> getProductList(Long categoryId){
        return productRepository.findAllByCategoryId(categoryId);
    }

}