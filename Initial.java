package com.highschool;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager master = new Master();
		master.manage();
		IGetSalary Imaster2 = new Master();
		Imaster2.getSalary();
		
		Manager workManager = new WorkManager();
		workManager.manage();
		IGetSalary IworkManager = new WorkManager();
		IworkManager.getSalary();
		
		Manager learnManager = new LearnManager();
		learnManager.manage();
		IGetSalary IlearnManager = new LearnManager();
		IlearnManager.getSalary();
		
		LearnPartment scienceStudent = new ScienceStudent();
		scienceStudent.learn();
		IStudy IscienceStudent = new ScienceStudent();
		IscienceStudent.study();
		
		LearnPartment liberalArtStudent = new LiberalArtStudent();
		liberalArtStudent.learn();
		IStudy IliberalArtStudent = new LiberalArtStudent();
		IliberalArtStudent.study();
		
		LearnPartment teacher = new Teacher();
		teacher.learn();
		IGetSalary Iteacher = new Teacher();
		Iteacher.getSalary();
		
		WorkPartment worker = new Worker();
		worker.work();
		IGetSalary Iworker = new Worker();
		Iworker.getSalary();
		
		WorkPartment guard = new Guard();
		guard.work();
		IGetSalary Iguard = new Guard();
		Iguard.getSalary();

	}

}
