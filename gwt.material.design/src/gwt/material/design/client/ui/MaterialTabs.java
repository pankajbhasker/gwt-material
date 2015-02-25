package gwt.material.design.client.ui;

import gwt.material.design.client.custom.CustomAnchor;
import gwt.material.design.client.custom.ListItem;
import gwt.material.design.client.custom.MaterialWidget;
import gwt.material.design.client.custom.UnorderedList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;

public class MaterialTabs extends MaterialWidget {

	private static MaterialTabsUiBinder uiBinder = GWT.create(MaterialTabsUiBinder.class);

	interface MaterialTabsUiBinder extends UiBinder<Widget, MaterialTabs> {
	}

	@UiField
	MaterialRow contentPanel;
	@UiField
	UnorderedList tabPanel;

	private String name;
	
	private String color = "";
	private String textColor = "";
	private String indicatorColor = "";
	private String waves = "";

	public MaterialTabs() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	protected void onAttach() {
		super.onAttach();

		int col = 12 / tabPanel.getWidgetCount();
		int index = tabPanel.getWidgetCount();
		for (Widget w : tabPanel) {
			if (w instanceof ListItem) {
				if(!waves.isEmpty()) w.getElement().addClassName("waves-effect waves-" + waves);
				if(!color.isEmpty()) w.getElement().addClassName(color);
				if(!textColor.isEmpty()) ((ListItem) w).getWidget(0).getElement().addClassName(textColor + "-text");
				((ListItem) w).getWidget(0).getElement().setAttribute("href", "#" + name + index);
				w.addStyleName("tab col s" + col);
				index--;
			}
		}

		int indexC = contentPanel.getWidgetCount();
		for (Widget w : contentPanel) {
			w.getElement().setAttribute("id", name + indexC);
			indexC--;
		}
		initTabs();
		
	}

	@UiChild(tagname = "tab")
	public void addTab(final Widget item) {
		CustomAnchor a = new CustomAnchor();
		a.add(item);
		ListItem li = new ListItem(a);
		tabPanel.add(li);
	}

	@UiChild(tagname = "content")
	public void addContent(final Widget item) {
		item.addStyleName("col s12");
		contentPanel.add(item);
	}

	public static native void initTabs()/*-{
		$wnd.jQuery(document).ready(function() {
			$wnd.jQuery('ul.tabs').tabs();
		});
	}-*/;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTextColor() {
		return textColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}

	public String getIndicatorColor() {
		return indicatorColor;
	}

	public void setIndicatorColor(String indicatorColor) {
		this.indicatorColor = indicatorColor;
		
	}

	public String getWaves() {
		return waves;
	}

	public void setWaves(String waves) {
		this.waves = waves;
	}
	
}
