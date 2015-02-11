package gwt.material.design.demo.client.panel;

import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialTopNav;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class MaterialDemo extends Composite {

	private static MaterialDemoUiBinder uiBinder = GWT.create(MaterialDemoUiBinder.class);

	interface MaterialDemoUiBinder extends UiBinder<Widget, MaterialDemo> {
	}
	
	@UiField HTMLPanel contentPanel;
	@UiField Label btnAbout, btnButtons, btnForms, btnDialogs, btnLoaders, btnMedia;

	
	@UiField MaterialHome materialHome;
	@UiField MaterialButtonPanel materialButtons;
	@UiField MaterialForms materialForms;
	@UiField MaterialDialogs materialDialogs;
	@UiField MaterialLoaders materialLoaders;
	@UiField MaterialMedia materialMedia;
	@UiField MaterialGettingStarted materialGettingStarted;
	
	@UiField MaterialNavBar navBar;
	@UiField MaterialTopNav topNav;
	
	public MaterialDemo() {
		initWidget(uiBinder.createAndBindUi(this));
		changeNav(materialHome,"GWT Material Design", "Under Development");
	}

	@Override
	protected void onAttach() {
		// TODO Auto-generated method stub
		super.onAttach();
	}
	
	@UiHandler("btnGettingStarted")
	void onGettingStarted(ClickEvent e){
		changeNav(materialGettingStarted,"Getting Started", "Learn how to easily start using GWT Material Design in your app.");
	}
	
	@UiHandler("btnAbout")
	void onAbout(ClickEvent e){
		changeNav(materialHome,"GWT Material Design", "Under Development");
	}
	
	@UiHandler("btnButtons")
	void onButtons(ClickEvent e){
		changeNav(materialButtons,"Buttons", "There are 3 main button types described in material design. The raised button is a standard button that signify actions and seek to give depth to a mostly flat page. The floating circular action button is meant for very important functions. Flat buttons are usually used within elements that already have depth like cards or modals.");
	}
	
	@UiHandler("btnForms")
	void onForms(ClickEvent e){
		changeNav(materialForms, "Forms", "Forms are the standard way to receive user inputted data. The transitions and smoothness of these elements are very important because of the inherent user interaction associated with forms.");
	}
	
	@UiHandler("btnDialogs")
	void onDialogs(ClickEvent e){
		changeNav(materialDialogs, "Dialogs", "Dialogs are content that are not original visible on a page but show up with extra information if needed. The transitions should make the appearance of the dialog make sense and not jarring to the user.");
	}
	
	@UiHandler("btnLoaders")
	void onLoaders(ClickEvent e){
		changeNav(materialLoaders, "Loaders", "If you have content that will take a long time to load, you should give the user feedback. For this reason we provide a number activity + progress indicators.");
	}
	
	@UiHandler("btnMedia")
	void onMedia(ClickEvent e){
		changeNav(materialMedia, "Media", "Media components include things that have to do with large media objects like Images, Video, Audio, etc.");
	}

	
	private void changeNav(Composite content, String title, String description){
		MaterialAnimator.animate(Transition.PULL, contentPanel, 500);
		navBar.hide();
		contentPanel.clear();
		contentPanel.add(content);
		topNav.setTitle(title);
		topNav.setDescription(description);
	}
	
}
