package gwt.material.design.client.ui;

import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.HTMLPanel;

public class MaterialPanel extends HTMLPanel{

	private String color = "";
	private String align = "";
	private String textColor = "";
	
	public MaterialPanel(SafeHtml safeHtml) {
		super(safeHtml);
		// TODO Auto-generated constructor stub
	}

	public MaterialPanel(String tag, String html) {
		super(tag, html);
		// TODO Auto-generated constructor stub
	}

	public MaterialPanel(String html) {
		super(html);
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		this.addStyleName(color);
	}

	public String getAlign() {
		return align;
	}

	public void setAlign(String align) {
		this.align = align;
		this.addStyleName(align);
	}

	public String getTextColor() {
		return textColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;
		this.addStyleName(textColor + "-text");
	}

	
	
}
