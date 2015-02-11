package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialGettingStarted extends Composite{

	private static MaterialGettingStartedUiBinder uiBinder = GWT
			.create(MaterialGettingStartedUiBinder.class);

	interface MaterialGettingStartedUiBinder extends
			UiBinder<Widget, MaterialGettingStarted> {
	}

	public MaterialGettingStarted() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	

}
