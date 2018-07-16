package sg.edu.rp.c346.p09quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;

    ArrayList<Math> alFormula;
    CustomAdapter caFormula;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.listViewFormula);

        alFormula = new ArrayList<>();
        Math form1 = new Math("Area of rectangle","Length x Length","Area");
        Math form2 = new Math("Area of triangle","(Length of base x Length) x 2","Area");
        Math form3 = new Math("Volume of cube","Length x Length x Length","Volume");

        alFormula.add(form1);
        alFormula.add(form2);
        alFormula.add(form3);

        caFormula = new CustomAdapter(this,R.layout.formula_item,alFormula);
        lvFormula.setAdapter(caFormula);

    }
}
