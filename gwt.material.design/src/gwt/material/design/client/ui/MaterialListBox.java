package gwt.material.design.client.ui;

import com.google.gwt.user.client.ui.ListBox;

public class MaterialListBox extends ListBox{

	private boolean old = false;
	
	public MaterialListBox() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void onAttach() {
		// TODO Auto-generated method stub
		super.onAttach();
		onInitMaterialDesign();
		
	}
	
	public static native void onInitMaterialDesign()/*-{
		$wnd.jQuery(document).ready(function(){
		  $wnd.jQuery('select').material_select();
		});
	}-*/;

	public boolean isOld() {
		return old;
	}

	public void setOld(boolean old) {
		this.old = old;
		if(old){
			this.addStyleName("browser-default");
		}
	}
	
	
}
