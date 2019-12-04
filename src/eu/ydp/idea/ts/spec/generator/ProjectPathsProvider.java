package eu.ydp.idea.ts.spec.generator;

import com.intellij.openapi.project.Project;

public class ProjectPathsProvider {
    private String SOURCE_PATH = "src/";
    private String SPEC_PATH = "src/";

    private Project project;

    public ProjectPathsProvider(Project project) {
        this.project = project;
    }

    public String getSourcePath() {
        return project.getBasePath() + "/" + SOURCE_PATH;
    }

    public String getSpecPath() {
        return project.getBasePath() + "/" + SPEC_PATH;
    }
}
