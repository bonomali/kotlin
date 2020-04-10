/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

@file:Suppress("PackageDirectoryMismatch")
package kotlin

import kotlin.reflect.*

@SinceKotlin("1.4")
@kotlin.internal.InlineOnly
public inline operator fun <V> KProperty0<V>.getValue(thisRef: Any?, property: KProperty<*>): V {
    return get()
}

@SinceKotlin("1.4")
@kotlin.internal.InlineOnly
public inline operator fun <V> KMutableProperty0<V>.setValue(thisRef: Any?, property: KProperty<*>, value: V) {
    set(value)
}

@SinceKotlin("1.4")
@kotlin.internal.InlineOnly
public inline operator fun <T, V> KProperty1<T, V>.getValue(thisRef: T, property: KProperty<*>): V {
    return get(thisRef)
}

@SinceKotlin("1.4")
@kotlin.internal.InlineOnly
public inline operator fun <T, V> KMutableProperty1<T, V>.setValue(thisRef: T, property: KProperty<*>, value: V) {
    set(thisRef, value)
}