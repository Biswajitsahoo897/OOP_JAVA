package Experiment_03;

public class StockTime {
    public static void main(String[] args) {
        String[][] Stock = {
            {"Time", "Stock A", "Stock B", "Stock C"},
            {"06:00", "100", "200", "300"},
            {"09:00", "150", "250", "350"},
            {"11:00", "155", "255", "355"},
            {"12:00", "175", "275", "375"},
            {"13:00", "195", "295", "395"}
        };

        for (int i = 0; i < Stock.length; i++) {
            for (int j = 0; j < Stock[i].length; j++) {
                System.out.print(Stock[i][j] + "\t");
            }
            System.out.println();
        }
    }

    
}
