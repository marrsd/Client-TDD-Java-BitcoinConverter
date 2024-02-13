package com.practicejava.tdd.bitcoin.client;

import com.practicejava.tdd.bitcoin.ConverterSvc;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BitcoinApp {

    public static void main( String[] args )
    {
        var converterSvc = new ConverterSvc();

        while (true) {
            try {
                var coins = Double.parseDouble(System.console().readLine("Coins: "));
                var currency = System.console().readLine("Currency (USD, GBP, or EUR): ");
                var dollars = converterSvc.convertBitcoins(ConverterSvc.Currency.valueOf(currency), coins);

                NumberFormat df = new DecimalFormat("#0.0000");
                df.setRoundingMode(RoundingMode.CEILING);

                System.out.println( String.format("%s Bitcoin = %s %s", coins, df.format(dollars), currency));
            }
            catch (Exception ex) {
                //
            }
        }
    }

}
