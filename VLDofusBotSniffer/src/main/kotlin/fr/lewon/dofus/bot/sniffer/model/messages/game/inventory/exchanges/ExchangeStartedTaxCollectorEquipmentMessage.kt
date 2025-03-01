package fr.lewon.dofus.bot.sniffer.model.messages.game.inventory.exchanges

import fr.lewon.dofus.bot.sniffer.model.types.game.collector.tax.TaxCollectorInformations
import fr.lewon.dofus.bot.core.io.stream.ByteArrayReader
import fr.lewon.dofus.bot.sniffer.model.messages.NetworkMessage
import fr.lewon.dofus.bot.sniffer.model.types.NetworkType
import fr.lewon.dofus.bot.sniffer.model.ProtocolTypeManager
import fr.lewon.dofus.bot.core.io.stream.BooleanByteWrapper

open class ExchangeStartedTaxCollectorEquipmentMessage : NetworkMessage() {
	lateinit var information: TaxCollectorInformations
	override fun deserialize(stream: ByteArrayReader) {
		super.deserialize(stream)
		information = TaxCollectorInformations()
		information.deserialize(stream)
	}
	override fun getNetworkMessageId(): Int = 4276
}
