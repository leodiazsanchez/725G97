import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int c = Integer.parseInt(br.readLine());

            for (int i = 0; i < c; i++) {

                int cross = 0;
                String[] arr = br.readLine().split(" ");
                int l = Integer.parseInt(arr[0]);
                int m = Integer.parseInt(arr[1]);

                for (int j = 0; j < m; j++) {
                    int len = 0;
                    String[] car = br.readLine().split(" ");
                    len += Integer.parseInt(car[0])/100; // Divide by 100 for cm to m
                    String dir = car[1];
                    String oldDir = null;

                    if (j==0){
                        oldDir = dir;
                    }

                    if (len > l && dir.equals(oldDir)){
                        cross++;
                    } else {
                        cross+=2;
                    }
                }

                System.out.println(cross);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
