// 
// Decompiled by Procyon v0.5.36
// 

public class bqf extends bqh
{
    public bqf(final pr \u2603, final pr \u2603) {
        super("player_combat");
        this.a("player", \u2603.e_());
        if (\u2603 != null) {
            this.a("primary_opponent", \u2603.e_());
        }
        if (\u2603 != null) {
            this.a("Combat between " + \u2603.e_() + " and " + \u2603.e_());
        }
        else {
            this.a("Combat between " + \u2603.e_() + " and others");
        }
    }
}
