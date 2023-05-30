package com.michelon.learningcache;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @autor raqueldarellimichelon
 * created on 30/05/23 inside the package - com.michelon.learningcache
 **/
@Service
public class ProductService {

    Map<Long, Product> products = new HashMap<>() {
        {
          put(1L, new Product(1L, "Lasagna", "Delicious one"));
          put(2L, new Product(2L, "Pizza", "Delicious pepperoni"));
          put(3L, new Product(3L, "Beans", "Delicious Red beans"));
        }
    };
    Product getById(Long id) {
        System.out.println("Getting products...");
        simulateLatency();
        return products.get(id);
    }

    private void simulateLatency() {

        try {
            long time = 1000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}


