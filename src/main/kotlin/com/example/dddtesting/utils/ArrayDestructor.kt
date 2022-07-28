package com.example.dddtesting.utils

class ArrayDestructor {
    companion object {
        private val <T> List<T>.tail: List<T> get() = subList(1, size)
        private val <T> List<T>.head: T get() = first()
        fun <T> List<T>.headTail() = Pair(head, tail)
    }
}