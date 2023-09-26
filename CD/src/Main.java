import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String line;
            while ((line = br.readLine()) != null && !line.equals("0 0")) {
                String[] parts = line.split(" ");
                int n = Integer.parseInt(parts[0]);
                int m = Integer.parseInt(parts[1]);

                Set<Integer> nCDs = new HashSet<>();

                for (int i = 0; i < n; i++) {
                    int cd = Integer.parseInt(br.readLine());
                    nCDs.add(cd);
                }

                int common = 0;

                for (int i = 0; i < m; i++) {
                    int cd = Integer.parseInt(br.readLine());
                    if (nCDs.contains(cd)) {
                        common++;
                    }
                }

                System.out.println(common);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
