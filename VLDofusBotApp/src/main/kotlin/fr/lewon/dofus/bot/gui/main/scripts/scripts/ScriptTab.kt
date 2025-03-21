package fr.lewon.dofus.bot.gui.main.scripts.scripts

import fr.lewon.dofus.bot.gui.main.scripts.characters.CharactersUIUtil

enum class ScriptTab(val title: String, val isEnabled: () -> Boolean, val onTabSelect: () -> Unit) {

    GLOBAL("Global scripts", { true }, {}),
    INDIVIDUAL("Individual scripts", { CharactersUIUtil.getSelectedCharacterUIState() != null }, { })

}