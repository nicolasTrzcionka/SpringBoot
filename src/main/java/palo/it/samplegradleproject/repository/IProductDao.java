package palo.it.samplegradleproject.repository;

import palo.it.samplegradleproject.model.Product;

import java.util.List;

public interface IProductDao {

    public List<Product> findAll();

    public Product findById(int id);

    public Product save(Product product);


}
