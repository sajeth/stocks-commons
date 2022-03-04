package com.saji.pojos.kite;

import com.saji.pojos.common.BaseEntity;

import java.util.Set;


public class ActionPojo extends BaseEntity {

    private Set<StepPojo> steps;

    public ActionPojo() {
        super();
    }

    public Set<StepPojo> getSteps() {
        return steps;
    }

    public void setSteps(Set<StepPojo> steps) {
        this.steps = steps;
    }
}
