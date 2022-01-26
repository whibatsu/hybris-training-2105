package org.training.core.product.service.impl;

import de.hybris.platform.core.model.product.ProductModel;
import org.training.core.product.dao.TrainingProductDao;
import org.training.core.product.service.TrainingProductService;
import org.training.facades.product.data.ProductData;

import javax.annotation.Resource;

public class TrainingProductServiceImpl implements TrainingProductService {

    @Resource
    TrainingProductDao trainingProductDao;

    @Override
    public ProductData getProductById(String name){
        ProductModel productModel = trainingProductDao.getProductById(name);
        ProductData productData = new ProductData();
        return productData;
    }
}
