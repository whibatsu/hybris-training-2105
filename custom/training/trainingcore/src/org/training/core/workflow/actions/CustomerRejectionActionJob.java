package org.training.core.workflow.actions;

import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class POSRejectionActionJob
 *
 * @author kris.sunu.purnandaru
 */
public class CustomerRejectionActionJob extends AbstractCustomerApprovalActionJob {


    /**
     * The Constant LOG.
     **/
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerRejectionActionJob.class);

    @Override
    public WorkflowDecisionModel perform(final WorkflowActionModel action) {
        LOGGER.info("Entered Customer Rejection Action job");
        return rejectCustomerAndFetchDecision(action);
    }
}