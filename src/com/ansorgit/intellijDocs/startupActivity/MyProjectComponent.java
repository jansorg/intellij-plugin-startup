package com.ansorgit.intellijDocs.startupActivity;

import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/**
 */
public class MyProjectComponent implements ProjectComponent {
    private final static Logger LOG = Logger.getInstance(MyProjectComponent.class);

    private final Project project;
    @NotNull
    private final MyApplicationComponent applicationComponent;

    /**
     * @param project The current project, i.e. the project which was just opened.
     */
    public MyProjectComponent(Project project, @NotNull MyApplicationComponent applicationComponent) {
        this.project = project;
        this.applicationComponent = applicationComponent;
    }

    public void initComponent() {
        //called before projectOpened()
    }

    public void projectOpened() {
        LOG.info(String.format("Project '%s' has been opened, base dir '%s'", project.getName(), project.getBaseDir().getCanonicalPath()));
    }

    public void projectClosed() {
        LOG.info(String.format("Project '%s' has been closed.", project.getName()));
    }

    public void disposeComponent() {
        //called after projectClosed()
    }

    @NotNull
    public String getComponentName() {
        return "myProjectComponent";
    }
}
