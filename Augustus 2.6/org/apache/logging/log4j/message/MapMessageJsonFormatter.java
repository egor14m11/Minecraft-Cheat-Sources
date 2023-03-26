// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.logging.log4j.message;

import java.math.BigDecimal;
import org.apache.logging.log4j.util.StringBuilders;
import org.apache.logging.log4j.util.StringBuilderFormattable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.util.IndexedStringMap;
import org.apache.logging.log4j.util.PropertiesUtil;

enum MapMessageJsonFormatter
{
    public static final int MAX_DEPTH;
    private static final char DQUOTE = '\"';
    private static final char RBRACE = ']';
    private static final char LBRACE = '[';
    private static final char COMMA = ',';
    private static final char RCURLY = '}';
    private static final char LCURLY = '{';
    private static final char COLON = ':';
    
    private static int readMaxDepth() {
        final int maxDepth = PropertiesUtil.getProperties().getIntegerProperty("log4j2.mapMessage.jsonFormatter.maxDepth", 8);
        if (maxDepth < 0) {
            throw new IllegalArgumentException("was expecting a positive maxDepth, found: " + maxDepth);
        }
        return maxDepth;
    }
    
    static void format(final StringBuilder sb, final Object object) {
        format(sb, object, 0);
    }
    
    private static void format(final StringBuilder sb, final Object object, final int depth) {
        if (depth >= MapMessageJsonFormatter.MAX_DEPTH) {
            throw new IllegalArgumentException("maxDepth has been exceeded");
        }
        if (object == null) {
            sb.append("null");
        }
        else if (object instanceof IndexedStringMap) {
            final IndexedStringMap map = (IndexedStringMap)object;
            formatIndexedStringMap(sb, map, depth);
        }
        else if (object instanceof Map) {
            final Map<Object, Object> map2 = (Map<Object, Object>)object;
            formatMap(sb, map2, depth);
        }
        else if (object instanceof List) {
            final List<Object> list = (List<Object>)object;
            formatList(sb, list, depth);
        }
        else if (object instanceof Collection) {
            final Collection<Object> collection = (Collection<Object>)object;
            formatCollection(sb, collection, depth);
        }
        else if (object instanceof Number) {
            final Number number = (Number)object;
            formatNumber(sb, number);
        }
        else if (object instanceof Boolean) {
            final boolean booleanValue = (boolean)object;
            formatBoolean(sb, booleanValue);
        }
        else if (object instanceof StringBuilderFormattable) {
            final StringBuilderFormattable formattable = (StringBuilderFormattable)object;
            formatFormattable(sb, formattable);
        }
        else if (object instanceof char[]) {
            final char[] charValues = (char[])object;
            formatCharArray(sb, charValues);
        }
        else if (object instanceof boolean[]) {
            final boolean[] booleanValues = (boolean[])object;
            formatBooleanArray(sb, booleanValues);
        }
        else if (object instanceof byte[]) {
            final byte[] byteValues = (byte[])object;
            formatByteArray(sb, byteValues);
        }
        else if (object instanceof short[]) {
            final short[] shortValues = (short[])object;
            formatShortArray(sb, shortValues);
        }
        else if (object instanceof int[]) {
            final int[] intValues = (int[])object;
            formatIntArray(sb, intValues);
        }
        else if (object instanceof long[]) {
            final long[] longValues = (long[])object;
            formatLongArray(sb, longValues);
        }
        else if (object instanceof float[]) {
            final float[] floatValues = (float[])object;
            formatFloatArray(sb, floatValues);
        }
        else if (object instanceof double[]) {
            final double[] doubleValues = (double[])object;
            formatDoubleArray(sb, doubleValues);
        }
        else if (object instanceof Object[]) {
            final Object[] objectValues = (Object[])object;
            formatObjectArray(sb, objectValues, depth);
        }
        else {
            formatString(sb, object);
        }
    }
    
    private static void formatIndexedStringMap(final StringBuilder sb, final IndexedStringMap map, final int depth) {
        sb.append('{');
        final int nextDepth = depth + 1;
        for (int entryIndex = 0; entryIndex < map.size(); ++entryIndex) {
            final String key = map.getKeyAt(entryIndex);
            final Object value = map.getValueAt(entryIndex);
            if (entryIndex > 0) {
                sb.append(',');
            }
            sb.append('\"');
            final int keyStartIndex = sb.length();
            sb.append(key);
            StringBuilders.escapeJson(sb, keyStartIndex);
            sb.append('\"').append(':');
            format(sb, value, nextDepth);
        }
        sb.append('}');
    }
    
    private static void formatMap(final StringBuilder sb, final Map<Object, Object> map, final int depth) {
        sb.append('{');
        final int nextDepth = depth + 1;
        final boolean[] firstEntry = { true };
        final Object o;
        String keyString;
        int keyStartIndex;
        final int depth2;
        map.forEach((key, value) -> {
            if (key == null) {
                throw new IllegalArgumentException("null keys are not allowed");
            }
            else {
                if (o[0]) {
                    o[0] = false;
                }
                else {
                    sb.append(',');
                }
                sb.append('\"');
                keyString = String.valueOf(key);
                keyStartIndex = sb.length();
                sb.append(keyString);
                StringBuilders.escapeJson(sb, keyStartIndex);
                sb.append('\"').append(':');
                format(sb, value, depth2);
                return;
            }
        });
        sb.append('}');
    }
    
    private static void formatList(final StringBuilder sb, final List<Object> items, final int depth) {
        sb.append('[');
        final int nextDepth = depth + 1;
        for (int itemIndex = 0; itemIndex < items.size(); ++itemIndex) {
            if (itemIndex > 0) {
                sb.append(',');
            }
            final Object item = items.get(itemIndex);
            format(sb, item, nextDepth);
        }
        sb.append(']');
    }
    
    private static void formatCollection(final StringBuilder sb, final Collection<Object> items, final int depth) {
        sb.append('[');
        final int nextDepth = depth + 1;
        final boolean[] firstItem = { true };
        final Object o;
        final int depth2;
        items.forEach(item -> {
            if (o[0]) {
                o[0] = false;
            }
            else {
                sb.append(',');
            }
            format(sb, item, depth2);
            return;
        });
        sb.append(']');
    }
    
    private static void formatNumber(final StringBuilder sb, final Number number) {
        if (number instanceof BigDecimal) {
            final BigDecimal decimalNumber = (BigDecimal)number;
            sb.append(decimalNumber.toString());
        }
        else if (number instanceof Double) {
            final double doubleNumber = (double)number;
            sb.append(doubleNumber);
        }
        else if (number instanceof Float) {
            final float floatNumber = (float)number;
            sb.append(floatNumber);
        }
        else if (number instanceof Byte || number instanceof Short || number instanceof Integer || number instanceof Long) {
            final long longNumber = number.longValue();
            sb.append(longNumber);
        }
        else {
            final long longNumber = number.longValue();
            final double doubleValue = number.doubleValue();
            if (Double.compare((double)longNumber, doubleValue) == 0) {
                sb.append(longNumber);
            }
            else {
                sb.append(doubleValue);
            }
        }
    }
    
    private static void formatBoolean(final StringBuilder sb, final boolean booleanValue) {
        sb.append(booleanValue);
    }
    
    private static void formatFormattable(final StringBuilder sb, final StringBuilderFormattable formattable) {
        sb.append('\"');
        final int startIndex = sb.length();
        formattable.formatTo(sb);
        StringBuilders.escapeJson(sb, startIndex);
        sb.append('\"');
    }
    
    private static void formatCharArray(final StringBuilder sb, final char[] items) {
        sb.append('[');
        for (int itemIndex = 0; itemIndex < items.length; ++itemIndex) {
            if (itemIndex > 0) {
                sb.append(',');
            }
            final char item = items[itemIndex];
            sb.append('\"');
            final int startIndex = sb.length();
            sb.append(item);
            StringBuilders.escapeJson(sb, startIndex);
            sb.append('\"');
        }
        sb.append(']');
    }
    
    private static void formatBooleanArray(final StringBuilder sb, final boolean[] items) {
        sb.append('[');
        for (int itemIndex = 0; itemIndex < items.length; ++itemIndex) {
            if (itemIndex > 0) {
                sb.append(',');
            }
            final boolean item = items[itemIndex];
            sb.append(item);
        }
        sb.append(']');
    }
    
    private static void formatByteArray(final StringBuilder sb, final byte[] items) {
        sb.append('[');
        for (int itemIndex = 0; itemIndex < items.length; ++itemIndex) {
            if (itemIndex > 0) {
                sb.append(',');
            }
            final byte item = items[itemIndex];
            sb.append(item);
        }
        sb.append(']');
    }
    
    private static void formatShortArray(final StringBuilder sb, final short[] items) {
        sb.append('[');
        for (int itemIndex = 0; itemIndex < items.length; ++itemIndex) {
            if (itemIndex > 0) {
                sb.append(',');
            }
            final short item = items[itemIndex];
            sb.append(item);
        }
        sb.append(']');
    }
    
    private static void formatIntArray(final StringBuilder sb, final int[] items) {
        sb.append('[');
        for (int itemIndex = 0; itemIndex < items.length; ++itemIndex) {
            if (itemIndex > 0) {
                sb.append(',');
            }
            final int item = items[itemIndex];
            sb.append(item);
        }
        sb.append(']');
    }
    
    private static void formatLongArray(final StringBuilder sb, final long[] items) {
        sb.append('[');
        for (int itemIndex = 0; itemIndex < items.length; ++itemIndex) {
            if (itemIndex > 0) {
                sb.append(',');
            }
            final long item = items[itemIndex];
            sb.append(item);
        }
        sb.append(']');
    }
    
    private static void formatFloatArray(final StringBuilder sb, final float[] items) {
        sb.append('[');
        for (int itemIndex = 0; itemIndex < items.length; ++itemIndex) {
            if (itemIndex > 0) {
                sb.append(',');
            }
            final float item = items[itemIndex];
            sb.append(item);
        }
        sb.append(']');
    }
    
    private static void formatDoubleArray(final StringBuilder sb, final double[] items) {
        sb.append('[');
        for (int itemIndex = 0; itemIndex < items.length; ++itemIndex) {
            if (itemIndex > 0) {
                sb.append(',');
            }
            final double item = items[itemIndex];
            sb.append(item);
        }
        sb.append(']');
    }
    
    private static void formatObjectArray(final StringBuilder sb, final Object[] items, final int depth) {
        sb.append('[');
        final int nextDepth = depth + 1;
        for (int itemIndex = 0; itemIndex < items.length; ++itemIndex) {
            if (itemIndex > 0) {
                sb.append(',');
            }
            final Object item = items[itemIndex];
            format(sb, item, nextDepth);
        }
        sb.append(']');
    }
    
    private static void formatString(final StringBuilder sb, final Object value) {
        sb.append('\"');
        final int startIndex = sb.length();
        final String valueString = String.valueOf(value);
        sb.append(valueString);
        StringBuilders.escapeJson(sb, startIndex);
        sb.append('\"');
    }
    
    static {
        MAX_DEPTH = readMaxDepth();
    }
}
