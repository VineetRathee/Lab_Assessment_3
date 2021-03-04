package com.traineeApp.model.dao;

import java.util.List;

public interface TraineeDao {
	
	public void addTrainee(Trainee trainee);
	public List<Trainee> showAllTraineeDetails();

}