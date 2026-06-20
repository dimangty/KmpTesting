package com.example.kursovikkmp.memorycache

import co.touchlab.stately.concurrency.AtomicReference

class MemoryCache<K, V> {
    private val map = AtomicReference<Map<K, V>>(emptyMap())

    fun get(key: K): V? {
        return map.get()[key]
    }

    fun put(key: K, value: V) {
        map.set(map.get() + (key to value))
    }

    fun remove(key: K) {
        map.set(map.get() - key)
    }

    fun clear() {
        map.set(emptyMap())
    }
}
