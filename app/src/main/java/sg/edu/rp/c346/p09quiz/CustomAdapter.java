package sg.edu.rp.c346.p09quiz;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16043971 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<Math> formulaList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Math> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        formulaList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
            convertView = inflater.inflate(layout_id,parent,false);
        }
        TextView tvTitle = convertView.findViewById(R.id.textViewTitle);
        TextView tvFormula = convertView.findViewById(R.id.textViewFormula);
        TextView tvType = convertView.findViewById(R.id.textViewType);
        Math currentItem = formulaList.get(position);
        tvTitle.setText(currentItem.getName());
        tvFormula.setText(currentItem.getFormula());
        tvType.setText("Formula type is: " + currentItem.getType());
        return convertView;
    }
}
