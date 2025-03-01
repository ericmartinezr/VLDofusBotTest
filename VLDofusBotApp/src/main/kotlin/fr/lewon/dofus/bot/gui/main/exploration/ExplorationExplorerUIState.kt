package fr.lewon.dofus.bot.gui.main.exploration

import fr.lewon.dofus.bot.scripts.impl.ExploreAreaScriptBuilder
import fr.lewon.dofus.bot.scripts.parameters.DofusBotParameter

data class ExplorationExplorerUIState(
    val selectedCharacterName: String? = null,
    val availableCharacters: List<String> = emptyList(),
    val explorationParameterValuesByName: Map<DofusBotParameter, String> = listOf(
        ExploreAreaScriptBuilder.stopWhenArchMonsterFoundParameter,
        ExploreAreaScriptBuilder.stopWhenQuestMonsterFoundParameter,
        ExploreAreaScriptBuilder.killEverythingParameter,
        ExploreAreaScriptBuilder.runForeverParameter,
        ExploreAreaScriptBuilder.searchedMonsterParameter,
        ExploreAreaScriptBuilder.harvestParameter,
        ExploreAreaScriptBuilder.harvestAllParameter,
        ExploreAreaScriptBuilder.harvestJobParameter,
        ExploreAreaScriptBuilder.ignoreMapsExploredRecentlyParameter
    ).associateWith { it.defaultValue }
)