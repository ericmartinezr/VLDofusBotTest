package fr.lewon.dofus.bot.sniffer.model.messages.game.alliance.application

import fr.lewon.dofus.bot.core.io.stream.ByteArrayReader
import fr.lewon.dofus.bot.sniffer.model.messages.NetworkMessage
import fr.lewon.dofus.bot.sniffer.model.types.NetworkType
import fr.lewon.dofus.bot.sniffer.model.ProtocolTypeManager
import fr.lewon.dofus.bot.core.io.stream.BooleanByteWrapper

open class AllianceApplicationPresenceMessage : NetworkMessage() {
	var isApplication: Boolean = false
	override fun deserialize(stream: ByteArrayReader) {
		super.deserialize(stream)
		isApplication = stream.readBoolean()
	}
	override fun getNetworkMessageId(): Int = 3867
}
