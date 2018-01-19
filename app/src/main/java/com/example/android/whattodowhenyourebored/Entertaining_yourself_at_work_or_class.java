package com.example.android.whattodowhenyourebored;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Entertaining_yourself_at_work_or_class extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertaining_yourself_at_work_or_class);


        TextView body3 = (TextView)findViewById(R.id.body_text_view_3);
        body3.setText(R.string.method3_bodyText1);
        Button previous= (Button)findViewById(R.id.previous_button_3);
        previous.setText("Home");
    }

    /**
     *
     * This method is called when nextButton is clicked
     *
     */

    public void nextButton_3 (View view) {

        Button home= (Button)findViewById(R.id.home_button_3);
        home.setVisibility(View.VISIBLE);

        Button previous= (Button)findViewById(R.id.previous_button_3);
        previous.setText("Previous");

        TextView body = (TextView) findViewById(R.id.body_text_view_3);
        String step1 = body.getText().toString();
        String currentStep  = getResources().getString(R.string.method3_bodyText1);
        String currentStep1 = getResources().getString(R.string.method3_bodyText2);
        String currentStep2 = getResources().getString(R.string.method3_bodyText3);
        String currentStep3 = getResources().getString(R.string.method3_bodyText4);

        if ( currentStep.equalsIgnoreCase(step1)) {

            ImageView image = (ImageView) findViewById(R.id.method3_image);
            image.setImageResource(R.drawable.method3_image2);
            body.setText(R.string.method3_bodyText2);
        }
        else if (currentStep1.equalsIgnoreCase(step1)){
            ImageView image = (ImageView) findViewById(R.id.method3_image);
            image.setImageResource(R.drawable.method3_image3);
            body.setText(R.string.method3_bodyText3);
        }

        else if (currentStep2.equalsIgnoreCase(step1)){
            ImageView image = (ImageView) findViewById(R.id.method3_image);
            image.setImageResource(R.drawable.method3_image4);
            body.setText(R.string.method3_bodyText4);
        }
        else if (currentStep3.equalsIgnoreCase(step1)){
            ImageView image = (ImageView) findViewById(R.id.method3_image);
            image.setImageResource(R.drawable.method3_image5);
            body.setText(R.string.method3_bodyText5);
            Button next =(Button)findViewById(R.id.next_button_3);
            // Show a message as a toast
            Toast.makeText(this, "You have reach all of the steps!! Click next to answer some question..", Toast.LENGTH_LONG).show();
        }
        else  {
            Intent intent = new Intent( this,Tell_us_about_yourself.class);
            startActivity(intent);
            home.setVisibility(View.GONE);
        }
    }
    /**
     *
     * This method is called when previousButton is clicked
     *
     */

    public void previousButton_3 (View view){

        Button next =(Button)findViewById(R.id.next_button_3);
        Button previous = (Button)findViewById(R.id.previous_button_3);

        Button home= (Button)findViewById(R.id.home_button_3);
        home.setVisibility(View.GONE);

        TextView body=(TextView)findViewById(R.id.body_text_view_3);
        String step1 = body.getText().toString();
        String currentStep = getResources().getString(R.string.method3_bodyText5);
        String currentStep1 = getResources().getString(R.string.method3_bodyText4);
        String currentStep2 = getResources().getString(R.string.method3_bodyText3);
        String currentStep3 = getResources().getString(R.string.method3_bodyText2);

        if ( currentStep.equalsIgnoreCase(step1)) {

            ImageView image = (ImageView) findViewById(R.id.method3_image);
            image.setImageResource(R.drawable.method3_image4);
            body.setText(R.string.method3_bodyText4);
            next.setText("NEXT");
            home.setVisibility(View.VISIBLE);
        }
        else if ( currentStep1.equalsIgnoreCase(step1)) {

            ImageView image = (ImageView) findViewById(R.id.method3_image);
            image.setImageResource(R.drawable.method3_image3);
            body.setText(R.string.method3_bodyText3);
            home.setVisibility(View.VISIBLE);
        }
        else if ( currentStep2.equalsIgnoreCase(step1)) {

            ImageView image = (ImageView) findViewById(R.id.method3_image);
            image.setImageResource(R.drawable.method3_image2);
            body.setText(R.string.method3_bodyText2);
            home.setVisibility(View.VISIBLE);
        }
        else if ( currentStep3.equalsIgnoreCase(step1)) {

            ImageView image = (ImageView) findViewById(R.id.method3_image);
            image.setImageResource(R.drawable.method3_image1);
            body.setText(R.string.method3_bodyText1);
            home.setVisibility(View.VISIBLE);
            next.setText("Next");
            previous.setText("Home");
        }
        else {
            Intent intent = new Intent( this,MainActivity.class);
            startActivity(intent);
        }
    }
    /**
     *
     * This method is called when homeButton is clicked
     *
     */
    public void homeButton_3 (View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_entertaining_yourself_at_work_or_class, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
