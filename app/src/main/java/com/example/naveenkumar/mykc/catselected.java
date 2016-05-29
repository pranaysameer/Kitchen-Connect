package com.example.naveenkumar.mykc;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationItem;
import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationView;
import com.parse.ParseObject;

import java.util.ArrayList;

public class catselected extends AppCompatActivity {
    ListView desserts;
    CustomDialogClass cdd;
    ParseObject testObject;
    int flag;
    ListView categories;
    String[] web = {
            "Chocolate Icecream",
            "Vanilla Icecream",
            "Lava Cake",
            "Chocolate MilkShake",
            "Gulab Jamun"
    } ;

    Integer[] imageId = {
            R.drawable.dessert1,
            R.drawable.dessert2,
            R.drawable.dessert3,
            R.drawable.dessert4,
            R.drawable.dessert5

    };
    Integer[] vandn = {
            R.drawable.vegicon,
            R.drawable.vegicon,
            R.drawable.nvegicon,
            R.drawable.vegicon,
            R.drawable.vegicon

    };
    String[] pric={
            "Rs 85.00",
            "Rs 80.00",
            "Rs 100.00"
            ,
            "Rs 65.00",
            "Rs 45.00"
    };
    String[] web1 = {
            "Egg Masala",
            "Chicken Tikka Masala",
            "Panner Masala",
            "Kadai Chicken",
            "Butter Chicken"
    } ;

    Integer[] imageId1 = {
            R.drawable.curry1,
            R.drawable.curry2,
            R.drawable.curry3,
            R.drawable.curry4,
            R.drawable.curry5

    };
    Integer[] vandn1 = {
            R.drawable.nvegicon,
            R.drawable.nvegicon,
            R.drawable.vegicon,
            R.drawable.nvegicon,
            R.drawable.nvegicon

    };
    String[] pric1={
            "Rs 95.00",
            "Rs 140.00",
            "Rs 100.00"
            ,
            "Rs 135.00",
            "Rs 145.00"
    };
    String[] web2 = {
            "Chicken Soup",
            "Chicken Noodle Soup",
            "Hot and Sour soup",
            "Mushroom soup",
            "Tomato soup"
    } ;

    Integer[] imageId2 = {
            R.drawable.soup1,
            R.drawable.soup2,
            R.drawable.soup3,
            R.drawable.soup4,
            R.drawable.soup5

    };
    Integer[] vandn2 = {
            R.drawable.nvegicon,
            R.drawable.nvegicon,
            R.drawable.nvegicon,
            R.drawable.vegicon,
            R.drawable.vegicon

    };
    String[] pric2={
            "Rs 105.00",
            "Rs 110.00",
            "Rs 100.00"
            ,
            "Rs 95.00",
            "Rs 85.00"
    };
    String[] web3 = {
            "Paneer Sandwitch",
            "Chicken Burger",
            "Chicken Nuggets",
            "Cuban Sandwitch",
            "Veg Burger"
    } ;

    Integer[] imageId3 = {
            R.drawable.continental1,
            R.drawable.continental2,
            R.drawable.continental3,
            R.drawable.continental4,
            R.drawable.continental5

    };
    Integer[] vandn3 = {
            R.drawable.vegicon,
            R.drawable.nvegicon,
            R.drawable.nvegicon,
            R.drawable.vegicon,
            R.drawable.vegicon

    };
    String[] pric3={
            "Rs 65.00",
            "Rs 70.00",
            "Rs 100.00"
            ,
            "Rs 85.00",
            "Rs 65.00"
    };
    String[] web4 = {
            "Veg Biryani",
            "Egg Biryani",
            "Chicken Biryani",
            "Mutton Biryani",
            "Hyderabadi Biryani"
    } ;

    Integer[] imageId4 = {
            R.drawable.biryani1,
            R.drawable.biryani2,
            R.drawable.biryani3,
            R.drawable.biryani4,
            R.drawable.biryani5

    };
    Integer[] vandn4 = {
            R.drawable.vegicon,
            R.drawable.nvegicon,
            R.drawable.nvegicon,
            R.drawable.nvegicon,
            R.drawable.nvegicon

    };
    String[] pric4={
            "Rs 105.00",
            "Rs 120.00",
            "Rs 150.00"
            ,
            "Rs 165.00",
            "Rs 165.00"
    };
    String[] web5 = {
            "Chicken Drumstick",
            "Chicken Manchurian",
            "Veg Manchurian",
            "Veg Noodles",
            "Chicken Noodles"
    } ;

    Integer[] imageId5 = {
            R.drawable.chinese1,
            R.drawable.chinese2,
            R.drawable.chinese3,
            R.drawable.chinese4,
            R.drawable.chinese5

    };
    Integer[] vandn5 = {
            R.drawable.nvegicon,
            R.drawable.nvegicon,
            R.drawable.vegicon,
            R.drawable.vegicon,
            R.drawable.nvegicon

    };
    String[] pric5={
            "Rs 125.00",
            "Rs 110.00",
            "Rs 100.00"
            ,
            "Rs 95.00",
            "Rs 105.00"
    };
    String[] web6 = {
            "Chicken Tikka",
            "Chicken Kebab",
            "Special Chicken Kebab",
            "Paneer Chilli",
            "Veg Rolls",
            "Teriyaki Chicken"
    } ;

    Integer[] imageId6 = {
            R.drawable.starter1,
            R.drawable.starter2,
            R.drawable.starter3,
            R.drawable.starter4,
            R.drawable.starter5,
            R.drawable.starter6

    };
    Integer[] vandn6 = {
            R.drawable.nvegicon,
            R.drawable.nvegicon,
            R.drawable.nvegicon,
            R.drawable.vegicon,
            R.drawable.vegicon,
            R.drawable.nvegicon

    };
    String[] pric6={
            "Rs 125.00",
            "Rs 110.00",
            "Rs 100.00"
            ,
            "Rs 125.00",
            "Rs 105.00",
            "Rs 145.00"
    };
    String[] catName={
            "Desserts\n\n",
            "Curries\n\n",
            "Soups\n\n",
            "Continental\n\n",
            "Chinese\n\n",
            "Biryani\n\n",
            "Starter\n\n",

    };
    Integer catImg[]={

    };
    String x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catselected);

        Intent intent=getIntent();
        x=intent.getStringExtra("string");
        TextView tvbi=(TextView)findViewById(R.id.bill);
        tvbi.setText("Rs "+AppClass.tbill);
        Button btn1=(Button)findViewById(R.id.cat_dessert_text1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomList adapter = new CustomList(catselected.this, web, pric, imageId, vandn);
                desserts = (ListView) findViewById(R.id.list2);
                flag=R.id.cat_dessert;
                desserts.setAdapter(adapter);
            }
        });
        Button btn2=(Button)findViewById(R.id.cat_curries_text1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomList adapter = new CustomList(catselected.this, web1, pric1, imageId1, vandn1);
                desserts = (ListView) findViewById(R.id.list2);
                flag=R.id.cat_curries;
                desserts.setAdapter(adapter);
            }
        });
        Button btn3=(Button)findViewById(R.id.cat_soups_text1);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomList adapter = new CustomList(catselected.this, web2, pric2, imageId2, vandn2);
                desserts = (ListView) findViewById(R.id.list2);
                flag=R.id.cat_soups;
                desserts.setAdapter(adapter);
            }
        });
        Button btn4=(Button)findViewById(R.id.cat_continental_text1);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomList adapter = new CustomList(catselected.this, web3, pric3, imageId3, vandn3);
                desserts = (ListView) findViewById(R.id.list2);
                flag=R.id.cat_continental;
                desserts.setAdapter(adapter);
            }
        });
        Button btn5=(Button)findViewById(R.id.cat_biryani_text1);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomList adapter = new CustomList(catselected.this, web4, pric4, imageId4, vandn4);
                desserts = (ListView) findViewById(R.id.list2);
                flag=R.id.cat_biryani;
                desserts.setAdapter(adapter);
            }
        });
        Button btn6=(Button)findViewById(R.id.cat_chinese_text1);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomList adapter = new CustomList(catselected.this, web5, pric5, imageId5, vandn5);
                desserts = (ListView) findViewById(R.id.list2);
                desserts.setAdapter(adapter);
                flag=R.id.cat_chinese;
            }
        });
        Button btn7=(Button)findViewById(R.id.cat_starters_text1);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomList adapter = new CustomList(catselected.this, web6, pric6, imageId6, vandn6);
                desserts = (ListView) findViewById(R.id.list2);
                desserts.setAdapter(adapter);
                flag = R.id.cat_starters;
            }
        });

        if(x.equals(""+R.id.cat_dessert))

        {
            CustomList adapter = new CustomList(catselected.this, web, pric, imageId, vandn);
            desserts = (ListView) findViewById(R.id.list2);
            desserts.setAdapter(adapter);
            flag=R.id.cat_dessert;
            //desserts.setOnItemClickListener(this);
        }
        else if(x.equals(""+R.id.cat_curries))
        {
            CustomList adapter = new CustomList(catselected.this, web1, pric1, imageId1, vandn1);
            desserts = (ListView) findViewById(R.id.list2);
            desserts.setAdapter(adapter);
            flag=R.id.cat_curries;
            //desserts.setOnItemClickListener(this);
        }
        else if(x.equals(""+R.id.cat_soups))
        {
            CustomList adapter = new CustomList(catselected.this, web2, pric2, imageId2, vandn2);
            desserts = (ListView) findViewById(R.id.list2);
            desserts.setAdapter(adapter);
            flag=R.id.cat_soups;
            //desserts.setOnItemClickListener(this);
        }
        else if(x.equals(""+R.id.cat_continental))
        {
            CustomList adapter = new CustomList(catselected.this, web3, pric3, imageId3, vandn3);
            desserts = (ListView) findViewById(R.id.list2);
            desserts.setAdapter(adapter);
            flag=R.id.cat_continental;
            //desserts.setOnItemClickListener(this);
        }
        else if(x.equals(""+R.id.cat_biryani))
        {
            CustomList adapter = new CustomList(catselected.this, web4, pric4, imageId4, vandn4);
            desserts = (ListView) findViewById(R.id.list2);
            desserts.setAdapter(adapter);
            flag=R.id.cat_biryani;
            //desserts.setOnItemClickListener(this);
        }
        else if(x.equals(""+R.id.cat_chinese))
        {
            CustomList adapter = new CustomList(catselected.this, web5, pric5, imageId5, vandn5);

            desserts = (ListView) findViewById(R.id.list2);
            desserts.setAdapter(adapter);
            flag=R.id.cat_chinese;
            //desserts.setOnItemClickListener(this);
        }
        else if(x.equals(""+R.id.cat_starters))
        {
            CustomList adapter = new CustomList(catselected.this, web6, pric6, imageId6, vandn6);
            desserts = (ListView) findViewById(R.id.list2);
            desserts.setAdapter(adapter);
            flag=R.id.cat_starters;
            //desserts.setOnItemClickListener(this);
        }
        desserts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                       cdd=new CustomDialogClass(catselected.this);
                       cdd.show();
                       cdd.setString("" + flag + "?" + position);
                        cdd.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public void onDismiss(DialogInterface dialog) {
                                TextView tvb=(TextView)findViewById(R.id.bill);
                                tvb.setText("Rs "+AppClass.tbill);
                            }
                        });



            }
        });

        Button btnw=(Button)findViewById(R.id.view_platter);
        btnw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(catselected.this, platter.class);
                startActivity(intent);
            }
        });

        Button waiterbutton =(Button)findViewById(R.id.call_waiter1);
        waiterbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testObject = new ParseObject("Orders");
                testObject.put("TableNo",AppClass.tableno);
                testObject.put("call_waiter","yes");
                testObject.saveInBackground();
                Toast.makeText(getApplicationContext(),"Waiter on the way...",Toast.LENGTH_SHORT).show();
            }
        });

    }




}

class CustomList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] web;
    private final String[] pric;
    private final Integer[] vandn;
    private final Integer[] imageId;
    public CustomList(Activity context,
                      String[] web,String[]pric, Integer[] imageId,Integer[] vandn) {
        super(context, R.layout.listforcatselected, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;
        this.vandn=vandn;

        this.pric=pric;
    }



    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.listforcatselected, null, true);
        TextView dishname = (TextView) rowView.findViewById(R.id.textView7);
        TextView price = (TextView) rowView.findViewById(R.id.textView8);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.profile_image);
        ImageView imageView1 = (ImageView) rowView.findViewById(R.id.nvicon);
        dishname.setText(web[position]);
        price.setText(pric[position]);
        //RadioButton veg=(RadioButton)rowView.findViewById(R.id.radioButton);
        imageView.setImageResource(imageId[position]);
        imageView1.setImageResource(vandn[position]);


        return rowView;
    }
}

/*class CustomList2 extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] web;
    //private final Integer[] imageId;
    public CustomList2(Activity context,
                       String[] web) {
        super(context, R.layout.list_double, web);
        this.context = context;
        this.web = web;
        // this.imageId = imageId;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_double, null, true);
        TextView dishname = (TextView) rowView.findViewById(R.id.textView20);
        //ImageView imageView = (ImageView) rowView.findViewById(R.id.profile_image);
        dishname.setText(web[position]);
        //imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
*/