package fr.lewon.dofus.bot.sniffer.model.messages.game.context.roleplay.fight

import fr.lewon.dofus.bot.core.io.stream.ByteArrayReader
import fr.lewon.dofus.bot.sniffer.model.messages.NetworkMessage
import fr.lewon.dofus.bot.sniffer.model.types.NetworkType
import fr.lewon.dofus.bot.sniffer.model.ProtocolTypeManager
import fr.lewon.dofus.bot.core.io.stream.BooleanByteWrapper

open class GameRolePlayMonsterAngryAtPlayerMessage : NetworkMessage() {
	var playerId: Double = 0.0
	var monsterGroupId: Double = 0.0
	var angryStartTime: Double = 0.0
	var attackTime: Double = 0.0
	override fun deserialize(stream: ByteArrayReader) {
		super.deserialize(stream)
		playerId = stream.readVarLong().toDouble()
		monsterGroupId = stream.readDouble().toDouble()
		angryStartTime = stream.readDouble().toDouble()
		attackTime = stream.readDouble().toDouble()
	}
	override fun getNetworkMessageId(): Int = 1587
}
