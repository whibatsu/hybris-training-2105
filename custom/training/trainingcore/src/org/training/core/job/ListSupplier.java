package org.training.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;

import org.training.core.enums.StatusEnum;
import org.training.core.model.SupplierModel;
import org.training.core.supplier.dao.TrainingSupplierDao;
import org.training.facades.product.data.SupplierData;

import javax.annotation.Resource;


public class ListSupplier extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = Logger.getLogger(ListSupplier.class);

    @Resource(name="trainingSupplierDao")
    private TrainingSupplierDao trainingSupplierDao;

    @Override
    public PerformResult perform(final CronJobModel cronJobModel){

        for(int i=0;i<trainingSupplierDao.getSupplier().size();i++) {
            SupplierModel supplierModel = trainingSupplierDao.getSupplier().get(i);
            if (supplierModel.getStatus() != StatusEnum.NOT_VERIFIED || supplierModel.getStatus() != StatusEnum.IN_REVIEW || supplierModel.getStatus() != StatusEnum.VERIFIED) {
                supplierModel.setStatus(StatusEnum.IN_REVIEW);
                modelService.save(supplierModel);
            }
            LOG.info("List Supplier > Name : " + supplierModel.getName() +" Status : " + supplierModel.getStatus());
        }

        if(null != trainingSupplierDao.getSupplier()){
            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
        } else {
            return null;
        }
    }
}
