package gwt.material.design.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class MaterialCard extends Composite {

	private static MaterialCardUiBinder uiBinder = GWT
			.create(MaterialCardUiBinder.class);

	interface MaterialCardUiBinder extends UiBinder<Widget, MaterialCard> {
	}

	@UiField
	Image imgCard;
	
	@UiField 
	Label lblTitle, lblDescription;
	
	private ImageResource resource;
	private String url = "";
	
	private String title="";
	private String description = "";

	public MaterialCard() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public ImageResource getResource() {
		return resource;
	}

	public void setResource(ImageResource resource) {
		this.resource = resource;
		imgCard.setResource(resource);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
		imgCard.setUrl(url);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		lblTitle.setText(title);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		lblDescription.setText(description);
	}
	
	

}
