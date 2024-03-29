package gwt.material.design.client.custom;

import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

@SuppressWarnings("deprecation")
public class CustomAnchor  extends ComplexPanel {
	
	
	public CustomAnchor() {
		setElement(DOM.createElement("A"));
	}

	@UiChild(tagname = "child")
	public void addWidget(final Widget item) {
		add(item);
	}
	
	public void add(Widget w) {
		super.add(w, getElement());
	}

	public void insert(Widget w, int beforeIndex) {
		super.insert(w, getElement(), beforeIndex, true);
	}

}