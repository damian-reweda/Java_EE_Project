package com.damian.reweda.project.jee.services;

import javax.faces.event.AjaxBehaviorEvent;

import com.damian.reweda.project.jee.domain.UserEntity;

/**
 *  
 * Service providing service methods to work with user data and entity.
 *
 */
public interface UserService {

        /**
         * Creating user 
         *
         * @param userEntity
         * @return true if success
         */
        boolean createUser(UserEntity userEntity);
        
        /**
         * Checking  user name availability. UI ajax use.
         *
         * @param ajax event
         * @return
         */
        boolean checkAvailable(AjaxBehaviorEvent event);
       
        /**
         * Retrieves full User record from database by user name
         *
         * @param userName
         * @return UserEntity
         */
        UserEntity loadUserEntityByUsername(String userName);

}

