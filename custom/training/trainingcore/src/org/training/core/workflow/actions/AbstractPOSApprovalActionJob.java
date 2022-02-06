package org.training.core.workflow.actions;

import de.hybris.platform.basecommerce.enums.PointOfServiceTypeEnum;
import de.hybris.platform.commerceservices.model.process.TestActionProcessModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.storelocator.model.PointOfServiceModel;
import de.hybris.platform.workflow.jobs.AutomatedWorkflowTemplateJob;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;
import org.apache.commons.collections.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * The Class AbstractPOSApprovalActionJob
 *
 * @author kris.sunu.purnandaru
 */
public class AbstractPOSApprovalActionJob implements AutomatedWorkflowTemplateJob {

    @Resource(name = "businessProcessService")
    private BusinessProcessService businessProcessService;

    @Resource(name = "modelService")
    private ModelService modelService;
    protected WorkflowDecisionModel approvePOSAndFetchDecision(final WorkflowActionModel action) {
        final PointOfServiceModel pos = getPOSFromAttachment(action);
        if (null != pos) {
            pos.setType(PointOfServiceTypeEnum.STORE);
            modelService.save(pos);
        }
        final TestActionProcessModel testActionProcessModel = businessProcessService.createProcess(
                "defaultTestAction-" + System.currentTimeMillis(),
                "defaultTestAction");
        testActionProcessModel.setSomething("Approved");
        modelService.save(testActionProcessModel);
        businessProcessService.startProcess(testActionProcessModel);
        return action.getDecisions().iterator().next();
    }

    protected WorkflowDecisionModel rejectPOSAndFetchDecision(final WorkflowActionModel action) {
        final PointOfServiceModel pos = getPOSFromAttachment(action);
        if (null != pos) {
            pos.setType(PointOfServiceTypeEnum.WAREHOUSE);
            modelService.save(pos);
        }
        final TestActionProcessModel testActionProcessModel = businessProcessService.createProcess(
                "defaultTestAction-" + System.currentTimeMillis(),
                "defaultTestAction");
        testActionProcessModel.setSomething("Rejected");
        modelService.save(testActionProcessModel);
        businessProcessService.startProcess(testActionProcessModel);
        return action.getDecisions().iterator().next();
    }

    protected PointOfServiceModel getPOSFromAttachment(final WorkflowActionModel action) {
        final List<ItemModel> attachments = action.getAttachmentItems();
        if (CollectionUtils.isNotEmpty(attachments)) {
            for (final ItemModel item : attachments) {
                if (item instanceof PointOfServiceModel) {
                    return (PointOfServiceModel) item;
                }
            }
        }
        return null;
    }

    @Override
    public WorkflowDecisionModel perform(final WorkflowActionModel action) {
        // YTODO Auto-generated method stub
        return null;
    }

    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
