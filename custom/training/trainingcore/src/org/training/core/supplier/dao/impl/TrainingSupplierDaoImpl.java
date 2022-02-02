package org.training.core.supplier.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.collections.CollectionUtils;
import org.training.core.model.SupplierModel;
import org.training.core.supplier.dao.TrainingSupplierDao;

import javax.annotation.Resource;
import java.util.List;

public class TrainingSupplierDaoImpl implements TrainingSupplierDao{

    private static final String QUERY_TRAINING_SUPPLIER = "SELECT {pk} FROM {supplier}";
    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<SupplierModel> getSupplier() {

        final FlexibleSearchQuery flexibleSearchForFindSupplierQuery = new FlexibleSearchQuery(QUERY_TRAINING_SUPPLIER);
        final SearchResult<SupplierModel> suppliers = flexibleSearchService.search(flexibleSearchForFindSupplierQuery);

        if(CollectionUtils.isNotEmpty(suppliers.getResult())){
            return suppliers.getResult();
        } else {
            return null;
        }
    }
}
