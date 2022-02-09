package org.training.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/training")
public class TrainingTemplatePageController extends AbstractPageController {

    private static final String TRAINING_TEMPLATE_PAGE = "TrainingPage";
    @RequestMapping(value=TRAINING_TEMPLATE_PAGE, method= RequestMethod.GET)
    public String getTrainingTemplatePage(final Model model) throws CMSItemNotFoundException{
        final ContentPageModel trainingData = getContentPageForLabelOrId(TRAINING_TEMPLATE_PAGE);
        storeCmsPageInModel(model, trainingData);
        setUpMetaDataForContentPage(model, trainingData);
        return getViewForPage(model);
    }
}
