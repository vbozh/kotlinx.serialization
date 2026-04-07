/*
 * Copyright 2017-2024 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.serialization;

/**
 * A Java class annotated with {@code @Serializable} but without a compiler-generated serializer.
 * Used to reproduce the scenario described in KT-47384, where the serialization compiler plugin
 * is not applied (e.g., in Kotlin script files), causing {@code @Serializable}-annotated classes
 * to fail at runtime with an unhelpful error message.
 */
@Serializable
public class AnnotatedWithoutPlugin {
    public final int x;
    public final String y;

    public AnnotatedWithoutPlugin(int x, String y) {
        this.x = x;
        this.y = y;
    }
}
