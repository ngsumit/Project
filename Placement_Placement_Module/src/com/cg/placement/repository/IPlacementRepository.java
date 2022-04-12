package com.cg.placement.repository;


import com.cg.placement.entities.Placement;

public interface IPlacementRepository {

	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement);
	public Placement searchPlacement(int id);
	public Placement cancelPlacement(Placement placement);
	
    public abstract void beginTransaction();
	public abstract void commitTrasaction();
	public void cancelPlacement(int id);
	
	
	
	}