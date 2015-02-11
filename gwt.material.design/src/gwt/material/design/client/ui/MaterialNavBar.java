package gwt.material.design.client.ui;

import gwt.material.design.client.custom.CustomAnchor;
import gwt.material.design.client.custom.ListItem;
import gwt.material.design.client.custom.UnorderedList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

public class MaterialNavBar extends Composite {

	private static MaterialNavBarUiBinder uiBinder = GWT.create(MaterialNavBarUiBinder.class);

	interface MaterialNavBarUiBinder extends UiBinder<Widget, MaterialNavBar> {
	}

	private String color;
	
	public MaterialNavBar() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField UnorderedList navigation;
	@UiField HTMLPanel wrapper;
	@UiField Image imgLogo;
	
	private String logoUrl;
	private ImageResource logoResource;
	
	@Override
	protected void onAttach() {
		// TODO Auto-generated method stub
		super.onAttach();
		initNavBar();
	}
	
	@UiChild( tagname = "nav" )
	public void addWidget(Widget item) {
		ListItem li = new ListItem();
		CustomAnchor a = new CustomAnchor();
		li.add(a);
		a.add(item);
		navigation.add(li);
	} 
	
	
	public static native void initNavBar()/*-{
		 $wnd.jQuery(".button-collapse").sideNav();
	}-*/;
	
	public static native void hideNav()/*-{
		$wnd.jQuery(".button-collapse").sideNav('hide');
	}-*/;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		wrapper.addStyleName(color);
	}

	public ImageResource getLogoResource() {
		return logoResource;
	}

	public void setLogoResource(ImageResource logoResource) {
		this.logoResource = logoResource;
		imgLogo.setResource(logoResource);
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
		imgLogo.setUrl(logoUrl);
	}

	public void hide() {
		hideNav();
	}
	
	
	

}
