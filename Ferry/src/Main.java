import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int c = Integer.parseInt(reader.readLine());

            for (int i = 0; i < c; i++) {
                String[] arr = reader.readLine().split(" ");
                int size = Integer.parseInt(arr[0]);
                int cars = Integer.parseInt(arr[1]);
                size *= 100;

                // Read cars into lists
                List<Integer> leftList = new ArrayList<>();
                List<Integer> rightList = new ArrayList<>();

                for (int j = 0; j < cars; j++) {
                    String[] carInfo = reader.readLine().split(" ");
                    int carSize = Integer.parseInt(carInfo[0]);
                    String side = carInfo[1];

                    if ("left".equals(side)) {
                        leftList.add(carSize);
                    } else if ("right".equals(side)) {
                        rightList.add(carSize);
                    }
                }

                // Simulate
                int trips = 0;

                while (!leftList.isEmpty() || !rightList.isEmpty()) {
                    int leftRemaining = size;

                    while (!leftList.isEmpty() && leftList.get(leftList.size() - 1) <= leftRemaining) {
                        leftRemaining -= leftList.remove(leftList.size() - 1);
                    }

                    trips++;

                    if (leftList.isEmpty() && rightList.isEmpty()) {
                        break;
                    }

                    int rightRemaining = size;

                    while (!rightList.isEmpty() && rightList.get(rightList.size() - 1) <= rightRemaining) {
                        rightRemaining -= rightList.remove(rightList.size() - 1);
                    }

                    trips++;
                }

                System.out.println(trips);

            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
