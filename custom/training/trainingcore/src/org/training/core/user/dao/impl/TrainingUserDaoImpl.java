package org.training.core.user.dao.impl;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.collections.CollectionUtils;
import org.training.core.user.dao.TrainingUserDao;

import javax.annotation.Resource;
import java.util.Arrays;

public class TrainingUserDaoImpl implements TrainingUserDao {

    private static final String QUERY_TRAINING_USER = "SELECT {pk} FROM {user} WHERE {uid}= ?email";
    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Override
    public UserModel getUserByEmail(String email){

        final FlexibleSearchQuery flexibleSearchForFindUserQuery = new FlexibleSearchQuery(QUERY_TRAINING_USER);
        flexibleSearchForFindUserQuery.addQueryParameter("email", email);

        final SearchResult<UserModel> users = flexibleSearchService.search(flexibleSearchForFindUserQuery);

        if(CollectionUtils.isNotEmpty(users.getResult())){
            return users.getResult().get(0);
        } else {
            return null;
        }

    }
}
