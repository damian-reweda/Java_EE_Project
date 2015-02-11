package com.damian.reweda.project.jee.services;

import com.damian.reweda.project.jee.domain.UserEntity;

/**
 * 
 * Service to set user authentication session
 *
 */
public interface UserAuthenticationProviderService {

        /**
         * Process user authentication
         *
         * @param user
         * @return
         */
        boolean processUserAuthentication(UserEntity user);
}
