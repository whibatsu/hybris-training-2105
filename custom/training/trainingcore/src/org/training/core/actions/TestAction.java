package org.training.core.actions;

import de.hybris.platform.commerceservices.model.process.TestActionProcessModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import org.apache.log4j.Logger;

public class TestAction extends AbstractSimpleDecisionAction<TestActionProcessModel> {

    private static final Logger LOGGER = Logger.getLogger(TestAction.class);

    @Override
    public Transition executeAction(TestActionProcessModel testActionProcessModel){
        //Do something

        String approval = testActionProcessModel.getSomething();

        if(approval == "Approved"){
            LOGGER.info("Test Action 1 OK : "+approval);
            return Transition.OK;
        } else return Transition.NOK;
    }
}
