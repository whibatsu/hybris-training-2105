package org.training.core.actions;

import de.hybris.platform.commerceservices.model.process.TestActionProcessModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import org.apache.log4j.Logger;

public class TestActionStep3 extends AbstractSimpleDecisionAction<TestActionProcessModel> {

    private static final Logger LOGGER = Logger.getLogger(TestActionStep3.class);

    @Override
    public Transition executeAction(TestActionProcessModel testActionProcessModel){
        //Do something

        LOGGER.info("Test Action 3 OK");
        return Transition.NOK;
    }
}
