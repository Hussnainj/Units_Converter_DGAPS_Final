package com.example.wasim.unitsconverterdgaps;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner11, from, to;
    TextView result,tex2,text3,text4,text5;
    EditText value;
    String[] froms ;
    String f="",t="";
    Button enterresult,bu;
    String check=null;
    double ress;
    double re;
    String convertTO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Typeface mytypeface = Typeface.createFromAsset(getAssets(),"sr.ttf");
        TextView tv1 = (TextView) findViewById(R.id.categoryTitle);
        tv1.setTypeface(mytypeface);


        spinner11 = (Spinner)findViewById(R.id.spinner11);
        from = (Spinner)findViewById(R.id.spinner);
        to = (Spinner)findViewById(R.id.spinner1);
        result = (TextView)findViewById(R.id.tvresult);
        value = (EditText)findViewById(R.id.value);
        enterresult = (Button)findViewById(R.id.buttonn);


        String[] val = {"Length" ,"Temperature" ,"Weight","Time","Area","Volume" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_custom,val);
        spinner11.setAdapter(adapter);
        spinnerCall();
        enterresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f = from.getSelectedItem().toString();
                t = to.getSelectedItem().toString();
                // Toast.makeText(Conversion_Of_Speed.this, f+"\n"+t, Toast.LENGTH_SHORT).show();
                String r = value.getText().toString();
                if (r.equals(null) || r.equals("") ||r.equals(" ")) {
                    Toast.makeText(MainActivity.this,"Enter Some Value", Toast.LENGTH_SHORT).show();
                    result.setText( "Enter  Value");

                }
                else
                {

                    try {
                        if (r.equals(".")) {

                        }

                        re = Double.parseDouble(r);
                        result.setText("Enter Value...." );

                    }
                    catch (Exception e)
                    {
                        Toast.makeText(MainActivity.this,"Invalid Entry."+"\n", Toast.LENGTH_SHORT).show();

                        result.setText("Enter Value....");

                    }

                    if (f.equals("Celcius") && t.equals("Celcius")) {

                        ress = re * 1;

                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }


                    } else if (f.equalsIgnoreCase("Celcius") && t.equalsIgnoreCase("kelvin")) {

                        double ress1 = re + 273.15;

                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Celcius") && t.equals("Farenheit")) {
                        double ress1 = (re * 1.8) + 32;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("kelvin") && t.equals("kelvin")) {

                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("kelvin") && t.equals("Celcius")) {
                        ress = re - 273.15;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("kelvin") && t.equals("Farenheit")) {
                        ress = (re * 1.8) - 459.67;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Farenheit") && t.equals("Farenheit")) {

                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Farenheit") && t.equals("kelvin")) {
                        ress = (re + 459.67) * 0.555;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Farenheit") && t.equals("Celcius")) {
                        ress = (re - 32) / 1.8;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Kilogram") && t.equals("Kilogram")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Kilogram") && t.equals("Gram")) {
                        ress = re * 1000;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Kilogram") && t.equals("Miligram")) {
                        ress = re * 1000000;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Kilogram") && t.equals("Pound")) {
                        ress = re * 2.2046244202;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Kilogram") && t.equals("Ounces")) {
                        ress = re * 35.273990723;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Gram") && t.equals("Gram")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Gram") && t.equals("Kilogram")) {
                        ress = re * 0.001;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Gram") && t.equals("Pound")) {
                        ress = re * 0.0022046244;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Gram") && t.equals("Ounces")) {
                        ress = re * 0.0352739907;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Gram") && t.equals("Miligram")) {
                        ress = re * 1000;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Miligram") && t.equals("Miligram")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Miligram") && t.equals("Kilogram")) {
                        ress = re * 0.000001;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Miligram") && t.equals("Ounces")) {
                        ress = re * 0.000035274;
                        result.setText(ress + "  " + t);
                    } else if (f.equals("Miligram") && t.equals("Pound")) {
                        ress = re * 0.0000022046;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Miligram") && t.equals("Gram")) {
                        ress = re * 0.001;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Pound") && t.equals("Pound")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Pound") && t.equals("Kilogram")) {
                        ress = re * 0.453592;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Pound") && t.equals("Gram")) {
                        ress = re * 453.592;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Pound") && t.equals("Ounces")) {
                        ress = re * 16;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Pound") && t.equals("Miligram")) {
                        ress = re * 453592;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Ounces") && t.equals("Ounces")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Ounces") && t.equals("Miligram")) {
                        ress = re * 28349.5;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Ounces") && t.equals("Kilogram")) {
                        ress = re * 0.0283495;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Ounces") && t.equals("Gram")) {
                        ress = re * 28.3495;
                        result.setText(ress + "  " + t);
                    } else if (f.equals("Ounces") && t.equals("Pound")) {
                        ress = re * 0.0625;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Meter") && t.equals("Meter")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Meter") && t.equals("kilometer")) {
                        ress = re * 0.001;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Meter") && t.equals("Centimeter")) {
                        ress = re * 100;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Meter") && t.equals("Mile")) {
                        ress = re * 0.0006213689;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Meter") && t.equals("Inch")) {
                        ress = re * 39.37007874;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("kilometer") && t.equals("kilometer")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("kilometer") && t.equals("Meter")) {
                        ress = re * 1000;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("kilometer") && t.equals("Centimeter")) {
                        ress = re * 100000;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("kilometer") && t.equals("Mile")) {
                        ress = re * 0.6213688756;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("kilometer") && t.equals("Inch")) {
                        ress = re * 39370.07874;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Centimeter") && t.equals("Centimeter")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Centimeter") && t.equals("Meter")) {
                        ress = re * 0.01;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Centimeter") && t.equals("Kilometer")) {
                        ress = re * 0.00001;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Centimeter") && t.equals("Mile")) {
                        ress = re * 0.0000062137;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Centimeter") && t.equals("Inch")) {
                        ress = re * 0.3937007874;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Mile") && t.equals("Mile")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Mile") && t.equals("Meter")) {
                        ress = re * 1609.35;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Mile") && t.equals("kilometer")) {
                        ress = re * 1.60935;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Mile") && t.equals("Centimeter")) {
                        ress = re * 160935;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Mile") && t.equals("Inch")) {
                        ress = re * 63360.23622;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Inch") && t.equals("Inch")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Inch") && t.equals("Meter")) {
                        ress = re * 0.0254;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Inch") && t.equals("kilometer")) {
                        ress = re * 0.0000254;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Inch") && t.equals("Centimeter")) {
                        ress = re * 2.54;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Inch") && t.equals("Mile")) {
                        ress = re * 0.0000157828;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Second") && t.equals("Second")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Second") && t.equals("Minute")) {
                        ress = re * 0.0166666667;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Second") && t.equals("Hour")) {
                        ress = re * 0.0002777778;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Second") && t.equals("Day")) {
                        ress = re * 0.0000115741;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Second") && t.equals("Week")) {
                        ress = re * 0.0000016534;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Second") && t.equals("Month")) {
                        ress = re * 3.802570537E-7;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Minute") && t.equals("Minute")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Minute") && t.equals("Second")) {
                        ress = re * 60;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Minute") && t.equals("Hour")) {
                        ress = re * 0.0166666667;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Minute") && t.equals("Day")) {
                        ress = re * 0.0006944444;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Minute") && t.equals("Week")) {
                        ress = re * 0.0000992063;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Minute") && t.equals("Month")) {
                        ress = re * 0.0000228154;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Hour") && t.equals("Hour")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Hour") && t.equals("Second")) {
                        ress = re * 3600;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Hour") && t.equals("Minute")) {
                        ress = re * 60;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Hour") && t.equals("Day")) {
                        ress = re * 0.0416666667;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Hour") && t.equals("Week")) {
                        ress = re * 0.005952381;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Hour") && t.equals("Month")) {
                        ress = re * 0.0013689254;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Day") && t.equals("Day")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Day") && t.equals("Second")) {
                        ress = re * 86400;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Day") && t.equals("Minute")) {
                        ress = re * 1440;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Day") && t.equals("Hour")) {
                        ress = re * 24;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Day") && t.equals("Week")) {
                        ress = re * 0.1428571429;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Day") && t.equals("Month")) {
                        ress = re * 0.0328542094;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Week") && t.equals("Week")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Week") && t.equals("Second")) {
                        ress = re * 604800;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Week") && t.equals("Minute")) {
                        ress = re * 10080;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Week") && t.equals("Hour")) {
                        ress = re * 168;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Week") && t.equals("Day")) {
                        ress = re * 7;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Week") && t.equals("Month")) {
                        ress = re * 0.2299794661;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Month") && t.equals("Month")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Month") && t.equals("Second")) {
                        ress = re * 2629800;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Month") && t.equals("Minute")) {
                        ress = re * 43830;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Month") && t.equals("Hour")) {
                        ress = re * 730.5;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Month") && t.equals("Day")) {
                        ress = re * 30.4375;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Month") && t.equals("Week")) {
                        ress = re * 4.3482142857;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Square Meter") && t.equals("Square Meter")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Square Meter") && t.equals("Square Kilometer")) {
                        ress = (re) / 1000000;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Square Meter") && t.equals("Square Centimeter")) {
                        ress = re * 10000;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    }
//                else if (f.equals("Square Meter") && t.equals("Square Mile")){
//                    ress = re*3.861018768E-7;
//                    result.setText(ress+"");
//                }
//                else if (f.equals("Square Meter") && t.equals("Square Inch")){
//                    ress = re*1550.0031 ;
//                    result.setText(ress+"");
//                }
                    else if (f.equals("Square kilometer") && t.equals("Square kilometer")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Square Kilometer") && t.equals("Square Meter")) {
                        ress = re * 1000000;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Square Kilometer") && t.equals("Square Centimeter")) {   // *** BigNumber from SKM to SCM
                        ress = re * 1000000000;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    }

                    else if (f.equals("Square Centimeter") && t.equals("Square Centimeter")) {
                        ress = re * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Square Centimeter") && t.equals("Square Meter")) {
                        ress = re * 0.0001;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    } else if (f.equals("Square Centimeter") && t.equals("Square Kilometer")) {

                        ress = (re) / 1000000000;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }
                    }
                    else if (f.equals("Liter") && t.equals("Liter")) {

                        ress = (re) * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Liter") && t.equals("Milliliter")) {

                        ress = (re) / 0.0010000;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Liter") && t.equals("US Gallon")) {

                        ress = (re) * 0.26417;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Liter") && t.equals("Imperial Gallon")) {

                        ress = (re) * 0.21997;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Liter") && t.equals("US Fluid Ounce")) {

                        ress = (re) * 33.814;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Liter") && t.equals("Imperial Fluid Ounce")) {

                        ress = (re) * 35.195;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Milliliter") && t.equals("Milliliter")) {

                        ress = (re) * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Milliliter") && t.equals("Liter")) {

                        ress = (re) / 1000;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Milliliter") && t.equals("US Gallon")) {

                        ress = (re) * 0.00026417;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Milliliter") && t.equals("Imperial Gallon")) {

                        ress = (re) * 0.00021997;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Milliliter") && t.equals("US Fluid Ounce")) {

                        ress = (re) * 0.033814;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Milliliter") && t.equals("Imperial Fluid Ounce")) {

                        ress = (re) * 0.035195;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("US Gallon") && t.equals("US Gallon")) {

                        ress = (re) * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("US Gallon") && t.equals("Millilier")) {

                        ress = (re) / 0.00026417;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("US Gallon") && t.equals("Liter")) {

                        ress = (re) / 0.26417;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("US Gallon") && t.equals("Imperial Gallon")) {

                        ress = (re) * 0.83267;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("US Gallon") && t.equals("US Fluid Ounce")) {

                        ress = (re) * 128.00;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Imperial Gallon") && t.equals("Imperial Gallon")) {

                        ress = (re) * 1;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Imperial Gallon") && t.equals("Milliliter")) {

                        ress = (re) / 0.00021997;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Imperial Gallon") && t.equals("Liter")) {

                        ress = (re) / 0.21997;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    } else if (f.equals("Imperial Gallon") && t.equals("US Gallon")) {

                        ress = (re) / 0.83267;
                        if(ress ==1 )
                        {
                            result.setText(ress + "  " + t);
                        }
                        else
                        {
                            result.setText(ress + "  " + t+"(s)");
                        }

                    }

                }

                }

        });}




    public  void spinnerCall()
    {

        spinner11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Toast.makeText(Conversion_Of_Speed.this, spinner11.getSelectedItem()+"", Toast.LENGTH_SHORT).show();
                final String spinervalue =  spinner11.getSelectedItem().toString();
                switch (spinervalue){
                    case "Length":
                        lenth();
                        break;
                    case "Temperature":
                        temperature();
                        break;
                    case "Weight":
                        weight();
                        break;
                    case "Time":
                        time();
                        break;
                    case "Area":
                        area();
                        break;
                    case "Volume":
                        volume();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
    }

    public void area(){
        froms =new String[] {"Square Kilometer", "Square Meter" ,"Square Centimeter"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_custom,froms);
        from.setAdapter(adapter);
        to.setAdapter(adapter);
    }

    public void volume(){
        froms =new String[] {"Liter", "Milliliter" ,"US Gallon","Imperial Gallon"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_custom,froms);
        from.setAdapter(adapter);
        to.setAdapter(adapter);
    }

    public void temperature(){
        froms = new String[]{"Celcius", "kelvin", "Farenheit"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_custom,froms);
        from.setAdapter(adapter);
        to.setAdapter(adapter);



    }
    public void lenth(){
        froms = new String[]{"Meter" ,"kilometer" ,"Centimeter" , "Mile" ,"Inch"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_custom,froms);
        from.setAdapter(adapter);
        to.setAdapter(adapter);
    }
    //    public void area(){
//         froms = new String[] {"Square Meter" ,"Square kilometer" ,"Square Centimeter" , "Square Mile" ,"Square Inch"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,froms);
//        from.setAdapter(adapter);
//        to.setAdapter(adapter);
//    }
//    public void volume(){
//         froms = new String[]{"Cubic Meter" ,"Cubic kilometer" ,"Cubic Centimeter" };
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,froms);
//        from.setAdapter(adapter);
//        to.setAdapter(adapter);
    // }
    public void weight(){
        froms =new String[] {"Kilogram" ,"Gram" ,"Miligram" , "Pound" , "Ounces"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_custom,froms);
        from.setAdapter(adapter);
        to.setAdapter(adapter);
    }
    public void time(){
        froms = new String[] {"Second"  , "Minute" , "Hour" , "Day" , "Week" ,"Month"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_custom,froms);
        from.setAdapter(adapter);
        to.setAdapter(adapter);

    }
   /* public void setenable(){
        from.setEnabled(true);
        to.setEnabled(true);
        value.setEnabled(true);
        result.setEnabled(true);
        enterresult.setEnabled(true);
        tex2.setEnabled(true);
        text3.setEnabled(true);
        text4.setEnabled(true);
        text5.setEnabled(true);

    }
    public void setdisable(){

        from.setEnabled(false);
        to.setEnabled(false);
        value.setEnabled(false);
        result.setEnabled(false);
        enterresult.setEnabled(false);
        tex2.setEnabled(false);
        text3.setEnabled(false);
        text4.setEnabled(false);
        text5.setEnabled(false);
    }*/


   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            AboutUs();
            return true;
        }if (id == R.id.aboutapp) {
            AboutAPP();
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }




    public  void AboutUs()
    {




        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("http://www.dgaps.com/");
        alertDialog.setIcon(R.drawable.logo);
        alertDialog.setMessage(" Digital Application’s Plans and Price has no hidden charges,\n" +
                "We have all-inclusive prices and unbeatable value. Other Companies promise to provide cheap solutions,\n" +
                "but they charge extra as setup fees or higher renewal rates, or some hidden charges.");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }

    public  void AboutAPP()
    {




        AlertDialog alertDialog1 = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog1.setTitle("About App");
        alertDialog1.setIcon(R.drawable.logocamp);
        alertDialog1.setMessage("Unit Converter is an application that allows  you to convert the values of Different Metrics into different unit scale.User can convert the values of Temperature,Area,Volume,Weight,Lenght and Time ");
        alertDialog1.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog1.show();
    }

}
