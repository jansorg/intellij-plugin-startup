package com.ansorgit.intellijDocs.startupActivity;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import org.jetbrains.annotations.NotNull;

/**
 * A {@link StartupActivity} to demonstrate how a plugin can execute some code after a project has been opened.
 */
public class MyPostStartupActivity implements StartupActivity {
    public void runActivity(@NotNull Project project) {

    }
}
