package com.damian.reweda.project.jee.dao;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.util.Assert;

import com.damian.reweda.project.jee.commons.dao.GenericJpaDao;
import com.damian.reweda.project.jee.domain.UserEntity;


/**
 * 
 * Data access object implementation to work with User.
 *
 */
public class UserJpaDao extends GenericJpaDao<UserEntity, Long> implements UserDao {

        public UserJpaDao() {
                super(UserEntity.class);
        }

        /**
         * Checking user name availability
         *
         * @param userName
         * @return true if available
         */
        public boolean checkAvailable(String userName) {
                Assert.notNull(userName);
               
                Query query = getEntityManager()
                        .createQuery("select count(*) from " + getPersistentClass().getSimpleName()
                                        + " u where u.userName = :userName").setParameter("userName", userName);
               
                Long count = (Long) query.getSingleResult();
               
                return count < 1;
        }

        /**
         * Loading user by username
         *
         * @param userName
         * @return User entity
         */
        public UserEntity loadUserByUserName(String userName) {
                Assert.notNull(userName);
               
                UserEntity user = null;
               
                Query query = getEntityManager().createQuery("select u from " + getPersistentClass().getSimpleName()
                                + " u where u.userName = :userName").setParameter("userName", userName);
               
                try {
                        user = (UserEntity) query.getSingleResult();
                } catch(NoResultException e) {
                        //do nothing
                }
               
                return user;
        }

}
