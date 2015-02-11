package gwt.material.design.client.ui;

import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HTMLPanel;

public class MaterialDatePicker extends FocusPanel{

	private HTMLPanel panel;
	private Date date = new Date();
	
	public MaterialDatePicker() {
		this.clear();
		panel = new HTMLPanel("<input placeholder='Date' type='date' id='materialDatePicker' class='datepicker'>");
		this.add(panel);
	}
	
	
	
	@Override
	protected void onAttach() {
		// TODO Auto-generated method stub
		super.onAttach();
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
		return date;
	}

	public Date getPickerDate(){
		DateTimeFormat sdf = DateTimeFormat.getFormat("d MMM, yyyy");
		date = sdf.parse(getDatePickerValue());
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
