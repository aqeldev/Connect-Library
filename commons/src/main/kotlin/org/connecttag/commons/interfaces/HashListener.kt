package org.connecttag.commons.interfaces

interface HashListener {
    fun receivedHash(hash: String, type: Int)
}
