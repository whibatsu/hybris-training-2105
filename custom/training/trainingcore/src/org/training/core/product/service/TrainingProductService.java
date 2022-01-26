package org.training.core.product.service;

import org.training.facades.product.data.ProductData;

public interface TrainingProductService {

    ProductData getProductById(String name);
}
