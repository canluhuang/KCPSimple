package com.kmm.compiler

import org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext
import org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity
import org.jetbrains.kotlin.cli.common.messages.MessageCollector
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment
import org.jetbrains.kotlin.ir.declarations.path

class SimpleIRGenerationExtension(
    private val messageCollector: MessageCollector
    ) : IrGenerationExtension {

    override fun generate(moduleFragment: IrModuleFragment, pluginContext: IrPluginContext) {
        messageCollector.report(CompilerMessageSeverity.STRONG_WARNING,"[IRGeneration] ${moduleFragment.name}")
        moduleFragment.files.forEach {irFile ->
            messageCollector.report(CompilerMessageSeverity.STRONG_WARNING,"[IRGeneration] irFile: ${irFile.path}")
        }
    }
}