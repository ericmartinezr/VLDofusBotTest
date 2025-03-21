package fr.lewon.dofus.bot.sniffer.model.messages.game.shortcut

import fr.lewon.dofus.bot.sniffer.model.types.game.shortcut.Shortcut
import fr.lewon.dofus.bot.core.io.stream.ByteArrayReader
import fr.lewon.dofus.bot.sniffer.model.messages.NetworkMessage
import fr.lewon.dofus.bot.sniffer.model.types.NetworkType
import fr.lewon.dofus.bot.sniffer.model.ProtocolTypeManager
import fr.lewon.dofus.bot.core.io.stream.BooleanByteWrapper

open class ShortcutBarRefreshMessage : NetworkMessage() {
	var barType: Int = 0
	lateinit var shortcut: Shortcut
	override fun deserialize(stream: ByteArrayReader) {
		super.deserialize(stream)
		barType = stream.readUnsignedByte().toInt()
		shortcut = ProtocolTypeManager.getInstance<Shortcut>(stream.readUnsignedShort())
		shortcut.deserialize(stream)
	}
	override fun getNetworkMessageId(): Int = 7060
}
