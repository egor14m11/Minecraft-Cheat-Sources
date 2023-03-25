/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.ApiStatus$NonExtendable
 *  org.jetbrains.annotations.ApiStatus$OverrideOnly
 *  org.jetbrains.annotations.ApiStatus$ScheduledForRemoval
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.viaversion.viaversion.libs.kyori.adventure.bossbar;

import com.viaversion.viaversion.libs.kyori.adventure.bossbar.BossBarImpl;
import com.viaversion.viaversion.libs.kyori.adventure.text.Component;
import com.viaversion.viaversion.libs.kyori.adventure.text.ComponentLike;
import com.viaversion.viaversion.libs.kyori.adventure.util.Index;
import com.viaversion.viaversion.libs.kyori.examination.Examinable;
import java.util.Set;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

@ApiStatus.NonExtendable
public interface BossBar
extends Examinable {
    public static final float MIN_PROGRESS = 0.0f;
    public static final float MAX_PROGRESS = 1.0f;
    @Deprecated
    @ApiStatus.ScheduledForRemoval
    public static final float MIN_PERCENT = 0.0f;
    @Deprecated
    @ApiStatus.ScheduledForRemoval
    public static final float MAX_PERCENT = 1.0f;

    @NotNull
    public static BossBar bossBar(@NotNull ComponentLike name, float progress, @NotNull Color color, @NotNull Overlay overlay) {
        BossBarImpl.checkProgress(progress);
        return BossBar.bossBar(name.asComponent(), progress, color, overlay);
    }

    @NotNull
    public static BossBar bossBar(@NotNull Component name, float progress, @NotNull Color color, @NotNull Overlay overlay) {
        BossBarImpl.checkProgress(progress);
        return new BossBarImpl(name, progress, color, overlay);
    }

    @NotNull
    public static BossBar bossBar(@NotNull ComponentLike name, float progress, @NotNull Color color, @NotNull Overlay overlay, @NotNull Set<Flag> flags) {
        BossBarImpl.checkProgress(progress);
        return BossBar.bossBar(name.asComponent(), progress, color, overlay, flags);
    }

    @NotNull
    public static BossBar bossBar(@NotNull Component name, float progress, @NotNull Color color, @NotNull Overlay overlay, @NotNull Set<Flag> flags) {
        BossBarImpl.checkProgress(progress);
        return new BossBarImpl(name, progress, color, overlay, flags);
    }

    @NotNull
    public Component name();

    @Contract(value="_ -> this")
    @NotNull
    default public BossBar name(@NotNull ComponentLike name) {
        return this.name(name.asComponent());
    }

    @Contract(value="_ -> this")
    @NotNull
    public BossBar name(@NotNull Component var1);

    public float progress();

    @Contract(value="_ -> this")
    @NotNull
    public BossBar progress(float var1);

    @Deprecated
    @ApiStatus.ScheduledForRemoval
    default public float percent() {
        return this.progress();
    }

    @Deprecated
    @ApiStatus.ScheduledForRemoval
    @Contract(value="_ -> this")
    @NotNull
    default public BossBar percent(float progress) {
        return this.progress(progress);
    }

    @NotNull
    public Color color();

    @Contract(value="_ -> this")
    @NotNull
    public BossBar color(@NotNull Color var1);

    @NotNull
    public Overlay overlay();

    @Contract(value="_ -> this")
    @NotNull
    public BossBar overlay(@NotNull Overlay var1);

    public @UnmodifiableView @NotNull Set<Flag> flags();

    @Contract(value="_ -> this")
    @NotNull
    public BossBar flags(@NotNull Set<Flag> var1);

    public boolean hasFlag(@NotNull Flag var1);

    @Contract(value="_ -> this")
    @NotNull
    public BossBar addFlag(@NotNull Flag var1);

    @Contract(value="_ -> this")
    @NotNull
    public BossBar removeFlag(@NotNull Flag var1);

    @Contract(value="_ -> this")
    @NotNull
    public BossBar addFlags(Flag ... var1);

    @Contract(value="_ -> this")
    @NotNull
    public BossBar removeFlags(Flag ... var1);

    @Contract(value="_ -> this")
    @NotNull
    public BossBar addFlags(@NotNull Iterable<Flag> var1);

    @Contract(value="_ -> this")
    @NotNull
    public BossBar removeFlags(@NotNull Iterable<Flag> var1);

    @Contract(value="_ -> this")
    @NotNull
    public BossBar addListener(@NotNull Listener var1);

    @Contract(value="_ -> this")
    @NotNull
    public BossBar removeListener(@NotNull Listener var1);

    public static final class Color
    extends Enum<Color> {
        public static final /* enum */ Color PINK = new Color("pink");
        public static final /* enum */ Color BLUE = new Color("blue");
        public static final /* enum */ Color RED = new Color("red");
        public static final /* enum */ Color GREEN = new Color("green");
        public static final /* enum */ Color YELLOW = new Color("yellow");
        public static final /* enum */ Color PURPLE = new Color("purple");
        public static final /* enum */ Color WHITE = new Color("white");
        public static final Index<String, Color> NAMES;
        private final String name;
        private static final /* synthetic */ Color[] $VALUES;

        public static Color[] values() {
            return (Color[])$VALUES.clone();
        }

        public static Color valueOf(String name) {
            return Enum.valueOf(Color.class, name);
        }

        private Color(String name) {
            this.name = name;
        }

        private static /* synthetic */ Color[] $values() {
            return new Color[]{PINK, BLUE, RED, GREEN, YELLOW, PURPLE, WHITE};
        }

        static {
            $VALUES = Color.$values();
            NAMES = Index.create(Color.class, color -> color.name);
        }
    }

    public static final class Overlay
    extends Enum<Overlay> {
        public static final /* enum */ Overlay PROGRESS = new Overlay("progress");
        public static final /* enum */ Overlay NOTCHED_6 = new Overlay("notched_6");
        public static final /* enum */ Overlay NOTCHED_10 = new Overlay("notched_10");
        public static final /* enum */ Overlay NOTCHED_12 = new Overlay("notched_12");
        public static final /* enum */ Overlay NOTCHED_20 = new Overlay("notched_20");
        public static final Index<String, Overlay> NAMES;
        private final String name;
        private static final /* synthetic */ Overlay[] $VALUES;

        public static Overlay[] values() {
            return (Overlay[])$VALUES.clone();
        }

        public static Overlay valueOf(String name) {
            return Enum.valueOf(Overlay.class, name);
        }

        private Overlay(String name) {
            this.name = name;
        }

        private static /* synthetic */ Overlay[] $values() {
            return new Overlay[]{PROGRESS, NOTCHED_6, NOTCHED_10, NOTCHED_12, NOTCHED_20};
        }

        static {
            $VALUES = Overlay.$values();
            NAMES = Index.create(Overlay.class, overlay -> overlay.name);
        }
    }

    public static final class Flag
    extends Enum<Flag> {
        public static final /* enum */ Flag DARKEN_SCREEN = new Flag("darken_screen");
        public static final /* enum */ Flag PLAY_BOSS_MUSIC = new Flag("play_boss_music");
        public static final /* enum */ Flag CREATE_WORLD_FOG = new Flag("create_world_fog");
        public static final Index<String, Flag> NAMES;
        private final String name;
        private static final /* synthetic */ Flag[] $VALUES;

        public static Flag[] values() {
            return (Flag[])$VALUES.clone();
        }

        public static Flag valueOf(String name) {
            return Enum.valueOf(Flag.class, name);
        }

        private Flag(String name) {
            this.name = name;
        }

        private static /* synthetic */ Flag[] $values() {
            return new Flag[]{DARKEN_SCREEN, PLAY_BOSS_MUSIC, CREATE_WORLD_FOG};
        }

        static {
            $VALUES = Flag.$values();
            NAMES = Index.create(Flag.class, flag -> flag.name);
        }
    }

    @ApiStatus.OverrideOnly
    public static interface Listener {
        default public void bossBarNameChanged(@NotNull BossBar bar, @NotNull Component oldName, @NotNull Component newName) {
        }

        default public void bossBarProgressChanged(@NotNull BossBar bar, float oldProgress, float newProgress) {
            this.bossBarPercentChanged(bar, oldProgress, newProgress);
        }

        @Deprecated
        @ApiStatus.ScheduledForRemoval
        default public void bossBarPercentChanged(@NotNull BossBar bar, float oldProgress, float newProgress) {
        }

        default public void bossBarColorChanged(@NotNull BossBar bar, @NotNull Color oldColor, @NotNull Color newColor) {
        }

        default public void bossBarOverlayChanged(@NotNull BossBar bar, @NotNull Overlay oldOverlay, @NotNull Overlay newOverlay) {
        }

        default public void bossBarFlagsChanged(@NotNull BossBar bar, @NotNull Set<Flag> flagsAdded, @NotNull Set<Flag> flagsRemoved) {
        }
    }
}

