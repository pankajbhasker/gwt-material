package gwt.material.design.demo.client.panel;

import gwt.material.design.client.ui.MaterialTable;
import gwt.material.design.shared.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.ProvidesKey;

public class InitialSampleTable extends Composite {

	private static InitialSampleTableUiBinder uiBinder = GWT.create(InitialSampleTableUiBinder.class);

	interface InitialSampleTableUiBinder extends UiBinder<Widget, InitialSampleTable> {
	}

	@UiField
	SimplePanel gridPanel;

	@UiField
	HTMLPanel panelRegisterWrapper;

	interface MyStyle extends CssResource {
		String editCellSmall();
	}
   
	private User user;

	private MaterialTable<User> activityGrid;
	private ListDataProvider<User> activityProvider;
	private ListHandler<User> columnSortHandler;

	public InitialSampleTable() {
		initWidget(uiBinder.createAndBindUi(this));
		setActionListAndPopulateMaterialTableForUser();
	}

	public HTMLPanel getPanelRegisterWrapper() {
		return panelRegisterWrapper;
	}

	public void setPanelRegisterWrapper(HTMLPanel panelRegisterWrapper) {
		this.panelRegisterWrapper = panelRegisterWrapper;
	}

	private void setActionListAndPopulateMaterialTableForUser() {
		this.activityGrid = createMaterialTable();
		gridPanel.setWidget(activityGrid);
		refreshData();
	}

	private void refreshData() {
		activityProvider.setList(new ArrayList<User>());
		populateUserTable(user);

	}
	
	private void loadDataProvider(List<User> user) {
		activityProvider.setList(user);
		columnSortHandler.setList(activityProvider.getList());
	}

	private void populateUserTable(User u) {
		loadDataProvider(getUserList());
	}

	private List<User> getUserList() {

		List<User> newList = new ArrayList<User>();
		newList.add(new User("Mark Kevin", "Baldemor", "Admin", new Date()));
		newList.add(new User("Karah", "Salayog", "Author", new Date()));
		newList.add(new User("Gigi", "Ambion", "Reader", new Date()));
		return newList;

	}

	public MaterialTable<User> createMaterialTable() {

		this.columnSortHandler = new ListHandler<User>(new ArrayList<User>());

		final MaterialTable<User> MaterialTable = new MaterialTable<User>(KEY_PROVIDER);
		MaterialTable.setSize("500px", "500px");
		MaterialTable.getElement().setId("myID");

		this.columnSortHandler = new ListHandler<User>(new ArrayList<User>());

		
		TextColumn<User> firstName = new TextColumn<User>() {
			@Override
			public String getValue(User a) {
				return a.getLastName();
			}
		};
		
		firstName.setSortable(true);
		columnSortHandler.setComparator(firstName, new Comparator<User>() {
			@Override
			public int compare(User arg0, User arg1) {
				return arg0.getFirstName().compareToIgnoreCase(arg1.getFirstName());
			}
		});
		

		TextColumn<User> lastName = new TextColumn<User>() {
			@Override
			public String getValue(User a) {
				return a.getLastName();
			}
		};
		
		lastName.setSortable(true);
		columnSortHandler.setComparator(lastName, new Comparator<User>() {
			@Override
			public int compare(User arg0, User arg1) {
				return arg0.getLastName().compareToIgnoreCase(arg1.getLastName());
			}
		});
		
		TextColumn<User> type = new TextColumn<User>() {
			@Override
			public String getValue(User a) {
				return a.getLastName();
			}
		};
		
		type.setSortable(true);
		columnSortHandler.setComparator(type, new Comparator<User>() {
			@Override
			public int compare(User arg0, User arg1) {
				return arg0.getType().compareToIgnoreCase(arg1.getType());
			}
		});
		
		TextColumn<User> creationDate = new TextColumn<User>() {
			@Override
			public String getValue(User a) {
				return String.valueOf(a.getCreationDate());
			}
		};
		
		creationDate.setSortable(true);
		columnSortHandler.setComparator(creationDate, new Comparator<User>() {
			@Override
			public int compare(User arg0, User arg1) {
				return arg0.getCreationDate().compareTo(arg1.getCreationDate());
			}
		});

		MaterialTable.addColumn(firstName, "First Name");
		MaterialTable.addColumn(lastName, "Last Name");
		MaterialTable.addColumn(type, "Type");
		MaterialTable.addColumn(creationDate, "Creation Date");
		activityProvider = new ListDataProvider<User>();
		activityProvider.addDataDisplay(MaterialTable);

		MaterialTable.addColumnSortHandler(columnSortHandler);

		return MaterialTable;

	}

	private static final ProvidesKey<User> KEY_PROVIDER = new ProvidesKey<User>() {

		@Override
		public Object getKey(User item) {
			return item.getId();
		}
	};

}
