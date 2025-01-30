package com.problemstatement.stack.stockspanproblem;

public class Main {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

StockSpanProblem st=new StockSpanProblem();
        int[] span = st.calculateSpan(prices);

        st.display(span);
    }
}
