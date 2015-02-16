package gwt.material.design.client.ui;

import gwt.material.design.client.custom.MaterialWidget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;

public class MaterialTabs extends MaterialWidget  {

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
	    	$wnd.jQuery('ul.tabs').tabs();
	  	});
	}-*/;
	
}
