package com.traineeApp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.traineeApp.Service.TraineeService;
import com.traineeApp.Service.TraineeServiceImplementation;
import com.traineeApp.model.dao.Trainee;


@WebServlet("/ActionController.do")
public class ActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TraineeService traineeService = new TraineeServiceImplementation();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/TraineeAppMgtHome.jsp");
			rd.forward(request, response);
		}

		else if (action.equalsIgnoreCase("show")) {
			List<Trainee> trainees = traineeService.showAllTraineeDetails();
			request.setAttribute("trainees", trainees);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/showAllTrainee.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String branch = request.getParameter("branch");
		Double percentage = Double.parseDouble(request.getParameter("percentage"));
		Trainee newTrainee = new Trainee(name, branch, percentage);
		traineeService.addTrainee(newTrainee);
		List<Trainee> trainees = traineeService.showAllTraineeDetails();
		request.setAttribute("trainees", trainees);
		response.sendRedirect("TraineeManagement.do?action=show");
	}

}