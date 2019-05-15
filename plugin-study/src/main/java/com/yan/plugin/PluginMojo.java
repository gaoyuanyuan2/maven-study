package com.yan.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Created by yan on  15/05/2019.
 */
@Mojo(name = "CustomPlugin",defaultPhase = LifecyclePhase.PACKAGE)
public class PluginMojo extends AbstractMojo {

    @Parameter
    private String param;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("PluginMojo" + param);
    }
}
