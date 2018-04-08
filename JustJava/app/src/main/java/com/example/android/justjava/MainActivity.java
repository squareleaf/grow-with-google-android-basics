package com.example.android.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream);
        boolean whipped_cream = whippedCreamCheckBox.isChecked();

        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate);
        boolean chocolate = chocolateCheckBox.isChecked();

        EditText nameInput = (EditText) findViewById(R.id.customer_name);
        String nameValue = nameInput.getText().toString();

        int price = calculatePrice(chocolate, whipped_cream);

        emailOrderSummary(nameValue, price, whipped_cream, chocolate);
    }

    private int calculatePrice(boolean chocolate, boolean whipped_cream) {
        int base_price = 5;

        if (whipped_cream == true) {
            base_price = base_price + 1;
        }

        if (chocolate == true) {
            base_price = base_price + 2;
        }
        return quantity * base_price;
    }

    private void emailOrderSummary(String name, int price, boolean cream, boolean chocolate) {
        String sendMessage = createOrderSummary(name, price, cream, chocolate);

        Intent emailOrderIntent = new Intent(Intent.ACTION_SENDTO);
        emailOrderIntent.setData(Uri.parse("mailto:"));
        emailOrderIntent.putExtra(Intent.EXTRA_SUBJECT, "JustJava order for " + name);
        emailOrderIntent.putExtra(Intent.EXTRA_TEXT, sendMessage);
        if (emailOrderIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(emailOrderIntent);
        }
    }
    private String createOrderSummary(String name, int price, boolean cream, boolean chocolate) {
        String priceMessage = "Name: " + name;
        priceMessage += "\nAdd whipped cream? " + cream;
        priceMessage += "\nAdd chocolate topping? " + chocolate;
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nTotal: $" + price;
        priceMessage += "\nThank you!";
        return priceMessage;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int coffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + coffees);
    }

    /**
     * This method displays the given text on the screen.
     */
//    private void displayMessage(String message) {
//        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
//        orderSummaryTextView.setText(message);
//    }

    public void increment(View view){
        if (quantity < 100 ) {
            quantity = quantity + 1;
        } else {
            Toast.makeText(this, "You cannot order more than 100 cups", Toast.LENGTH_SHORT).show();
        }
        displayQuantity(quantity);
    }

    public void decrement(View view) {
        if (quantity > 1) {
            quantity = quantity - 1;
        } else {
            Toast.makeText(this, "You cannot order less than one cup", Toast.LENGTH_SHORT).show();
        }

        displayQuantity(quantity);
    }
}