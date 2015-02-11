package gwt.material.design.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialSideNav extends Composite {

	private static MaterialSideNavUiBinder uiBinder = GWT.create(MaterialSideNavUiBinder.class);

	interface MaterialSideNavUiBinder extends UiBinder<Widget, MaterialSideNav> {
	}

	public MaterialSideNav() {
		initWidget(uiBinder.createAndBindUi(this));
		onInitMaterialDesign();
	}


	 
	
	  public static native void onInitMaterialDesign()/*-{
		$wnd.jQuery(document).ready(function(){
		 	 $wnd.jQuery(".button-collapse").sideNav();
			 $wnd.jQuery('.collapsible').collapsible();
		});
	}-*/;
	
}
