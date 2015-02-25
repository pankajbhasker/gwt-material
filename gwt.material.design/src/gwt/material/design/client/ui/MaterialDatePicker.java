package gwt.material.design.client.ui;

import java.util.Date;

import com.google.gwt.core.ext.typeinfo.ParseException;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HTMLPanel;

public class MaterialDatePicker extends FocusPanel{

	private HTMLPanel panel;
	private Date date;
	private String placeholder;
	
	public MaterialDatePicker() {
	
	}
	
	
	
	@Override
	protected void onAttach() {
		// TODO Auto-generated method stub
		super.onAttach();
		
		this.clear();
		panel = new HTMLPanel("<input placeholder='"+placeholder+"' type='date' id='materialDatePicker' class='datepicker'>");
		this.add(panel);
		initDatePicker();
	}
	
	public static native String getDatePickerValue()/*-{
		var color    = $wnd.jQuery('#materialDatePicker').val();  
		return color;
	}-*/;
	
	public static native void setDatePickerValue(String value)/*-{
		$wnd.jQuery('#materialDatePicker').val(value);
	}-*/;
	
	public static native void initDatePicker()/*-{
		 $wnd.jQuery('.datepicker').pickadate();
	}-*/;


	
	public Date getDate() {
		return getPickerDate();
	}

	public void clearValues(){
		setDate(null);
	}
	
	public Date getPickerDate(){
		try{
			DateTimeFormat sdf = DateTimeFormat.getFormat("d MMM, yyyy");
			date = sdf.parse(getDatePickerValue());
			return date;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

	public String getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}
	
}
