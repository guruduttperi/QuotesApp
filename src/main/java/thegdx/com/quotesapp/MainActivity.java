package thegdx.com.quotesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //Declaring the Onscreen Components

    private Button quoteButton;
    private TextView quoteText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteButton = (Button) findViewById(R.id.quoteButtonView);
        quoteText =  (TextView) findViewById(R.id.quoteTextView);

        // Button Onclick Method

        quoteButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                QuoteServe qs = new QuoteServe();
                quoteText.setText(qs.getRandomQuote());
            }
        });
    }
}
