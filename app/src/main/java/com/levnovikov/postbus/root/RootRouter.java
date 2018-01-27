package com.levnovikov.postbus.root;

import com.levnovikov.postbus.root.di.RootScope;
import com.levnovikov.postbus.root.home.HomeActivity;
import com.levnovikov.system_base.ActivityStarter;

import javax.inject.Inject;

/**
 * Author: lev.novikov
 * Date: 20/11/17.
 */

@RootScope
public class RootRouter {

    private final ActivityStarter starter;

    @Inject
    RootRouter(ActivityStarter starter) {
        this.starter = starter;
    }

    void home() {
        starter.startActivity(HomeActivity.class, null);
    }
}
