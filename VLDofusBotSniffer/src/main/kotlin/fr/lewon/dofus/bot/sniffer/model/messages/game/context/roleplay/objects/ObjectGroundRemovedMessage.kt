package fr.lewon.dofus.bot.sniffer.model.messages.game.context.roleplay.objects

import fr.lewon.dofus.bot.core.io.stream.ByteArrayReader
import fr.lewon.dofus.bot.sniffer.model.messages.NetworkMessage
import fr.lewon.dofus.bot.sniffer.model.types.NetworkType
import fr.lewon.dofus.bot.sniffer.model.ProtocolTypeManager
import fr.lewon.dofus.bot.core.io.stream.BooleanByteWrapper

open class ObjectGroundRemovedMessage : NetworkMessage() {
	var cell: Int = 0
	override fun deserialize(stream: ByteArrayReader) {
		super.deserialize(stream)
		cell = stream.readVarShort().toInt()
	}
	override fun getNetworkMessageId(): Int = 7056
}
