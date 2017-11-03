package com.hujunjie.highschool;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager master = new Master();
		master.manage();
		master.putName();
		IGetSalary Imaster2 = new Master();
		Imaster2.getSalary();
		
		Manager workManager = new WorkManager();
		workManager.manage();
		workManager.putName();
		IGetSalary IworkManager = new WorkManager();
		IworkManager.getSalary();
		
		Manager learnManager = new LearnManager();
		learnManager.manage();
		learnManager.putName();
		IGetSalary IlearnManager = new LearnManager();
		IlearnManager.getSalary();
		
		LearnPartment scienceStudent = new ScienceStudent();
		scienceStudent.learn();
		scienceStudent.putName();
		IStudy IscienceStudent = new ScienceStudent();
		IscienceStudent.study();
		
		LearnPartment liberalArtStudent = new LiberalArtStudent();
		liberalArtStudent.learn();
		liberalArtStudent.putName();
		IStudy IliberalArtStudent = new LiberalArtStudent();
		IliberalArtStudent.study();
		
		LearnPartment teacher = new Teacher();
		teacher.learn();
		teacher.putName();
		IGetSalary Iteacher = new Teacher();
		Iteacher.getSalary();
		
		WorkPartment worker = new Worker();
		worker.work();
		worker.putName();
		IGetSalary Iworker = new Worker();
		Iworker.getSalary();
		
		WorkPartment guard = new Guard();
		guard.work();
		guard.putName();
		Guard guard2 = new Guard();
		guard2.patrol();
		IGetSalary Iguard = new Guard();
		Iguard.getSalary();

	}

}
