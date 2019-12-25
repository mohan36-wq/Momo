package com.example.momo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FlamesCalculator extends AppCompatActivity {

    ImageView iv_f, iv_l, iv_a, iv_m, iv_e, iv_s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flames_calculator);

        iv_f = findViewById(R.id.imageView_f);
        iv_l = findViewById(R.id.imageView_l);
        iv_a = findViewById(R.id.imageView_a);
        iv_m = findViewById(R.id.imageView_m);
        iv_e = findViewById(R.id.imageView_e);
        iv_s = findViewById(R.id.imageView_s);

        int count = 1;

        switch (count) {
            case 1:
                iv_f.setVisibility(View.VISIBLE);
        }
    }


   /* class flames
    {
        public static void main(String args[])
        {
            int i,j,k=0;
            String s1=new String("madhumitha"),s2=new String("sairam"),s3=new String(),s4=new String();
            for(i=0;i<s1.length()-1;i++)
            {
                for(j=0;j<=s2.length()-1;j++)
                {
                    //System.out.println("Madhu: "+s1.charAt(i));
                    //System.out.println("Sai: "+s2.charAt(j));
                    if(s1.charAt(i)==s2.charAt(j))
                    {
                        //char ch1=s3.charAt(k);
                        //System.out.println("Chumma: "+ch1);
                        //char ch2=s1.charAt(i);
                        //System.out.println("Rep let: "+ch2);
//s3.charAt(k)=s1.charAt(i);
//s3.replace(s3.charAt(k),s1.charAt(i));
                        s3=s3+s1.charAt(i);
//System.out.println("After rep: "+s3.charAt(k));
                        k++;
                    }}}
            System.out.println(s3);
            for (i = 0; i < s3.length(); i++) {
                for (j = 0; j < i; j++)
                    if (s3.charAt(i) == s3.charAt(j))
                        break;
                if (j == i)
                    s4=s4+s3.charAt(i);
            }
            System.out.println(s4);
        }
    }*/
}
