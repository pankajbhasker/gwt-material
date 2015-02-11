package gwt.material.design.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class MaterialTopNav extends Composite  {

	private static MaterialTopNavUiBinder uiBinder = GWT.create(MaterialTopNavUiBinder.class);

	interface MaterialTopNavUiBinder extends UiBinder<Widget, MaterialTopNav> {
	}
	
	@UiField Label lblTitle, lblDescription;
	@UiField HTMLPanel panel, customPanel;
	
	private String title = "";
	private String description = "";
	private String color="blue";
	private String textColor="white";
	
	public MaterialTopNav() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiChild( tagname = "child" )
	public void addWidget(Widget item) {
		customPanel.add(item);
	} 

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		lblTitle.setText(title);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		lblDescription.setText(description);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		panel.addStyleName(color);
	}

	public String getTextColor() {
		return textColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;
		panel.getElement().getStyle().setColor(textColor);
	}

	

}
