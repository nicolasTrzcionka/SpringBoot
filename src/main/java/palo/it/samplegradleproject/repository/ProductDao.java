package palo.it.samplegradleproject.repository;

import org.springframework.stereotype.Repository;
import palo.it.samplegradleproject.model.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDao implements IProductDao {

    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, new String("CashFlow"), 350));
        products.add(new Product(2, new String("Forex"), 500));
        products.add(new Product(3, new String("Swap"), 750));
    }

    @Override
    public List<Product>findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }


}
