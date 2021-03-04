package com.traineeApp.Service;

import java.util.List;

import com.traineeApp.model.dao.Trainee;

public interface TraineeService {
	public void addTrainee(Trainee trainee);
	public List<Trainee> showAllTraineeDetails();

}
