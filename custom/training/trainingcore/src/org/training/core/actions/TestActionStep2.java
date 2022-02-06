package org.training.core.actions;

import de.hybris.platform.commerceservices.model.process.TestActionProcessModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import org.apache.log4j.Logger;

public class TestActionStep2 extends AbstractSimpleDecisionAction<TestActionProcessModel> {

    private static final Logger LOGGER = Logger.getLogger(TestActionStep2.class);

    @Override
    public Transition executeAction(TestActionProcessModel testActionProcessModel){
        //Do something

        LOGGER.info("Test Action 2 OK");
        return Transition.OK;

    }
}
