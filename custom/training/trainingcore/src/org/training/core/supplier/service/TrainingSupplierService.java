package org.training.core.supplier.service;

import org.training.core.model.SupplierModel;
import org.training.facades.product.data.SupplierData;

import java.util.List;

public interface TrainingSupplierService {
    List<SupplierData> getSupplier();
}
