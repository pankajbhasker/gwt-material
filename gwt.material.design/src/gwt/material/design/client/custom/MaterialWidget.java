package gwt.material.design.client.custom;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialWidget extends Composite{
	
	protected String waves = "";
	protected String color = "";
	protected String textColor = "";
	protected String type = "";
	protected Widget widget;

	
	public String getWaves() {
		return waves;
	}

	public void setWaves(String waves) {
		this.waves = waves;
		applyMaterialEffect();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		applyMaterialEffect();
	}

	public String getTextColor() {
		return textColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;
		applyMaterialEffect();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void applyMaterialEffect() {
		if(widget!=null){
			if(!waves.isEmpty()) widget.getElement().addClassName("waves-effect waves-" + waves);
			if(!color.isEmpty()) widget.getElement().addClassName(color);
			if(!textColor.isEmpty()) widget.getElement().addClassName(textColor);
		}
	}

	public Widget getWidget() {
		return widget;
	}

	public void setWidget(Widget widget) {
		this.widget = widget;
	}

}
