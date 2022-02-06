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
public class POSRejectionActionJob extends AbstractPOSApprovalActionJob {


    /**
     * The Constant LOG.
     **/
    private static final Logger LOGGER = LoggerFactory.getLogger(POSRejectionActionJob.class);

    @Override
    public WorkflowDecisionModel perform(final WorkflowActionModel action) {
        LOGGER.info("Entered POS Rejection Action job");
        return rejectPOSAndFetchDecision(action);
    }
}