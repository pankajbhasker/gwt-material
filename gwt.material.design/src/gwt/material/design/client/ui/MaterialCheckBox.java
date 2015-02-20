package gwt.material.design.client.ui;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DoubleClickHandler;
import com.google.gwt.event.dom.client.DragEndHandler;
import com.google.gwt.event.dom.client.DragEnterHandler;
import com.google.gwt.event.dom.client.DragHandler;
import com.google.gwt.event.dom.client.DragLeaveHandler;
import com.google.gwt.event.dom.client.DragOverHandler;
import com.google.gwt.event.dom.client.DragStartHandler;
import com.google.gwt.event.dom.client.DropHandler;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.GestureChangeHandler;
import com.google.gwt.event.dom.client.GestureEndHandler;
import com.google.gwt.event.dom.client.GestureStartHandler;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.MouseWheelHandler;
import com.google.gwt.event.dom.client.TouchCancelHandler;
import com.google.gwt.event.dom.client.TouchEndHandler;
import com.google.gwt.event.dom.client.TouchMoveHandler;
import com.google.gwt.event.dom.client.TouchStartHandler;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.i18n.client.HasDirection.Direction;
import com.google.gwt.i18n.shared.DirectionEstimator;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FocusListener;
import com.google.gwt.user.client.ui.KeyboardListener;
import com.google.gwt.user.client.ui.MouseListener;
import com.google.gwt.user.client.ui.MouseWheelListener;

public class MaterialCheckBox extends CheckBox {

	private Object object;

	public MaterialCheckBox() {
		// TODO Auto-generated constructor stub
		this.getElement().getStyle().setMarginRight(20, Unit.PX);
	}

	public MaterialCheckBox(Element elem) {
		super(elem);
		// TODO Auto-generated constructor stub
	}

	public MaterialCheckBox(SafeHtml label, Direction dir) {
		super(label, dir);
		// TODO Auto-generated constructor stub
	}

	public MaterialCheckBox(SafeHtml label, DirectionEstimator directionEstimator) {
		super(label, directionEstimator);
		// TODO Auto-generated constructor stub
	}

	public MaterialCheckBox(SafeHtml label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	public MaterialCheckBox(String label, boolean asHTML) {
		super(label, asHTML);
		// TODO Auto-generated constructor stub
	}

	public MaterialCheckBox(String label, Direction dir) {
		super(label, dir);
		// TODO Auto-generated constructor stub
	}

	public MaterialCheckBox(String label, DirectionEstimator directionEstimator) {
		super(label, directionEstimator);
		// TODO Auto-generated constructor stub
	}

	public MaterialCheckBox(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	@Override
	public HandlerRegistration addValueChangeHandler(ValueChangeHandler<Boolean> handler) {
		// TODO Auto-generated method stub
		return super.addValueChangeHandler(handler);
	}

	@Override
	public HandlerRegistration addBlurHandler(BlurHandler handler) {
		// TODO Auto-generated method stub
		return super.addBlurHandler(handler);
	}

	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		// TODO Auto-generated method stub
		return super.addClickHandler(handler);
	}

	@Override
	@Deprecated
	public void addClickListener(ClickListener listener) {
		// TODO Auto-generated method stub
		super.addClickListener(listener);
	}

	@Override
	public HandlerRegistration addDoubleClickHandler(DoubleClickHandler handler) {
		// TODO Auto-generated method stub
		return super.addDoubleClickHandler(handler);
	}

	@Override
	public HandlerRegistration addDragEndHandler(DragEndHandler handler) {
		// TODO Auto-generated method stub
		return super.addDragEndHandler(handler);
	}

	@Override
	public HandlerRegistration addDragEnterHandler(DragEnterHandler handler) {
		// TODO Auto-generated method stub
		return super.addDragEnterHandler(handler);
	}

	@Override
	public HandlerRegistration addDragHandler(DragHandler handler) {
		// TODO Auto-generated method stub
		return super.addDragHandler(handler);
	}

	@Override
	public HandlerRegistration addDragLeaveHandler(DragLeaveHandler handler) {
		// TODO Auto-generated method stub
		return super.addDragLeaveHandler(handler);
	}

	@Override
	public HandlerRegistration addDragOverHandler(DragOverHandler handler) {
		// TODO Auto-generated method stub
		return super.addDragOverHandler(handler);
	}

	@Override
	public HandlerRegistration addDragStartHandler(DragStartHandler handler) {
		// TODO Auto-generated method stub
		return super.addDragStartHandler(handler);
	}

	@Override
	public HandlerRegistration addDropHandler(DropHandler handler) {
		// TODO Auto-generated method stub
		return super.addDropHandler(handler);
	}

	@Override
	public HandlerRegistration addFocusHandler(FocusHandler handler) {
		// TODO Auto-generated method stub
		return super.addFocusHandler(handler);
	}

	@Override
	@Deprecated
	public void addFocusListener(FocusListener listener) {
		// TODO Auto-generated method stub
		super.addFocusListener(listener);
	}

	@Override
	public HandlerRegistration addGestureChangeHandler(GestureChangeHandler handler) {
		// TODO Auto-generated method stub
		return super.addGestureChangeHandler(handler);
	}

	@Override
	public HandlerRegistration addGestureEndHandler(GestureEndHandler handler) {
		// TODO Auto-generated method stub
		return super.addGestureEndHandler(handler);
	}

	@Override
	public HandlerRegistration addGestureStartHandler(GestureStartHandler handler) {
		// TODO Auto-generated method stub
		return super.addGestureStartHandler(handler);
	}

	@Override
	@Deprecated
	public void addKeyboardListener(KeyboardListener listener) {
		// TODO Auto-generated method stub
		super.addKeyboardListener(listener);
	}

	@Override
	public HandlerRegistration addKeyDownHandler(KeyDownHandler handler) {
		// TODO Auto-generated method stub
		return super.addKeyDownHandler(handler);
	}

	@Override
	public HandlerRegistration addKeyPressHandler(KeyPressHandler handler) {
		// TODO Auto-generated method stub
		return super.addKeyPressHandler(handler);
	}

	@Override
	public HandlerRegistration addKeyUpHandler(KeyUpHandler handler) {
		// TODO Auto-generated method stub
		return super.addKeyUpHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
		// TODO Auto-generated method stub
		return super.addMouseDownHandler(handler);
	}

	@Override
	@Deprecated
	public void addMouseListener(MouseListener listener) {
		// TODO Auto-generated method stub
		super.addMouseListener(listener);
	}

	@Override
	public HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
		// TODO Auto-generated method stub
		return super.addMouseMoveHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
		// TODO Auto-generated method stub
		return super.addMouseOutHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
		// TODO Auto-generated method stub
		return super.addMouseOverHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
		// TODO Auto-generated method stub
		return super.addMouseUpHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseWheelHandler(MouseWheelHandler handler) {
		// TODO Auto-generated method stub
		return super.addMouseWheelHandler(handler);
	}

	@Override
	@Deprecated
	public void addMouseWheelListener(MouseWheelListener listener) {
		// TODO Auto-generated method stub
		super.addMouseWheelListener(listener);
	}

	@Override
	public HandlerRegistration addTouchCancelHandler(TouchCancelHandler handler) {
		// TODO Auto-generated method stub
		return super.addTouchCancelHandler(handler);
	}

	@Override
	public HandlerRegistration addTouchEndHandler(TouchEndHandler handler) {
		// TODO Auto-generated method stub
		return super.addTouchEndHandler(handler);
	}

	@Override
	public HandlerRegistration addTouchMoveHandler(TouchMoveHandler handler) {
		// TODO Auto-generated method stub
		return super.addTouchMoveHandler(handler);
	}

	@Override
	public HandlerRegistration addTouchStartHandler(TouchStartHandler handler) {
		// TODO Auto-generated method stub
		return super.addTouchStartHandler(handler);
	}

	@Override
	@Deprecated
	public void removeClickListener(ClickListener listener) {
		// TODO Auto-generated method stub
		super.removeClickListener(listener);
	}

	@Override
	@Deprecated
	public void removeFocusListener(FocusListener listener) {
		// TODO Auto-generated method stub
		super.removeFocusListener(listener);
	}

	@Override
	@Deprecated
	public void removeKeyboardListener(KeyboardListener listener) {
		// TODO Auto-generated method stub
		super.removeKeyboardListener(listener);
	}

	@Override
	@Deprecated
	public void removeMouseListener(MouseListener listener) {
		// TODO Auto-generated method stub
		super.removeMouseListener(listener);
	}

	@Override
	@Deprecated
	public void removeMouseWheelListener(MouseWheelListener listener) {
		// TODO Auto-generated method stub
		super.removeMouseWheelListener(listener);
	}

	@Override
	protected void onAttach() {
		// TODO Auto-generated method stub
		super.onAttach();
	}

}
