import java.util.*;

public class Main {
	public static void main(String[] args) {
		removeHashElement();
	}

	public static void removeHashElement() {
		Set<String> brands = new HashSet<>(Arrays.asList("Gucci", "Louis Vuitton", "Rolex"));

		String newObj = "Rolex";

		Iterator<String> iterator = brands.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			if (element.contains(newObj)) {
				iterator.remove();
			}
		}
		System.out.println(brands); // per vedere la differenza
		brands.clear();
		System.out.println(brands);
	}
}