/*
Copyright 2006 Jerry Huxtable

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.jhlabs.composite;

import java.awt.*;
import java.awt.image.ColorModel;

public final class MiscComposite implements Composite {

	public static final int BLEND = 0;
	public static final int ADD = 1;
	public static final int SUBTRACT = 2;
	public static final int DIFFERENCE = 3;

	public static final int MULTIPLY = 4;
	public static final int DARKEN = 5;
	public static final int BURN = 6;
	public static final int COLOR_BURN = 7;

	public static final int SCREEN = 8;
	public static final int LIGHTEN = 9;
	public static final int DODGE = 10;
	public static final int COLOR_DODGE = 11;

	public static final int HUE = 12;
	public static final int SATURATION = 13;
	public static final int VALUE = 14;
	public static final int COLOR = 15;

	public static final int OVERLAY = 16;
	public static final int SOFT_LIGHT = 17;
	public static final int HARD_LIGHT = 18;
	public static final int PIN_LIGHT = 19;

	public static final int EXCLUSION = 20;
	public static final int NEGATION = 21;
	public static final int AVERAGE = 22;

	public static final int STENCIL = 23;
	public static final int SILHOUETTE = 24;

	private static final int MIN_RULE = BLEND;
	private static final int MAX_RULE = SILHOUETTE;

	public static String[] RULE_NAMES = {
		"Normal",
		"Add",
		"Subtract",
		"Difference",

		"Multiply",
		"Darken",
		"Burn",
		"Color Burn",
		
		"Screen",
		"Lighten",
		"Dodge",
		"Color Dodge",

		"Hue",
		"Saturation",
		"Brightness",
		"Color",
		
		"Overlay",
		"Soft Light",
		"Hard Light",
		"Pin Light",

		"Exclusion",
		"Negation",
		"Average",

		"Stencil",
		"Silhouette",
	};

	protected float extraAlpha;
	protected int rule;

	private MiscComposite(int rule) {
		this(rule, 1.0f);
	}

	private MiscComposite(int rule, float alpha) {
		if (alpha < 0.0f || alpha > 1.0f)
			throw new IllegalArgumentException("alpha value out of range");
		if (rule < MIN_RULE || rule > MAX_RULE)
			throw new IllegalArgumentException("unknown composite rule");
		this.rule = rule;
		extraAlpha = alpha;
	}

	public static Composite getInstance(int rule, float alpha) {
		switch ( rule ) {
		case BLEND:
			return AlphaComposite.getInstance( AlphaComposite.SRC_OVER, alpha );
		case ADD:
			return new AddComposite( alpha );
		case SUBTRACT:
			return new SubtractComposite( alpha );
		case DIFFERENCE:
			return new DifferenceComposite( alpha );
		case MULTIPLY:
			return new MultiplyComposite( alpha );
		case DARKEN:
			return new DarkenComposite( alpha );
		case BURN:
			return new BurnComposite( alpha );
		case COLOR_BURN:
			return new ColorBurnComposite( alpha );
		case SCREEN:
			return new ScreenComposite( alpha );
		case LIGHTEN:
			return new LightenComposite( alpha );
		case DODGE:
			return new DodgeComposite( alpha );
		case COLOR_DODGE:
			return new ColorDodgeComposite( alpha );
		case HUE:
			return new HueComposite( alpha );
		case SATURATION:
			return new SaturationComposite( alpha );
		case VALUE:
			return new ValueComposite( alpha );
		case COLOR:
			return new ColorComposite( alpha );
		case OVERLAY:
			return new OverlayComposite( alpha );
		case SOFT_LIGHT:
			return new SoftLightComposite( alpha );
		case HARD_LIGHT:
			return new HardLightComposite( alpha );
		case PIN_LIGHT:
			return new PinLightComposite( alpha );
		case EXCLUSION:
			return new ExclusionComposite( alpha );
		case NEGATION:
			return new NegationComposite( alpha );
		case AVERAGE:
			return new AverageComposite( alpha );
		case STENCIL:
			return AlphaComposite.getInstance( AlphaComposite.DST_IN, alpha );
		case SILHOUETTE:
			return AlphaComposite.getInstance( AlphaComposite.DST_OUT, alpha );
		}
		return new MiscComposite(rule, alpha);
	}

	public CompositeContext createContext(ColorModel srcColorModel, ColorModel dstColorModel, RenderingHints hints) {
		return new MiscCompositeContext( rule, extraAlpha, srcColorModel, dstColorModel );
	}

	public float getAlpha() {
		return extraAlpha;
	}

	public int getRule() {
		return rule;
	}

	public int hashCode() {
		return (Float.floatToIntBits(extraAlpha) * 31 + rule);
	}

	public boolean equals(Object o) {
		if (!(o instanceof MiscComposite))
			return false;
		MiscComposite c = (MiscComposite)o;

		if (rule != c.rule)
			return false;
        return extraAlpha == c.extraAlpha;
    }
			
}
