package com.ferquies.utils;

import java.util.List;

public class Combo {
	
	public List<ComboOption> options;
	
	public Combo() {}
	
	public Combo(List<ComboOption> options) {
		this.options = options;
	}

	public List<ComboOption> getOptions() {
		return options;
	}
	
	public void setOptions(List<ComboOption> options) {
		this.options = options;
	}
	
}
