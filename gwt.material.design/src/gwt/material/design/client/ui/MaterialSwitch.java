package gwt.material.design.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialSwitch extends Composite {

	private static MaterialSwitchUiBinder uiBinder = GWT
			.create(MaterialSwitchUiBinder.class);

	interface MaterialSwitchUiBinder extends UiBinder<Widget, MaterialSwitch> {
	}
	
	
	public MaterialSwitch() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	
}
