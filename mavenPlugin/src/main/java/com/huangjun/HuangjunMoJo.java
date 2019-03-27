package com.huangjun;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;


@Mojo(name="huangjun",defaultPhase= LifecyclePhase.PACKAGE)
public class HuangjunMoJo extends AbstractMojo {

    @Parameter
    private String msg;

    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("huangjun"+msg);
    }
}
