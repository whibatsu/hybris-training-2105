package org.training.core.user;

import org.training.facades.product.data.UserData;

public interface TrainingUserService {
    UserData getUserByEmail (String email);
}
