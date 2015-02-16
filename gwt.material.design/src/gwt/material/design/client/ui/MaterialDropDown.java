package gwt.material.design.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialDropDown extends Composite {

	private static MaterialDropDownUiBinder uiBinder = GWT.create(MaterialDropDownUiBinder.class);

	interface MaterialDropDownUiBinder extends UiBinder<Widget, MaterialDropDown> {
	}

	public MaterialDropDown() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
