package gwt.material.design.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface MaterialResources extends ClientBundle {
	public static final MaterialResources INSTANCE = GWT
			.create(MaterialResources.class);

	ImageResource thermolabo_logo();
	ImageResource image();
	ImageResource ic_glen();
	ImageResource ic_jeremy();
	ImageResource ic_karl();
	ImageResource ic_kevin();
	MaterialCSS materialcss();
	MaterialMobileCSS materialmobilecss();

}
