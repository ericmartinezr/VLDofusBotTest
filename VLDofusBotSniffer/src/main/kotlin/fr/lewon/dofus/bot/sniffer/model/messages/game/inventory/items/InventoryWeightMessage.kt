package fr.lewon.dofus.bot.sniffer.model.messages.game.inventory.items

import fr.lewon.dofus.bot.core.io.stream.ByteArrayReader
import fr.lewon.dofus.bot.sniffer.model.messages.NetworkMessage
import fr.lewon.dofus.bot.sniffer.model.types.NetworkType
import fr.lewon.dofus.bot.sniffer.model.ProtocolTypeManager
import fr.lewon.dofus.bot.core.io.stream.BooleanByteWrapper

open class InventoryWeightMessage : NetworkMessage() {
	var inventoryWeight: Int = 0
	var weightMax: Int = 0
	override fun deserialize(stream: ByteArrayReader) {
		super.deserialize(stream)
		inventoryWeight = stream.readVarInt().toInt()
		weightMax = stream.readVarInt().toInt()
	}
	override fun getNetworkMessageId(): Int = 4358
}
