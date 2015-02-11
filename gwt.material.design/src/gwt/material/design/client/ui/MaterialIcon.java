package gwt.material.design.client.ui;

import com.google.gwt.dom.client.Style.Cursor;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HTMLPanel;

public class MaterialIcon extends FocusPanel {

	protected HTMLPanel panel = new HTMLPanel("");

	protected String icon;
	protected String fontSize;
	protected String tooltip = "";
	protected String title = "";

	public MaterialIcon() {
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
		this.getElement().getStyle().setCursor(Cursor.POINTER);
		generateIcon();
	}

	public String getFontSize() {
		return fontSize;
	}

	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
		this.getElement().getStyle().setFontSize(Double.valueOf(fontSize), Unit.EM);
	}

	public String getTooltip() {
		return tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
		generateIcon();
	}

	@Override
	protected void onAttach() {
		// TODO Auto-generated method stub
		super.onAttach();
		initTooltip();
	}

	public static native void initTooltip()/*-{
		$wnd.jQuery('.tooltipped').tooltip({
			"delay" : 10
		});
	}-*/;
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		this.getElement().setTitle(title);
	}

	public void generateIcon() {
		this.clear();
		panel = new HTMLPanel("<i class='" + icon + " materialIcon'></i>");
		if (!tooltip.isEmpty()) {
			panel = new HTMLPanel("<i class='tooltipped " + icon + " materialIcon' data-position='bottom' data-tooltip=" + tooltip + "></i>");
		}
		this.add(panel);
	}

}
