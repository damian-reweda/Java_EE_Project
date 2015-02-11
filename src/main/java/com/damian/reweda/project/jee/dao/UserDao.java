package com.damian.reweda.project.jee.dao;

import com.damian.reweda.project.jee.commons.dao.GenericDao;
import com.damian.reweda.project.jee.domain.UserEntity;

/**
 * 
 * Data access object interface to work with User.
 *
 */
public interface UserDao extends GenericDao<UserEntity, Long> {

        /**
         * Checking user name availability
         *
         * @param userName
         * @return true if available
         */
        boolean checkAvailable(String userName);
       
        /**
         * Loading user by username
         *
         * @param userName
         * @return User entity
         */
        UserEntity loadUserByUserName(String userName);
}

