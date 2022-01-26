package org.training.facades.user.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.training.facades.product.data.UserData;

public class TrainingUserPopulator implements Populator<UserModel, UserData> {

    @Override
    public void populate(UserModel userModel, UserData userData) throws ConversionException {
        userData.setName(userModel.getName());
        userData.setEmail(userModel.getUid());
    }
}
