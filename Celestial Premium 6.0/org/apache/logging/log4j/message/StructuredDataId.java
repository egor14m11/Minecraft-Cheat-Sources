/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.message;

import java.io.Serializable;

public class StructuredDataId
implements Serializable {
    public static final StructuredDataId TIME_QUALITY = new StructuredDataId("timeQuality", null, new String[]{"tzKnown", "isSynced", "syncAccuracy"});
    public static final StructuredDataId ORIGIN = new StructuredDataId("origin", null, new String[]{"ip", "enterpriseId", "software", "swVersion"});
    public static final StructuredDataId META = new StructuredDataId("meta", null, new String[]{"sequenceId", "sysUpTime", "language"});
    public static final int RESERVED = -1;
    private static final long serialVersionUID = 9031746276396249990L;
    private static final int MAX_LENGTH = 32;
    private final String name;
    private final int enterpriseNumber;
    private final String[] required;
    private final String[] optional;

    protected StructuredDataId(String name, String[] required, String[] optional) {
        int index = -1;
        if (name != null) {
            if (name.length() > 32) {
                throw new IllegalArgumentException(String.format("Length of id %s exceeds maximum of %d characters", name, 32));
            }
            index = name.indexOf("@");
        }
        if (index > 0) {
            this.name = name.substring(0, index);
            this.enterpriseNumber = Integer.parseInt(name.substring(index + 1));
        } else {
            this.name = name;
            this.enterpriseNumber = -1;
        }
        this.required = required;
        this.optional = optional;
    }

    public StructuredDataId(String name, int enterpriseNumber, String[] required, String[] optional) {
        String id;
        if (name == null) {
            throw new IllegalArgumentException("No structured id name was supplied");
        }
        if (name.contains("@")) {
            throw new IllegalArgumentException("Structured id name cannot contain an '@");
        }
        if (enterpriseNumber <= 0) {
            throw new IllegalArgumentException("No enterprise number was supplied");
        }
        this.name = name;
        this.enterpriseNumber = enterpriseNumber;
        String string = id = enterpriseNumber < 0 ? name : name + "@" + enterpriseNumber;
        if (id.length() > 32) {
            throw new IllegalArgumentException("Length of id exceeds maximum of 32 characters: " + id);
        }
        this.required = required;
        this.optional = optional;
    }

    public StructuredDataId makeId(StructuredDataId id) {
        if (id == null) {
            return this;
        }
        return this.makeId(id.getName(), id.getEnterpriseNumber());
    }

    public StructuredDataId makeId(String defaultId, int enterpriseNumber) {
        String[] opt;
        String[] req;
        String id;
        if (enterpriseNumber <= 0) {
            return this;
        }
        if (this.name != null) {
            id = this.name;
            req = this.required;
            opt = this.optional;
        } else {
            id = defaultId;
            req = null;
            opt = null;
        }
        return new StructuredDataId(id, enterpriseNumber, req, opt);
    }

    public String[] getRequired() {
        return this.required;
    }

    public String[] getOptional() {
        return this.optional;
    }

    public String getName() {
        return this.name;
    }

    public int getEnterpriseNumber() {
        return this.enterpriseNumber;
    }

    public boolean isReserved() {
        return this.enterpriseNumber <= 0;
    }

    public String toString() {
        return this.isReserved() ? this.name : this.name + "@" + this.enterpriseNumber;
    }
}

