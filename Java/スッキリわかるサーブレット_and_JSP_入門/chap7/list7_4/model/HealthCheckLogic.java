package chap7.list7_4.model;

public class HealthCheckLogic {

	public void execute(Health health) {
		double bmi = health.getBmi();

		if (bmi < 18.5)
			health.setBodyType("痩せ型");
		else if (bmi < 25)
			health.setBodyType("普通");
		else
			health.setBodyType("肥満");
	}

}
