package test_singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Logger logger = Logger.getInstance();
		logger.log("Запускаем программу");
		logger.log("Просим пользователя ввести входные данные для списка");
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
		
		System.out.print("Введите размер списка: " );
		String sizeLineStr = reader.readLine();
		int sizeLine = Integer.parseInt(sizeLineStr);
		
		System.out.print("Введите верхнюю границу для значений: " );
		String maxValueStr = reader.readLine();
		int maxValue = Integer.parseInt(maxValueStr);
		
		logger.log("Создаём и наполняем список");
		
		List<Integer> list = buildList(sizeLine, maxValue);
		
		System.out.println("Вот случайный список: " + list);
		
		logger.log("Просим пользователя ввести входные данные для фильтрации");
		
		System.out.print("Введите порог для фильтра: " );
		String filterStr = reader.readLine();
		int filter = Integer.parseInt(filterStr);
		
		Filter filt = new Filter(filter);
		List<Integer> filterList = filt.filterOut(list);
		logger.log("Выводим результат на экран");
		System.out.println("Отфильтрованный список: " + filterList);
		logger.log("Завершаем программу");
	}
	
	private static List<Integer> buildList(int sizeLine, int maxValue) {
		List<Integer> listRan = new ArrayList<>();
		for (int i = 0; i < (sizeLine); i++) {
			listRan.add(new Random().nextInt(maxValue));
		}
		return listRan;
	}
	
}
