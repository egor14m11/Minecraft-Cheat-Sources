/*
 * Decompiled with CFR 0.150.
 */
package com.viaversion.viaversion.protocols.protocol1_16to1_15_2.storage;

import com.viaversion.viaversion.api.connection.StorableObject;

public class InventoryTracker1_16
implements StorableObject {
    private short inventory = (short)-1;

    public short getInventory() {
        return this.inventory;
    }

    public void setInventory(short inventory) {
        this.inventory = inventory;
    }
}

