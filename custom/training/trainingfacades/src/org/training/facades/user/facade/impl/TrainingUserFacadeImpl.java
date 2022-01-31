package org.training.facades.user.facade.impl;

import org.training.core.user.TrainingUserService;
import org.training.facades.product.data.UserData;
import org.training.facades.user.facade.TrainingUserFacade;

import javax.annotation.Resource;

public class TrainingUserFacadeImpl implements TrainingUserFacade {

    @Resource(name="trainingUserService")
    private TrainingUserService trainingUserService;

    @Override
    public UserData getUserByEmail(String email){

        UserData userData = trainingUserService.getUserByEmail(email);
        if(null != userData) {
            return userData;
        } else {
            return null;
        }
    }
}
