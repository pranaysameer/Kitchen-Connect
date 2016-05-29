package com.example.naveenkumar.mykc;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v4.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;


/**
 * Created by NAVEEN KUMAR on 28-05-2016.
 */
/*public class CustomDialogClass extends DialogFragment implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    public Button yes, no;
    private static final String KEY_STRING = "STRING";

    public CustomDialogClass() {

    }

    public static CustomDialogClass newInstance(String slkfj){
        CustomDialogClass mClass=new CustomDialogClass();
        Bundle mBundle=new Bundle();
        mBundle.putString(KEY_STRING, slkfj);
        mClass.setArguments(mBundle);
        return mClass;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mView=View.inflate(getContext(),R.layout.item_description,container);
        TextView tv=(TextView)mView.findViewById(R.id.item_name);
        //tv.setText(getArguments().getString(KEY_STRING));
        return mView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        String args=getArguments().getString(KEY_STRING);
        Log.d("gfhh",args);



        //no = (Button) findV0iewById(R.id.btn_no);
        //yes.setOnClickListener(this);
        //no.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
        dismiss();
    }
}
*/
public class CustomDialogClass extends Dialog implements
        android.view.View.OnClickListener {

    private static int[] IMAGES = { R.drawable.dessert1, R.drawable.dessert2,
            R.drawable.dessert3 };
    private final Activity c;
    private int mPosition = 0;
    public int n;

    private ImageSwitcher mImageSwitcher;


    
    public Dialog d;
    public Button yes, no;
    private TextView tv,rs;
    private EditText co;
    private ImageView img,pl,mi,cl;
    private TextView desc,quan;
    int counter;
    Button addToPlat;
    String[] web = {
            "Chocolate Icecream",
            "Vanilla Icecream",
            "Lava Cake",
            "Chocolate MilkShake",
            "Gulab Jamun"
    } ;
    String[] web1 = {
            "Egg Masala",
            "Chicken Tikka Masala",
            "Panner Masala",
            "Kadai Chicken",
            "Butter Chicken"
    } ;
    String[] web2 = {
            "Chicken Soup",
            "Chicken Noodle Soup",
            "Hot and Sour soup",
            "Mushroom soup",
            "Tomato soup"
    } ;
    String[] web3 = {
            "Paneer Sandwitch",
            "Chicken Burger",
            "Chicken Nuggets",
            "Cuban Sandwitch",
            "Veg Burger"
    } ;
    String[] web4 = {
            "Veg Biryani",
            "Egg Biryani",
            "Chicken Biryani",
            "Mutton Biryani",
            "Hyderabadi Biryani"
    } ;
    String[] web5 = {
            "Chicken Drumstick",
            "Chicken Manchurian",
            "Veg Manchurian",
            "Veg Noodles",
            "Chicken Noodles"
    } ;
    String[] web6 = {
            "Chicken Tikka",
            "Chicken Kebab",
            "Special Chicken Kebab",
            "Paneer Chilli",
            "Veg Rolls",
            "Teriyaki Chicken"
    } ;
    String[] pric={
            "Rs 85.00",
            "Rs 80.00",
            "Rs 100.00"
            ,
            "Rs 65.00",
            "Rs 45.00"
    };String[] pric1={
            "Rs 95.00",
            "Rs 140.00",
            "Rs 100.00"
            ,
            "Rs 135.00",
            "Rs 145.00"
    };
    String[] pric2={
            "Rs 105.00",
            "Rs 110.00",
            "Rs 100.00"
            ,
            "Rs 95.00",
            "Rs 85.00"
    };String[] pric3={
            "Rs 65.00",
            "Rs 70.00",
            "Rs 100.00"
            ,
            "Rs 85.00",
            "Rs 65.00"
    };String[] pric4={
            "Rs 105.00",
            "Rs 120.00",
            "Rs 150.00"
            ,
            "Rs 165.00",
            "Rs 165.00"
    };String[] pric5={
            "Rs 125.00",
            "Rs 110.00",
            "Rs 100.00"
            ,
            "Rs 95.00",
            "Rs 105.00"
    };String[] pric6={
            "Rs 125.00",
            "Rs 110.00",
            "Rs 100.00"
            ,
            "Rs 125.00",
            "Rs 105.00",
            "Rs 145.00"
    };
    public CustomDialogClass(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.item_description);
        //yes = (Button) findViewById(R.id.btn_yes);
        //no = (Button) findViewById(R.id.btn_no);
       // yes.setOnClickListener(this);
       // no.setOnClickListener(this);
        mImageSwitcher = (ImageSwitcher) findViewById(R.id.itemview);
        mImageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getContext());
                return imageView;
            }
        });
        mImageSwitcher.setInAnimation(getContext(), android.R.anim.slide_in_left);
        mImageSwitcher.setOutAnimation(getContext(), android.R.anim.slide_out_right);
        //mPosition++;
        mImageSwitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPosition = (mPosition + 1) %n;
                mImageSwitcher.setBackgroundResource(IMAGES[mPosition]);

            }
        });
        co=(EditText)findViewById(R.id.editcomment);
        tv=(TextView)findViewById(R.id.item_name);
        rs=(TextView)findViewById(R.id.price);

        quan=(TextView)findViewById(R.id.quantity);
//        img=(ImageView)findViewById(R.id.itemview);
        pl=(ImageView)findViewById(R.id.item_plus);
        pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                quan.setText(""+counter);

            }
        });
        mi=(ImageView)findViewById(R.id.item_minus);
        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                quan.setText(""+counter);

            }
        });

        cl=(ImageView)findViewById(R.id.close_dialog);
        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cancel();

            }
        });
        TextView adder=(TextView)findViewById(R.id.addtoplatter);
        adder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter!=0) {
                    AppClass.x4[AppClass.i]=""+co.getText().toString();
                    AppClass.x1[AppClass.i]=tv.getText().toString();
                    AppClass.x2[AppClass.i]=""+counter;
                    AppClass.x3[AppClass.i]=rs.getText().toString();

                    final double y=Double.parseDouble(rs.getText().toString().substring(3));
                    Log.d("Bishop",""+y);
                    AppClass.tbill=AppClass.tbill+y*counter;
                    AppClass.x3[AppClass.i]="Rs "+y*counter;
                    AppClass.i++;
                    counter=0;
                    cancel();

                }
                else{
                    Toast.makeText(getContext(),"Please Select Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
        dismiss();
    }

    public void setString(String x) {
       if(x.equals(""+R.id.cat_dessert+"?"+0))
        {
            tv.setText(web[0]);
            rs.setText(pric[0]);
            IMAGES[0]=R.drawable.dessert1;
            IMAGES[1]=R.drawable.chocoicecream;
            IMAGES[2]=R.drawable.chocoicecream2;
            n=3;

            //img.setImageResource(R.drawable.dessert1);
        }
        else if(x.equals(""+R.id.cat_dessert+"?"+1))
        {rs.setText(pric[1]);
            tv.setText(web[1]);
            IMAGES[0]=R.drawable.dessert2;
            n=1;


            //img.setImageResource(R.drawable.dessert2);
        }else if(x.equals(""+R.id.cat_dessert+"?"+2))
        {rs.setText(pric[2]);
            tv.setText(web[2]);
            IMAGES[0]=(R.drawable.dessert3);
            n=1;

        }else if(x.equals(""+R.id.cat_dessert+"?"+3))
        {rs.setText(pric[3]);
            tv.setText(web[3]);n=1;
            IMAGES[0]=(R.drawable.dessert4);
        }else if(x.equals(""+R.id.cat_dessert+"?"+4))
        {rs.setText(pric[4]);
            tv.setText(web[4]);n=1;
            IMAGES[0]=(R.drawable.dessert5);
        }else if(x.equals(""+R.id.cat_curries+"?"+0))
        {rs.setText(pric1[0]);
            tv.setText(web1[0]);n=1;
            IMAGES[0]=(R.drawable.curry1);
        }else if(x.equals(""+R.id.cat_curries+"?"+1))
        {rs.setText(pric1[1]);n=1;
            tv.setText(web1[1]);
            IMAGES[0]=(R.drawable.curry2);
        }else if(x.equals(""+R.id.cat_curries+"?"+2))
        {rs.setText(pric1[2]);
            tv.setText(web1[2]);n=1;
            IMAGES[0]=(R.drawable.curry3);
        }else if(x.equals(""+R.id.cat_curries+"?"+3))
        {rs.setText(pric1[3]);
            tv.setText(web1[3]);n=1;
            IMAGES[0]=(R.drawable.curry4);
        }else if(x.equals(""+R.id.cat_curries+"?"+4))
        {rs.setText(pric1[4]);
            tv.setText(web1[4]);n=1;
            IMAGES[0]=(R.drawable.curry5);
        }else if(x.equals(""+R.id.cat_soups+"?"+0))
        {rs.setText(pric2[0]);
            tv.setText(web2[0]);n=1;
            IMAGES[0]=(R.drawable.soup1);
        }else if(x.equals(""+R.id.cat_soups+"?"+1))
        {rs.setText(pric2[1]);
            tv.setText(web2[1]);n=1;
            IMAGES[0]=(R.drawable.soup2);
        }else if(x.equals(""+R.id.cat_soups+"?"+2))
        {rs.setText(pric2[2]);
            tv.setText(web2[2]);n=1;
            IMAGES[0]=(R.drawable.soup3);
        }else if(x.equals(""+R.id.cat_soups+"?"+3))
        {rs.setText(pric2[3]);
            tv.setText(web2[3]);n=1;
            IMAGES[0]=(R.drawable.soup4);
        }else if(x.equals(""+R.id.cat_soups+"?"+4))
        {rs.setText(pric2[4]);
            tv.setText(web2[4]);n=1;
            IMAGES[0]=(R.drawable.soup5);
        }else if(x.equals(""+R.id.cat_continental+"?"+0))
        {rs.setText(pric3[0]);
            tv.setText(web3[0]);n=1;
            IMAGES[0]=(R.drawable.continental1);
        }else if(x.equals(""+R.id.cat_continental+"?"+1))
        {rs.setText(pric3[1]);
            tv.setText(web3[1]);n=1;
            IMAGES[0]=(R.drawable.continental2);
        }else if(x.equals(""+R.id.cat_continental+"?"+2))
        {rs.setText(pric3[2]);
            tv.setText(web3[2]);n=1;
            IMAGES[0]=(R.drawable.continental3);
        }else if(x.equals(""+R.id.cat_continental+"?"+3))
        {rs.setText(pric3[3]);
            tv.setText(web3[3]);n=1;
            IMAGES[0]=(R.drawable.continental4);
        }else if(x.equals(""+R.id.cat_continental+"?"+4))
        {rs.setText(pric3[4]);
            tv.setText(web3[4]);n=1;
            IMAGES[0]=(R.drawable.continental5);
        }else if(x.equals(""+R.id.cat_biryani+"?"+0))
        {rs.setText(pric4[0]);
            tv.setText(web4[0]);n=1;
            IMAGES[0]=(R.drawable.biryani1);
        }else if(x.equals(""+R.id.cat_biryani+"?"+1))
        {rs.setText(pric4[1]);
            tv.setText(web4[1]);n=1;
            IMAGES[0]=(R.drawable.biryani2);
        }else if(x.equals(""+R.id.cat_biryani+"?"+2))
        {rs.setText(pric4[2]);
            tv.setText(web4[2]);n=1;
            IMAGES[0]=(R.drawable.biryani3);
        }else if(x.equals(""+R.id.cat_biryani+"?"+3))
        {rs.setText(pric4[3]);
            tv.setText(web4[3]);n=1;
            IMAGES[0]=(R.drawable.biryani4);
        }else if(x.equals(""+R.id.cat_biryani+"?"+4))
        {rs.setText(pric4[4]);
            tv.setText(web4[4]);n=1;
            IMAGES[0]=(R.drawable.biryani5);
        }else if(x.equals(""+R.id.cat_chinese+"?"+0))
        {rs.setText(pric5[0]);
            tv.setText(web5[0]);n=1;
            IMAGES[0]=(R.drawable.chinese1);
        }else if(x.equals(""+R.id.cat_chinese+"?"+1))
        {rs.setText(pric5[1]);
            tv.setText(web5[1]);n=1;
            IMAGES[0]=(R.drawable.chinese2);
        }else if(x.equals(""+R.id.cat_chinese+"?"+2))
        {rs.setText(pric5[2]);
            tv.setText(web5[2]);n=1;
            IMAGES[0]=(R.drawable.chinese3);
        }else if(x.equals(""+R.id.cat_chinese+"?"+3))
        {rs.setText(pric5[3]);
            tv.setText(web5[3]);n=1;
            IMAGES[0]=(R.drawable.chinese4);
        }else if(x.equals(""+R.id.cat_chinese+"?"+4))
        {rs.setText(pric5[4]);
            tv.setText(web5[4]);n=1;
            IMAGES[0]=(R.drawable.chinese5);
        }else if(x.equals(""+R.id.cat_starters+"?"+0))
        {rs.setText(pric6[0]);n=1;
            tv.setText(web6[0]);
            IMAGES[0]=(R.drawable.starter1);
        }else if(x.equals(""+R.id.cat_starters+"?"+1))
        {rs.setText(pric6[1]);n=1;
            tv.setText(web6[1]);
            IMAGES[0]=(R.drawable.starter2);
        }else if(x.equals(""+R.id.cat_starters+"?"+2))
        {rs.setText(pric6[2]);n=1;
            tv.setText(web6[2]);
            IMAGES[0]=(R.drawable.starter3);
        }else if(x.equals(""+R.id.cat_starters+"?"+3))
        {rs.setText(pric6[3]);n=1;
            tv.setText(web6[3]);
            IMAGES[0]=(R.drawable.starter4);
        }else if(x.equals(""+R.id.cat_starters+"?"+4))
        {rs.setText(pric6[4]);n=1;
            tv.setText(web6[4]);
            IMAGES[0]=(R.drawable.starter5);
        }else if(x.equals(""+R.id.cat_starters+"?"+5))
        {rs.setText(pric6[5]);
            tv.setText(web6[5]);
            IMAGES[0]=(R.drawable.starter6);
            n=1;
        }

        mImageSwitcher.setBackgroundResource(IMAGES[mPosition]);
        mPosition++;
    }

}