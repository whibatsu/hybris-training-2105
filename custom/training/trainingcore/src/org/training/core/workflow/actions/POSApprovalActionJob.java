package org.training.core.workflow.actions;

import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class POSApprovalActionJob
 *
 * @author kris.sunu.purnandaru
 */
public class POSApprovalActionJob extends AbstractPOSApprovalActionJob {

    /**
     * The Constant LOG.
     **/
    private static final Logger LOGGER = LoggerFactory.getLogger(POSApprovalActionJob.class);

    @Override
    public WorkflowDecisionModel perform(final WorkflowActionModel action) {
        LOGGER.info("Entered into POS Approval Action Job");
        return approvePOSAndFetchDecision(action);
    }

}
