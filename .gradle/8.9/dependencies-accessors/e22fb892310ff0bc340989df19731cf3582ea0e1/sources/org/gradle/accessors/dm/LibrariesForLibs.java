package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final CoilLibraryAccessors laccForCoilLibraryAccessors = new CoilLibraryAccessors(owner);
    private final ComposeLibraryAccessors laccForComposeLibraryAccessors = new ComposeLibraryAccessors(owner);
    private final KoinLibraryAccessors laccForKoinLibraryAccessors = new KoinLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final KotlinxLibraryAccessors laccForKotlinxLibraryAccessors = new KotlinxLibraryAccessors(owner);
    private final KtorLibraryAccessors laccForKtorLibraryAccessors = new KtorLibraryAccessors(owner);
    private final MokoLibraryAccessors laccForMokoLibraryAccessors = new MokoLibraryAccessors(owner);
    private final SqldelightLibraryAccessors laccForSqldelightLibraryAccessors = new SqldelightLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Dependency provider for <b>datetime</b> with <b>org.jetbrains.kotlinx:kotlinx-datetime</b> coordinates and
     * with version reference <b>kotlinx.datetime</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getDatetime() {
        return create("datetime");
    }

    /**
     * Dependency provider for <b>junit</b> with <b>junit:junit</b> coordinates and
     * with version reference <b>junit</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getJunit() {
        return create("junit");
    }

    /**
     * Dependency provider for <b>material</b> with <b>com.google.android.material:material</b> coordinates and
     * with version reference <b>material</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getMaterial() {
        return create("material");
    }

    /**
     * Dependency provider for <b>napier</b> with <b>io.github.aakira:napier</b> coordinates and
     * with version reference <b>napier</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getNapier() {
        return create("napier");
    }

    /**
     * Dependency provider for <b>touchLab</b> with <b>co.touchlab:stately-common</b> coordinates and
     * with version reference <b>touchLab</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getTouchLab() {
        return create("touchLab");
    }

    /**
     * Dependency provider for <b>turbine</b> with <b>app.cash.turbine:turbine</b> coordinates and
     * with version reference <b>turbine</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getTurbine() {
        return create("turbine");
    }

    /**
     * Group of libraries at <b>androidx</b>
     */
    public AndroidxLibraryAccessors getAndroidx() {
        return laccForAndroidxLibraryAccessors;
    }

    /**
     * Group of libraries at <b>coil</b>
     */
    public CoilLibraryAccessors getCoil() {
        return laccForCoilLibraryAccessors;
    }

    /**
     * Group of libraries at <b>compose</b>
     */
    public ComposeLibraryAccessors getCompose() {
        return laccForComposeLibraryAccessors;
    }

    /**
     * Group of libraries at <b>koin</b>
     */
    public KoinLibraryAccessors getKoin() {
        return laccForKoinLibraryAccessors;
    }

    /**
     * Group of libraries at <b>kotlin</b>
     */
    public KotlinLibraryAccessors getKotlin() {
        return laccForKotlinLibraryAccessors;
    }

    /**
     * Group of libraries at <b>kotlinx</b>
     */
    public KotlinxLibraryAccessors getKotlinx() {
        return laccForKotlinxLibraryAccessors;
    }

    /**
     * Group of libraries at <b>ktor</b>
     */
    public KtorLibraryAccessors getKtor() {
        return laccForKtorLibraryAccessors;
    }

    /**
     * Group of libraries at <b>moko</b>
     */
    public MokoLibraryAccessors getMoko() {
        return laccForMokoLibraryAccessors;
    }

    /**
     * Group of libraries at <b>sqldelight</b>
     */
    public SqldelightLibraryAccessors getSqldelight() {
        return laccForSqldelightLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxActivityLibraryAccessors laccForAndroidxActivityLibraryAccessors = new AndroidxActivityLibraryAccessors(owner);
        private final AndroidxCoreLibraryAccessors laccForAndroidxCoreLibraryAccessors = new AndroidxCoreLibraryAccessors(owner);
        private final AndroidxEspressoLibraryAccessors laccForAndroidxEspressoLibraryAccessors = new AndroidxEspressoLibraryAccessors(owner);
        private final AndroidxLifecycleLibraryAccessors laccForAndroidxLifecycleLibraryAccessors = new AndroidxLifecycleLibraryAccessors(owner);
        private final AndroidxNavigationLibraryAccessors laccForAndroidxNavigationLibraryAccessors = new AndroidxNavigationLibraryAccessors(owner);
        private final AndroidxUiLibraryAccessors laccForAndroidxUiLibraryAccessors = new AndroidxUiLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>appcompat</b> with <b>androidx.appcompat:appcompat</b> coordinates and
         * with version reference <b>appcompat</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAppcompat() {
            return create("androidx.appcompat");
        }

        /**
         * Dependency provider for <b>junit</b> with <b>androidx.test.ext:junit</b> coordinates and
         * with version reference <b>junitVersion</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit() {
            return create("androidx.junit");
        }

        /**
         * Group of libraries at <b>androidx.activity</b>
         */
        public AndroidxActivityLibraryAccessors getActivity() {
            return laccForAndroidxActivityLibraryAccessors;
        }

        /**
         * Group of libraries at <b>androidx.core</b>
         */
        public AndroidxCoreLibraryAccessors getCore() {
            return laccForAndroidxCoreLibraryAccessors;
        }

        /**
         * Group of libraries at <b>androidx.espresso</b>
         */
        public AndroidxEspressoLibraryAccessors getEspresso() {
            return laccForAndroidxEspressoLibraryAccessors;
        }

        /**
         * Group of libraries at <b>androidx.lifecycle</b>
         */
        public AndroidxLifecycleLibraryAccessors getLifecycle() {
            return laccForAndroidxLifecycleLibraryAccessors;
        }

        /**
         * Group of libraries at <b>androidx.navigation</b>
         */
        public AndroidxNavigationLibraryAccessors getNavigation() {
            return laccForAndroidxNavigationLibraryAccessors;
        }

        /**
         * Group of libraries at <b>androidx.ui</b>
         */
        public AndroidxUiLibraryAccessors getUi() {
            return laccForAndroidxUiLibraryAccessors;
        }

    }

    public static class AndroidxActivityLibraryAccessors extends SubDependencyFactory {

        public AndroidxActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compose</b> with <b>androidx.activity:activity-compose</b> coordinates and
         * with version reference <b>androidx.activityCompose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompose() {
            return create("androidx.activity.compose");
        }

    }

    public static class AndroidxCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ktx</b> with <b>androidx.core:core-ktx</b> coordinates and
         * with version reference <b>coreKtx</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKtx() {
            return create("androidx.core.ktx");
        }

    }

    public static class AndroidxEspressoLibraryAccessors extends SubDependencyFactory {

        public AndroidxEspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>androidx.test.espresso:espresso-core</b> coordinates and
         * with version reference <b>espressoCore</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("androidx.espresso.core");
        }

    }

    public static class AndroidxLifecycleLibraryAccessors extends SubDependencyFactory {

        public AndroidxLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>viewmodel</b> with <b>androidx.lifecycle:lifecycle-viewmodel</b> coordinates and
         * with version reference <b>lifecycle</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getViewmodel() {
            return create("androidx.lifecycle.viewmodel");
        }

    }

    public static class AndroidxNavigationLibraryAccessors extends SubDependencyFactory {

        public AndroidxNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compose</b> with <b>androidx.navigation:navigation-compose</b> coordinates and
         * with version reference <b>navigationCompose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompose() {
            return create("androidx.navigation.compose");
        }

    }

    public static class AndroidxUiLibraryAccessors extends SubDependencyFactory {
        private final AndroidxUiToolingLibraryAccessors laccForAndroidxUiToolingLibraryAccessors = new AndroidxUiToolingLibraryAccessors(owner);

        public AndroidxUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>androidx.ui.tooling</b>
         */
        public AndroidxUiToolingLibraryAccessors getTooling() {
            return laccForAndroidxUiToolingLibraryAccessors;
        }

    }

    public static class AndroidxUiToolingLibraryAccessors extends SubDependencyFactory {
        private final AndroidxUiToolingPreviewLibraryAccessors laccForAndroidxUiToolingPreviewLibraryAccessors = new AndroidxUiToolingPreviewLibraryAccessors(owner);

        public AndroidxUiToolingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>androidx.ui.tooling.preview</b>
         */
        public AndroidxUiToolingPreviewLibraryAccessors getPreview() {
            return laccForAndroidxUiToolingPreviewLibraryAccessors;
        }

    }

    public static class AndroidxUiToolingPreviewLibraryAccessors extends SubDependencyFactory {

        public AndroidxUiToolingPreviewLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>android</b> with <b>androidx.compose.ui:ui-tooling-preview-android</b> coordinates and
         * with version reference <b>uiToolingPreviewAndroid</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroid() {
            return create("androidx.ui.tooling.preview.android");
        }

    }

    public static class CoilLibraryAccessors extends SubDependencyFactory {

        public CoilLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compose</b> with <b>io.coil-kt:coil-compose</b> coordinates and
         * with version reference <b>coil</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompose() {
            return create("coil.compose");
        }

    }

    public static class ComposeLibraryAccessors extends SubDependencyFactory {
        private final ComposeUiLibraryAccessors laccForComposeUiLibraryAccessors = new ComposeUiLibraryAccessors(owner);

        public ComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>foundation</b> with <b>androidx.compose.foundation:foundation</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFoundation() {
            return create("compose.foundation");
        }

        /**
         * Dependency provider for <b>material</b> with <b>androidx.compose.material:material</b> coordinates and
         * with version reference <b>compose.material</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMaterial() {
            return create("compose.material");
        }

        /**
         * Dependency provider for <b>material3</b> with <b>androidx.compose.material3:material3</b> coordinates and
         * with version reference <b>compose.material3</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMaterial3() {
            return create("compose.material3");
        }

        /**
         * Group of libraries at <b>compose.ui</b>
         */
        public ComposeUiLibraryAccessors getUi() {
            return laccForComposeUiLibraryAccessors;
        }

    }

    public static class ComposeUiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final ComposeUiToolingLibraryAccessors laccForComposeUiToolingLibraryAccessors = new ComposeUiToolingLibraryAccessors(owner);

        public ComposeUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ui</b> with <b>androidx.compose.ui:ui</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("compose.ui");
        }

        /**
         * Group of libraries at <b>compose.ui.tooling</b>
         */
        public ComposeUiToolingLibraryAccessors getTooling() {
            return laccForComposeUiToolingLibraryAccessors;
        }

    }

    public static class ComposeUiToolingLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComposeUiToolingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>tooling</b> with <b>androidx.compose.ui:ui-tooling</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("compose.ui.tooling");
        }

        /**
         * Dependency provider for <b>preview</b> with <b>androidx.compose.ui:ui-tooling-preview</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPreview() {
            return create("compose.ui.tooling.preview");
        }

    }

    public static class KoinLibraryAccessors extends SubDependencyFactory {
        private final KoinAndroidLibraryAccessors laccForKoinAndroidLibraryAccessors = new KoinAndroidLibraryAccessors(owner);

        public KoinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>io.insert-koin:koin-core</b> coordinates and
         * with version reference <b>koin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("koin.core");
        }

        /**
         * Group of libraries at <b>koin.android</b>
         */
        public KoinAndroidLibraryAccessors getAndroid() {
            return laccForKoinAndroidLibraryAccessors;
        }

    }

    public static class KoinAndroidLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public KoinAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>android</b> with <b>io.insert-koin:koin-android</b> coordinates and
         * with version reference <b>koin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("koin.android");
        }

        /**
         * Dependency provider for <b>compose</b> with <b>io.insert-koin:koin-androidx-compose</b> coordinates and
         * with version reference <b>koin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompose() {
            return create("koin.android.compose");
        }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {
        private final KotlinCoroutinesLibraryAccessors laccForKotlinCoroutinesLibraryAccessors = new KotlinCoroutinesLibraryAccessors(owner);

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>test</b> with <b>org.jetbrains.kotlin:kotlin-test</b> coordinates and
         * with version reference <b>kotlin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTest() {
            return create("kotlin.test");
        }

        /**
         * Group of libraries at <b>kotlin.coroutines</b>
         */
        public KotlinCoroutinesLibraryAccessors getCoroutines() {
            return laccForKotlinCoroutinesLibraryAccessors;
        }

    }

    public static class KotlinCoroutinesLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public KotlinCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>coroutines</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-core</b> coordinates and
         * with version reference <b>kotlin.coroutines</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("kotlin.coroutines");
        }

        /**
         * Dependency provider for <b>test</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-test</b> coordinates and
         * with version reference <b>kotlin.coroutines</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTest() {
            return create("kotlin.coroutines.test");
        }

    }

    public static class KotlinxLibraryAccessors extends SubDependencyFactory {
        private final KotlinxSerializationLibraryAccessors laccForKotlinxSerializationLibraryAccessors = new KotlinxSerializationLibraryAccessors(owner);

        public KotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>kotlinx.serialization</b>
         */
        public KotlinxSerializationLibraryAccessors getSerialization() {
            return laccForKotlinxSerializationLibraryAccessors;
        }

    }

    public static class KotlinxSerializationLibraryAccessors extends SubDependencyFactory {

        public KotlinxSerializationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.jetbrains.kotlinx:kotlinx-serialization-core</b> coordinates and
         * with version reference <b>kotlinx.serialization</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("kotlinx.serialization.core");
        }

    }

    public static class KtorLibraryAccessors extends SubDependencyFactory {
        private final KtorClientLibraryAccessors laccForKtorClientLibraryAccessors = new KtorClientLibraryAccessors(owner);
        private final KtorSerializationLibraryAccessors laccForKtorSerializationLibraryAccessors = new KtorSerializationLibraryAccessors(owner);

        public KtorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>ktor.client</b>
         */
        public KtorClientLibraryAccessors getClient() {
            return laccForKtorClientLibraryAccessors;
        }

        /**
         * Group of libraries at <b>ktor.serialization</b>
         */
        public KtorSerializationLibraryAccessors getSerialization() {
            return laccForKtorSerializationLibraryAccessors;
        }

    }

    public static class KtorClientLibraryAccessors extends SubDependencyFactory {

        public KtorClientLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>android</b> with <b>io.ktor:ktor-client-android</b> coordinates and
         * with version reference <b>ktor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroid() {
            return create("ktor.client.android");
        }

        /**
         * Dependency provider for <b>cio</b> with <b>io.ktor:ktor-client-cio</b> coordinates and
         * with version reference <b>ktor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCio() {
            return create("ktor.client.cio");
        }

        /**
         * Dependency provider for <b>core</b> with <b>io.ktor:ktor-client-core</b> coordinates and
         * with version reference <b>ktor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("ktor.client.core");
        }

        /**
         * Dependency provider for <b>ios</b> with <b>io.ktor:ktor-client-ios</b> coordinates and
         * with version reference <b>ktor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getIos() {
            return create("ktor.client.ios");
        }

        /**
         * Dependency provider for <b>js</b> with <b>io.ktor:ktor-client-js</b> coordinates and
         * with version reference <b>ktor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJs() {
            return create("ktor.client.js");
        }

        /**
         * Dependency provider for <b>logging</b> with <b>io.ktor:ktor-client-logging</b> coordinates and
         * with version reference <b>ktor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLogging() {
            return create("ktor.client.logging");
        }

        /**
         * Dependency provider for <b>mock</b> with <b>io.ktor:ktor-client-mock</b> coordinates and
         * with version reference <b>ktor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMock() {
            return create("ktor.client.mock");
        }

        /**
         * Dependency provider for <b>negotiation</b> with <b>io.ktor:ktor-client-content-negotiation</b> coordinates and
         * with version reference <b>ktor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getNegotiation() {
            return create("ktor.client.negotiation");
        }

        /**
         * Dependency provider for <b>okhttp</b> with <b>io.ktor:ktor-client-okhttp</b> coordinates and
         * with version reference <b>ktor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOkhttp() {
            return create("ktor.client.okhttp");
        }

        /**
         * Dependency provider for <b>serialization</b> with <b>io.ktor:ktor-client-serialization</b> coordinates and
         * with version reference <b>ktor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSerialization() {
            return create("ktor.client.serialization");
        }

    }

    public static class KtorSerializationLibraryAccessors extends SubDependencyFactory {
        private final KtorSerializationKotlinxLibraryAccessors laccForKtorSerializationKotlinxLibraryAccessors = new KtorSerializationKotlinxLibraryAccessors(owner);

        public KtorSerializationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>ktor.serialization.kotlinx</b>
         */
        public KtorSerializationKotlinxLibraryAccessors getKotlinx() {
            return laccForKtorSerializationKotlinxLibraryAccessors;
        }

    }

    public static class KtorSerializationKotlinxLibraryAccessors extends SubDependencyFactory {

        public KtorSerializationKotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>json</b> with <b>io.ktor:ktor-serialization-kotlinx-json</b> coordinates and
         * with version reference <b>ktor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJson() {
            return create("ktor.serialization.kotlinx.json");
        }

    }

    public static class MokoLibraryAccessors extends SubDependencyFactory {
        private final MokoResourcesLibraryAccessors laccForMokoResourcesLibraryAccessors = new MokoResourcesLibraryAccessors(owner);

        public MokoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>moko.resources</b>
         */
        public MokoResourcesLibraryAccessors getResources() {
            return laccForMokoResourcesLibraryAccessors;
        }

    }

    public static class MokoResourcesLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public MokoResourcesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>resources</b> with <b>dev.icerock.moko:resources</b> coordinates and
         * with version reference <b>moko.resources</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("moko.resources");
        }

        /**
         * Dependency provider for <b>generator</b> with <b>dev.icerock.moko:resources-generator</b> coordinates and
         * with version reference <b>moko.resources</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGenerator() {
            return create("moko.resources.generator");
        }

    }

    public static class SqldelightLibraryAccessors extends SubDependencyFactory {
        private final SqldelightAndroidLibraryAccessors laccForSqldelightAndroidLibraryAccessors = new SqldelightAndroidLibraryAccessors(owner);
        private final SqldelightCoroutinesLibraryAccessors laccForSqldelightCoroutinesLibraryAccessors = new SqldelightCoroutinesLibraryAccessors(owner);
        private final SqldelightDesktopLibraryAccessors laccForSqldelightDesktopLibraryAccessors = new SqldelightDesktopLibraryAccessors(owner);
        private final SqldelightNativeLibraryAccessors laccForSqldelightNativeLibraryAccessors = new SqldelightNativeLibraryAccessors(owner);

        public SqldelightLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>sqldelight.android</b>
         */
        public SqldelightAndroidLibraryAccessors getAndroid() {
            return laccForSqldelightAndroidLibraryAccessors;
        }

        /**
         * Group of libraries at <b>sqldelight.coroutines</b>
         */
        public SqldelightCoroutinesLibraryAccessors getCoroutines() {
            return laccForSqldelightCoroutinesLibraryAccessors;
        }

        /**
         * Group of libraries at <b>sqldelight.desktop</b>
         */
        public SqldelightDesktopLibraryAccessors getDesktop() {
            return laccForSqldelightDesktopLibraryAccessors;
        }

        /**
         * Group of libraries at <b>sqldelight.native</b>
         */
        public SqldelightNativeLibraryAccessors getNative() {
            return laccForSqldelightNativeLibraryAccessors;
        }

    }

    public static class SqldelightAndroidLibraryAccessors extends SubDependencyFactory {

        public SqldelightAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>driver</b> with <b>app.cash.sqldelight:android-driver</b> coordinates and
         * with version reference <b>sqldelight</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDriver() {
            return create("sqldelight.android.driver");
        }

    }

    public static class SqldelightCoroutinesLibraryAccessors extends SubDependencyFactory {

        public SqldelightCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>extensions</b> with <b>app.cash.sqldelight:coroutines-extensions</b> coordinates and
         * with version reference <b>sqldelight</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getExtensions() {
            return create("sqldelight.coroutines.extensions");
        }

    }

    public static class SqldelightDesktopLibraryAccessors extends SubDependencyFactory {

        public SqldelightDesktopLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>driver</b> with <b>app.cash.sqldelight:sqlite-driver</b> coordinates and
         * with version reference <b>sqldelight</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDriver() {
            return create("sqldelight.desktop.driver");
        }

    }

    public static class SqldelightNativeLibraryAccessors extends SubDependencyFactory {

        public SqldelightNativeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>driver</b> with <b>app.cash.sqldelight:native-driver</b> coordinates and
         * with version reference <b>sqldelight</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDriver() {
            return create("sqldelight.native.driver");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AndroidxVersionAccessors vaccForAndroidxVersionAccessors = new AndroidxVersionAccessors(providers, config);
        private final ComposeVersionAccessors vaccForComposeVersionAccessors = new ComposeVersionAccessors(providers, config);
        private final KotlinVersionAccessors vaccForKotlinVersionAccessors = new KotlinVersionAccessors(providers, config);
        private final KotlinxVersionAccessors vaccForKotlinxVersionAccessors = new KotlinxVersionAccessors(providers, config);
        private final MokoVersionAccessors vaccForMokoVersionAccessors = new MokoVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>agp</b> with value <b>8.7.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAgp() { return getVersion("agp"); }

        /**
         * Version alias <b>appcompat</b> with value <b>1.7.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAppcompat() { return getVersion("appcompat"); }

        /**
         * Version alias <b>coil</b> with value <b>2.7.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCoil() { return getVersion("coil"); }

        /**
         * Version alias <b>coreKtx</b> with value <b>1.15.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCoreKtx() { return getVersion("coreKtx"); }

        /**
         * Version alias <b>espressoCore</b> with value <b>3.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getEspressoCore() { return getVersion("espressoCore"); }

        /**
         * Version alias <b>junit</b> with value <b>4.13.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJunit() { return getVersion("junit"); }

        /**
         * Version alias <b>junitVersion</b> with value <b>1.2.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJunitVersion() { return getVersion("junitVersion"); }

        /**
         * Version alias <b>koin</b> with value <b>4.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKoin() { return getVersion("koin"); }

        /**
         * Version alias <b>ktor</b> with value <b>2.3.6</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKtor() { return getVersion("ktor"); }

        /**
         * Version alias <b>lifecycle</b> with value <b>2.8.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLifecycle() { return getVersion("lifecycle"); }

        /**
         * Version alias <b>material</b> with value <b>1.12.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMaterial() { return getVersion("material"); }

        /**
         * Version alias <b>napier</b> with value <b>2.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getNapier() { return getVersion("napier"); }

        /**
         * Version alias <b>navigationCompose</b> with value <b>2.8.7</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getNavigationCompose() { return getVersion("navigationCompose"); }

        /**
         * Version alias <b>sqldelight</b> with value <b>2.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSqldelight() { return getVersion("sqldelight"); }

        /**
         * Version alias <b>touchLab</b> with value <b>2.0.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTouchLab() { return getVersion("touchLab"); }

        /**
         * Version alias <b>turbine</b> with value <b>1.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTurbine() { return getVersion("turbine"); }

        /**
         * Version alias <b>uiToolingPreviewAndroid</b> with value <b>1.7.8</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getUiToolingPreviewAndroid() { return getVersion("uiToolingPreviewAndroid"); }

        /**
         * Group of versions at <b>versions.androidx</b>
         */
        public AndroidxVersionAccessors getAndroidx() {
            return vaccForAndroidxVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.compose</b>
         */
        public ComposeVersionAccessors getCompose() {
            return vaccForComposeVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.kotlin</b>
         */
        public KotlinVersionAccessors getKotlin() {
            return vaccForKotlinVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.kotlinx</b>
         */
        public KotlinxVersionAccessors getKotlinx() {
            return vaccForKotlinxVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.moko</b>
         */
        public MokoVersionAccessors getMoko() {
            return vaccForMokoVersionAccessors;
        }

    }

    public static class AndroidxVersionAccessors extends VersionFactory  {

        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>androidx.activityCompose</b> with value <b>1.8.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getActivityCompose() { return getVersion("androidx.activityCompose"); }

    }

    public static class ComposeVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public ComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>compose</b> with value <b>1.5.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("compose"); }

        /**
         * Version alias <b>compose.material</b> with value <b>1.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMaterial() { return getVersion("compose.material"); }

        /**
         * Version alias <b>compose.material3</b> with value <b>1.1.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMaterial3() { return getVersion("compose.material3"); }

    }

    public static class KotlinVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public KotlinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>kotlin</b> with value <b>2.0.20</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("kotlin"); }

        /**
         * Version alias <b>kotlin.coroutines</b> with value <b>1.10.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCoroutines() { return getVersion("kotlin.coroutines"); }

    }

    public static class KotlinxVersionAccessors extends VersionFactory  {

        public KotlinxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>kotlinx.datetime</b> with value <b>0.4.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getDatetime() { return getVersion("kotlinx.datetime"); }

        /**
         * Version alias <b>kotlinx.serialization</b> with value <b>1.6.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSerialization() { return getVersion("kotlinx.serialization"); }

    }

    public static class MokoVersionAccessors extends VersionFactory  {

        public MokoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>moko.resources</b> with value <b>0.24.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getResources() { return getVersion("moko.resources"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final ComposePluginAccessors paccForComposePluginAccessors = new ComposePluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>androidApplication</b> with plugin id <b>com.android.application</b> and
         * with version reference <b>agp</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getAndroidApplication() { return createPlugin("androidApplication"); }

        /**
         * Plugin provider for <b>androidLibrary</b> with plugin id <b>com.android.library</b> and
         * with version reference <b>agp</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getAndroidLibrary() { return createPlugin("androidLibrary"); }

        /**
         * Plugin provider for <b>kotlinAndroid</b> with plugin id <b>org.jetbrains.kotlin.android</b> and
         * with version reference <b>kotlin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getKotlinAndroid() { return createPlugin("kotlinAndroid"); }

        /**
         * Plugin provider for <b>kotlinCocoapods</b> with plugin id <b>org.jetbrains.kotlin.native.cocoapods</b> and
         * with version reference <b>kotlin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getKotlinCocoapods() { return createPlugin("kotlinCocoapods"); }

        /**
         * Plugin provider for <b>kotlinMultiplatform</b> with plugin id <b>org.jetbrains.kotlin.multiplatform</b> and
         * with version reference <b>kotlin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getKotlinMultiplatform() { return createPlugin("kotlinMultiplatform"); }

        /**
         * Plugin provider for <b>serialization</b> with plugin id <b>org.jetbrains.kotlin.plugin.serialization</b> and
         * with version reference <b>kotlin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getSerialization() { return createPlugin("serialization"); }

        /**
         * Plugin provider for <b>sqldelight</b> with plugin id <b>app.cash.sqldelight</b> and
         * with version reference <b>sqldelight</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getSqldelight() { return createPlugin("sqldelight"); }

        /**
         * Group of plugins at <b>plugins.compose</b>
         */
        public ComposePluginAccessors getCompose() {
            return paccForComposePluginAccessors;
        }

    }

    public static class ComposePluginAccessors extends PluginFactory {

        public ComposePluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>compose.compiler</b> with plugin id <b>org.jetbrains.kotlin.plugin.compose</b> and
         * with version reference <b>kotlin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getCompiler() { return createPlugin("compose.compiler"); }

    }

}
