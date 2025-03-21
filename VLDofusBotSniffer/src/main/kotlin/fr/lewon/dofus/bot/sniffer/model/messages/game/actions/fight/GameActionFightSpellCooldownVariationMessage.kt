package fr.lewon.dofus.bot.sniffer.model.messages.game.actions.fight

import fr.lewon.dofus.bot.sniffer.model.messages.game.actions.AbstractGameActionMessage
import fr.lewon.dofus.bot.core.io.stream.ByteArrayReader
import fr.lewon.dofus.bot.sniffer.model.messages.NetworkMessage
import fr.lewon.dofus.bot.sniffer.model.types.NetworkType
import fr.lewon.dofus.bot.sniffer.model.ProtocolTypeManager
import fr.lewon.dofus.bot.core.io.stream.BooleanByteWrapper

open class GameActionFightSpellCooldownVariationMessage : AbstractGameActionMessage() {
	var targetId: Double = 0.0
	var spellId: Int = 0
	var value: Int = 0
	override fun deserialize(stream: ByteArrayReader) {
		super.deserialize(stream)
		targetId = stream.readDouble().toDouble()
		spellId = stream.readVarShort().toInt()
		value = stream.readVarShort().toInt()
	}
	override fun getNetworkMessageId(): Int = 2736
}
