/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.storefront.controllers.pages;

import de.hybris.platform.commerceservices.model.process.TestActionProcessModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * Controller for trigger
 */
@Controller
@RequestMapping("/trigger")
public class TriggerBussinessProcessController
{

	@Resource(name = "businessProcessService")
	private BusinessProcessService businessProcessService;

	@Resource(name = "modelService")
	private ModelService modelService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String trigger()
	{
//		final TestActionProcessModel testActionProcessModel = getBusinessProcessService().createProcess(
//			"defaultTestAction-" + System.currentTimeMillis(),
//			"defaultTestAction");
//		getModelService().save(testActionProcessModel);
//		getBusinessProcessService().startProcess(testActionProcessModel);
		return "OK";
	}

//	public BusinessProcessService getBusinessProcessService() {
//		return businessProcessService;
//	}
//
//	public void setBusinessProcessService(BusinessProcessService businessProcessService) {
//		this.businessProcessService = businessProcessService;
//	}
//
//	public ModelService getModelService() {
//		return modelService;
//	}
//
//	public void setModelService(ModelService modelService) {
//		this.modelService = modelService;
//	}
}
