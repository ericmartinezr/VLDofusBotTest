package fr.lewon.dofus.bot.sniffer.model.messages.game.friend

import fr.lewon.dofus.bot.sniffer.model.types.common.AccountTagInformation
import fr.lewon.dofus.bot.core.io.stream.ByteArrayReader
import fr.lewon.dofus.bot.sniffer.model.messages.NetworkMessage
import fr.lewon.dofus.bot.sniffer.model.types.NetworkType
import fr.lewon.dofus.bot.sniffer.model.ProtocolTypeManager
import fr.lewon.dofus.bot.core.io.stream.BooleanByteWrapper

open class FriendDeleteResultMessage : NetworkMessage() {
	var success: Boolean = false
	lateinit var tag: AccountTagInformation
	override fun deserialize(stream: ByteArrayReader) {
		super.deserialize(stream)
		success = stream.readBoolean()
		tag = AccountTagInformation()
		tag.deserialize(stream)
	}
	override fun getNetworkMessageId(): Int = 8346
}
