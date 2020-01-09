package happygram.ecommerce.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import happygram.ecommerce.jpa.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
}