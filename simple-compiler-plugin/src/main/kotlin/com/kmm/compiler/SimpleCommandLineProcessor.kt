package com.kmm.compiler

import com.google.auto.service.AutoService
import org.jetbrains.kotlin.compiler.plugin.AbstractCliOption
import org.jetbrains.kotlin.compiler.plugin.CliOption
import org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor
import org.jetbrains.kotlin.compiler.plugin.ExperimentalCompilerApi
import org.jetbrains.kotlin.config.CompilerConfiguration

@OptIn(ExperimentalCompilerApi::class)
@AutoService(CommandLineProcessor::class)
class SimpleCommandLineProcessor : CommandLineProcessor {

    override val pluginId: String = "com.tencent.kuikly.core-compiler-plugin"

    override val pluginOptions: Collection<CliOption> = listOf(
        CliOption(
            optionName = "option-key",
            valueDescription = "Sample option",
            description = "Some sample option",
            required = false,
        )
    )

    override fun processOption(
        option: AbstractCliOption,
        value: String,
        configuration: CompilerConfiguration
    ) {
        super.processOption(option, value, configuration)
        println("[JSExportKCP] processOption, optionName: ${option.optionName}")
    }

}