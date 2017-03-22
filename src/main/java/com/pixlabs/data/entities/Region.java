package com.pixlabs.data.entities;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pix on 22.03.17.
 */

@Entity
public class Region {

    @ManyToMany
    public List<Region> subRegions = new ArrayList<>();

    @ManyToMany
    public List<Region> upperRegions = new ArrayList<>();

    /**
     * JPA constructor
     */
    public Region() {
    }



    public List<Region> getSubRegions() {
        return subRegions;
    }

    public void setSubRegions(List<Region> subRegions) {
        this.subRegions = subRegions;
    }

    public List<Region> getUpperRegions() {
        return upperRegions;
    }

    public void setUpperRegions(List<Region> upperRegions) {
        this.upperRegions = upperRegions;
    }
}
