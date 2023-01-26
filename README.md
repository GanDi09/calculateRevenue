package org.example.SaleApartament;

public class SalesService {

    public static int calculateRevenue(int N, int M, int X) {
        int totalRevenue = 0;
        int currentPrice = X;
        for (int i = 1; i <= N; i++) {
            if (i % M == 1) {
                if (i > 10) {
                    currentPrice += 1000;
                }
            }
            totalRevenue += currentPrice;
        }
        return totalRevenue;
    }
    
}