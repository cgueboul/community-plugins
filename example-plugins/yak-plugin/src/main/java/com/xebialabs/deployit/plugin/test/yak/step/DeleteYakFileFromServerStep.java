package com.xebialabs.deployit.plugin.test.yak.step;

import com.xebialabs.deployit.plugin.test.yak.ci.DeployedYakFile;
import com.xebialabs.deployit.plugin.api.flow.ExecutionContext;
import com.xebialabs.deployit.plugin.api.flow.Step;
import com.xebialabs.deployit.plugin.api.flow.StepExitCode;
import com.xebialabs.deployit.plugin.test.yak.ci.RestartRequiringDeployedYakFile;

/**
 * The steps in this package are all similar in that they
 * do not to a lot of work, but are here to illustrate step
 * classes.
 */
@SuppressWarnings("serial")
public class DeleteYakFileFromServerStep implements Step {

    public DeleteYakFileFromServerStep() {
    }

    public DeleteYakFileFromServerStep(DeployedYakFile deployedYakFile) {
    }

    public DeleteYakFileFromServerStep(RestartRequiringDeployedYakFile restartRequiringDeployedYakFile) {
    }

    @Override
    public String getDescription() {
        return "Deleting";
    }

    @Override
    public StepExitCode execute(ExecutionContext ctx) throws Exception {
        return StepExitCode.SUCCESS;
    }

    @Override
    public int getOrder() {
        return 30;
    }
}

