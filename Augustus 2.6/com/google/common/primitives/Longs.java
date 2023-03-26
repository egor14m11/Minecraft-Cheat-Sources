// 
// Decompiled by Procyon v0.5.36
// 

package com.google.common.primitives;

import java.util.Spliterators;
import java.util.Spliterator;
import java.util.RandomAccess;
import java.util.AbstractList;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Arrays;
import com.google.common.base.Converter;
import javax.annotation.CheckForNull;
import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class Longs
{
    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 4611686018427387904L;
    
    private Longs() {
    }
    
    public static int hashCode(final long value) {
        return (int)(value ^ value >>> 32);
    }
    
    public static int compare(final long a, final long b) {
        return (a < b) ? -1 : ((a > b) ? 1 : 0);
    }
    
    public static boolean contains(final long[] array, final long target) {
        for (final long value : array) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }
    
    public static int indexOf(final long[] array, final long target) {
        return indexOf(array, target, 0, array.length);
    }
    
    private static int indexOf(final long[] array, final long target, final int start, final int end) {
        for (int i = start; i < end; ++i) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static int indexOf(final long[] array, final long[] target) {
        Preconditions.checkNotNull(array, (Object)"array");
        Preconditions.checkNotNull(target, (Object)"target");
        if (target.length == 0) {
            return 0;
        }
        int i = 0;
    Label_0023:
        while (i < array.length - target.length + 1) {
            for (int j = 0; j < target.length; ++j) {
                if (array[i + j] != target[j]) {
                    ++i;
                    continue Label_0023;
                }
            }
            return i;
        }
        return -1;
    }
    
    public static int lastIndexOf(final long[] array, final long target) {
        return lastIndexOf(array, target, 0, array.length);
    }
    
    private static int lastIndexOf(final long[] array, final long target, final int start, final int end) {
        for (int i = end - 1; i >= start; --i) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static long min(final long... array) {
        Preconditions.checkArgument(array.length > 0);
        long min = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    public static long max(final long... array) {
        Preconditions.checkArgument(array.length > 0);
        long max = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
    @Beta
    public static long constrainToRange(final long value, final long min, final long max) {
        Preconditions.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        return Math.min(Math.max(value, min), max);
    }
    
    public static long[] concat(final long[]... arrays) {
        int length = 0;
        for (final long[] array : arrays) {
            length += array.length;
        }
        final long[] result = new long[length];
        int pos = 0;
        for (final long[] array2 : arrays) {
            System.arraycopy(array2, 0, result, pos, array2.length);
            pos += array2.length;
        }
        return result;
    }
    
    public static byte[] toByteArray(long value) {
        final byte[] result = new byte[8];
        for (int i = 7; i >= 0; --i) {
            result[i] = (byte)(value & 0xFFL);
            value >>= 8;
        }
        return result;
    }
    
    public static long fromByteArray(final byte[] bytes) {
        Preconditions.checkArgument(bytes.length >= 8, "array too small: %s < %s", bytes.length, 8);
        return fromBytes(bytes[0], bytes[1], bytes[2], bytes[3], bytes[4], bytes[5], bytes[6], bytes[7]);
    }
    
    public static long fromBytes(final byte b1, final byte b2, final byte b3, final byte b4, final byte b5, final byte b6, final byte b7, final byte b8) {
        return ((long)b1 & 0xFFL) << 56 | ((long)b2 & 0xFFL) << 48 | ((long)b3 & 0xFFL) << 40 | ((long)b4 & 0xFFL) << 32 | ((long)b5 & 0xFFL) << 24 | ((long)b6 & 0xFFL) << 16 | ((long)b7 & 0xFFL) << 8 | ((long)b8 & 0xFFL);
    }
    
    @CheckForNull
    @Beta
    public static Long tryParse(final String string) {
        return tryParse(string, 10);
    }
    
    @CheckForNull
    @Beta
    public static Long tryParse(final String string, final int radix) {
        if (Preconditions.checkNotNull(string).isEmpty()) {
            return null;
        }
        if (radix < 2 || radix > 36) {
            throw new IllegalArgumentException(new StringBuilder(65).append("radix must be between MIN_RADIX and MAX_RADIX but was ").append(radix).toString());
        }
        int index;
        final boolean negative = (index = ((string.charAt(0) == '-') ? 1 : 0)) != 0;
        if (index == string.length()) {
            return null;
        }
        int digit = AsciiDigits.digit(string.charAt(index++));
        if (digit < 0 || digit >= radix) {
            return null;
        }
        long accum = -digit;
        final long cap = Long.MIN_VALUE / radix;
        while (index < string.length()) {
            digit = AsciiDigits.digit(string.charAt(index++));
            if (digit < 0 || digit >= radix || accum < cap) {
                return null;
            }
            accum *= radix;
            if (accum < Long.MIN_VALUE + digit) {
                return null;
            }
            accum -= digit;
        }
        if (negative) {
            return accum;
        }
        if (accum == Long.MIN_VALUE) {
            return null;
        }
        return -accum;
    }
    
    @Beta
    public static Converter<String, Long> stringConverter() {
        return LongConverter.INSTANCE;
    }
    
    public static long[] ensureCapacity(final long[] array, final int minLength, final int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return (array.length < minLength) ? Arrays.copyOf(array, minLength + padding) : array;
    }
    
    public static String join(final String separator, final long... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        final StringBuilder builder = new StringBuilder(array.length * 10);
        builder.append(array[0]);
        for (int i = 1; i < array.length; ++i) {
            builder.append(separator).append(array[i]);
        }
        return builder.toString();
    }
    
    public static Comparator<long[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }
    
    public static void sortDescending(final long[] array) {
        Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }
    
    public static void sortDescending(final long[] array, final int fromIndex, final int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }
    
    public static void reverse(final long[] array) {
        Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }
    
    public static void reverse(final long[] array, final int fromIndex, final int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = fromIndex, j = toIndex - 1; i < j; ++i, --j) {
            final long tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
    
    public static long[] toArray(final Collection<? extends Number> collection) {
        if (collection instanceof LongArrayAsList) {
            return ((LongArrayAsList)collection).toLongArray();
        }
        final Object[] boxedArray = collection.toArray();
        final int len = boxedArray.length;
        final long[] array = new long[len];
        for (int i = 0; i < len; ++i) {
            array[i] = Preconditions.checkNotNull(boxedArray[i]).longValue();
        }
        return array;
    }
    
    public static List<Long> asList(final long... backingArray) {
        if (backingArray.length == 0) {
            return Collections.emptyList();
        }
        return new LongArrayAsList(backingArray);
    }
    
    static final class AsciiDigits
    {
        private static final byte[] asciiDigits;
        
        private AsciiDigits() {
        }
        
        static int digit(final char c) {
            return (c < '\u0080') ? AsciiDigits.asciiDigits[c] : -1;
        }
        
        static {
            final byte[] result = new byte[128];
            Arrays.fill(result, (byte)(-1));
            for (int i = 0; i < 10; ++i) {
                result[48 + i] = (byte)i;
            }
            for (int i = 0; i < 26; ++i) {
                result[65 + i] = (byte)(10 + i);
                result[97 + i] = (byte)(10 + i);
            }
            asciiDigits = result;
        }
    }
    
    private static final class LongConverter extends Converter<String, Long> implements Serializable
    {
        static final LongConverter INSTANCE;
        private static final long serialVersionUID = 1L;
        
        @Override
        protected Long doForward(final String value) {
            return Long.decode(value);
        }
        
        @Override
        protected String doBackward(final Long value) {
            return value.toString();
        }
        
        @Override
        public String toString() {
            return "Longs.stringConverter()";
        }
        
        private Object readResolve() {
            return LongConverter.INSTANCE;
        }
        
        static {
            INSTANCE = new LongConverter();
        }
    }
    
    private enum LexicographicalComparator implements Comparator<long[]>
    {
        INSTANCE;
        
        @Override
        public int compare(final long[] left, final long[] right) {
            for (int minLength = Math.min(left.length, right.length), i = 0; i < minLength; ++i) {
                final int result = Longs.compare(left[i], right[i]);
                if (result != 0) {
                    return result;
                }
            }
            return left.length - right.length;
        }
        
        @Override
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }
        
        private static /* synthetic */ LexicographicalComparator[] $values() {
            return new LexicographicalComparator[] { LexicographicalComparator.INSTANCE };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @GwtCompatible
    private static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable
    {
        final long[] array;
        final int start;
        final int end;
        private static final long serialVersionUID = 0L;
        
        LongArrayAsList(final long[] array) {
            this(array, 0, array.length);
        }
        
        LongArrayAsList(final long[] array, final int start, final int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }
        
        @Override
        public int size() {
            return this.end - this.start;
        }
        
        @Override
        public boolean isEmpty() {
            return false;
        }
        
        @Override
        public Long get(final int index) {
            Preconditions.checkElementIndex(index, this.size());
            return this.array[this.start + index];
        }
        
        @Override
        public Spliterator.OfLong spliterator() {
            return Spliterators.spliterator(this.array, this.start, this.end, 0);
        }
        
        @Override
        public boolean contains(@CheckForNull final Object target) {
            return target instanceof Long && indexOf(this.array, (long)target, this.start, this.end) != -1;
        }
        
        @Override
        public int indexOf(@CheckForNull final Object target) {
            if (target instanceof Long) {
                final int i = indexOf(this.array, (long)target, this.start, this.end);
                if (i >= 0) {
                    return i - this.start;
                }
            }
            return -1;
        }
        
        @Override
        public int lastIndexOf(@CheckForNull final Object target) {
            if (target instanceof Long) {
                final int i = lastIndexOf(this.array, (long)target, this.start, this.end);
                if (i >= 0) {
                    return i - this.start;
                }
            }
            return -1;
        }
        
        @Override
        public Long set(final int index, final Long element) {
            Preconditions.checkElementIndex(index, this.size());
            final long oldValue = this.array[this.start + index];
            this.array[this.start + index] = Preconditions.checkNotNull(element);
            return oldValue;
        }
        
        @Override
        public List<Long> subList(final int fromIndex, final int toIndex) {
            final int size = this.size();
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size);
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            return new LongArrayAsList(this.array, this.start + fromIndex, this.start + toIndex);
        }
        
        @Override
        public boolean equals(@CheckForNull final Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof LongArrayAsList)) {
                return super.equals(object);
            }
            final LongArrayAsList that = (LongArrayAsList)object;
            final int size = this.size();
            if (that.size() != size) {
                return false;
            }
            for (int i = 0; i < size; ++i) {
                if (this.array[this.start + i] != that.array[that.start + i]) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public int hashCode() {
            int result = 1;
            for (int i = this.start; i < this.end; ++i) {
                result = 31 * result + Longs.hashCode(this.array[i]);
            }
            return result;
        }
        
        @Override
        public String toString() {
            final StringBuilder builder = new StringBuilder(this.size() * 10);
            builder.append('[').append(this.array[this.start]);
            for (int i = this.start + 1; i < this.end; ++i) {
                builder.append(", ").append(this.array[i]);
            }
            return builder.append(']').toString();
        }
        
        long[] toLongArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }
}
