package gwt.material.design.client.ui;

import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class MaterialModal {
	
	private static HTMLPanel panel = new HTMLPanel("");
	
	public static void showModal(boolean isShow,Widget composite){
		if(isShow){
			panel.clear();
			panel.getElement().setId("modal1");
			panel.addStyleName("modal");
			panel.add(composite);
			RootPanel.get().add(panel);
			showModal();
		}
		
	}
	
	public static native void showModal()/*-{
		$wnd.jQuery('#modal1').openModal();
	}-*/;
	
	public static native void closeModal()/*-{
		$wnd.jQuery('#modal1').closeModal();
	}-*/;
	
}
