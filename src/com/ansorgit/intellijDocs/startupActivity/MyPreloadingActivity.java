package com.ansorgit.intellijDocs.startupActivity;

import com.intellij.openapi.application.PreloadingActivity;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.progress.ProgressIndicator;
import org.jetbrains.annotations.NotNull;

/**
 * A {@link PreloadingActivity} to demonstrate how a plugin could run some (possibly expensive)
 * activities on startup.
 */
public class MyPreloadingActivity extends PreloadingActivity {
    private static final Logger LOG = Logger.getInstance(MyPreloadingActivity.class);

    /**
     * This method is run in IntelliJ's pooled background thread. Only one PreloadingActivity is run at the same time.
     *
     * @param indicator
     * @see com.intellij.openapi.application.Preloader
     * @see PreloadingActivity
     */
    public void preload(@NotNull ProgressIndicator indicator) {
        LOG.info("Preloading plugin-data");
    }
}
