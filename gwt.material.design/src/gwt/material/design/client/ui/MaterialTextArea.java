package gwt.material.design.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;

public class MaterialTextArea extends Composite {

	private static MaterialTextAreaUiBinder uiBinder = GWT
			.create(MaterialTextAreaUiBinder.class);

	interface MaterialTextAreaUiBinder extends
			UiBinder<Widget, MaterialTextArea> {
	}

	private String placeholder;
	private String type;
	
	@UiField Label lblName;	
	@UiField TextArea txtBox;
	
	public MaterialTextArea() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public String getText() {
		return txtBox.getText();
	}

	public void setText(String text) {
		txtBox.setText(text);
	}

	public String getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
		lblName.setText(placeholder);
		this.removeStyleName("gwt-TextArea");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		txtBox.getElement().setAttribute("type", type);
	}

}
