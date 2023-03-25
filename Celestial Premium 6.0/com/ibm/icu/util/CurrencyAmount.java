/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.Currency;
import com.ibm.icu.util.Measure;

public class CurrencyAmount
extends Measure {
    public CurrencyAmount(Number number, Currency currency) {
        super(number, currency);
    }

    public CurrencyAmount(double number, Currency currency) {
        super(new Double(number), currency);
    }

    public Currency getCurrency() {
        return (Currency)this.getUnit();
    }
}

