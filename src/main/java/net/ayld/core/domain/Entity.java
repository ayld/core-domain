package net.ayld.core.domain;

import java.io.Serializable;

public interface Entity<I extends Serializable> extends Serializable {
	
	public I getId();
}
