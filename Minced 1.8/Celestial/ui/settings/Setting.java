package Celestial.ui.settings;

import java.util.function.Supplier;

public class Setting extends Configurable {

    protected String name;
    protected Supplier<Boolean> visible;

    public boolean isVisible() {
        return visible.get();
    }

    public void setVisible(Supplier<Boolean> visible) {
        this.visible = visible;
    }

    public String getName() {
        return name;
    }
}
