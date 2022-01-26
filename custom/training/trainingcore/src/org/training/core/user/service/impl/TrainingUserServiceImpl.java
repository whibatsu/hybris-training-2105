package org.training.core.user.service.impl;

import de.hybris.platform.core.model.user.UserModel;
import org.training.core.user.TrainingUserService;
import org.training.core.user.dao.TrainingUserDao;
import org.training.facades.product.data.UserData;

import javax.annotation.Resource;

public class TrainingUserServiceImpl implements TrainingUserService {

    @Resource
    private TrainingUserDao trainingUserDao;

    @Override
    public UserData getUserByEmail(String email){
        UserModel userModel = trainingUserDao.getUserByEmail(email);
        UserData userData = new UserData();
        return userData;
    }

}
