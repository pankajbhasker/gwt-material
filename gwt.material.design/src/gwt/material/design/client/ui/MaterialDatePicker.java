package gwt.material.design.client.ui;

import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HTMLPanel;

public class MaterialDatePicker extends FocusPanel{

	private HTMLPanel panel;
	private Date date;
	private String placeholder;
	private String id;
	public MaterialDatePicker() {
	
	}
		
	@Override
	protected void onAttach() {
		// TODO Auto-generated method stub
		super.onAttach();
		id = String.valueOf(hashCode());
		this.clear();
		panel = new HTMLPanel("<input placeholder='"+placeholder+"' type='date' id='"+id+"' class='datepicker'>");
		this.add(panel);
		initDatePicker();
	}
	
	public static native String getDatePickerValue(String id)/*-{
		var color    = $wnd.jQuery('#' + id).val();  
		return color;
	}-*/;
	
	public static native void setDatePickerValue(String value)/*-{
		$wnd.jQuery('#' + id).val(value);
	}-*/;
	
	public static native void initDatePicker()/*-{
		  $wnd.jQuery('.datepicker').pickadate();
		  $wnd.jQuery('.picker__weekday-display').css("background", '#1E88E5');
		  $wnd.jQuery('.picker__year-display').css("color", '#82B1FF');
		  $wnd.jQuery('.picker--focused').css("color", '#1E88E5');
		  $wnd.jQuery('.picker__day--selected').css("color", '#1E88E5');
	}-*/;


	
	public Date getDate() {
		return getPickerDate();
	}

	public void clearValues(){
		setDatePickerValue(null);
	}
	
	public Date getPickerDate(){
		try{
			DateTimeFormat sdf = DateTimeFormat.getFormat("d MMM, yyyy");
			date = sdf.parse(getDatePickerValue(id));
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
