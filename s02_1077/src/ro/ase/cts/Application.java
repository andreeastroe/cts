package ro.ase.cts;

public class Application {

	public static void main(String[] args) {
		try {
			System.out.println(ProductUtils.computeFinalPrice(ProductCategory.SMARTPHONE, 10000, 11000));
		} catch (InvalidProductCategoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * Initial function 
	 */
	public static float compute(int c, float p, float cs) {
		float fp = 0f;
		float cd = 0f;
		if(c == 1) {
			if(cs >= 2000 && cs <= 10000) {
				cd = p * 0.05f;
			} else {
				cd = p * 0.02f;
			}
			fp = p - cd - (p * 0.03f);
		} else if (c == 2) {
			if(cs >= 2000 && cs <= 10000) {
				cd = p * 0.05f;
			} else {
				cd = p * 0.02f;
			}
			fp = p - cd - (p * 0.05f);
		} else if (c == 3) {
			if(cs >= 2000 && cs <= 10000) {
				cd = p * 0.05f;
			} else {
				cd = p * 0.02f;
			}
			fp = p - cd - (p * 0.07f);
		} else if (c == 4) {
			if(cs >= 2000 && cs <= 10000) {
				cd = p * 0.05f;
			} else {
				cd = p * 0.02f;
			}
			fp = p - cd - (p * 0.1f);
		}
		return fp;
	}
}
