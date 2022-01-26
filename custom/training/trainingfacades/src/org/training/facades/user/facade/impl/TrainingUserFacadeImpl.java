package org.training.facades.user.facade.impl;

import org.training.facades.product.data.UserData;
import org.training.facades.user.facade.TrainingUserFacade;

public class TrainingUserFacadeImpl implements TrainingUserFacade {

    @Override
    public UserData getUserByEmail(String email){
        UserData user = new UserData();
        return user;
    }
}
