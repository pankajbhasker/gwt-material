package gwt.material.design.client.ui;

import com.google.gwt.dom.client.Style.Cursor;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HTMLPanel;

public class MaterialLink extends FocusPanel {

	protected HTMLPanel panel = new HTMLPanel("");
	private String text = "";
	private String icon = "";
	private String iconPosition = "";
	private String textColor = "";
	protected String fontSize = "";
	private String wave = "";
	private Object object;

	public MaterialLink() {
		// TODO Auto-generated constructor stub
	}
	
	

	public MaterialLink(String text, String textColor) {
		super();
		this.text = text;
		this.textColor = textColor;
	}



	public MaterialLink(String text) {
		super();
		this.text = text;
	}

	public String getTextColor() {
		return textColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;
		generateLink();
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
		generateLink();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
		generateLink();
	}

	public String getFontSize() {
		return fontSize;
	}

	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
		this.getElement().getStyle().setFontSize(Double.valueOf(fontSize), Unit.EM);
	}

	public String getIconPosition() {
		return iconPosition;
	}

	public void setIconPosition(String iconPosition) {
		this.iconPosition = iconPosition;
		generateLink();
	}

	public void generateLink() {
		this.clear();
		String iconMarkup = "";
		if (!icon.isEmpty()) {
			iconMarkup = "<i class='" + icon + " " + iconPosition + "'></i>";
		}
		panel = new HTMLPanel("<a class='" + textColor + "-text'>" + iconMarkup + " " + text + "</a>");
		panel.getElement().getStyle().setCursor(Cursor.POINTER);
		this.add(panel);
	}

	public String getWave() {
		return wave;
	}

	public void setWave(String wave) {
		this.wave = wave;
		if (!wave.isEmpty()) {
			this.addStyleName("waves-effect waves-" + wave);
		}
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}
