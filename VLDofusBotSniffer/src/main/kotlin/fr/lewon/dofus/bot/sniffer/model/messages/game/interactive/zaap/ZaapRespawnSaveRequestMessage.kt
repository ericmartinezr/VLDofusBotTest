package fr.lewon.dofus.bot.sniffer.model.messages.game.interactive.zaap

import fr.lewon.dofus.bot.core.io.stream.ByteArrayReader
import fr.lewon.dofus.bot.sniffer.model.messages.NetworkMessage
import fr.lewon.dofus.bot.sniffer.model.types.NetworkType
import fr.lewon.dofus.bot.sniffer.model.ProtocolTypeManager
import fr.lewon.dofus.bot.core.io.stream.BooleanByteWrapper

open class ZaapRespawnSaveRequestMessage : NetworkMessage() {
	override fun deserialize(stream: ByteArrayReader) {
		super.deserialize(stream)
	}
	override fun getNetworkMessageId(): Int = 2071
}
