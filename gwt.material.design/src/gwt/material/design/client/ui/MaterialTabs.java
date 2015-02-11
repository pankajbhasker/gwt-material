package gwt.material.design.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialTabs extends Composite  {

	private static MaterialTabsUiBinder uiBinder = GWT.create(MaterialTabsUiBinder.class);

	interface MaterialTabsUiBinder extends UiBinder<Widget, MaterialTabs> {
	}

	public MaterialTabs() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	protected void onAttach() {
		// TODO Auto-generated method stub
		super.onAttach();
		initTabs();
	}
	
	

	public static native void initTabs()/*-{
		$wnd.jQuery(document).ready(function(){
	    	$wnd.jQuery('ul.tabs').tabs('select_tab', 'tab_id');
	  	});
	}-*/;
	
}
