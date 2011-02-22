package com.gmail.vivek.client.panels;

import java.util.Iterator;
import java.util.Vector;

import com.allen_sauer.gwt.dnd.client.DragContext;
import com.allen_sauer.gwt.dnd.client.PickupDragController;
import com.allen_sauer.gwt.dnd.client.drop.DropController;
import com.allen_sauer.gwt.dnd.client.drop.VerticalPanelDropController;
import com.gmail.vivek.client.Mediator;
import com.gmail.vivek.client.callbacks.ProcessDataCallback;
import com.gmail.vivek.client.interfaces.UpdateableContents;
import com.gmail.vivek.client.services.DataService;
import com.gmail.vivek.shared.ColumnData;
import com.gmail.vivek.shared.InputOptions;
import com.gmail.vivek.shared.OutputData;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.dom.client.Style.VerticalAlign;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.visualization.client.AbstractDataTable;
import com.google.gwt.visualization.client.AbstractDataTable.ColumnType;
import com.google.gwt.visualization.client.DataTable;
import com.google.gwt.visualization.client.DataView;
import com.google.gwt.visualization.client.VisualizationUtils;
import com.google.gwt.visualization.client.visualizations.GeoMap;
import com.google.gwt.visualization.client.visualizations.GeoMap.DataMode;
import com.google.gwt.visualization.client.visualizations.IntensityMap.Region;
import com.google.gwt.visualization.client.visualizations.MotionChart;
import com.google.gwt.visualization.client.visualizations.Table;
import com.google.gwt.visualization.client.visualizations.Visualization;
import com.google.gwt.visualization.client.visualizations.corechart.ColumnChart;
import com.google.gwt.visualization.client.visualizations.corechart.Options;
import com.google.gwt.visualization.client.visualizations.corechart.PieChart;
import com.google.gwt.visualization.client.visualizations.corechart.PieChart.PieOptions;

public class OutputPanel extends VerticalPanel implements ClickHandler,
		SelectionHandler<Integer> {

	private static final int SPACING = 0;
	private VerticalPanelDropController characteristicsWidgetDropController;
	private DropController indicatorWidgetDropController;
	private Button updateButton;
	private HorizontalPanelWithSpacer indicatorVerticalPanel;
	private HorizontalPanelWithSpacer characteristicVerticalPanel;
	private DeckPanel dp;

	private static final String CSS_DEMO_INSERT_PANEL_EXAMPLE = "demo-InsertPanelExample";
	private static final String CSS_DEMO_INSERT_PANEL_EXAMPLE_COLUMN_COMPOSITE = "demo-InsertPanelExample-column-composite";
	private static final String CSS_DEMO_INSERT_PANEL_EXAMPLE_CONTAINER = "demo-InsertPanelExample-container";
	private static final String CSS_DEMO_INSERT_PANEL_EXAMPLE_HEADING = "demo-InsertPanelExample-heading";
	private static final String CSS_DEMO_INSERT_PANEL_EXAMPLE_WIDGET = "demo-InsertPanelExample-widget";

	private TabPanel tabPanel = new TabPanel();
	private MapPanel mapPanel;
	private TablePanel tablePanel;
	private ChartPanel chartPanel;
	private Vector<Integer> updatedTab = new Vector<Integer>();

	public OutputPanel(Mediator mediator) {
		mediator.registerOuputPanel(this);
		//HTML loadingPanel = new HTML("<img src='resources/images/ajax-loader.gif'/> Loading data. Please wait..");
		HTML errorPanel = new HTML("<font color='red'> Error: No selection for the characteristic of interest or indicator field. Please drag and drop" +
				" properties from the left panel to the above panel and click 'update' button.</font>");
		
		HTML initPanel = new HTML("<font color='green'> Please drag and drop" +
		" properties from the left panel to the above panel and click 'update' button to view the results.</font>");
		errorPanel.getElement().getStyle()
				.setVerticalAlign(VerticalAlign.MIDDLE);

		// use the boundary panel as this composite's widget

		AbsolutePanel characteristicBoundaryPanel = new AbsolutePanel();
		characteristicBoundaryPanel.setSize("100%", "100%");
		characteristicBoundaryPanel.setStyleName(CSS_DEMO_INSERT_PANEL_EXAMPLE);

		AbsolutePanel indicatorBoundaryPanel = new AbsolutePanel();
		indicatorBoundaryPanel.setSize("100%", "100%");
		indicatorBoundaryPanel.setStyleName(CSS_DEMO_INSERT_PANEL_EXAMPLE);

		HorizontalPanel hp = new HorizontalPanel();

		VerticalPanel vp1 = new VerticalPanel();
		vp1.add(new HTML(
				"<b>Characteristic of interest</b><br><font size='1'>(Drag from the left panel)</font>"));
		vp1.add(characteristicBoundaryPanel);
		VerticalPanel vp2 = new VerticalPanel();
		vp2.add(new HTML(
				"<b>Indicators</b><br><font size='1'>(Drag from the left panel)</font>"));
		vp2.add(indicatorBoundaryPanel);

		updateButton = new Button("update");
		updateButton.setTitle("Click here to refresh the results table below.");
		updateButton.addClickHandler(this);
		updateButton.getElement().getStyle().setPaddingTop(3, Unit.PX);
		vp2.add(updateButton);
		vp2.setCellHorizontalAlignment(updateButton,HorizontalPanel.ALIGN_RIGHT);
		updateButton.getElement().getParentElement().getStyle().setHeight(30, Unit.PX);
		updateButton.getElement().getParentElement().getStyle().setVerticalAlign(VerticalAlign.MIDDLE);

		vp1.setStyleName("outputPanel-table");
		vp2.setStyleName("outputPanel-table");
		hp.add(vp1);
		hp.add(vp2);
		vp1.getParent().getElement().getStyle().setBackgroundColor("#CCFFFF");
		vp1.getParent().getElement().getStyle().setBackgroundColor("#CCFFFF");

		add(hp);
		dp = new DeckPanel();
		dp.add(initPanel);
		dp.add(errorPanel);
    
		mapPanel = new MapPanel(this);
		tablePanel = new TablePanel(this);
		 chartPanel = new ChartPanel(this);
		tabPanel.add(tablePanel, "Table");
		tabPanel.add(chartPanel, "Chart");
		tabPanel.add(mapPanel, "Map");
		tabPanel.setWidth("700px");
		tabPanel.selectTab(0);
		tabPanel.addSelectionHandler(this);
		
		dp.add(tabPanel);
		add(dp);
		dp.showWidget(0);

		// initialize our widget drag controller
		PickupDragController characteristicWidgetDragController = new PickupDragController(characteristicBoundaryPanel, false);
		characteristicWidgetDragController.setBehaviorMultipleSelection(false);

		PickupDragController indicatorWidgetDragController = new PickupDragController(indicatorBoundaryPanel, false);
		indicatorWidgetDragController.setBehaviorMultipleSelection(false);

		// initialize inner vertiGcal panel to hold individual widgets
		characteristicVerticalPanel = new HorizontalPanelWithSpacer();
		characteristicVerticalPanel.addStyleName(CSS_DEMO_INSERT_PANEL_EXAMPLE_CONTAINER);
		characteristicVerticalPanel.setSpacing(SPACING);

		indicatorVerticalPanel = new HorizontalPanelWithSpacer();
		indicatorVerticalPanel.addStyleName(CSS_DEMO_INSERT_PANEL_EXAMPLE_CONTAINER);
		indicatorVerticalPanel.setSpacing(SPACING);

		// initialize a widget drop controller for the current column

		characteristicsWidgetDropController = new VerticalPanelDropController(
				characteristicVerticalPanel) {
			public void onDrop(DragContext context) {
				context.draggable.addStyleName(CSS_DEMO_INSERT_PANEL_EXAMPLE_WIDGET);
				super.onDrop(context);
			};
		};
		indicatorWidgetDropController = new VerticalPanelDropController(indicatorVerticalPanel) {
			public void onDrop(DragContext context) {
				context.draggable.addStyleName(CSS_DEMO_INSERT_PANEL_EXAMPLE_WIDGET);
				super.onDrop(context);
			};
		};
		indicatorWidgetDragController.registerDropController(indicatorWidgetDropController);
		characteristicWidgetDragController.registerDropController(characteristicsWidgetDropController);

		characteristicBoundaryPanel.add(characteristicVerticalPanel);
		indicatorBoundaryPanel.add(indicatorVerticalPanel);
	}

	public void update(final OutputData result) {
		
		Runnable onLoadCallback = new Runnable() {
			public void run() {
				//if (dp.getWidgetCount() >= 2)
				//	dp.remove(1);
				
				AbstractDataTable table = createTable(result);
				// DataView dv = DataView.create(table);
				Widget viewWidget;
				int i = tabPanel.getTabBar().getSelectedTab();

				if (i == 0)
					viewWidget = new Table(table, createOptions());
				else if (i==1) {
					DataView dv = DataView.create(table);
					int[] selectedColumn = new int[2];
					selectedColumn[0] = 0;
					
					viewWidget = new Table(table, createOptions());
					String selectedIndicator = chartPanel.getSelectedIndicator();

					int nCol = table.getNumberOfColumns();
					for (int j = 0; j < nCol; j++) {
						if (table.getColumnLabel(j).equals(selectedIndicator)) {
							selectedColumn[1] = j;
							break;
						}
					}
					dv.setColumns(selectedColumn);
					
					if(chartPanel.getPlotType().equals("pie")) {
						PieOptions opt = createPieOptions();
						opt.setTitle(selectedIndicator + " vs. " + table.getColumnLabel(selectedColumn[0]));
						viewWidget = new PieChart(dv,opt);
					}else {
						Options opt = ColumnChart.createOptions();
						opt.setWidth(600);
						opt.setHeight(400);
						opt.setTitle(selectedIndicator + " vs. " + table.getColumnLabel(selectedColumn[0]));
						viewWidget = new ColumnChart(dv,opt);
					}
					
				}
				else {
					if (mapPanel.getMapType().equals("byCity")) {
						DataView dv = DataView.create(table);
						int[] selectedColumn = new int[4];
						selectedColumn[0] = 1;
						selectedColumn[1] = 2;
						selectedColumn[3] = 0;
						String selectedIndicator = mapPanel.getSelectedIndicator();
						
						int nCol = table.getNumberOfColumns();
						for (int j = 0; j < nCol; j++) {
							if (table.getColumnLabel(j).equals(selectedIndicator)) {
								selectedColumn[2] = j;
								break;
							}
						}
						dv.setColumns(selectedColumn);
						GeoMap.Options options = GeoMap.Options.create();
						options.setRegion("US");
						options.setDataMode(DataMode.MARKERS);
						viewWidget = new GeoMap(dv,options);
					}else {
						DataView dv = DataView.create(table);
						int[] selectedColumn = new int[2];
						int nCol = table.getNumberOfColumns();
						String selectedIndicator = mapPanel.getSelectedIndicator();
						
						selectedColumn[0] = 0;
						
						for (int j = 0; j < nCol; j++) {
							if (table.getColumnLabel(j).equals(selectedIndicator)) {
								selectedColumn[1] = j;
								break;
							}
						}
						dv.setColumns(selectedColumn);
						viewWidget = new GeoMap(dv,createMapOptions());
					}
					
				}
				dp.showWidget(2);
				UpdateableContents w = (UpdateableContents) tabPanel.getWidget(i);
				w.updateCanvas(viewWidget);
				Mediator.getInstance().showMessage("Finished updating contents from server");

			}
		};

		String x;
		if (tabPanel.getTabBar().getSelectedTab() == 0) 
			x=Table.PACKAGE;
		else if (tabPanel.getTabBar().getSelectedTab() == 1 )
			if (chartPanel.getPlotType().equals("pie"))
				x=PieChart.PACKAGE;
			else
				x=ColumnChart.PACKAGE;
		else
				x=GeoMap.PACKAGE;
			
		VisualizationUtils.loadVisualizationApi(onLoadCallback, x);
	}

	private GeoMap.Options createMapOptions() {
		GeoMap.Options options = GeoMap.Options.create();
		options.setRegion("US");
		options.setDataMode(DataMode.REGIONS);
		return options;
	}
	
	private Table.Options createOptions() {
		Table.Options options = Table.Options.create();
		options.setHeight("400px");
		return options;
	}

	private AbstractDataTable createPieTable() {
		DataTable data = DataTable.create();
		data.addColumn(ColumnType.STRING, "Task");
		data.addColumn(ColumnType.NUMBER, "Hours per Day");
		data.addRows(2);
		data.setValue(0, 0, "Work");
		data.setValue(0, 1, 14);
		data.setValue(1, 0, "Sleep");
		data.setValue(1, 1, 10);
		return data;
	}

	private PieOptions createPieOptions() {
		PieOptions options = PieOptions.create();
		options.setWidth(400);
		options.setHeight(240);
		options.set3D(true);
		return options;
	}

	private AbstractDataTable createTable(OutputData result) {
		DataTable data = DataTable.create();
		for (Iterator iterator = result.iterator(); iterator.hasNext();) {
			ColumnData cp = (ColumnData) iterator.next();
			switch (cp.getType()) {
			case BOOLEAN:
				data.addColumn(ColumnType.BOOLEAN, cp.getName());
				break;
			case INTEGER:
				data.addColumn(ColumnType.NUMBER, cp.getName());
				break;
			case DOUBLE:
				data.addColumn(ColumnType.NUMBER, cp.getName());
				break;
			case STRING:
				data.addColumn(ColumnType.STRING, cp.getName());
				break;
			default:
				break;
			}
		}
		
		data.addRows(result.get(0).size());

		for (int col = 0; col < result.size(); col++) {
			ColumnData colData = result.get(col);
			for (int row = 0; row < colData.size(); row++) {
				switch (colData.getType()) {
				case STRING:
					data.setValue(row, col, (String) colData.get(row));
					break;
				case INTEGER:
					data.setValue(row, col, Integer.parseInt(colData.get(row)));
					break;
				case DOUBLE:
					try {
						data.setValue(row, col, Double.parseDouble(colData.get(row)));

					} catch (Exception e) {
						data.setValue(row, col, 0);
					}
					break;
				default:
					break;
				}

			}
		}
		return data;
	}

	public void registerCharacteristicDropController(PickupDragController dc) {
		dc.registerDropController(characteristicsWidgetDropController);
	}

	public void registerIndicatorDropController(PickupDragController dc) {
		dc.registerDropController(indicatorWidgetDropController);
	}

	private Vector<String> getCharacteristics() {
		Vector<String> c = new Vector<String>();
		for (int i = 0; i < characteristicVerticalPanel.getWidgetCount(); i++) {
			String s = ((HasText) characteristicVerticalPanel.getWidget(i)).getText();
			if (s != null && s.trim().length() > 0)
				c.add(s);
		}
		return c;
	}

	private Vector<String> getIndicators() {
		Vector<String> v = new Vector<String>();
		for (int i = 0; i < indicatorVerticalPanel.getWidgetCount(); i++) {
			String s = ((HasText) indicatorVerticalPanel.getWidget(i))
					.getText();
			if (s != null && s.trim().length() > 0)
				v.add(s);

		}
		return v;
	}

	private void emptyVariableSelectionAction(){
		dp.showWidget(1);
		Mediator.getInstance().showMessage("Error: Empty parameter. Please drag and drop parameters from the left panels.");
	}
	public void onClick(ClickEvent event) {
		Mediator.getInstance().showMessage("Updating contents from server.. Please wait");
		if (event.getSource() == updateButton) {
			updatedTab  = new Vector<Integer>();
			updatedTab.add(tabPanel.getTabBar().getSelectedTab());
			mapPanel.updateIndicatorLb(getIndicators());
			chartPanel.updateIndicatorLb(getIndicators());
			updateTabPanel(tabPanel.getTabBar().getSelectedTab());
		}
	}

	public void createAndShowMap(String selectedIndicator,String mapType) {
		InputOptions input = new InputOptions();
		input.setMapType(mapType);
		
		Vector<String> c = new Vector<String>();
		c.add("sstate_std");
		
		if (mapType.equals("byCity")) {
			c.add("scity");
		}
		
		input.setCharacteristics(c);
		input.setIndicators(getIndicators());
		if (input.isEmpty()) 
			emptyVariableSelectionAction();
		else
		DataService.App.getInstance().processData(input,new ProcessDataCallback());

	}	
	public void createAndShowTable() {
		InputOptions input = new InputOptions();
		input.setCharacteristics(getCharacteristics());
		input.setIndicators(getIndicators());
		if (input.isEmpty()) 
			emptyVariableSelectionAction();
		else
		DataService.App.getInstance().processData(input,new ProcessDataCallback());
	}
	
	public void createAndShowChart(String selecteIndicator, String mapType) {
		InputOptions input = new InputOptions();
		input.setCharacteristics(getCharacteristics());
		input.setIndicators(getIndicators());
		if (input.isEmpty()) 
			emptyVariableSelectionAction();
		else
		DataService.App.getInstance().processData(input,new ProcessDataCallback());
	}

	public void updateTabPanel(int selecedTab){
		
		UpdateableContents w = (UpdateableContents) tabPanel.getWidget(selecedTab);
		w.updateContents();
	}
	public void onSelection(SelectionEvent<Integer> event) {
		UpdateableContents w = (UpdateableContents) tabPanel.getWidget(event.getSelectedItem());
		
		if (!w.containsCanvas() || ! updatedTab.contains(event.getSelectedItem())) {
			updateTabPanel(event.getSelectedItem());
			updatedTab.add(event.getSelectedItem());

		}
	}

}
