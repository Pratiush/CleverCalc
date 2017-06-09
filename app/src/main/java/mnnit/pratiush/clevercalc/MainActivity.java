package mnnit.pratiush.clevercalc;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    private ImageButton speak;
    private TextView t1,t2;
    private final int REQ_CODE_SPEECH_INPUT = 100;
    public String input="",ans="";
    public String[] list={};
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    private Button b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t2=(TextView)findViewById(R.id.t2);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        //b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        b10=(Button)findViewById(R.id.b10);
        b11=(Button)findViewById(R.id.b11);
        b12=(Button)findViewById(R.id.b12);
        b13=(Button)findViewById(R.id.b13);
        b14=(Button)findViewById(R.id.b14);
        b15=(Button)findViewById(R.id.b15);
        b16=(Button)findViewById(R.id.b16);
        b17=(Button)findViewById(R.id.b17);
        b18=(Button)findViewById(R.id.b18);
        b19=(Button)findViewById(R.id.b19);
        b20=(Button)findViewById(R.id.b20);
        b21=(Button)findViewById(R.id.b21);
        b22=(Button)findViewById(R.id.b22);
        b23=(Button)findViewById(R.id.b23);
        b24=(Button)findViewById(R.id.b24);
        b25=(Button)findViewById(R.id.b25);
        b26=(Button)findViewById(R.id.b26);
        b27=(Button)findViewById(R.id.b27);
        b28=(Button)findViewById(R.id.b28);
        b29=(Button)findViewById(R.id.b29);
        b30=(Button)findViewById(R.id.b30);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="!(";
                t1.setText(input);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="sqrt(";
                t1.setText(input);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="^";
                t1.setText(input);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.isEmpty()) {
                    input = input.substring(0, input.length() - 1);
                    t1.setText(input);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="+";
                t1.setText(input);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="sin(";
                t1.setText(input);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="(";
                t1.setText(input);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+=")";//do some trick
                t1.setText(input);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="e^";
                t1.setText(input);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input="";
                t1.setText(input);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             ans=evaluate(input);
             t2.setText(ans);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="cos(";
                t1.setText(input);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="7";
                t1.setText(input);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="8";
                t1.setText(input);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="9";
                t1.setText(input);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="/";
                t1.setText(input);
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+=".";
                t1.setText(input);
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="tan(";
                t1.setText(input);
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="4";
                t1.setText(input);
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="5";
                t1.setText(input);
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="6";
                t1.setText(input);
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="x";
                t1.setText(input);
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="0";
                t1.setText(input);
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="ln(";
                t1.setText(input);
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="1";
                t1.setText(input);
            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="2";
                t1.setText(input);
            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="3";
                t1.setText(input);
            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="-";
                t1.setText(input);
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input+="log(";
                t1.setText(input);
            }
        });

        speak=(ImageButton)findViewById(R.id.b4);
        t1=(TextView)findViewById(R.id.t1);
        //all onClicklisteners
        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                promptSpeechInput();
            }
        });
    }

    private void promptSpeechInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                getString(R.string.speech_prompt));
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    getString(R.string.speech_not_supported),
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Receiving speech input
     * */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQ_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    //do stuff with spoken text(result.get(0))
                    //String mic_input=porcess(result.get(0));
                    String mic_input=result.get(0);//need to process
                    ans=evaluate(mic_input);
                    t1.setText(mic_input);
                    t2.setText(ans);
                }
                break;
            }

        }
    }
    private String evaluate(String input){

        /* Create stacks for operators and operands */
        Stack<Integer> op  = new Stack<Integer>();
        Stack<Double> val = new Stack<Double>();
        /* Create temporary stacks for operators and operands */
        Stack<Integer> optmp  = new Stack<Integer>();
        Stack<Double> valtmp = new Stack<Double>();
        input = "0" + input;
        input = input.replaceAll("-","+-");
        /* Store operands and operators in respective stacks */
        String temp = "";
        for (int i = 0;i < input.length();i++)
        {
            char ch = input.charAt(i);
            if (ch == '-')
                temp = "-" + temp;
            else if (ch != '+' &&  ch != 'x' && ch != '/')
                temp = temp + ch;
            else
            {
                val.push(Double.parseDouble(temp));
                op.push((int)ch);
                temp = "";
            }
        }
        val.push(Double.parseDouble(temp));
        /* Create char array of operators as per precedence */
        /* -ve sign is already taken care of while storing */
        char operators[] = {'/','x','+'};
        /* Evaluation of expression */
        for (int i = 0; i < 3; i++)
        {
            boolean it = false;
            while (!op.isEmpty())
            {
                int optr = op.pop();
                double v1 = val.pop();
                double v2 = val.pop();
                if (optr == operators[i])
                {
                    /* if operator matches evaluate and store in temporary stack */
                    if (i == 0)
                    {
                        valtmp.push(v2 / v1);
                        it = true;
                        break;
                    }
                    else if (i == 1)
                    {
                        valtmp.push(v2 * v1);
                        it = true;
                        break;
                    }
                    else if (i == 2)
                    {
                        valtmp.push(v2 + v1);
                        it = true;
                        break;
                    }
                }
                else
                {
                    valtmp.push(v1);
                    val.push(v2);
                    optmp.push(optr);
                }
            }
            /* Push back all elements from temporary stacks to main stacks */
            while (!valtmp.isEmpty())
                val.push(valtmp.pop());
            while (!optmp.isEmpty())
                op.push(optmp.pop());
            /* Iterate again for same operator */
            if (it)
                i--;
        }
        String ans=new Double(val.pop()).toString();
        return ans;
    }
    public String porcess(String mic_input){
        String result="";
        list=mic_input.split(" ");
        for (int i=0;i<list.length;i++) {
            if(list[i].equals("exponent" )|| list[i].equals("exponential")){
                result=result+"e"+"^";
            }
            else if((list[i]+list[i+1]).equals("divided by")){
                result=result+"/";
            }
            else if( (list[i]+list[i+1]+list[i+2]).equals("to the power")){
                result=result+"^";
                i+=2;
            }
            else if (list[i].equals("power")){
                result=result+"^";
            }
            else if (list[i].equals("factorial")){
                result=result+"!";
                //factorial calculate and add value here
            }
            else if (list[i].equals("log")){
                result=result+"log("+list[i+1]+")";
                i++;
            }
            else{
                result=result+list[i];
            }
        }
        return result;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
