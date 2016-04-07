package mx.krieger.mapaton.hackeourbano.model.wrappers;


import mx.krieger.mapaton.publicutils.wrappers.CursorParameter;

public class RouteStatsParameter extends CursorParameter {
	private boolean descending;

	/**
	 * @return the descending
	 */
	public boolean isDescending() {
		return descending;
	}

	/**
	 * @param descending the descending to set
	 */
	public void setDescending(boolean descending) {
		this.descending = descending;
	}
	
	

}
