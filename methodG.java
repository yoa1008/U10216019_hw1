public class methodG extends AbstractDrawFunction {

	@Override
	double f(double x) {
		return Math.log(x) / Math.log(10) + x * x;
	}

}