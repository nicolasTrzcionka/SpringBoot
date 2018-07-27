package palo.it.samplegradleproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import palo.it.samplegradleproject.model.Product;
import palo.it.samplegradleproject.repository.IProductDao;

import java.util.List;

/**
 * @Controller sur la class + @ResponseBody sur methode = @RestController
 */

@RestController
public class ProductController {


    @Autowired
    private IProductDao dao;


    /**
     * @return
     */
    @RequestMapping(value="/Products", method=RequestMethod.GET)
    public List<Product> productList() {
        return dao.findAll();
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/Products/{id}")
    public Product getProduct(@PathVariable int id) {
        return dao.findById(id);
    }







}
