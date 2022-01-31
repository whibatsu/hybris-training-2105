package org.training.core.supplier.service.impl;

import de.hybris.platform.servicelayer.model.ModelService;
import org.training.core.enums.StatusEnum;
import org.training.core.jalo.Supplier;
import org.training.core.model.SupplierModel;
import org.training.core.supplier.dao.TrainingSupplierDao;
import org.training.core.supplier.service.TrainingSupplierService;
import org.training.facades.product.data.SupplierData;

import javax.annotation.Resource;
import java.util.List;

public class TrainingSupplierServiceImpl implements TrainingSupplierService {

    @Resource(name="trainingSupplierDao")
    private TrainingSupplierDao trainingSupplierDao;

    @Resource
    ModelService modelService;

    @Override
    public List<SupplierData> getSupplier(){
        SupplierModel supplierModel = (SupplierModel) trainingSupplierDao.getSupplier();
        SupplierData supplierData = new SupplierData();

        if(null != supplierModel){
            supplierData.setCode(supplierModel.getCode());
            supplierData.setName(supplierModel.getName());
            supplierData.setCity(String.valueOf(supplierModel.getCity()));
            supplierData.setProvince(String.valueOf(supplierModel.getProvince()));
//            supplierData.setStatus(supplierModel.getStatus());
            return (List<SupplierData>) supplierData;
        }
        return null;
    }

}
