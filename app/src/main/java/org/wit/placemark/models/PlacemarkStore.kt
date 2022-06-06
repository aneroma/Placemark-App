package org.wit.placemark.models

interface PlacemarkStore {
    fun findAll() : List<PlacemarkModel>
    fun findById(id: Long) : PlacemarkModel?
    fun create(donation: PlacemarkModel)
}