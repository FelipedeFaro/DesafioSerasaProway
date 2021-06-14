package com.example.desafioserasaproway.placeholder

import java.math.BigDecimal
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    val ITEMS: MutableList<PlaceholderItem> = ArrayList()

    /**
     * A map of sample (placeholder) items, by ID.
     */
    val ITEM_MAP: MutableMap<Long, PlaceholderItem> = HashMap()

    private val COUNT = 4

    init {
        // Add some sample items.
        addItem(PlaceholderItem(1,"Empréstimo para Estudantes", BigDecimal("4"), 12, BigDecimal("8000"),BigDecimal("500") ))
        addItem(PlaceholderItem(2,"Empréstimo para Aposentado e Pensionista", BigDecimal("2"), 24, BigDecimal("30000"),BigDecimal("1000") ))
        addItem(PlaceholderItem(3,"Empréstimo para Pessoa Jurídica", BigDecimal("3"), 36, BigDecimal("300000"),BigDecimal("400") ))
        addItem(PlaceholderItem(4,"Empréstimo para Pessoa Física", BigDecimal("4"), 24, BigDecimal("40000"),BigDecimal("500.99") ))

    }

    private fun addItem(item: PlaceholderItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }



    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A placeholder item representing a piece of content.
     */
    data class PlaceholderItem(val id: Long, val nome: String , val juros: BigDecimal, val tempo: Int, val max: BigDecimal, val min: BigDecimal) {
        override fun toString(): String = nome
    }
}