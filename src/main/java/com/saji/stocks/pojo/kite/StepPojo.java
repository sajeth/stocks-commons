package com.saji.stocks.pojo.kite;

import com.saji.stocks.pojo.common.BasePojo;
import com.saji.stocks.pojo.common.LovPojo;


public class StepPojo extends BasePojo {

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
