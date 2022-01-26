package org.training.core.product.dao;

import de.hybris.platform.core.model.product.ProductModel;

public interface TrainingProductDao {

    ProductModel getProductById(String name);
}
