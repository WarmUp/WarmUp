package com.weinuts.domain;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;

/**
 * Created by Administrator on 10/30/2015.
 */
@MappedSuperclass
public class BaseEntity implements Serializable{

    private static final long serialVersionUID = 5496251267231748896L;

    @Id
    @SequenceGenerator(name="ORACLE_GENERATOR", sequenceName="eis_sequence", allocationSize=1000)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
