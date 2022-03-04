package com.saji.pojos.kite;

import com.saji.pojos.common.BaseEntity;
import com.saji.pojos.common.LovPojo;


public class StepPojo extends BaseEntity {

    private ActionPojo action;
    private LovPojo actionType;

    public StepPojo() {
        super();
    }

    public ActionPojo getAction() {
        return action;
    }

    public void setAction(ActionPojo actions) {
        this.action = actions;
    }

    public LovPojo getActionType() {
        return actionType;
    }

    public void setActionType(LovPojo actionType) {
        this.actionType = actionType;
    }
}
