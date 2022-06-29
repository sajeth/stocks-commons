package com.saji.stocks.pojo.kite;

import com.saji.stocks.pojo.common.BasePojo;

import java.util.Set;


public class ActionPojo extends BasePojo {

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
