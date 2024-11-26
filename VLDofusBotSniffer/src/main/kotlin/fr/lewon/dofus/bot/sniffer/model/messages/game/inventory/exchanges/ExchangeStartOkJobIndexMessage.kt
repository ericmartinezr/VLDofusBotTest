package fr.lewon.dofus.bot.sniffer.model.messages.game.inventory.exchanges

import fr.lewon.dofus.bot.core.io.stream.ByteArrayReader
import fr.lewon.dofus.bot.sniffer.model.messages.NetworkMessage
import fr.lewon.dofus.bot.sniffer.model.types.NetworkType
import fr.lewon.dofus.bot.sniffer.model.ProtocolTypeManager
import fr.lewon.dofus.bot.core.io.stream.BooleanByteWrapper

open class ExchangeStartOkJobIndexMessage : NetworkMessage() {
	var jobs: ArrayList<Int> = ArrayList()
	override fun deserialize(stream: ByteArrayReader) {
		super.deserialize(stream)
		jobs = ArrayList()
		for (i in 0 until stream.readUnsignedShort().toInt()) {
			val item = stream.readVarInt().toInt()
			jobs.add(item)
		}
	}
	override fun getNetworkMessageId(): Int = 1248
}
