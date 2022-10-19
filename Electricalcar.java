package Mapusingelectrical;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Electricalcar {
	public static void main(String[] args) {
		Map<Integer, String> a = new HashMap<>();

		a.put(1, "power10");
		a.put(2, "power20");
		a.put(3, "power30");
		a.put(4, "power40");
		a.put(5, "power50");
		a.put(6, "power0");
		// Set set = a.entrySet();
		// Iterator b = set.iterator();
		// while (b.hasNext()) {
		// Entry entry = (Entry) b.next();
		// System.out.println(entry.getKey() + " " + entry.getValue());

		Scanner input = new Scanner(System.in);
		String gearname;
		while (true) {
			System.out.println("enter your power");
			gearname = input.next();
			if (a.containsValue(gearname)) {
				// String gearname2=input.next();
				for (int i : a.keySet()) {
					if (a.get(i).equals(gearname)) {
						// Scanner input1 = new Scanner(System.in);

						switch (gearname) {
						case "power10": {

							System.out.println("running gear  first");

							System.out.println("your speed increase:yes");

							System.out.println("yes or decrease:no");
							String increase = input.next();
							if (increase.equals("yes")) {

								increase("power20");
							}
							if (increase.equals("no")) {
								decrease("power0");
							}
							break;
						}
						case "power20": {

							System.out.println("running gear second");
							System.out.println("increase:yes or decrease:no");
							String increase = input.next();
							if (increase.equals("yes")) {

								increase("power30");
							}
							if (increase.equals("no")) {
								decrease("power10");
							}
							break;
						}
						case "power30": {

							System.out.println("running gear  third");
							System.out.println("increase:yes or decrease:no");
							String increase = input.next();
							if (increase.equals("yes")) {

								increase("power40");
							}
							if (increase.equals("no")) {
								decrease("power20");
							}
							break;
						}
						case "power40": {

							System.out.println("running gear  fourth");
							System.out.println("increase:yes or decrease:no");
							String increase = input.next();
							if (increase.equals("yes")) {

								increase("power50");
							}
							if (increase.equals("no")) {
								decrease("power30");
							}
							break;
						}
						case "power50": {

							System.out.println("running gear  fiveth");
							System.out.println("increase:yes or decrease:no");
							String increase = input.next();
							if (increase.equals("yes")) {

								increase("power0");
							}
							if (increase.equals("no")) {
								decrease("power40");
							}
							break;
						}
						case "power0": {

							System.out.println(" car running  reversegear:rev or carrun:run");
							String reverse = input.next();
							if (reverse.equals("rev")) {
								carreverse();
							}
							if (reverse.equals("run")) {
								System.out.println("increase:yes or decrease:no");
								String increase = input.next();
								if (increase.equals("yes")) {

									increase("power10");
								}

								if (increase.equals("no")) {
									decrease("power0");

								}
							}
							break;
						}

						}
					}

				}

			}else {
				System.out.println("Input Wrong");
			}

		}

	}

	private static void carreverse() {

		Scanner input2 = new Scanner(System.in);
		System.out.println("reverse gear run:powerinput or no power:stop");
		String power = input2.next();
		if ("power0".equals(power)) {
			System.out.println("your car reverse run");
		}

		else if ("stop".equals(power)) {

			System.out.println("ideal  the car");
			System.out.println("car speed increase:yes");
			String increase = input2.next();
			if ("yes".equals(increase)) {

				increase("power10");
			}
		}

	}

	private static void decrease(String i2) {

		Scanner input = new Scanner(System.in);
		switch (i2) {
		case "power10": {
			System.out.println("running gear  first");

			System.out.println("your speed increase:yes");

			System.out.println("yes or decrease:no");
			String increase = input.next();
			if (increase.equals("yes")) {

				increase("power20");
			}
			if (increase.equals("no")) {
				decrease("power0");
			}
			break;
		}
		case "power20": {

			System.out.println("running gear second");
			System.out.println("increase:yes or decrease:no");
			String increase = input.next();
			if (increase.equals("yes")) {

				increase("power30");
			}
			if (increase.equals("no")) {
				decrease("power10");
			}
			break;
		}
		case "power30": {

			System.out.println("running gear  third");
			System.out.println("increase:yes or decrease:no");
			String increase = input.next();
			if (increase.equals("yes")) {

				increase("power40");
			}
			if (increase.equals("no")) {
				decrease("power20");
			}
			break;
		}
		case "power40": {

			System.out.println("running gear  fourth");
			System.out.println("increase:yes or decrease:no");
			String increase = input.next();
			if (increase.equals("yes")) {

				increase("power50");
			}
			if (increase.equals("no")) {
				decrease("power30");
			}
			break;
		}
		case "power50": {

			System.out.println("running gear  fiveth");
			System.out.println("increase:yes or decrease:no");
			String increase = input.next();
			if (increase.equals("yes")) {

				increase("power0");
			}
			if (increase.equals("no")) {
				decrease("power40");
			}
			break;
		}
		case "power0":
			System.out.println(" car running ");

			System.out.println(" car running  reversegear:rev or carrun:run");
			String reverse = input.next();
			if (reverse.equals("rev")) {
				carreverse();
			}
			if (reverse.equals("run")) {
				System.out.println("increase:yes or decrease:no");
				String increase = input.next();
				if (increase.equals("yes")) {

					increase("power10");
				}

				if (increase.equals("no")) {
					decrease("power0");

				}
			}
			break;
		}
	}

	private static void increase(String i) {
		Scanner input = new Scanner(System.in);
		switch (i) {
		case "power10": {
			System.out.println("running gear  first");

			System.out.println("your speed increase:yes");

			System.out.println("yes or decrease:no");
			String increase = input.next();
			if (increase.equals("yes")) {

				increase("power20");
			}
			if (increase.equals("no")) {
				decrease("power0");
			}
			break;
		}
		case "power20": {

			System.out.println("running gear second");
			System.out.println("increase:yes or decrease:no");
			String increase = input.next();
			if (increase.equals("yes")) {

				increase("power30");
			}
			if (increase.equals("no")) {
				decrease("power10");
			}
			break;
		}
		case "power30": {

			System.out.println("running gear  third");
			System.out.println("increase:yes or decrease:no");
			String increase = input.next();
			if (increase.equals("yes")) {

				increase("power40");
			}
			if (increase.equals("no")) {
				decrease("power20");
			}
			break;
		}
		case "power40": {

			System.out.println("running gear  fourth");
			System.out.println("increase:yes or decrease:no");
			String increase = input.next();
			if (increase.equals("yes")) {

				increase("power50");
			}
			if (increase.equals("no")) {
				decrease("power30");
			}
			break;
		}
		case "power50": {

			System.out.println("running gear  fiveth");
			System.out.println("increase:yes or decrease:no");
			String increase = input.next();
			if (increase.equals("yes")) {

				increase("power0");
			}
			if (increase.equals("no")) {
				decrease("power40");
			}
			break;
		}
		case "power0":
			System.out.println(" car speed limit 50 ");

			System.out.println(" car running  reversegear:rev or carrun:run");
			String reverse = input.next();
			if (reverse.equals("rev")) {
				carreverse();
			}
			if (reverse.equals("run")) {
				System.out.println("increase:yes or decrease:no");
				String increase = input.next();
				if (increase.equals("yes")) {

					increase("power10");
				}

				if (increase.equals("no")) {
					decrease("power0");

				}
			}
			break;

		}

	}
}
