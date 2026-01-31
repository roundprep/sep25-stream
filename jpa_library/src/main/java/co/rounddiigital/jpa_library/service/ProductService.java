package co.rounddiigital.jpa_library.service;

import co.rounddiigital.jpa_library.dao.ProductRepo;
import co.rounddiigital.jpa_library.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public Product create(Product product) {
        return productRepo.save(product);
    }
}
