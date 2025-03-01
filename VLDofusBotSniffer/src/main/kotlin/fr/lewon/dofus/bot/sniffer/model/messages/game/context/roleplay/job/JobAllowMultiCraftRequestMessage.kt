package fr.lewon.dofus.bot.sniffer.model.messages.game.context.roleplay.job

import fr.lewon.dofus.bot.core.io.stream.ByteArrayReader
import fr.lewon.dofus.bot.sniffer.model.messages.NetworkMessage
import fr.lewon.dofus.bot.sniffer.model.types.NetworkType
import fr.lewon.dofus.bot.sniffer.model.ProtocolTypeManager
import fr.lewon.dofus.bot.core.io.stream.BooleanByteWrapper

open class JobAllowMultiCraftRequestMessage : NetworkMessage() {
	var enabled: Boolean = false
	override fun deserialize(stream: ByteArrayReader) {
		super.deserialize(stream)
		enabled = stream.readBoolean()
	}
	override fun getNetworkMessageId(): Int = 3486
}
