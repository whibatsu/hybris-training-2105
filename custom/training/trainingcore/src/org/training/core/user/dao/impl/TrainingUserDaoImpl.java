package org.training.core.user.dao.impl;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.core.user.dao.TrainingUserDao;

import javax.annotation.Resource;

public class TrainingUserDaoImpl implements TrainingUserDao {

    private static final String QUERY_TRAINING_USER = "SELECT {name} FROM {user} WHERE {uid}='whibatsuh@gmail.com'";
    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Override
    public UserModel getUserByEmail(String email){
        final FlexibleSearchQuery flexibleSearchForFindUserQuery = new FlexibleSearchQuery(QUERY_TRAINING_USER);
        final SearchResult<UserModel> users = flexibleSearchService.search(flexibleSearchForFindUserQuery);
        return users.getResult().get(0);
    }
}
