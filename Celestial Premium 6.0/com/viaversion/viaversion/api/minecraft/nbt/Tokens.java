/*
 * Decompiled with CFR 0.150.
 */
package com.viaversion.viaversion.api.minecraft.nbt;

final class Tokens {
    static final char COMPOUND_BEGIN = '{';
    static final char COMPOUND_END = '}';
    static final char COMPOUND_KEY_TERMINATOR = ':';
    static final char ARRAY_BEGIN = '[';
    static final char ARRAY_END = ']';
    static final char ARRAY_SIGNATURE_SEPARATOR = ';';
    static final char VALUE_SEPARATOR = ',';
    static final char SINGLE_QUOTE = '\'';
    static final char DOUBLE_QUOTE = '\"';
    static final char ESCAPE_MARKER = '\\';
    static final char TYPE_BYTE = 'B';
    static final char TYPE_SHORT = 'S';
    static final char TYPE_INT = 'I';
    static final char TYPE_LONG = 'L';
    static final char TYPE_FLOAT = 'F';
    static final char TYPE_DOUBLE = 'D';
    static final char EOF = '\u0000';

    private Tokens() {
    }

    static boolean id(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '-' || c == '_' || c == '.' || c == '+';
    }

    static boolean numeric(char c) {
        return c >= '0' && c <= '9' || c == '+' || c == '-' || c == 'e' || c == 'E' || c == '.';
    }
}

