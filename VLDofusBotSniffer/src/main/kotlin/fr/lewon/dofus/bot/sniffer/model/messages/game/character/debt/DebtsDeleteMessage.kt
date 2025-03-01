package fr.lewon.dofus.bot.sniffer.model.messages.game.character.debt

import fr.lewon.dofus.bot.core.io.stream.ByteArrayReader
import fr.lewon.dofus.bot.sniffer.model.messages.NetworkMessage
import fr.lewon.dofus.bot.sniffer.model.types.NetworkType
import fr.lewon.dofus.bot.sniffer.model.ProtocolTypeManager
import fr.lewon.dofus.bot.core.io.stream.BooleanByteWrapper

open class DebtsDeleteMessage : NetworkMessage() {
	var reason: Int = 0
	var debts: ArrayList<Double> = ArrayList()
	override fun deserialize(stream: ByteArrayReader) {
		super.deserialize(stream)
		reason = stream.readUnsignedByte().toInt()
		debts = ArrayList()
		for (i in 0 until stream.readUnsignedShort().toInt()) {
			val item = stream.readDouble().toDouble()
			debts.add(item)
		}
	}
	override fun getNetworkMessageId(): Int = 5016
}
