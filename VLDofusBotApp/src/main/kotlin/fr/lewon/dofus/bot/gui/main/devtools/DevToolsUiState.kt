package fr.lewon.dofus.bot.gui.main.devtools

import androidx.compose.foundation.lazy.LazyListState

data class DevToolsUiState(
    val selectedD2OModule: String? = null,
    val loading: Boolean = false,
    val selectedModuleListState: LazyListState = LazyListState(),
    val nameFilter: String = "",
    val moduleItemNameFilter: String = "",
    val moduleItemIdFilter: String = "",
    val selectedModuleItems: List<ModuleItem> = emptyList()
)

data class ModuleItem(
    val id: Int?,
    val name: String?,
    val description: String?,
    val content: String
)