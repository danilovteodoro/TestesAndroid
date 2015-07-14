package teste.cerradoinformatica.com.br.teste;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by danilo on 14/07/15.
 */
public class EventoAdapter extends BaseAdapter {
    private Context context;
    private List<String>lstEvento;
    private LayoutInflater inflater;

    public EventoAdapter(Context context,List<String> lstEvento){
        this.context = context;
        this.lstEvento = lstEvento;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return lstEvento.size();
    }

    @Override
    public Object getItem(int position) {
        return lstEvento.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.inflater_evento,parent,false);
        TextView text = (TextView) convertView.findViewById(R.id.txtEvento);
        text.setText(lstEvento.get(position));
        return convertView;
    }
}
