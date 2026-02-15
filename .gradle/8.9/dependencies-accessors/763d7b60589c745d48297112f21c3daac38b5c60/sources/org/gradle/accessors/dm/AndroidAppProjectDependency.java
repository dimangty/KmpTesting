package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class AndroidAppProjectDependency extends DelegatingProjectDependency {

    @Inject
    public AndroidAppProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":androidApp:core"
     */
    public AndroidApp_CoreProjectDependency getCore() { return new AndroidApp_CoreProjectDependency(getFactory(), create(":androidApp:core")); }

    /**
     * Creates a project dependency on the project at path ":androidApp:feature_auth"
     */
    public AndroidApp_FeatureAuthProjectDependency getFeatureAuth() { return new AndroidApp_FeatureAuthProjectDependency(getFactory(), create(":androidApp:feature_auth")); }

    /**
     * Creates a project dependency on the project at path ":androidApp:feature_favorites"
     */
    public AndroidApp_FeatureFavoritesProjectDependency getFeatureFavorites() { return new AndroidApp_FeatureFavoritesProjectDependency(getFactory(), create(":androidApp:feature_favorites")); }

    /**
     * Creates a project dependency on the project at path ":androidApp:feature_news"
     */
    public AndroidApp_FeatureNewsProjectDependency getFeatureNews() { return new AndroidApp_FeatureNewsProjectDependency(getFactory(), create(":androidApp:feature_news")); }

}
