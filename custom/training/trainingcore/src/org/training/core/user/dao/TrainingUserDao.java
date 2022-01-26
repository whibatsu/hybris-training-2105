package org.training.core.user.dao;

import de.hybris.platform.core.model.user.UserModel;

public interface TrainingUserDao {
    UserModel getUserByEmail(String email);
}
