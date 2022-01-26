package org.training.core.product.dao.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.core.product.dao.TrainingProductDao;

import javax.annotation.Resource;

public class TrainingProductDaoImpl implements TrainingProductDao {

    private static final String QUERY_TRAINING_PRODUCT = "SELECT * FROM {product} WHERE {name}=''";
    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Override
    public ProductModel getProductById(String name){
        final FlexibleSearchQuery flexibleSearchForFindUserQuery = new FlexibleSearchQuery(QUERY_TRAINING_PRODUCT);
        final SearchResult<ProductModel> products = flexibleSearchService.search(flexibleSearchForFindUserQuery);
        return products.getResult().get(0);
    }
}
