package org.training.facades.user.facade;

import org.training.facades.product.data.UserData;

public interface TrainingUserFacade {

    UserData getUserByEmail(String email);
}
