package gwt.material.design.client.custom;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

@SuppressWarnings("deprecation")
public class ListItem extends ComplexPanel {
	
	public ListItem() {
		setElement(DOM.createElement("LI"));
	}

	public void add(Widget w) {
		super.add(w, getElement());
	}

	public void insert(Widget w, int beforeIndex) {
		super.insert(w, getElement(), beforeIndex, true);
	}

}