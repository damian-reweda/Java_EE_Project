package com.damian.reweda.project.jee.commons.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 
 * Base entity to hold Id.
 *
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
        private static final long serialVersionUID = 568379222048217476L;

        @Id
        @GeneratedValue
        private Long id;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }
       
}
