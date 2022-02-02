package org.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class TrainingSearchResultProductPopulator extends SearchResultProductPopulator {

    @Override
    public void populate(final SearchResultValueData source, final ProductData target) throws ConversionException {

        target.setSku(this.<String>getValue(source, "sku"));
        target.setMaterial(this.<String>getValue(source, "material"));
        target.setSupplier(this.<String>getValue(source,"supplier"));
        target.setColor(this.<String>getValue(source,"color"));
        target.setRating(this.<String>getValue(source,"rating"));
    }
}
