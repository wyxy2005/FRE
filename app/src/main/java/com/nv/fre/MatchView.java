package com.nv.fre;

public class MatchView {
	public int idx;
	public Class<?>[] viewClasses;

	public MatchView(int idx, Class<?>[] viewClasses) {
		this.idx = idx;
		this.viewClasses = viewClasses;
	}
}