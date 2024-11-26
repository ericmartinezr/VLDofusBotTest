package fr.lewon.dofus.bot.sniffer.model.messages.web.haapi

import fr.lewon.dofus.bot.core.io.stream.ByteArrayReader
import fr.lewon.dofus.bot.sniffer.model.messages.NetworkMessage
import fr.lewon.dofus.bot.sniffer.model.types.NetworkType
import fr.lewon.dofus.bot.sniffer.model.ProtocolTypeManager
import fr.lewon.dofus.bot.core.io.stream.BooleanByteWrapper

open class HaapiValidationRequestMessage : NetworkMessage() {
	var transaction: String = ""
	override fun deserialize(stream: ByteArrayReader) {
		super.deserialize(stream)
		transaction = stream.readUTF()
	}
	override fun getNetworkMessageId(): Int = 2930
}
