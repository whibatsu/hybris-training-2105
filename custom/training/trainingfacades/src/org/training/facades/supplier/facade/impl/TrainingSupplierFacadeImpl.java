package org.training.facades.supplier.facade.impl;

import org.training.core.supplier.service.TrainingSupplierService;
import org.training.facades.product.data.SupplierData;
import org.training.facades.supplier.facade.TrainingSupplierFacade;

import javax.annotation.Resource;
import java.util.List;

public class TrainingSupplierFacadeImpl implements TrainingSupplierFacade {

    @Resource(name="trainingSupplierService")
    private TrainingSupplierService trainingSupplierService;

    @Override
    public List<SupplierData> getSupplier(){

        SupplierData supplierData = (SupplierData) trainingSupplierService.getSupplier();
        if(null != supplierData){
            return (List<SupplierData>) supplierData;
        } else {
            return null;
        }
    }
}
