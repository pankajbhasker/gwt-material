package gwt.material.design.client.ui;

import gwt.material.design.client.custom.ListItem;
import gwt.material.design.client.custom.MaterialWidget;
import gwt.material.design.client.custom.UnorderedList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;

public class MaterialCollection extends MaterialWidget {

	private static MaterialCollectionUiBinder uiBinder = GWT.create(MaterialCollectionUiBinder.class);

	interface MaterialCollectionUiBinder extends UiBinder<Widget, MaterialCollection> {
	}

	@UiField 
	UnorderedList collection;
	
	public MaterialCollection() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	/**
	 * Add each item on a collection container
	 * @param collection, the item to be added 
	 */
	@UiChild(tagname = "item")
	public void onAddItem(Widget item){
	
		ListItem list = new ListItem(item);
		list.addStyleName("collection-item");
		collection.add(list);
	}
	
}
