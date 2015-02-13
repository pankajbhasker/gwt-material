package gwt.material.design.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class MaterialTextBox extends Composite {

	private static MaterialTextBoxUiBinder uiBinder = GWT.create(MaterialTextBoxUiBinder.class);

	interface MaterialTextBoxUiBinder extends UiBinder<Widget, MaterialTextBox> {
	}

	private String placeholder;
	private String type = "text";
	private String size = "s12";
	private String icon = "";
	private boolean isValid = true;

	@UiField
	Label lblName;
	@UiField
	TextBox txtBox;
	@UiField
	HTMLPanel iconPanel, txtBoxWrapper;

	public MaterialTextBox() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setInvalid() {
		backToDefault();
		txtBox.getElement().addClassName("invalid");
		isValid = false;
	}

	public void setValid() {
		backToDefault();
		txtBox.getElement().addClassName("valid");
		isValid = true;
	}

	public void backToDefault() {
		txtBox.getElement().removeClassName("valid");
		txtBox.getElement().removeClassName("invalid");
	}

	public String getText() {
		return txtBox.getText();
	}

	public void setText(String text) {
		txtBox.setText(text);
		Scheduler.get().scheduleDeferred(new Scheduler.ScheduledCommand() {
			public void execute() {
				txtBox.setFocus(true);
			}
		});

	}

	public String getPlaceholder() {
		return placeholder;

	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
		lblName.setText(placeholder);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		txtBox.getElement().setAttribute("type", type);
	}


	public String getIcon() {
		return icon;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
		txtBoxWrapper.getElement().removeClassName("s12");
		txtBoxWrapper.getElement().addClassName(size);
	}

	public void setIcon(String icon) {
		this.icon = icon;
		iconPanel.addStyleName(icon + " prefix");
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	
	public void setDisabled(boolean disabled){
		
		if(disabled){
			txtBox.setEnabled(disabled);
		} else {
			txtBox.setEnabled(!disabled);
		}
		
			
	}

}
