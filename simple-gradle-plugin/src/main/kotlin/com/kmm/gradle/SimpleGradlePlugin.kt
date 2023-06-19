package com.kmm.gradle

import org.gradle.api.Project
import org.gradle.api.provider.Provider
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilerPluginSupportPlugin
import org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption

class SimpleGradlePlugin : KotlinCompilerPluginSupportPlugin {

    companion object {
        private const val TAG = "KuiklyPlugin"

        const val ARTIFACT_GROUP_NAME = "com.kmm.compiler"
        const val ARTIFACT_NAME = "simple-compiler-plugin"
        const val ARTIFACT_VERSION = "1.0"
        const val PLUGIN_ID = "com.kmm.compiler.simple-compiler-plugin"
    }

    override fun apply(target: Project) {
        println("apply")
    }

    override fun getCompilerPluginId(): String = PLUGIN_ID

    override fun isApplicable(kotlinCompilation: KotlinCompilation<*>): Boolean = true

    override fun applyToCompilation(kotlinCompilation: KotlinCompilation<*>): Provider<List<SubpluginOption>> {
        val project = kotlinCompilation.target.project
        return project.provider {
            listOf(SubpluginOption(key = "option-key", value = "option-value"))
        }
    }

    override fun getPluginArtifact(): SubpluginArtifact = SubpluginArtifact(
        ARTIFACT_GROUP_NAME,
        ARTIFACT_NAME,
        ARTIFACT_VERSION
    )

}