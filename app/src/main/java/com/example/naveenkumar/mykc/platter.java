package com.example.naveenkumar.mykc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.text.ParseException;
import java.util.List;

public class platter extends AppCompatActivity {
    ParseObject testObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platter);
        CustomListp adapter = new CustomListp(platter.this,AppClass.x1,AppClass.x3,AppClass.x2);
        ListView displayL = (ListView) findViewById(R.id.list3);
        displayL.setAdapter(adapter);
        TextView tvb=(TextView)findViewById(R.id.tbill);
        tvb.setText("" + AppClass.tbill);
        Button orderbutton =(Button)findViewById(R.id.order);
        orderbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < AppClass.i; i++) {
                    testObject = new ParseObject("Orders");
                    testObject.put("Dish_name", AppClass.x1[i]);
                    testObject.put("Quantity", AppClass.x2[i]);
                    testObject.put("Price", AppClass.x3[i]);
                    testObject.put("Comments",AppClass.x4[i]);
                    testObject.put("TableNo", AppClass.tableno);
                    testObject.put("status","false");

                    testObject.saveInBackground();
                }
                Toast.makeText(getApplicationContext(), "Order Placed...", Toast.LENGTH_SHORT).show();
            }
        });

        Button waiterbutton =(Button)findViewById(R.id.call_waiter);
        waiterbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testObject = new ParseObject("Orders");
                testObject.put("TableNo", AppClass.tableno);
                testObject.put("call_waiter", "yes");
                testObject.saveInBackground();
                Toast.makeText(getApplicationContext(), "Waiter on the way...", Toast.LENGTH_SHORT).show();
            }
        });

        Button payment=(Button)findViewById(R.id.payment);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    ParseQuery<ParseObject> query= ParseQuery.getQuery("Orders");
                    query.whereEqualTo("TableNo",AppClass.tableno);
                    query.findInBackground(new FindCallback<ParseObject>() {
                        @Override
                        public void done(List<ParseObject> objects, com.parse.ParseException e) {
                            if(e==null) {

                                        ParseObject[] po=objects.toArray(new ParseObject[objects.size()]);
                                for(int i=0;i<objects.size();i++){
                                    po[i].put("status","true");
                                    po[i].saveInBackground();

                                }

                                    Toast.makeText(getApplicationContext(), "Thank you...you may proceed to the Payment", Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                                startActivity(intent);
                                     }
                            else {
                                Toast.makeText(getApplicationContext(), "Error...WAIT!!!", Toast.LENGTH_SHORT).show();
                            }
                        }


                    });


                }
            }
        });




    }
}


class CustomListp extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] web;
    private final String[] pric;
    private final String[] quan;
    public CustomListp(Activity context,
                       String[] web, String[] pric, String[] quan) {
        super(context, R.layout.platter_list, web);
        this.context = context;
        this.web = web;
        this.quan = quan;
        this.pric=pric;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.platter_list, null, true);
        TextView dishname = (TextView) rowView.findViewById(R.id.dish_n);
        TextView price = (TextView) rowView.findViewById(R.id.price_n);
        TextView quantity=(TextView)rowView.findViewById(R.id.quantity_n);
        dishname.setText(web[position]);
        price.setText(pric[position]);
        quantity.setText(quan[position]);




        return rowView;
    }
}