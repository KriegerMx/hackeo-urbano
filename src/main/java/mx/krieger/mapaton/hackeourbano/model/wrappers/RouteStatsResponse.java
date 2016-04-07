package mx.krieger.mapaton.hackeourbano.model.wrappers;


import mx.krieger.mapaton.publicutils.wrappers.CursorResponse;
import mx.krieger.mapaton.publicutils.wrappers.RouteStatsWrapper;

import java.util.List;

public class RouteStatsResponse extends CursorResponse {
	private List<RouteStatsWrapper> items;

	/**
	 * @return the items
	 */
	public List<RouteStatsWrapper> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<RouteStatsWrapper> items) {
		this.items = items;
	}
	
	
}
