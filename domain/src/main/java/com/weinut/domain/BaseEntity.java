package com.weinut.domain;

import javax.persistence.GeneratedValue;
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
    @GeneratedValue
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
