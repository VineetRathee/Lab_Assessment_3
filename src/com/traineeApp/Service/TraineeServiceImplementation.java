package com.traineeApp.Service;

import java.util.List;

import com.traineeApp.model.dao.Trainee;
import com.traineeApp.model.dao.TraineeDao;
import com.traineeApp.model.dao.TraineeDaoImpl;

public class TraineeServiceImplementation implements TraineeService{
	private TraineeDao traineeDao;
	
	
	

	public TraineeServiceImplementation() {
		traineeDao = new TraineeDaoImpl();
	}

	@Override
	public void addTrainee(Trainee trainee) {
		traineeDao.addTrainee(trainee);
		
		
	}

	@Override
	public List<Trainee> showAllTraineeDetails() {
		return traineeDao.showAllTraineeDetails();
		
	}
	
	

}
